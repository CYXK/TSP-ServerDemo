package com.tsp.server.bean;

import java.util.Date;

public class Profile {
    private Integer id;

    private Integer serviceRequestorId;

    private String name;

    private String tokenRequestorId;

    private String status;

    private String encryptionApiKey;

    private String encryptionSecret;

    private String postbackApiKey;

    private String postbackSecret;

    private String postbackUrl;

    private Integer maxpmts;

    private Date keyexpts;

    private Long amountLimit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceRequestorId() {
        return serviceRequestorId;
    }

    public void setServiceRequestorId(Integer serviceRequestorId) {
        this.serviceRequestorId = serviceRequestorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTokenRequestorId() {
        return tokenRequestorId;
    }

    public void setTokenRequestorId(String tokenRequestorId) {
        this.tokenRequestorId = tokenRequestorId == null ? null : tokenRequestorId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getEncryptionApiKey() {
        return encryptionApiKey;
    }

    public void setEncryptionApiKey(String encryptionApiKey) {
        this.encryptionApiKey = encryptionApiKey == null ? null : encryptionApiKey.trim();
    }

    public String getEncryptionSecret() {
        return encryptionSecret;
    }

    public void setEncryptionSecret(String encryptionSecret) {
        this.encryptionSecret = encryptionSecret == null ? null : encryptionSecret.trim();
    }

    public String getPostbackApiKey() {
        return postbackApiKey;
    }

    public void setPostbackApiKey(String postbackApiKey) {
        this.postbackApiKey = postbackApiKey == null ? null : postbackApiKey.trim();
    }

    public String getPostbackSecret() {
        return postbackSecret;
    }

    public void setPostbackSecret(String postbackSecret) {
        this.postbackSecret = postbackSecret == null ? null : postbackSecret.trim();
    }

    public String getPostbackUrl() {
        return postbackUrl;
    }

    public void setPostbackUrl(String postbackUrl) {
        this.postbackUrl = postbackUrl == null ? null : postbackUrl.trim();
    }

    public Integer getMaxpmts() {
        return maxpmts;
    }

    public void setMaxpmts(Integer maxpmts) {
        this.maxpmts = maxpmts;
    }

    public Date getKeyexpts() {
        return keyexpts;
    }

    public void setKeyexpts(Date keyexpts) {
        this.keyexpts = keyexpts;
    }

    public Long getAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(Long amountLimit) {
        this.amountLimit = amountLimit;
    }
}