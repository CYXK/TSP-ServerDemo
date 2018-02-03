package com.tsp.server.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfileExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdIsNull() {
            addCriterion("SERVICE_REQUESTOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdIsNotNull() {
            addCriterion("SERVICE_REQUESTOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdEqualTo(Integer value) {
            addCriterion("SERVICE_REQUESTOR_ID =", value, "serviceRequestorId");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdNotEqualTo(Integer value) {
            addCriterion("SERVICE_REQUESTOR_ID <>", value, "serviceRequestorId");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdGreaterThan(Integer value) {
            addCriterion("SERVICE_REQUESTOR_ID >", value, "serviceRequestorId");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_REQUESTOR_ID >=", value, "serviceRequestorId");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdLessThan(Integer value) {
            addCriterion("SERVICE_REQUESTOR_ID <", value, "serviceRequestorId");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdLessThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_REQUESTOR_ID <=", value, "serviceRequestorId");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdIn(List<Integer> values) {
            addCriterion("SERVICE_REQUESTOR_ID in", values, "serviceRequestorId");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdNotIn(List<Integer> values) {
            addCriterion("SERVICE_REQUESTOR_ID not in", values, "serviceRequestorId");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_REQUESTOR_ID between", value1, value2, "serviceRequestorId");
            return (Criteria) this;
        }

        public Criteria andServiceRequestorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_REQUESTOR_ID not between", value1, value2, "serviceRequestorId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdIsNull() {
            addCriterion("TOKEN_REQUESTOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdIsNotNull() {
            addCriterion("TOKEN_REQUESTOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdEqualTo(String value) {
            addCriterion("TOKEN_REQUESTOR_ID =", value, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdNotEqualTo(String value) {
            addCriterion("TOKEN_REQUESTOR_ID <>", value, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdGreaterThan(String value) {
            addCriterion("TOKEN_REQUESTOR_ID >", value, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN_REQUESTOR_ID >=", value, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdLessThan(String value) {
            addCriterion("TOKEN_REQUESTOR_ID <", value, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdLessThanOrEqualTo(String value) {
            addCriterion("TOKEN_REQUESTOR_ID <=", value, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdLike(String value) {
            addCriterion("TOKEN_REQUESTOR_ID like", value, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdNotLike(String value) {
            addCriterion("TOKEN_REQUESTOR_ID not like", value, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdIn(List<String> values) {
            addCriterion("TOKEN_REQUESTOR_ID in", values, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdNotIn(List<String> values) {
            addCriterion("TOKEN_REQUESTOR_ID not in", values, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdBetween(String value1, String value2) {
            addCriterion("TOKEN_REQUESTOR_ID between", value1, value2, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andTokenRequestorIdNotBetween(String value1, String value2) {
            addCriterion("TOKEN_REQUESTOR_ID not between", value1, value2, "tokenRequestorId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyIsNull() {
            addCriterion("ENCRYPTION_API_KEY is null");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyIsNotNull() {
            addCriterion("ENCRYPTION_API_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyEqualTo(String value) {
            addCriterion("ENCRYPTION_API_KEY =", value, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyNotEqualTo(String value) {
            addCriterion("ENCRYPTION_API_KEY <>", value, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyGreaterThan(String value) {
            addCriterion("ENCRYPTION_API_KEY >", value, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ENCRYPTION_API_KEY >=", value, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyLessThan(String value) {
            addCriterion("ENCRYPTION_API_KEY <", value, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyLessThanOrEqualTo(String value) {
            addCriterion("ENCRYPTION_API_KEY <=", value, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyLike(String value) {
            addCriterion("ENCRYPTION_API_KEY like", value, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyNotLike(String value) {
            addCriterion("ENCRYPTION_API_KEY not like", value, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyIn(List<String> values) {
            addCriterion("ENCRYPTION_API_KEY in", values, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyNotIn(List<String> values) {
            addCriterion("ENCRYPTION_API_KEY not in", values, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyBetween(String value1, String value2) {
            addCriterion("ENCRYPTION_API_KEY between", value1, value2, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionApiKeyNotBetween(String value1, String value2) {
            addCriterion("ENCRYPTION_API_KEY not between", value1, value2, "encryptionApiKey");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretIsNull() {
            addCriterion("ENCRYPTION_SECRET is null");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretIsNotNull() {
            addCriterion("ENCRYPTION_SECRET is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretEqualTo(String value) {
            addCriterion("ENCRYPTION_SECRET =", value, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretNotEqualTo(String value) {
            addCriterion("ENCRYPTION_SECRET <>", value, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretGreaterThan(String value) {
            addCriterion("ENCRYPTION_SECRET >", value, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretGreaterThanOrEqualTo(String value) {
            addCriterion("ENCRYPTION_SECRET >=", value, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretLessThan(String value) {
            addCriterion("ENCRYPTION_SECRET <", value, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretLessThanOrEqualTo(String value) {
            addCriterion("ENCRYPTION_SECRET <=", value, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretLike(String value) {
            addCriterion("ENCRYPTION_SECRET like", value, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretNotLike(String value) {
            addCriterion("ENCRYPTION_SECRET not like", value, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretIn(List<String> values) {
            addCriterion("ENCRYPTION_SECRET in", values, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretNotIn(List<String> values) {
            addCriterion("ENCRYPTION_SECRET not in", values, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretBetween(String value1, String value2) {
            addCriterion("ENCRYPTION_SECRET between", value1, value2, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andEncryptionSecretNotBetween(String value1, String value2) {
            addCriterion("ENCRYPTION_SECRET not between", value1, value2, "encryptionSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyIsNull() {
            addCriterion("POSTBACK_API_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyIsNotNull() {
            addCriterion("POSTBACK_API_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyEqualTo(String value) {
            addCriterion("POSTBACK_API_KEY =", value, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyNotEqualTo(String value) {
            addCriterion("POSTBACK_API_KEY <>", value, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyGreaterThan(String value) {
            addCriterion("POSTBACK_API_KEY >", value, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyGreaterThanOrEqualTo(String value) {
            addCriterion("POSTBACK_API_KEY >=", value, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyLessThan(String value) {
            addCriterion("POSTBACK_API_KEY <", value, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyLessThanOrEqualTo(String value) {
            addCriterion("POSTBACK_API_KEY <=", value, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyLike(String value) {
            addCriterion("POSTBACK_API_KEY like", value, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyNotLike(String value) {
            addCriterion("POSTBACK_API_KEY not like", value, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyIn(List<String> values) {
            addCriterion("POSTBACK_API_KEY in", values, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyNotIn(List<String> values) {
            addCriterion("POSTBACK_API_KEY not in", values, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyBetween(String value1, String value2) {
            addCriterion("POSTBACK_API_KEY between", value1, value2, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackApiKeyNotBetween(String value1, String value2) {
            addCriterion("POSTBACK_API_KEY not between", value1, value2, "postbackApiKey");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretIsNull() {
            addCriterion("POSTBACK_SECRET is null");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretIsNotNull() {
            addCriterion("POSTBACK_SECRET is not null");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretEqualTo(String value) {
            addCriterion("POSTBACK_SECRET =", value, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretNotEqualTo(String value) {
            addCriterion("POSTBACK_SECRET <>", value, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretGreaterThan(String value) {
            addCriterion("POSTBACK_SECRET >", value, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretGreaterThanOrEqualTo(String value) {
            addCriterion("POSTBACK_SECRET >=", value, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretLessThan(String value) {
            addCriterion("POSTBACK_SECRET <", value, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretLessThanOrEqualTo(String value) {
            addCriterion("POSTBACK_SECRET <=", value, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretLike(String value) {
            addCriterion("POSTBACK_SECRET like", value, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretNotLike(String value) {
            addCriterion("POSTBACK_SECRET not like", value, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretIn(List<String> values) {
            addCriterion("POSTBACK_SECRET in", values, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretNotIn(List<String> values) {
            addCriterion("POSTBACK_SECRET not in", values, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretBetween(String value1, String value2) {
            addCriterion("POSTBACK_SECRET between", value1, value2, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackSecretNotBetween(String value1, String value2) {
            addCriterion("POSTBACK_SECRET not between", value1, value2, "postbackSecret");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlIsNull() {
            addCriterion("POSTBACK_URL is null");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlIsNotNull() {
            addCriterion("POSTBACK_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlEqualTo(String value) {
            addCriterion("POSTBACK_URL =", value, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlNotEqualTo(String value) {
            addCriterion("POSTBACK_URL <>", value, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlGreaterThan(String value) {
            addCriterion("POSTBACK_URL >", value, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("POSTBACK_URL >=", value, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlLessThan(String value) {
            addCriterion("POSTBACK_URL <", value, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlLessThanOrEqualTo(String value) {
            addCriterion("POSTBACK_URL <=", value, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlLike(String value) {
            addCriterion("POSTBACK_URL like", value, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlNotLike(String value) {
            addCriterion("POSTBACK_URL not like", value, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlIn(List<String> values) {
            addCriterion("POSTBACK_URL in", values, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlNotIn(List<String> values) {
            addCriterion("POSTBACK_URL not in", values, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlBetween(String value1, String value2) {
            addCriterion("POSTBACK_URL between", value1, value2, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andPostbackUrlNotBetween(String value1, String value2) {
            addCriterion("POSTBACK_URL not between", value1, value2, "postbackUrl");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsIsNull() {
            addCriterion("MAXPMTS is null");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsIsNotNull() {
            addCriterion("MAXPMTS is not null");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsEqualTo(Integer value) {
            addCriterion("MAXPMTS =", value, "maxpmts");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsNotEqualTo(Integer value) {
            addCriterion("MAXPMTS <>", value, "maxpmts");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsGreaterThan(Integer value) {
            addCriterion("MAXPMTS >", value, "maxpmts");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAXPMTS >=", value, "maxpmts");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsLessThan(Integer value) {
            addCriterion("MAXPMTS <", value, "maxpmts");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsLessThanOrEqualTo(Integer value) {
            addCriterion("MAXPMTS <=", value, "maxpmts");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsIn(List<Integer> values) {
            addCriterion("MAXPMTS in", values, "maxpmts");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsNotIn(List<Integer> values) {
            addCriterion("MAXPMTS not in", values, "maxpmts");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsBetween(Integer value1, Integer value2) {
            addCriterion("MAXPMTS between", value1, value2, "maxpmts");
            return (Criteria) this;
        }

        public Criteria andMaxpmtsNotBetween(Integer value1, Integer value2) {
            addCriterion("MAXPMTS not between", value1, value2, "maxpmts");
            return (Criteria) this;
        }

        public Criteria andKeyexptsIsNull() {
            addCriterion("KEYEXPTS is null");
            return (Criteria) this;
        }

        public Criteria andKeyexptsIsNotNull() {
            addCriterion("KEYEXPTS is not null");
            return (Criteria) this;
        }

        public Criteria andKeyexptsEqualTo(Date value) {
            addCriterion("KEYEXPTS =", value, "keyexpts");
            return (Criteria) this;
        }

        public Criteria andKeyexptsNotEqualTo(Date value) {
            addCriterion("KEYEXPTS <>", value, "keyexpts");
            return (Criteria) this;
        }

        public Criteria andKeyexptsGreaterThan(Date value) {
            addCriterion("KEYEXPTS >", value, "keyexpts");
            return (Criteria) this;
        }

        public Criteria andKeyexptsGreaterThanOrEqualTo(Date value) {
            addCriterion("KEYEXPTS >=", value, "keyexpts");
            return (Criteria) this;
        }

        public Criteria andKeyexptsLessThan(Date value) {
            addCriterion("KEYEXPTS <", value, "keyexpts");
            return (Criteria) this;
        }

        public Criteria andKeyexptsLessThanOrEqualTo(Date value) {
            addCriterion("KEYEXPTS <=", value, "keyexpts");
            return (Criteria) this;
        }

        public Criteria andKeyexptsIn(List<Date> values) {
            addCriterion("KEYEXPTS in", values, "keyexpts");
            return (Criteria) this;
        }

        public Criteria andKeyexptsNotIn(List<Date> values) {
            addCriterion("KEYEXPTS not in", values, "keyexpts");
            return (Criteria) this;
        }

        public Criteria andKeyexptsBetween(Date value1, Date value2) {
            addCriterion("KEYEXPTS between", value1, value2, "keyexpts");
            return (Criteria) this;
        }

        public Criteria andKeyexptsNotBetween(Date value1, Date value2) {
            addCriterion("KEYEXPTS not between", value1, value2, "keyexpts");
            return (Criteria) this;
        }

        public Criteria andAmountLimitIsNull() {
            addCriterion("AMOUNT_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andAmountLimitIsNotNull() {
            addCriterion("AMOUNT_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountLimitEqualTo(Long value) {
            addCriterion("AMOUNT_LIMIT =", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitNotEqualTo(Long value) {
            addCriterion("AMOUNT_LIMIT <>", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitGreaterThan(Long value) {
            addCriterion("AMOUNT_LIMIT >", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitGreaterThanOrEqualTo(Long value) {
            addCriterion("AMOUNT_LIMIT >=", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitLessThan(Long value) {
            addCriterion("AMOUNT_LIMIT <", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitLessThanOrEqualTo(Long value) {
            addCriterion("AMOUNT_LIMIT <=", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitIn(List<Long> values) {
            addCriterion("AMOUNT_LIMIT in", values, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitNotIn(List<Long> values) {
            addCriterion("AMOUNT_LIMIT not in", values, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitBetween(Long value1, Long value2) {
            addCriterion("AMOUNT_LIMIT between", value1, value2, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitNotBetween(Long value1, Long value2) {
            addCriterion("AMOUNT_LIMIT not between", value1, value2, "amountLimit");
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