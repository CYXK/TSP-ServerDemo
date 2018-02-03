package com.tsp.server.bean;

import java.util.Date;

public class Token {
    private String token;

    private String id;

    private Integer profileId;

    private String status;

    private Date expirationDate;

    private Integer maxpmts;

    private Date keyexpts;

    private Long amountLimit;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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