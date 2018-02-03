package com.tsp.server.bean;

public class AccountEnrollment {
    private String id;

    private Integer accountId;

    private String walletAccount;

    private String locale;

    private String accountSource;

    private String accountEntryMode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getWalletAccount() {
        return walletAccount;
    }

    public void setWalletAccount(String walletAccount) {
        this.walletAccount = walletAccount == null ? null : walletAccount.trim();
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

    public String getAccountEntryMode() {
        return accountEntryMode;
    }

    public void setAccountEntryMode(String accountEntryMode) {
        this.accountEntryMode = accountEntryMode == null ? null : accountEntryMode.trim();
    }
}