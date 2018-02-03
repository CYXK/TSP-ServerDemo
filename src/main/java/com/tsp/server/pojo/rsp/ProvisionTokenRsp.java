package com.tsp.server.pojo.rsp;

import com.tsp.server.pojo.bo.PaymentInstrument;
import com.tsp.server.pojo.bo.TokenInfo;
import lombok.Data;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/4 0:17
 */
@Data
public class ProvisionTokenRsp {
    private String vPanEnrollmentID;
    private String vProvisionedTokenID;
    private PaymentInstrument paymentInstrument;
    private TokenInfo tokenInfo;
}
