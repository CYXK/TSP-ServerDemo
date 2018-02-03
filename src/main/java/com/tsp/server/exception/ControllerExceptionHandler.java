package com.tsp.server.exception;

import com.tsp.server.pojo.rsp.ErrorRsp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @description : 全局异常处理
 * @author: liuyanlong
 * @date: created in 2018/12/3 17:50
 *
 * 系统内人为抛出的异常 http code = 200
 * 非人为抛出的异常 http code 500
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    /**
     * 通用异常,无特殊处理的异常都从该方法返回<br>
     * 返回 httpcode 500，打印并返回堆栈。
     */
    @ExceptionHandler(value = Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorRsp handleException(Exception exception, HttpServletRequest request, HttpServletResponse response) {
        String msg = exception.getMessage();
        if (StringUtils.isEmpty(msg)) {
            msg = "服务器内部异常";
        }
        logger.error(msg, exception);
        ErrorRsp errRsp = new ErrorRsp();
        errRsp.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errRsp.setMessage(msg);
        return errRsp;
    }

    @ResponseBody
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ErrorRsp messageNotReadable(HttpMessageNotReadableException exception, HttpServletResponse response) {
        logger.error("请求参数不匹配。", exception);
        return new ErrorRsp(HttpStatus.BAD_REQUEST.value(), exception.getMessage());

    }


    private String getExpStackTrace2Str(Throwable throwable) {
        StringBuilder sb = new StringBuilder();
        if (throwable.getStackTrace() != null) {
            sb.append("Caused by: ")
                    .append(throwable.getClass())
                    .append(":")
                    .append(throwable.getMessage())
                    .append("\n")
            ;
            for (StackTraceElement stackTraceElement : throwable.getStackTrace()) {
                sb.append("\tat  ");
                sb.append(stackTraceElement.getClassName()).append(".")
                        .append(stackTraceElement.getMethodName())
                        .append("(").append(stackTraceElement.getFileName()).append(":")
                        .append(stackTraceElement.getLineNumber())
                        .append(")")
                        .append("\n")
                ;
            }
        }
        return sb.toString();
    }


    /**
     * 通用业务异常
     */
    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    public ErrorRsp handleBusinessException(BusinessException exception) {
        String msg = exception.getMessage();
        logger.error(msg, exception);
        ErrorRsp errRsp = new ErrorRsp();
        errRsp.setMessage(msg);
        return errRsp;
    }

    /**
     * 请求参数校验异常
     */
    @ResponseBody
    @ExceptionHandler(value = {MethodArgumentNotValidException.class, BindException.class})
    public ErrorRsp requestBeanValidException(Exception exception) {

        StringBuilder sbMsg = new StringBuilder();
        sbMsg.append("请求参数异常:");
        ErrorRsp errRsp = new ErrorRsp();
        BindingResult bindingResult = null;
        if (exception instanceof MethodArgumentNotValidException) {
            bindingResult = ((MethodArgumentNotValidException) exception).getBindingResult();
        } else {
            bindingResult = ((BindException) exception).getBindingResult();
        }
        List<String> errMsgs = new ArrayList<>();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            errMsgs.add(fieldError.getField() + fieldError.getDefaultMessage());
        }
        sbMsg.append(String.join(",", errMsgs)).append("。");
        errRsp.setMessage(sbMsg.toString());
        return errRsp;
    }

}
