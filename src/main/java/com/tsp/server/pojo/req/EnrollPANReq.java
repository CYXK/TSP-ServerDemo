package com.tsp.server.pojo.req;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @description :Enroll PAN时的请求对象
 * @author: liuyanlong
 * @date: created in 2018/2/3 22:34
 */
@Data
public class EnrollPANReq {
    /*
    * {
"clientAppID": "98765432",
"clientWalletAccountID": "FAmwn",
"consumerEntryMode": "KEYENTERED",
"encPaymentInstrument": "ew0KICAiYWxnIiA6ICJBMjU2R0NNS1ciLA0KICAiaXYiIDogIm9jV1J1am5MVURkM0RMYjIiLA0KICAidGFnIiA6ICJZTndlajNFLXlkWVBVMHZpUkZGVkNRIiwNCiAgImVuYyIgOiAiQTI1NkdDTSIsDQogICJ0eXAiIDogIkpPU0UiLA0KICAia2lkIiA6ICJJV00xM0Y1NzFOWUNMV0I0QjBVNjExM3A4c2Y5SmVHenI2XzJoYUM5RjltX0FOdExNIiwNCiAgImNoYW5uZWxTZWN1cml0eUNvbnRleHQiIDogbnVsbCwNCiAgImlhdCIgOiBudWxsLA0KICAiY3R5IiA6IG51bGwsDQogICJqdGkiIDogbnVsbA0KfQ.mDaNp3UaTBamM3Os8csqBZHK_TFdJeGcwB7EAm8iFJ0.3p3k8KwdoNVRIXlh.T_Ywtb1a9MeRE1yBUa3PTWZQTerPwRoozz-MB56wCtWZxeqNbUm9chaNUZDrtWOWfaJBVVFl8EwFl4yaIYDfM1XHB5noNYxQTOlh3WbD3wYLyVFpoxtDA3x5sdEIeBnS6SIraIhPQD5a17AkGhj0PRaq2IIfrV9QgcPOY4ktiT0rqLnV0UBJpNIEwmwLIP2bFfn_hwKX1c0WXd2UIVCUlPCxQ88VNfObl91ykSRIBZ1v4G-qIV1oKEWYtinvcZO28gJta86AhTZy3-uTBaoDPXUUKFQz6y-D5CAi72TCfXXVUXl6ELpKpt328BoGPw.G7_Lf3wWgVVi-pj-ZY5-DQ",
"locale": "en_US",
"panSource": "MANUALLYENTERED"
}*/

    @NotBlank
    private String clientWalletAccountID;
    @NotBlank
    private String clientAppID;
    private String consumerEntryMode;
    @NotBlank
    private String encPaymentInstrument;
    @NotBlank
    private String locale;
    @NotBlank
    private String panSource;

}
