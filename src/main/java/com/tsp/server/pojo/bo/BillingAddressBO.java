package com.tsp.server.pojo.bo;

import lombok.Data;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/3 23:23
 */
@Data
public class BillingAddressBO {
    private String country;
    private String province;
    private String city;
    private String line1;
    private String line2;
    private String postalCode;
}
