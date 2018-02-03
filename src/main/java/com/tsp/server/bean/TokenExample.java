package com.tsp.server.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TokenExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
            return (Criteria) this;
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

        public Criteria andProfileIdIsNull() {
            addCriterion("PROFILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProfileIdIsNotNull() {
            addCriterion("PROFILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProfileIdEqualTo(Integer value) {
            addCriterion("PROFILE_ID =", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdNotEqualTo(Integer value) {
            addCriterion("PROFILE_ID <>", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdGreaterThan(Integer value) {
            addCriterion("PROFILE_ID >", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROFILE_ID >=", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdLessThan(Integer value) {
            addCriterion("PROFILE_ID <", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROFILE_ID <=", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdIn(List<Integer> values) {
            addCriterion("PROFILE_ID in", values, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdNotIn(List<Integer> values) {
            addCriterion("PROFILE_ID not in", values, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdBetween(Integer value1, Integer value2) {
            addCriterion("PROFILE_ID between", value1, value2, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROFILE_ID not between", value1, value2, "profileId");
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

        public Criteria andExpirationDateIsNull() {
            addCriterion("EXPIRATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNotNull() {
            addCriterion("EXPIRATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE =", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE <>", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE >", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE >=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThan(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE <", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE <=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIn(List<Date> values) {
            addCriterionForJDBCDate("EXPIRATION_DATE in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXPIRATION_DATE not in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPIRATION_DATE between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPIRATION_DATE not between", value1, value2, "expirationDate");
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