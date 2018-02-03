package com.tsp.server.pojo.bo;

import com.tsp.server.enumeration.TokenStatusEnum;
import lombok.Data;

import java.util.Date;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/4 0:19
 */
@Data
public class TokenInfo {
    private TokenStatusEnum tokenStatus;
    private String tokenRequestorID;
    private String tokenReferenceID;
    private String last4;
    private Date expirationDate;
    private EncTokenInfo encTokenInfo;

}
