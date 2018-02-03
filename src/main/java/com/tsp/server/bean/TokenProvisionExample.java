package com.tsp.server.bean;

import java.util.ArrayList;
import java.util.List;

public class TokenProvisionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TokenProvisionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("DEVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("DEVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("DEVICE_ID =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("DEVICE_ID <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("DEVICE_ID >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_ID >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("DEVICE_ID <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_ID <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("DEVICE_ID like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("DEVICE_ID not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("DEVICE_ID in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("DEVICE_ID not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("DEVICE_ID between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("DEVICE_ID not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andWalletAccountIsNull() {
            addCriterion("WALLET_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andWalletAccountIsNotNull() {
            addCriterion("WALLET_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andWalletAccountEqualTo(String value) {
            addCriterion("WALLET_ACCOUNT =", value, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountNotEqualTo(String value) {
            addCriterion("WALLET_ACCOUNT <>", value, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountGreaterThan(String value) {
            addCriterion("WALLET_ACCOUNT >", value, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountGreaterThanOrEqualTo(String value) {
            addCriterion("WALLET_ACCOUNT >=", value, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountLessThan(String value) {
            addCriterion("WALLET_ACCOUNT <", value, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountLessThanOrEqualTo(String value) {
            addCriterion("WALLET_ACCOUNT <=", value, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountLike(String value) {
            addCriterion("WALLET_ACCOUNT like", value, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountNotLike(String value) {
            addCriterion("WALLET_ACCOUNT not like", value, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountIn(List<String> values) {
            addCriterion("WALLET_ACCOUNT in", values, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountNotIn(List<String> values) {
            addCriterion("WALLET_ACCOUNT not in", values, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountBetween(String value1, String value2) {
            addCriterion("WALLET_ACCOUNT between", value1, value2, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andWalletAccountNotBetween(String value1, String value2) {
            addCriterion("WALLET_ACCOUNT not between", value1, value2, "walletAccount");
            return (Criteria) this;
        }

        public Criteria andIp4addressIsNull() {
            addCriterion("IP4ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andIp4addressIsNotNull() {
            addCriterion("IP4ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIp4addressEqualTo(String value) {
            addCriterion("IP4ADDRESS =", value, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressNotEqualTo(String value) {
            addCriterion("IP4ADDRESS <>", value, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressGreaterThan(String value) {
            addCriterion("IP4ADDRESS >", value, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressGreaterThanOrEqualTo(String value) {
            addCriterion("IP4ADDRESS >=", value, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressLessThan(String value) {
            addCriterion("IP4ADDRESS <", value, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressLessThanOrEqualTo(String value) {
            addCriterion("IP4ADDRESS <=", value, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressLike(String value) {
            addCriterion("IP4ADDRESS like", value, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressNotLike(String value) {
            addCriterion("IP4ADDRESS not like", value, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressIn(List<String> values) {
            addCriterion("IP4ADDRESS in", values, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressNotIn(List<String> values) {
            addCriterion("IP4ADDRESS not in", values, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressBetween(String value1, String value2) {
            addCriterion("IP4ADDRESS between", value1, value2, "ip4address");
            return (Criteria) this;
        }

        public Criteria andIp4addressNotBetween(String value1, String value2) {
            addCriterion("IP4ADDRESS not between", value1, value2, "ip4address");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationSourceIsNull() {
            addCriterion("LOCATION_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andLocationSourceIsNotNull() {
            addCriterion("LOCATION_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andLocationSourceEqualTo(String value) {
            addCriterion("LOCATION_SOURCE =", value, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceNotEqualTo(String value) {
            addCriterion("LOCATION_SOURCE <>", value, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceGreaterThan(String value) {
            addCriterion("LOCATION_SOURCE >", value, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_SOURCE >=", value, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceLessThan(String value) {
            addCriterion("LOCATION_SOURCE <", value, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_SOURCE <=", value, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceLike(String value) {
            addCriterion("LOCATION_SOURCE like", value, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceNotLike(String value) {
            addCriterion("LOCATION_SOURCE not like", value, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceIn(List<String> values) {
            addCriterion("LOCATION_SOURCE in", values, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceNotIn(List<String> values) {
            addCriterion("LOCATION_SOURCE not in", values, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceBetween(String value1, String value2) {
            addCriterion("LOCATION_SOURCE between", value1, value2, "locationSource");
            return (Criteria) this;
        }

        public Criteria andLocationSourceNotBetween(String value1, String value2) {
            addCriterion("LOCATION_SOURCE not between", value1, value2, "locationSource");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIsNull() {
            addCriterion("EMAIL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIsNotNull() {
            addCriterion("EMAIL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAddressEqualTo(String value) {
            addCriterion("EMAIL_ADDRESS =", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotEqualTo(String value) {
            addCriterion("EMAIL_ADDRESS <>", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressGreaterThan(String value) {
            addCriterion("EMAIL_ADDRESS >", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_ADDRESS >=", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLessThan(String value) {
            addCriterion("EMAIL_ADDRESS <", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_ADDRESS <=", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLike(String value) {
            addCriterion("EMAIL_ADDRESS like", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotLike(String value) {
            addCriterion("EMAIL_ADDRESS not like", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIn(List<String> values) {
            addCriterion("EMAIL_ADDRESS in", values, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotIn(List<String> values) {
            addCriterion("EMAIL_ADDRESS not in", values, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressBetween(String value1, String value2) {
            addCriterion("EMAIL_ADDRESS between", value1, value2, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotBetween(String value1, String value2) {
            addCriterion("EMAIL_ADDRESS not between", value1, value2, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeIsNull() {
            addCriterion("PROTECTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeIsNotNull() {
            addCriterion("PROTECTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeEqualTo(String value) {
            addCriterion("PROTECTION_TYPE =", value, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeNotEqualTo(String value) {
            addCriterion("PROTECTION_TYPE <>", value, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeGreaterThan(String value) {
            addCriterion("PROTECTION_TYPE >", value, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROTECTION_TYPE >=", value, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeLessThan(String value) {
            addCriterion("PROTECTION_TYPE <", value, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeLessThanOrEqualTo(String value) {
            addCriterion("PROTECTION_TYPE <=", value, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeLike(String value) {
            addCriterion("PROTECTION_TYPE like", value, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeNotLike(String value) {
            addCriterion("PROTECTION_TYPE not like", value, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeIn(List<String> values) {
            addCriterion("PROTECTION_TYPE in", values, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeNotIn(List<String> values) {
            addCriterion("PROTECTION_TYPE not in", values, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeBetween(String value1, String value2) {
            addCriterion("PROTECTION_TYPE between", value1, value2, "protectionType");
            return (Criteria) this;
        }

        public Criteria andProtectionTypeNotBetween(String value1, String value2) {
            addCriterion("PROTECTION_TYPE not between", value1, value2, "protectionType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeIsNull() {
            addCriterion("PRESENTATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeIsNotNull() {
            addCriterion("PRESENTATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeEqualTo(String value) {
            addCriterion("PRESENTATION_TYPE =", value, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeNotEqualTo(String value) {
            addCriterion("PRESENTATION_TYPE <>", value, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeGreaterThan(String value) {
            addCriterion("PRESENTATION_TYPE >", value, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRESENTATION_TYPE >=", value, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeLessThan(String value) {
            addCriterion("PRESENTATION_TYPE <", value, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeLessThanOrEqualTo(String value) {
            addCriterion("PRESENTATION_TYPE <=", value, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeLike(String value) {
            addCriterion("PRESENTATION_TYPE like", value, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeNotLike(String value) {
            addCriterion("PRESENTATION_TYPE not like", value, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeIn(List<String> values) {
            addCriterion("PRESENTATION_TYPE in", values, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeNotIn(List<String> values) {
            addCriterion("PRESENTATION_TYPE not in", values, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeBetween(String value1, String value2) {
            addCriterion("PRESENTATION_TYPE between", value1, value2, "presentationType");
            return (Criteria) this;
        }

        public Criteria andPresentationTypeNotBetween(String value1, String value2) {
            addCriterion("PRESENTATION_TYPE not between", value1, value2, "presentationType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("ACCOUNT_TYPE >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("ACCOUNT_TYPE <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("ACCOUNT_TYPE like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("ACCOUNT_TYPE not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("ACCOUNT_TYPE in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("ACCOUNT_TYPE not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("ACCOUNT_TYPE between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_TYPE not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNull() {
            addCriterion("LOCALE is null");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNotNull() {
            addCriterion("LOCALE is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleEqualTo(String value) {
            addCriterion("LOCALE =", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotEqualTo(String value) {
            addCriterion("LOCALE <>", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThan(String value) {
            addCriterion("LOCALE >", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALE >=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThan(String value) {
            addCriterion("LOCALE <", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThanOrEqualTo(String value) {
            addCriterion("LOCALE <=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLike(String value) {
            addCriterion("LOCALE like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotLike(String value) {
            addCriterion("LOCALE not like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleIn(List<String> values) {
            addCriterion("LOCALE in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotIn(List<String> values) {
            addCriterion("LOCALE not in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleBetween(String value1, String value2) {
            addCriterion("LOCALE between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotBetween(String value1, String value2) {
            addCriterion("LOCALE not between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andAccountSourceIsNull() {
            addCriterion("ACCOUNT_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andAccountSourceIsNotNull() {
            addCriterion("ACCOUNT_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSourceEqualTo(String value) {
            addCriterion("ACCOUNT_SOURCE =", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceNotEqualTo(String value) {
            addCriterion("ACCOUNT_SOURCE <>", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceGreaterThan(String value) {
            addCriterion("ACCOUNT_SOURCE >", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_SOURCE >=", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceLessThan(String value) {
            addCriterion("ACCOUNT_SOURCE <", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_SOURCE <=", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceLike(String value) {
            addCriterion("ACCOUNT_SOURCE like", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceNotLike(String value) {
            addCriterion("ACCOUNT_SOURCE not like", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceIn(List<String> values) {
            addCriterion("ACCOUNT_SOURCE in", values, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceNotIn(List<String> values) {
            addCriterion("ACCOUNT_SOURCE not in", values, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceBetween(String value1, String value2) {
            addCriterion("ACCOUNT_SOURCE between", value1, value2, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_SOURCE not between", value1, value2, "accountSource");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeIsNull() {
            addCriterion("CONSUMER_ENTRY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeIsNotNull() {
            addCriterion("CONSUMER_ENTRY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeEqualTo(String value) {
            addCriterion("CONSUMER_ENTRY_MODE =", value, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeNotEqualTo(String value) {
            addCriterion("CONSUMER_ENTRY_MODE <>", value, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeGreaterThan(String value) {
            addCriterion("CONSUMER_ENTRY_MODE >", value, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeGreaterThanOrEqualTo(String value) {
            addCriterion("CONSUMER_ENTRY_MODE >=", value, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeLessThan(String value) {
            addCriterion("CONSUMER_ENTRY_MODE <", value, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeLessThanOrEqualTo(String value) {
            addCriterion("CONSUMER_ENTRY_MODE <=", value, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeLike(String value) {
            addCriterion("CONSUMER_ENTRY_MODE like", value, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeNotLike(String value) {
            addCriterion("CONSUMER_ENTRY_MODE not like", value, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeIn(List<String> values) {
            addCriterion("CONSUMER_ENTRY_MODE in", values, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeNotIn(List<String> values) {
            addCriterion("CONSUMER_ENTRY_MODE not in", values, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeBetween(String value1, String value2) {
            addCriterion("CONSUMER_ENTRY_MODE between", value1, value2, "consumerEntryMode");
            return (Criteria) this;
        }

        public Criteria andConsumerEntryModeNotBetween(String value1, String value2) {
            addCriterion("CONSUMER_ENTRY_MODE not between", value1, value2, "consumerEntryMode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}