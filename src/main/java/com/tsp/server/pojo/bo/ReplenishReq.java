package com.tsp.server.pojo.bo;

import lombok.Data;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/4 0:56
 */
@Data
public class ReplenishReq {
    private Integer maxPmts;
    private Long keyExpTS;//date UNIX_UTC_Timestamp
    private Long amountLimit;
}
