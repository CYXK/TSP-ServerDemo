package com.tsp.server.bean;

public class TokenProvision {
    private String id;

    private String deviceId;

    private String walletAccount;

    private String ip4address;

    private String location;

    private String locationSource;

    private String emailAddress;

    private String protectionType;

    private String presentationType;

    private String accountType;

    private String locale;

    private String accountSource;

    private String consumerEntryMode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getWalletAccount() {
        return walletAccount;
    }

    public void setWalletAccount(String walletAccount) {
        this.walletAccount = walletAccount == null ? null : walletAccount.trim();
    }

    public String getIp4address() {
        return ip4address;
    }

    public void setIp4address(String ip4address) {
        this.ip4address = ip4address == null ? null : ip4address.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLocationSource() {
        return locationSource;
    }

    public void setLocationSource(String locationSource) {
        this.locationSource = locationSource == null ? null : locationSource.trim();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress == null ? null : emailAddress.trim();
    }

    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType == null ? null : protectionType.trim();
    }

    public String getPresentationType() {
        return presentationType;
    }

    public void setPresentationType(String presentationType) {
        this.presentationType = presentationType == null ? null : presentationType.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale == null ? null : locale.trim();
    }

    public String getAccountSource() {
        return accountSource;
    }

    public void setAccountSource(String accountSource) {
        this.accountSource = accountSource == null ? null : accountSource.trim();
    }

    public String getConsumerEntryMode() {
        return consumerEntryMode;
    }

    public void setConsumerEntryMode(String consumerEntryMode) {
        this.consumerEntryMode = consumerEntryMode == null ? null : consumerEntryMode.trim();
    }
}