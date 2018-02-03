package com.tsp.server.pojo.bo;

import lombok.Data;

import java.util.Date;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/4 0:23
 */
@Data
public class EncTokenInfo {
    private String token;
    private Integer maxPmts;
    private Date keyExpTS;
    private Long amountLimit;
}
