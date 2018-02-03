package com.tsp.server.pojo.rsp;

import com.tsp.server.pojo.bo.PaymentInstrument;
import lombok.Data;

/**
 * @description : enroll pan时的响应对象
 * @author: liuyanlong
 * @date: created in 2018/2/3 22:51
 */
@Data
public class EnrollPANRsp {

    /*
    * {
"cardMetaData": {
"backgroundColor": "0x0000FF",
"contactEmail": "support@testbank.com",
"contactName": "Test Bank",
"contactNumber": "+12345678902",
"contactWebsite": "www.testbank.com",
"foregroundColor": "0x00FF00",
"labelColor": "0xFF0000",
"longDescription": "This is a test bank",
"privacyPolicyURL": "http://www.vip.com/FiprivacyPolicyURL",
"shortDescription": "A Test Bank",
"termsAndConditionsURL": "http://www.vip.com/FitermsAndConditionsURL"
},
"paymentInstrument": {
"expirationDate": {
"month": "01",
"year": "2017"
},
"last4": "9659"
},
"vPanEnrollmentID": "0c5fb72c7ee07b9b8c9a1c7e898d6b01"
}
    *
    * */

    private String vPanEnrollmentID;
    private PaymentInstrument paymentInstrument;

}
