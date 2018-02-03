package com.tsp.server.pojo.bo;

import lombok.Data;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/3 23:01
 */
@Data
public class PaymentInstrument {
    private String last4;
    private String accountStatus;
    private String isTokenizable;
    private ExpirationDate expirationDate;
}
