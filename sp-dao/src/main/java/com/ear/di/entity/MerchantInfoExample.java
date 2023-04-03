package com.ear.di.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantInfoExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdIsNull() {
            addCriterion("chnl_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdIsNotNull() {
            addCriterion("chnl_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdEqualTo(String value) {
            addCriterion("chnl_agent_id =", value, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdNotEqualTo(String value) {
            addCriterion("chnl_agent_id <>", value, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdGreaterThan(String value) {
            addCriterion("chnl_agent_id >", value, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("chnl_agent_id >=", value, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdLessThan(String value) {
            addCriterion("chnl_agent_id <", value, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdLessThanOrEqualTo(String value) {
            addCriterion("chnl_agent_id <=", value, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdLike(String value) {
            addCriterion("chnl_agent_id like", value, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdNotLike(String value) {
            addCriterion("chnl_agent_id not like", value, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdIn(List<String> values) {
            addCriterion("chnl_agent_id in", values, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdNotIn(List<String> values) {
            addCriterion("chnl_agent_id not in", values, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdBetween(String value1, String value2) {
            addCriterion("chnl_agent_id between", value1, value2, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andChnlAgentIdNotBetween(String value1, String value2) {
            addCriterion("chnl_agent_id not between", value1, value2, "chnlAgentId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdIsNull() {
            addCriterion("merchant_privat_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdIsNotNull() {
            addCriterion("merchant_privat_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdEqualTo(String value) {
            addCriterion("merchant_privat_id =", value, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdNotEqualTo(String value) {
            addCriterion("merchant_privat_id <>", value, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdGreaterThan(String value) {
            addCriterion("merchant_privat_id >", value, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_privat_id >=", value, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdLessThan(String value) {
            addCriterion("merchant_privat_id <", value, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_privat_id <=", value, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdLike(String value) {
            addCriterion("merchant_privat_id like", value, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdNotLike(String value) {
            addCriterion("merchant_privat_id not like", value, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdIn(List<String> values) {
            addCriterion("merchant_privat_id in", values, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdNotIn(List<String> values) {
            addCriterion("merchant_privat_id not in", values, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdBetween(String value1, String value2) {
            addCriterion("merchant_privat_id between", value1, value2, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantPrivatIdNotBetween(String value1, String value2) {
            addCriterion("merchant_privat_id not between", value1, value2, "merchantPrivatId");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressIsNull() {
            addCriterion("merchant_adress is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressIsNotNull() {
            addCriterion("merchant_adress is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressEqualTo(String value) {
            addCriterion("merchant_adress =", value, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressNotEqualTo(String value) {
            addCriterion("merchant_adress <>", value, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressGreaterThan(String value) {
            addCriterion("merchant_adress >", value, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_adress >=", value, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressLessThan(String value) {
            addCriterion("merchant_adress <", value, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressLessThanOrEqualTo(String value) {
            addCriterion("merchant_adress <=", value, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressLike(String value) {
            addCriterion("merchant_adress like", value, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressNotLike(String value) {
            addCriterion("merchant_adress not like", value, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressIn(List<String> values) {
            addCriterion("merchant_adress in", values, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressNotIn(List<String> values) {
            addCriterion("merchant_adress not in", values, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressBetween(String value1, String value2) {
            addCriterion("merchant_adress between", value1, value2, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantAdressNotBetween(String value1, String value2) {
            addCriterion("merchant_adress not between", value1, value2, "merchantAdress");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneIsNull() {
            addCriterion("merchant_phone is null");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneIsNotNull() {
            addCriterion("merchant_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneEqualTo(String value) {
            addCriterion("merchant_phone =", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneNotEqualTo(String value) {
            addCriterion("merchant_phone <>", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneGreaterThan(String value) {
            addCriterion("merchant_phone >", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_phone >=", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneLessThan(String value) {
            addCriterion("merchant_phone <", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneLessThanOrEqualTo(String value) {
            addCriterion("merchant_phone <=", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneLike(String value) {
            addCriterion("merchant_phone like", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneNotLike(String value) {
            addCriterion("merchant_phone not like", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneIn(List<String> values) {
            addCriterion("merchant_phone in", values, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneNotIn(List<String> values) {
            addCriterion("merchant_phone not in", values, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneBetween(String value1, String value2) {
            addCriterion("merchant_phone between", value1, value2, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneNotBetween(String value1, String value2) {
            addCriterion("merchant_phone not between", value1, value2, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailIsNull() {
            addCriterion("merchant_email is null");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailIsNotNull() {
            addCriterion("merchant_email is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailEqualTo(String value) {
            addCriterion("merchant_email =", value, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailNotEqualTo(String value) {
            addCriterion("merchant_email <>", value, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailGreaterThan(String value) {
            addCriterion("merchant_email >", value, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_email >=", value, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailLessThan(String value) {
            addCriterion("merchant_email <", value, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailLessThanOrEqualTo(String value) {
            addCriterion("merchant_email <=", value, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailLike(String value) {
            addCriterion("merchant_email like", value, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailNotLike(String value) {
            addCriterion("merchant_email not like", value, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailIn(List<String> values) {
            addCriterion("merchant_email in", values, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailNotIn(List<String> values) {
            addCriterion("merchant_email not in", values, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailBetween(String value1, String value2) {
            addCriterion("merchant_email between", value1, value2, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantEmailNotBetween(String value1, String value2) {
            addCriterion("merchant_email not between", value1, value2, "merchantEmail");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusIsNull() {
            addCriterion("merchant_status is null");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusIsNotNull() {
            addCriterion("merchant_status is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusEqualTo(String value) {
            addCriterion("merchant_status =", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusNotEqualTo(String value) {
            addCriterion("merchant_status <>", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusGreaterThan(String value) {
            addCriterion("merchant_status >", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_status >=", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusLessThan(String value) {
            addCriterion("merchant_status <", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusLessThanOrEqualTo(String value) {
            addCriterion("merchant_status <=", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusLike(String value) {
            addCriterion("merchant_status like", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusNotLike(String value) {
            addCriterion("merchant_status not like", value, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusIn(List<String> values) {
            addCriterion("merchant_status in", values, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusNotIn(List<String> values) {
            addCriterion("merchant_status not in", values, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusBetween(String value1, String value2) {
            addCriterion("merchant_status between", value1, value2, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantStatusNotBetween(String value1, String value2) {
            addCriterion("merchant_status not between", value1, value2, "merchantStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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