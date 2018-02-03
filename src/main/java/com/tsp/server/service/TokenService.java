package com.tsp.server.service;

import com.tsp.server.enumeration.TokenStatusEnum;
import com.tsp.server.pojo.bo.*;
import com.tsp.server.pojo.req.EnrollPANReq;
import com.tsp.server.pojo.req.ProvisionTokenReq;
import com.tsp.server.pojo.rsp.*;
import com.tsp.server.util.UUIDUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/3 23:26
 */
@Service
public class TokenService {

    public BaseRsp<EnrollPANRsp> panEnrollments(EnrollPANReq enrollPANReq) {
        // TODO liuyanlong 2018-02-03 存储细节补充

        PaymentInstrument paymentInstrument = new PaymentInstrument();
        paymentInstrument.setLast4("6666");
        paymentInstrument.setAccountStatus("1");
        paymentInstrument.setIsTokenizable("1");

        ExpirationDate expirationDate = new ExpirationDate();
        expirationDate.setMonth("12");
        expirationDate.setYear("2018");

        paymentInstrument.setExpirationDate(expirationDate);

        EnrollPANRsp enrollPANRsp = new EnrollPANRsp();
        enrollPANRsp.setVPanEnrollmentID(UUIDUtils.getUUID());
        enrollPANRsp.setPaymentInstrument(paymentInstrument);

        return new BaseRsp<>(enrollPANRsp);
    }

    /**
     * 申请Token
     */
    public BaseRsp<ProvisionTokenRsp> provisionToken(ProvisionTokenReq provisionTokenReq) {

        PaymentInstrument paymentInstrument = new PaymentInstrument();
        paymentInstrument.setLast4("6666");
        paymentInstrument.setAccountStatus("1");
        paymentInstrument.setIsTokenizable("1");

        ExpirationDate expirationDate = new ExpirationDate();
        expirationDate.setMonth("12");
        expirationDate.setYear("2018");

        paymentInstrument.setExpirationDate(expirationDate);

        TokenInfo tokenInfo = new TokenInfo();
        tokenInfo.setTokenStatus(TokenStatusEnum.INACTIVE);
        tokenInfo.setTokenRequestorID("fpoiahgar");
        tokenInfo.setTokenReferenceID("fhapiuehaewf");
        tokenInfo.setLast4("1234");
        tokenInfo.setExpirationDate(new Date());

        EncTokenInfo encTokenInfo = new EncTokenInfo();
        encTokenInfo.setToken("jf;aehgalweknmjwa;hreg");
        encTokenInfo.setMaxPmts(666);
        // TODO liuyanlong UNIX_UTC_Timestamp
        encTokenInfo.setKeyExpTS(new Date());
        encTokenInfo.setAmountLimit(66666L);

        tokenInfo.setEncTokenInfo(encTokenInfo);

        ProvisionTokenRsp provisionTokenRsp = new ProvisionTokenRsp();
        provisionTokenRsp.setPaymentInstrument(paymentInstrument);
        provisionTokenRsp.setTokenInfo(tokenInfo);
        provisionTokenRsp.setVPanEnrollmentID("faoehgiapw");
        provisionTokenRsp.setVProvisionedTokenID("fja[oejigj'aw[rg");

        return new BaseRsp<>(provisionTokenRsp);
    }

    /**
     * 通过EnrollmentId获取Token
     */
    public BaseRsp<ProvisionTokenRsp> provisionTokenByEnrollmentId(String vPanEnrollmentID) {
        PaymentInstrument paymentInstrument = new PaymentInstrument();
        paymentInstrument.setLast4("6666");
        paymentInstrument.setAccountStatus("1");
        paymentInstrument.setIsTokenizable("1");

        ExpirationDate expirationDate = new ExpirationDate();
        expirationDate.setMonth("12");
        expirationDate.setYear("2018");

        paymentInstrument.setExpirationDate(expirationDate);

        TokenInfo tokenInfo = new TokenInfo();
        tokenInfo.setTokenStatus(TokenStatusEnum.INACTIVE);
        tokenInfo.setTokenRequestorID("fpoiahgar");
        tokenInfo.setTokenReferenceID("fhapiuehaewf");
        tokenInfo.setLast4("1234");
        tokenInfo.setExpirationDate(new Date());

        EncTokenInfo encTokenInfo = new EncTokenInfo();
        encTokenInfo.setToken("jf;aehgalvsdweknmjwa;hreg");
        encTokenInfo.setMaxPmts(666);
        // TODO liuyanlong UNIX_UTC_Timestamp
        encTokenInfo.setKeyExpTS(new Date());
        encTokenInfo.setAmountLimit(66666L);

        tokenInfo.setEncTokenInfo(encTokenInfo);

        ProvisionTokenRsp provisionTokenRsp = new ProvisionTokenRsp();
        provisionTokenRsp.setPaymentInstrument(paymentInstrument);
        provisionTokenRsp.setTokenInfo(tokenInfo);
//        provisionTokenRsp.setVPanEnrollmentID("faoehgiapw");
        provisionTokenRsp.setVProvisionedTokenID("fja[oejigj'aw[rg");

        return new BaseRsp<>(provisionTokenRsp);
    }

    public BaseRsp confirmProvisioning(String vProvisionedTokenID) {
        return new BaseRsp();
    }

    public BaseRsp<ReplenishRsp> replenish(ReplenishReq replenishReq, String vProvisionedTokenID) {
        ReplenishRsp replenishRsp = new ReplenishRsp();
        replenishRsp.setMaxPmts(666);
        replenishReq.setKeyExpTS(new Date().getTime());
        replenishReq.setAmountLimit(66666L);

        return new BaseRsp<>(replenishRsp);
    }

    public BaseRsp confirmReplenishment(String vProvisionedTokenID) {
        return new BaseRsp();
    }

    public BaseRsp<TokenInfoRsp> getTokenStatus(String vProvisionedTokenID) {
        TokenInfoRsp tokenInfo = new TokenInfoRsp();
        tokenInfo.setTokenStatus(TokenStatusEnum.ACTIVE);
        ExpirationDate expirationDate = new ExpirationDate();
        expirationDate.setYear("2018");
        expirationDate.setMonth("12");
        tokenInfo.setExpirationDate(expirationDate);
        return new BaseRsp<>(tokenInfo);
    }

    public BaseRsp deleteToken(UpdateReason updateReason,String vProvisionedTokenID) {
        return new BaseRsp();
    }

    public BaseRsp suspendToken(UpdateReason updateReason, String vProvisionedTokenID) {
        return new BaseRsp();
    }

    public BaseRsp resumeToken(UpdateReason updateReason, String vProvisionedTokenID) {
        return new BaseRsp();
    }
}
