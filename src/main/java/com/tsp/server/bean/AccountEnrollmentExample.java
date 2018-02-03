package com.tsp.server.bean;

import java.util.ArrayList;
import java.util.List;

public class AccountEnrollmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountEnrollmentExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
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

        public Criteria andAccountEntryModeIsNull() {
            addCriterion("ACCOUNT_ENTRY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeIsNotNull() {
            addCriterion("ACCOUNT_ENTRY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeEqualTo(String value) {
            addCriterion("ACCOUNT_ENTRY_MODE =", value, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeNotEqualTo(String value) {
            addCriterion("ACCOUNT_ENTRY_MODE <>", value, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeGreaterThan(String value) {
            addCriterion("ACCOUNT_ENTRY_MODE >", value, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ENTRY_MODE >=", value, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeLessThan(String value) {
            addCriterion("ACCOUNT_ENTRY_MODE <", value, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ENTRY_MODE <=", value, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeLike(String value) {
            addCriterion("ACCOUNT_ENTRY_MODE like", value, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeNotLike(String value) {
            addCriterion("ACCOUNT_ENTRY_MODE not like", value, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeIn(List<String> values) {
            addCriterion("ACCOUNT_ENTRY_MODE in", values, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeNotIn(List<String> values) {
            addCriterion("ACCOUNT_ENTRY_MODE not in", values, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ENTRY_MODE between", value1, value2, "accountEntryMode");
            return (Criteria) this;
        }

        public Criteria andAccountEntryModeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ENTRY_MODE not between", value1, value2, "accountEntryMode");
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