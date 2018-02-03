package com.tsp.server.pojo.rsp;

import lombok.Data;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/4 0:59
 */
@Data
public class ReplenishRsp {
    private Integer maxPmts;
    private Long keyExpTS;//date UNIX_UTC_Timestamp
    private Long amountLimit;
}
