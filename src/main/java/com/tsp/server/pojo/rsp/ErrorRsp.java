package com.tsp.server.pojo.rsp;

import com.tsp.server.enumeration.ResponseCodeEnum;

/**
 * @description :返回异常对象
 * @author: liuyanlong
 * @date: created in 17-12-22 上午11:09
 */
public class ErrorRsp extends BaseRsp {

    public ErrorRsp(Integer code, String message) {
        super(code);
        this.message = message;
    }

    public ErrorRsp(ResponseCodeEnum rspCode) {
        this(rspCode.code(),rspCode.msg());
    }

    public ErrorRsp(String message) {
        this.message = message;
    }

    public ErrorRsp() {
    }

    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}