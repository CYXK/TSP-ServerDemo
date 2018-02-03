package com.tsp.server.pojo.req;

import com.tsp.server.enumeration.*;
import lombok.Data;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/4 0:05
 */
@Data
public class ProvisionTokenReq {
    private String clientAppID;
    private String clientDeviceID;
    private String clientWalletAccountID;
    private String ip4addreess;
    private String location;
    private LocationSourceEnum locationSource;
    private String clientWalletAccountEmailAddress;
    private ProtectionTypeEnum protectionType;
    private PresentationTypeEnum[] presentationType;
    private AccountTypeEnum accountType;
    private String encRiskDataInfo;
    private String locale;
    private PanSourceEnum panSource;
    private ConsumerEntryModeEnum consumerEntryMode;
    private String encPaymentInstrument;

}
