package com.tsp.server.controller;

import com.tsp.server.pojo.bo.ReplenishReq;
import com.tsp.server.pojo.bo.TokenInfo;
import com.tsp.server.pojo.bo.UpdateReason;
import com.tsp.server.pojo.req.EnrollPANReq;
import com.tsp.server.pojo.req.ProvisionTokenReq;
import com.tsp.server.pojo.rsp.*;
import com.tsp.server.service.TokenService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/3 22:27
 */
@RestController
@RequestMapping("/v2/tsp")
public class TokenController {

    @Resource
    private TokenService tokenService;

    // tsp/panEnrollments?apikey={apikey}
    /**
     * 登记PAN信息
     */
    @RequestMapping(value = "/panEnrollments",method = RequestMethod.POST)
    public BaseRsp<EnrollPANRsp> panEnrollments(@Valid @RequestBody EnrollPANReq enrollPANReq) {
        return tokenService.panEnrollments(enrollPANReq);
    }

    //tsp/provisionedTokens?apikey={apikey}
    /**
     * 申请Token
     */
    @RequestMapping(value = "/provisionedTokens",method = RequestMethod.POST)
    public BaseRsp<ProvisionTokenRsp> provisionToken(@Valid @RequestBody ProvisionTokenReq provisionTokenReq) {
        return tokenService.provisionToken(provisionTokenReq);
    }

    //tsp/panEnrollments/{vPanEnrollmentID}/provisionedTokens?apikey={apikey}
    /**
     * 通过PanEnrollmentId申请Token
     */
    @RequestMapping(value = "/panEnrollments/{vPanEnrollmentID}/provisionedTokens",method = RequestMethod.POST)
    public BaseRsp<ProvisionTokenRsp> provisionTokenByEnrollmentId(@PathVariable("vPanEnrollmentID") String vPanEnrollmentID) {
        return tokenService.provisionTokenByEnrollmentId(vPanEnrollmentID);
    }

    //tsp/provisionedTokens/{vProvisionedTokenID}/confirmProvisioning?apikey={apikey}
    /**
     *
     */
    @RequestMapping(value = "/provisionedTokens/{vProvisionedTokenID}/confirmProvisioning",method = RequestMethod.PUT)
    public BaseRsp confirmProvisioning(@PathVariable("vProvisionedTokenID") String vProvisionedTokenID) {
        return tokenService.confirmProvisioning(vProvisionedTokenID);
    }

    //tsp/provisionedTokens/{vProvisionedTokenID}/replenish?apikey={apikey}
    /**
     *
     */
    @RequestMapping(value = "/provisionedTokens/{vProvisionedTokenID}/replenish",method = RequestMethod.POST)
    public BaseRsp<ReplenishRsp> replenish(@RequestBody ReplenishReq replenishReq, @PathVariable("vProvisionedTokenID") String vProvisionedTokenID) {
        return tokenService.replenish(replenishReq,vProvisionedTokenID);
    }

    //tsp/provisionedTokens/${vProvisionedTokenID}/confirmReplenishment?apikey={apikey}
    /**
     *
     */
    @RequestMapping(value = "/provisionedTokens/{vProvisionedTokenID}/confirmReplenishment",method = RequestMethod.PUT)
    public BaseRsp confirmReplenishment(@PathVariable("vProvisionedTokenID") String vProvisionedTokenID) {
        return tokenService.confirmReplenishment(vProvisionedTokenID);
    }

    //tsp/provisionedTokens/{vProvisionedTokenID}?apikey={apikey}
    /**
     * 获取Token状态
     */
    @RequestMapping(value = "/provisionedTokens/{vProvisionedTokenID}",method = RequestMethod.GET)
    public BaseRsp<TokenInfoRsp> getTokenStatus(@PathVariable("vProvisionedTokenID") String vProvisionedTokenID) {
        return tokenService.getTokenStatus(vProvisionedTokenID);
    }

    //tsp/provisionedTokens/{vProvisionedTokenID}/delete?apikey={apikey}
    /**
     * 删除Token
     */
    @RequestMapping(value = "/provisionedTokens/{vProvisionedTokenID}/delete",method = RequestMethod.PUT)
    public BaseRsp deleteToken(@RequestBody UpdateReason updateReason, @PathVariable("vProvisionedTokenID") String vProvisionedTokenID) {
        return tokenService.deleteToken(updateReason,vProvisionedTokenID);
    }

    //tsp/provisionedTokens/{vProvisionedTokenID}/suspend?apikey={apikey}
    /**
     * 挂起Token
     */
    @RequestMapping(value = "/provisionedTokens/{vProvisionedTokenID}/suspend",method = RequestMethod.PUT)
    public BaseRsp suspendToken(@RequestBody UpdateReason updateReason, @PathVariable("vProvisionedTokenID") String vProvisionedTokenID) {
        return tokenService.suspendToken(updateReason,vProvisionedTokenID);
    }

    //tsp/provisionedTokens/{vProvisionedTokenID}/resume?apikey={apikey}
    /**
     *
     */
    @RequestMapping(value = "/provisionedTokens/{vProvisionedTokenID}/resume",method = RequestMethod.PUT)
    public BaseRsp resumeToken(@RequestBody UpdateReason updateReason, @PathVariable("vProvisionedTokenID") String vProvisionedTokenID) {
        return tokenService.resumeToken(updateReason,vProvisionedTokenID);
    }

}
