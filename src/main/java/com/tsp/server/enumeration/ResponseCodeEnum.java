package com.tsp.server.enumeration;

/**
 * @description : 响应码枚举
 * @author: liuyanlong
 * @date: created in 2018/2/3 18:01
 */
public enum ResponseCodeEnum {

    SUCCESS(200,"success"),

    ;


    private int code;
    private String msg;

    ResponseCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public int code() {
        return code;
    }

    public String msg() {
        return msg;
    }
}
