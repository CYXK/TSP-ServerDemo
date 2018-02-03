package com.tsp.server.pojo.rsp;

import com.tsp.server.enumeration.TokenStatusEnum;
import com.tsp.server.pojo.bo.ExpirationDate;
import lombok.Data;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/4 1:09
 */
@Data
public class TokenInfoRsp {
    private TokenStatusEnum tokenStatus;
    private ExpirationDate expirationDate;
}
