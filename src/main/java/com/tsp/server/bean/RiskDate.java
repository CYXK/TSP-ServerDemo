package com.tsp.server.bean;

public class RiskDate {
    private Integer id;

    private String key;

    private String value;

    private String tokenProvisionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getTokenProvisionId() {
        return tokenProvisionId;
    }

    public void setTokenProvisionId(String tokenProvisionId) {
        this.tokenProvisionId = tokenProvisionId == null ? null : tokenProvisionId.trim();
    }
}