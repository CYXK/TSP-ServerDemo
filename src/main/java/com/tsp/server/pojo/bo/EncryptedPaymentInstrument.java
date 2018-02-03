package com.tsp.server.pojo.bo;

import com.tsp.server.bean.BillingAddress;
import lombok.Data;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/3 23:07
 */
@Data
public class EncryptedPaymentInstrument {
    private String accountNumber;
    private String cvv2;
    private String last4;
    private String name;
    private String tel;
    private String IDType;
    private String IDNumber;
    private ExpirationDate expirationDate;
    private BillingAddress billingAddress;
}
