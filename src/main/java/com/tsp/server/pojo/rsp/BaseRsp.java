package com.tsp.server.pojo.rsp;

import com.tsp.server.enumeration.ResponseCodeEnum;

/**
 * @description :基础返回对象
 * @author: liuyanlong
 * @date: created in 17-12-22 上午11:09
 */
public class BaseRsp<T> {

    public BaseRsp(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public BaseRsp(Integer code) {
        this.code = code;
    }

    public BaseRsp(T data) {
        this.data = data;
    }

    public BaseRsp() {

    }


    private Integer code = ResponseCodeEnum.SUCCESS.code();
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
