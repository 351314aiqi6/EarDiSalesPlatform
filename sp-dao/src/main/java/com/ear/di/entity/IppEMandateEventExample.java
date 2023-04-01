package com.ear.di.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IppEMandateEventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IppEMandateEventExample() {
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

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(String value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(String value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(String value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(String value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(String value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLike(String value) {
            addCriterion("event_id like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotLike(String value) {
            addCriterion("event_id not like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<String> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<String> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(String value1, String value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(String value1, String value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNull() {
            addCriterion("event_type is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("event_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(String value) {
            addCriterion("event_type =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(String value) {
            addCriterion("event_type <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(String value) {
            addCriterion("event_type >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(String value) {
            addCriterion("event_type >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(String value) {
            addCriterion("event_type <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(String value) {
            addCriterion("event_type <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLike(String value) {
            addCriterion("event_type like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotLike(String value) {
            addCriterion("event_type not like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<String> values) {
            addCriterion("event_type in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<String> values) {
            addCriterion("event_type not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(String value1, String value2) {
            addCriterion("event_type between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(String value1, String value2) {
            addCriterion("event_type not between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescIsNull() {
            addCriterion("event_type_desc is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescIsNotNull() {
            addCriterion("event_type_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescEqualTo(String value) {
            addCriterion("event_type_desc =", value, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescNotEqualTo(String value) {
            addCriterion("event_type_desc <>", value, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescGreaterThan(String value) {
            addCriterion("event_type_desc >", value, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("event_type_desc >=", value, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescLessThan(String value) {
            addCriterion("event_type_desc <", value, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescLessThanOrEqualTo(String value) {
            addCriterion("event_type_desc <=", value, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescLike(String value) {
            addCriterion("event_type_desc like", value, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescNotLike(String value) {
            addCriterion("event_type_desc not like", value, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescIn(List<String> values) {
            addCriterion("event_type_desc in", values, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescNotIn(List<String> values) {
            addCriterion("event_type_desc not in", values, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescBetween(String value1, String value2) {
            addCriterion("event_type_desc between", value1, value2, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventTypeDescNotBetween(String value1, String value2) {
            addCriterion("event_type_desc not between", value1, value2, "eventTypeDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusIsNull() {
            addCriterion("event_status is null");
            return (Criteria) this;
        }

        public Criteria andEventStatusIsNotNull() {
            addCriterion("event_status is not null");
            return (Criteria) this;
        }

        public Criteria andEventStatusEqualTo(String value) {
            addCriterion("event_status =", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusNotEqualTo(String value) {
            addCriterion("event_status <>", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusGreaterThan(String value) {
            addCriterion("event_status >", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusGreaterThanOrEqualTo(String value) {
            addCriterion("event_status >=", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusLessThan(String value) {
            addCriterion("event_status <", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusLessThanOrEqualTo(String value) {
            addCriterion("event_status <=", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusLike(String value) {
            addCriterion("event_status like", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusNotLike(String value) {
            addCriterion("event_status not like", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusIn(List<String> values) {
            addCriterion("event_status in", values, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusNotIn(List<String> values) {
            addCriterion("event_status not in", values, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusBetween(String value1, String value2) {
            addCriterion("event_status between", value1, value2, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusNotBetween(String value1, String value2) {
            addCriterion("event_status not between", value1, value2, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescIsNull() {
            addCriterion("event_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescIsNotNull() {
            addCriterion("event_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescEqualTo(String value) {
            addCriterion("event_status_desc =", value, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescNotEqualTo(String value) {
            addCriterion("event_status_desc <>", value, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescGreaterThan(String value) {
            addCriterion("event_status_desc >", value, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("event_status_desc >=", value, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescLessThan(String value) {
            addCriterion("event_status_desc <", value, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescLessThanOrEqualTo(String value) {
            addCriterion("event_status_desc <=", value, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescLike(String value) {
            addCriterion("event_status_desc like", value, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescNotLike(String value) {
            addCriterion("event_status_desc not like", value, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescIn(List<String> values) {
            addCriterion("event_status_desc in", values, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescNotIn(List<String> values) {
            addCriterion("event_status_desc not in", values, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescBetween(String value1, String value2) {
            addCriterion("event_status_desc between", value1, value2, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andEventStatusDescNotBetween(String value1, String value2) {
            addCriterion("event_status_desc not between", value1, value2, "eventStatusDesc");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqIsNull() {
            addCriterion("from_chnl_seq is null");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqIsNotNull() {
            addCriterion("from_chnl_seq is not null");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqEqualTo(String value) {
            addCriterion("from_chnl_seq =", value, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqNotEqualTo(String value) {
            addCriterion("from_chnl_seq <>", value, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqGreaterThan(String value) {
            addCriterion("from_chnl_seq >", value, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqGreaterThanOrEqualTo(String value) {
            addCriterion("from_chnl_seq >=", value, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqLessThan(String value) {
            addCriterion("from_chnl_seq <", value, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqLessThanOrEqualTo(String value) {
            addCriterion("from_chnl_seq <=", value, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqLike(String value) {
            addCriterion("from_chnl_seq like", value, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqNotLike(String value) {
            addCriterion("from_chnl_seq not like", value, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqIn(List<String> values) {
            addCriterion("from_chnl_seq in", values, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqNotIn(List<String> values) {
            addCriterion("from_chnl_seq not in", values, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqBetween(String value1, String value2) {
            addCriterion("from_chnl_seq between", value1, value2, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlSeqNotBetween(String value1, String value2) {
            addCriterion("from_chnl_seq not between", value1, value2, "fromChnlSeq");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeIsNull() {
            addCriterion("from_chnl_code is null");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeIsNotNull() {
            addCriterion("from_chnl_code is not null");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeEqualTo(String value) {
            addCriterion("from_chnl_code =", value, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeNotEqualTo(String value) {
            addCriterion("from_chnl_code <>", value, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeGreaterThan(String value) {
            addCriterion("from_chnl_code >", value, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeGreaterThanOrEqualTo(String value) {
            addCriterion("from_chnl_code >=", value, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeLessThan(String value) {
            addCriterion("from_chnl_code <", value, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeLessThanOrEqualTo(String value) {
            addCriterion("from_chnl_code <=", value, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeLike(String value) {
            addCriterion("from_chnl_code like", value, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeNotLike(String value) {
            addCriterion("from_chnl_code not like", value, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeIn(List<String> values) {
            addCriterion("from_chnl_code in", values, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeNotIn(List<String> values) {
            addCriterion("from_chnl_code not in", values, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeBetween(String value1, String value2) {
            addCriterion("from_chnl_code between", value1, value2, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlCodeNotBetween(String value1, String value2) {
            addCriterion("from_chnl_code not between", value1, value2, "fromChnlCode");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateIsNull() {
            addCriterion("from_chnl_date is null");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateIsNotNull() {
            addCriterion("from_chnl_date is not null");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateEqualTo(Date value) {
            addCriterion("from_chnl_date =", value, "fromChnlDate");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateNotEqualTo(Date value) {
            addCriterion("from_chnl_date <>", value, "fromChnlDate");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateGreaterThan(Date value) {
            addCriterion("from_chnl_date >", value, "fromChnlDate");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateGreaterThanOrEqualTo(Date value) {
            addCriterion("from_chnl_date >=", value, "fromChnlDate");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateLessThan(Date value) {
            addCriterion("from_chnl_date <", value, "fromChnlDate");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateLessThanOrEqualTo(Date value) {
            addCriterion("from_chnl_date <=", value, "fromChnlDate");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateIn(List<Date> values) {
            addCriterion("from_chnl_date in", values, "fromChnlDate");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateNotIn(List<Date> values) {
            addCriterion("from_chnl_date not in", values, "fromChnlDate");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateBetween(Date value1, Date value2) {
            addCriterion("from_chnl_date between", value1, value2, "fromChnlDate");
            return (Criteria) this;
        }

        public Criteria andFromChnlDateNotBetween(Date value1, Date value2) {
            addCriterion("from_chnl_date not between", value1, value2, "fromChnlDate");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmIsNull() {
            addCriterion("from_chnl_dttm is null");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmIsNotNull() {
            addCriterion("from_chnl_dttm is not null");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmEqualTo(Date value) {
            addCriterion("from_chnl_dttm =", value, "fromChnlDttm");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmNotEqualTo(Date value) {
            addCriterion("from_chnl_dttm <>", value, "fromChnlDttm");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmGreaterThan(Date value) {
            addCriterion("from_chnl_dttm >", value, "fromChnlDttm");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmGreaterThanOrEqualTo(Date value) {
            addCriterion("from_chnl_dttm >=", value, "fromChnlDttm");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmLessThan(Date value) {
            addCriterion("from_chnl_dttm <", value, "fromChnlDttm");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmLessThanOrEqualTo(Date value) {
            addCriterion("from_chnl_dttm <=", value, "fromChnlDttm");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmIn(List<Date> values) {
            addCriterion("from_chnl_dttm in", values, "fromChnlDttm");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmNotIn(List<Date> values) {
            addCriterion("from_chnl_dttm not in", values, "fromChnlDttm");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmBetween(Date value1, Date value2) {
            addCriterion("from_chnl_dttm between", value1, value2, "fromChnlDttm");
            return (Criteria) this;
        }

        public Criteria andFromChnlDttmNotBetween(Date value1, Date value2) {
            addCriterion("from_chnl_dttm not between", value1, value2, "fromChnlDttm");
            return (Criteria) this;
        }

        public Criteria andMandateIdIsNull() {
            addCriterion("mandate_id is null");
            return (Criteria) this;
        }

        public Criteria andMandateIdIsNotNull() {
            addCriterion("mandate_id is not null");
            return (Criteria) this;
        }

        public Criteria andMandateIdEqualTo(String value) {
            addCriterion("mandate_id =", value, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdNotEqualTo(String value) {
            addCriterion("mandate_id <>", value, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdGreaterThan(String value) {
            addCriterion("mandate_id >", value, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdGreaterThanOrEqualTo(String value) {
            addCriterion("mandate_id >=", value, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdLessThan(String value) {
            addCriterion("mandate_id <", value, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdLessThanOrEqualTo(String value) {
            addCriterion("mandate_id <=", value, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdLike(String value) {
            addCriterion("mandate_id like", value, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdNotLike(String value) {
            addCriterion("mandate_id not like", value, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdIn(List<String> values) {
            addCriterion("mandate_id in", values, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdNotIn(List<String> values) {
            addCriterion("mandate_id not in", values, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdBetween(String value1, String value2) {
            addCriterion("mandate_id between", value1, value2, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateIdNotBetween(String value1, String value2) {
            addCriterion("mandate_id not between", value1, value2, "mandateId");
            return (Criteria) this;
        }

        public Criteria andMandateStatusIsNull() {
            addCriterion("mandate_status is null");
            return (Criteria) this;
        }

        public Criteria andMandateStatusIsNotNull() {
            addCriterion("mandate_status is not null");
            return (Criteria) this;
        }

        public Criteria andMandateStatusEqualTo(String value) {
            addCriterion("mandate_status =", value, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusNotEqualTo(String value) {
            addCriterion("mandate_status <>", value, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusGreaterThan(String value) {
            addCriterion("mandate_status >", value, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusGreaterThanOrEqualTo(String value) {
            addCriterion("mandate_status >=", value, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusLessThan(String value) {
            addCriterion("mandate_status <", value, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusLessThanOrEqualTo(String value) {
            addCriterion("mandate_status <=", value, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusLike(String value) {
            addCriterion("mandate_status like", value, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusNotLike(String value) {
            addCriterion("mandate_status not like", value, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusIn(List<String> values) {
            addCriterion("mandate_status in", values, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusNotIn(List<String> values) {
            addCriterion("mandate_status not in", values, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusBetween(String value1, String value2) {
            addCriterion("mandate_status between", value1, value2, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateStatusNotBetween(String value1, String value2) {
            addCriterion("mandate_status not between", value1, value2, "mandateStatus");
            return (Criteria) this;
        }

        public Criteria andMandateRoleIsNull() {
            addCriterion("mandate_role is null");
            return (Criteria) this;
        }

        public Criteria andMandateRoleIsNotNull() {
            addCriterion("mandate_role is not null");
            return (Criteria) this;
        }

        public Criteria andMandateRoleEqualTo(String value) {
            addCriterion("mandate_role =", value, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleNotEqualTo(String value) {
            addCriterion("mandate_role <>", value, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleGreaterThan(String value) {
            addCriterion("mandate_role >", value, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleGreaterThanOrEqualTo(String value) {
            addCriterion("mandate_role >=", value, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleLessThan(String value) {
            addCriterion("mandate_role <", value, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleLessThanOrEqualTo(String value) {
            addCriterion("mandate_role <=", value, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleLike(String value) {
            addCriterion("mandate_role like", value, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleNotLike(String value) {
            addCriterion("mandate_role not like", value, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleIn(List<String> values) {
            addCriterion("mandate_role in", values, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleNotIn(List<String> values) {
            addCriterion("mandate_role not in", values, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleBetween(String value1, String value2) {
            addCriterion("mandate_role between", value1, value2, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateRoleNotBetween(String value1, String value2) {
            addCriterion("mandate_role not between", value1, value2, "mandateRole");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateIsNull() {
            addCriterion("mandate_start_date is null");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateIsNotNull() {
            addCriterion("mandate_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateEqualTo(Date value) {
            addCriterion("mandate_start_date =", value, "mandateStartDate");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateNotEqualTo(Date value) {
            addCriterion("mandate_start_date <>", value, "mandateStartDate");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateGreaterThan(Date value) {
            addCriterion("mandate_start_date >", value, "mandateStartDate");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mandate_start_date >=", value, "mandateStartDate");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateLessThan(Date value) {
            addCriterion("mandate_start_date <", value, "mandateStartDate");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateLessThanOrEqualTo(Date value) {
            addCriterion("mandate_start_date <=", value, "mandateStartDate");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateIn(List<Date> values) {
            addCriterion("mandate_start_date in", values, "mandateStartDate");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateNotIn(List<Date> values) {
            addCriterion("mandate_start_date not in", values, "mandateStartDate");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateBetween(Date value1, Date value2) {
            addCriterion("mandate_start_date between", value1, value2, "mandateStartDate");
            return (Criteria) this;
        }

        public Criteria andMandateStartDateNotBetween(Date value1, Date value2) {
            addCriterion("mandate_start_date not between", value1, value2, "mandateStartDate");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateIsNull() {
            addCriterion("mandate_end_date is null");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateIsNotNull() {
            addCriterion("mandate_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateEqualTo(Date value) {
            addCriterion("mandate_end_date =", value, "mandateEndDate");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateNotEqualTo(Date value) {
            addCriterion("mandate_end_date <>", value, "mandateEndDate");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateGreaterThan(Date value) {
            addCriterion("mandate_end_date >", value, "mandateEndDate");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mandate_end_date >=", value, "mandateEndDate");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateLessThan(Date value) {
            addCriterion("mandate_end_date <", value, "mandateEndDate");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateLessThanOrEqualTo(Date value) {
            addCriterion("mandate_end_date <=", value, "mandateEndDate");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateIn(List<Date> values) {
            addCriterion("mandate_end_date in", values, "mandateEndDate");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateNotIn(List<Date> values) {
            addCriterion("mandate_end_date not in", values, "mandateEndDate");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateBetween(Date value1, Date value2) {
            addCriterion("mandate_end_date between", value1, value2, "mandateEndDate");
            return (Criteria) this;
        }

        public Criteria andMandateEndDateNotBetween(Date value1, Date value2) {
            addCriterion("mandate_end_date not between", value1, value2, "mandateEndDate");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeIsNull() {
            addCriterion("mandate_purpose is null");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeIsNotNull() {
            addCriterion("mandate_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeEqualTo(String value) {
            addCriterion("mandate_purpose =", value, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeNotEqualTo(String value) {
            addCriterion("mandate_purpose <>", value, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeGreaterThan(String value) {
            addCriterion("mandate_purpose >", value, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeGreaterThanOrEqualTo(String value) {
            addCriterion("mandate_purpose >=", value, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeLessThan(String value) {
            addCriterion("mandate_purpose <", value, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeLessThanOrEqualTo(String value) {
            addCriterion("mandate_purpose <=", value, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeLike(String value) {
            addCriterion("mandate_purpose like", value, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeNotLike(String value) {
            addCriterion("mandate_purpose not like", value, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeIn(List<String> values) {
            addCriterion("mandate_purpose in", values, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeNotIn(List<String> values) {
            addCriterion("mandate_purpose not in", values, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeBetween(String value1, String value2) {
            addCriterion("mandate_purpose between", value1, value2, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andMandatePurposeNotBetween(String value1, String value2) {
            addCriterion("mandate_purpose not between", value1, value2, "mandatePurpose");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdIsNull() {
            addCriterion("biller_reference_id is null");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdIsNotNull() {
            addCriterion("biller_reference_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdEqualTo(String value) {
            addCriterion("biller_reference_id =", value, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdNotEqualTo(String value) {
            addCriterion("biller_reference_id <>", value, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdGreaterThan(String value) {
            addCriterion("biller_reference_id >", value, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("biller_reference_id >=", value, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdLessThan(String value) {
            addCriterion("biller_reference_id <", value, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdLessThanOrEqualTo(String value) {
            addCriterion("biller_reference_id <=", value, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdLike(String value) {
            addCriterion("biller_reference_id like", value, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdNotLike(String value) {
            addCriterion("biller_reference_id not like", value, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdIn(List<String> values) {
            addCriterion("biller_reference_id in", values, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdNotIn(List<String> values) {
            addCriterion("biller_reference_id not in", values, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdBetween(String value1, String value2) {
            addCriterion("biller_reference_id between", value1, value2, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerReferenceIdNotBetween(String value1, String value2) {
            addCriterion("biller_reference_id not between", value1, value2, "billerReferenceId");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameIsNull() {
            addCriterion("biller_display_name is null");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameIsNotNull() {
            addCriterion("biller_display_name is not null");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameEqualTo(String value) {
            addCriterion("biller_display_name =", value, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameNotEqualTo(String value) {
            addCriterion("biller_display_name <>", value, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameGreaterThan(String value) {
            addCriterion("biller_display_name >", value, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("biller_display_name >=", value, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameLessThan(String value) {
            addCriterion("biller_display_name <", value, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("biller_display_name <=", value, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameLike(String value) {
            addCriterion("biller_display_name like", value, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameNotLike(String value) {
            addCriterion("biller_display_name not like", value, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameIn(List<String> values) {
            addCriterion("biller_display_name in", values, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameNotIn(List<String> values) {
            addCriterion("biller_display_name not in", values, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameBetween(String value1, String value2) {
            addCriterion("biller_display_name between", value1, value2, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andBillerDisplayNameNotBetween(String value1, String value2) {
            addCriterion("biller_display_name not between", value1, value2, "billerDisplayName");
            return (Criteria) this;
        }

        public Criteria andMandateTypeIsNull() {
            addCriterion("mandate_type is null");
            return (Criteria) this;
        }

        public Criteria andMandateTypeIsNotNull() {
            addCriterion("mandate_type is not null");
            return (Criteria) this;
        }

        public Criteria andMandateTypeEqualTo(String value) {
            addCriterion("mandate_type =", value, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeNotEqualTo(String value) {
            addCriterion("mandate_type <>", value, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeGreaterThan(String value) {
            addCriterion("mandate_type >", value, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mandate_type >=", value, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeLessThan(String value) {
            addCriterion("mandate_type <", value, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeLessThanOrEqualTo(String value) {
            addCriterion("mandate_type <=", value, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeLike(String value) {
            addCriterion("mandate_type like", value, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeNotLike(String value) {
            addCriterion("mandate_type not like", value, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeIn(List<String> values) {
            addCriterion("mandate_type in", values, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeNotIn(List<String> values) {
            addCriterion("mandate_type not in", values, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeBetween(String value1, String value2) {
            addCriterion("mandate_type between", value1, value2, "mandateType");
            return (Criteria) this;
        }

        public Criteria andMandateTypeNotBetween(String value1, String value2) {
            addCriterion("mandate_type not between", value1, value2, "mandateType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeIsNull() {
            addCriterion("sequence_type is null");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeIsNotNull() {
            addCriterion("sequence_type is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeEqualTo(String value) {
            addCriterion("sequence_type =", value, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeNotEqualTo(String value) {
            addCriterion("sequence_type <>", value, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeGreaterThan(String value) {
            addCriterion("sequence_type >", value, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sequence_type >=", value, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeLessThan(String value) {
            addCriterion("sequence_type <", value, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeLessThanOrEqualTo(String value) {
            addCriterion("sequence_type <=", value, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeLike(String value) {
            addCriterion("sequence_type like", value, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeNotLike(String value) {
            addCriterion("sequence_type not like", value, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeIn(List<String> values) {
            addCriterion("sequence_type in", values, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeNotIn(List<String> values) {
            addCriterion("sequence_type not in", values, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeBetween(String value1, String value2) {
            addCriterion("sequence_type between", value1, value2, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andSequenceTypeNotBetween(String value1, String value2) {
            addCriterion("sequence_type not between", value1, value2, "sequenceType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNull() {
            addCriterion("period_type is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNotNull() {
            addCriterion("period_type is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeEqualTo(String value) {
            addCriterion("period_type =", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotEqualTo(String value) {
            addCriterion("period_type <>", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThan(String value) {
            addCriterion("period_type >", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("period_type >=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThan(String value) {
            addCriterion("period_type <", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThanOrEqualTo(String value) {
            addCriterion("period_type <=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLike(String value) {
            addCriterion("period_type like", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotLike(String value) {
            addCriterion("period_type not like", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIn(List<String> values) {
            addCriterion("period_type in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotIn(List<String> values) {
            addCriterion("period_type not in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeBetween(String value1, String value2) {
            addCriterion("period_type between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotBetween(String value1, String value2) {
            addCriterion("period_type not between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountIsNull() {
            addCriterion("period_per_count is null");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountIsNotNull() {
            addCriterion("period_per_count is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountEqualTo(Integer value) {
            addCriterion("period_per_count =", value, "periodPerCount");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountNotEqualTo(Integer value) {
            addCriterion("period_per_count <>", value, "periodPerCount");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountGreaterThan(Integer value) {
            addCriterion("period_per_count >", value, "periodPerCount");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_per_count >=", value, "periodPerCount");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountLessThan(Integer value) {
            addCriterion("period_per_count <", value, "periodPerCount");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountLessThanOrEqualTo(Integer value) {
            addCriterion("period_per_count <=", value, "periodPerCount");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountIn(List<Integer> values) {
            addCriterion("period_per_count in", values, "periodPerCount");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountNotIn(List<Integer> values) {
            addCriterion("period_per_count not in", values, "periodPerCount");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountBetween(Integer value1, Integer value2) {
            addCriterion("period_per_count between", value1, value2, "periodPerCount");
            return (Criteria) this;
        }

        public Criteria andPeriodPerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("period_per_count not between", value1, value2, "periodPerCount");
            return (Criteria) this;
        }

        public Criteria andColltnTypeIsNull() {
            addCriterion("colltn_type is null");
            return (Criteria) this;
        }

        public Criteria andColltnTypeIsNotNull() {
            addCriterion("colltn_type is not null");
            return (Criteria) this;
        }

        public Criteria andColltnTypeEqualTo(String value) {
            addCriterion("colltn_type =", value, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeNotEqualTo(String value) {
            addCriterion("colltn_type <>", value, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeGreaterThan(String value) {
            addCriterion("colltn_type >", value, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("colltn_type >=", value, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeLessThan(String value) {
            addCriterion("colltn_type <", value, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeLessThanOrEqualTo(String value) {
            addCriterion("colltn_type <=", value, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeLike(String value) {
            addCriterion("colltn_type like", value, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeNotLike(String value) {
            addCriterion("colltn_type not like", value, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeIn(List<String> values) {
            addCriterion("colltn_type in", values, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeNotIn(List<String> values) {
            addCriterion("colltn_type not in", values, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeBetween(String value1, String value2) {
            addCriterion("colltn_type between", value1, value2, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnTypeNotBetween(String value1, String value2) {
            addCriterion("colltn_type not between", value1, value2, "colltnType");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountIsNull() {
            addCriterion("colltn_max_amount is null");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountIsNotNull() {
            addCriterion("colltn_max_amount is not null");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountEqualTo(BigDecimal value) {
            addCriterion("colltn_max_amount =", value, "colltnMaxAmount");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountNotEqualTo(BigDecimal value) {
            addCriterion("colltn_max_amount <>", value, "colltnMaxAmount");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountGreaterThan(BigDecimal value) {
            addCriterion("colltn_max_amount >", value, "colltnMaxAmount");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("colltn_max_amount >=", value, "colltnMaxAmount");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountLessThan(BigDecimal value) {
            addCriterion("colltn_max_amount <", value, "colltnMaxAmount");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("colltn_max_amount <=", value, "colltnMaxAmount");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountIn(List<BigDecimal> values) {
            addCriterion("colltn_max_amount in", values, "colltnMaxAmount");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountNotIn(List<BigDecimal> values) {
            addCriterion("colltn_max_amount not in", values, "colltnMaxAmount");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("colltn_max_amount between", value1, value2, "colltnMaxAmount");
            return (Criteria) this;
        }

        public Criteria andColltnMaxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("colltn_max_amount not between", value1, value2, "colltnMaxAmount");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountIsNull() {
            addCriterion("colltn_fixed_amount is null");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountIsNotNull() {
            addCriterion("colltn_fixed_amount is not null");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountEqualTo(BigDecimal value) {
            addCriterion("colltn_fixed_amount =", value, "colltnFixedAmount");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountNotEqualTo(BigDecimal value) {
            addCriterion("colltn_fixed_amount <>", value, "colltnFixedAmount");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountGreaterThan(BigDecimal value) {
            addCriterion("colltn_fixed_amount >", value, "colltnFixedAmount");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("colltn_fixed_amount >=", value, "colltnFixedAmount");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountLessThan(BigDecimal value) {
            addCriterion("colltn_fixed_amount <", value, "colltnFixedAmount");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("colltn_fixed_amount <=", value, "colltnFixedAmount");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountIn(List<BigDecimal> values) {
            addCriterion("colltn_fixed_amount in", values, "colltnFixedAmount");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountNotIn(List<BigDecimal> values) {
            addCriterion("colltn_fixed_amount not in", values, "colltnFixedAmount");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("colltn_fixed_amount between", value1, value2, "colltnFixedAmount");
            return (Criteria) this;
        }

        public Criteria andColltnFixedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("colltn_fixed_amount not between", value1, value2, "colltnFixedAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountIsNull() {
            addCriterion("first_colltn_amount is null");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountIsNotNull() {
            addCriterion("first_colltn_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountEqualTo(BigDecimal value) {
            addCriterion("first_colltn_amount =", value, "firstColltnAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountNotEqualTo(BigDecimal value) {
            addCriterion("first_colltn_amount <>", value, "firstColltnAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountGreaterThan(BigDecimal value) {
            addCriterion("first_colltn_amount >", value, "firstColltnAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_colltn_amount >=", value, "firstColltnAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountLessThan(BigDecimal value) {
            addCriterion("first_colltn_amount <", value, "firstColltnAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_colltn_amount <=", value, "firstColltnAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountIn(List<BigDecimal> values) {
            addCriterion("first_colltn_amount in", values, "firstColltnAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountNotIn(List<BigDecimal> values) {
            addCriterion("first_colltn_amount not in", values, "firstColltnAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_colltn_amount between", value1, value2, "firstColltnAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_colltn_amount not between", value1, value2, "firstColltnAmount");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateIsNull() {
            addCriterion("first_colltn_date is null");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateIsNotNull() {
            addCriterion("first_colltn_date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateEqualTo(Date value) {
            addCriterion("first_colltn_date =", value, "firstColltnDate");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateNotEqualTo(Date value) {
            addCriterion("first_colltn_date <>", value, "firstColltnDate");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateGreaterThan(Date value) {
            addCriterion("first_colltn_date >", value, "firstColltnDate");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("first_colltn_date >=", value, "firstColltnDate");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateLessThan(Date value) {
            addCriterion("first_colltn_date <", value, "firstColltnDate");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateLessThanOrEqualTo(Date value) {
            addCriterion("first_colltn_date <=", value, "firstColltnDate");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateIn(List<Date> values) {
            addCriterion("first_colltn_date in", values, "firstColltnDate");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateNotIn(List<Date> values) {
            addCriterion("first_colltn_date not in", values, "firstColltnDate");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateBetween(Date value1, Date value2) {
            addCriterion("first_colltn_date between", value1, value2, "firstColltnDate");
            return (Criteria) this;
        }

        public Criteria andFirstColltnDateNotBetween(Date value1, Date value2) {
            addCriterion("first_colltn_date not between", value1, value2, "firstColltnDate");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateIsNull() {
            addCriterion("final_colltn_date is null");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateIsNotNull() {
            addCriterion("final_colltn_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateEqualTo(Date value) {
            addCriterion("final_colltn_date =", value, "finalColltnDate");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateNotEqualTo(Date value) {
            addCriterion("final_colltn_date <>", value, "finalColltnDate");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateGreaterThan(Date value) {
            addCriterion("final_colltn_date >", value, "finalColltnDate");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("final_colltn_date >=", value, "finalColltnDate");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateLessThan(Date value) {
            addCriterion("final_colltn_date <", value, "finalColltnDate");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateLessThanOrEqualTo(Date value) {
            addCriterion("final_colltn_date <=", value, "finalColltnDate");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateIn(List<Date> values) {
            addCriterion("final_colltn_date in", values, "finalColltnDate");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateNotIn(List<Date> values) {
            addCriterion("final_colltn_date not in", values, "finalColltnDate");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateBetween(Date value1, Date value2) {
            addCriterion("final_colltn_date between", value1, value2, "finalColltnDate");
            return (Criteria) this;
        }

        public Criteria andFinalColltnDateNotBetween(Date value1, Date value2) {
            addCriterion("final_colltn_date not between", value1, value2, "finalColltnDate");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNull() {
            addCriterion("customer_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("customer_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoEqualTo(String value) {
            addCriterion("customer_no =", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotEqualTo(String value) {
            addCriterion("customer_no <>", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThan(String value) {
            addCriterion("customer_no >", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_no >=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThan(String value) {
            addCriterion("customer_no <", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("customer_no <=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLike(String value) {
            addCriterion("customer_no like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotLike(String value) {
            addCriterion("customer_no not like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIn(List<String> values) {
            addCriterion("customer_no in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotIn(List<String> values) {
            addCriterion("customer_no not in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoBetween(String value1, String value2) {
            addCriterion("customer_no between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotBetween(String value1, String value2) {
            addCriterion("customer_no not between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCreditorIdIsNull() {
            addCriterion("creditor_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditorIdIsNotNull() {
            addCriterion("creditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditorIdEqualTo(String value) {
            addCriterion("creditor_id =", value, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdNotEqualTo(String value) {
            addCriterion("creditor_id <>", value, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdGreaterThan(String value) {
            addCriterion("creditor_id >", value, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdGreaterThanOrEqualTo(String value) {
            addCriterion("creditor_id >=", value, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdLessThan(String value) {
            addCriterion("creditor_id <", value, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdLessThanOrEqualTo(String value) {
            addCriterion("creditor_id <=", value, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdLike(String value) {
            addCriterion("creditor_id like", value, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdNotLike(String value) {
            addCriterion("creditor_id not like", value, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdIn(List<String> values) {
            addCriterion("creditor_id in", values, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdNotIn(List<String> values) {
            addCriterion("creditor_id not in", values, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdBetween(String value1, String value2) {
            addCriterion("creditor_id between", value1, value2, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorIdNotBetween(String value1, String value2) {
            addCriterion("creditor_id not between", value1, value2, "creditorId");
            return (Criteria) this;
        }

        public Criteria andCreditorNameIsNull() {
            addCriterion("creditor_name is null");
            return (Criteria) this;
        }

        public Criteria andCreditorNameIsNotNull() {
            addCriterion("creditor_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreditorNameEqualTo(String value) {
            addCriterion("creditor_name =", value, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameNotEqualTo(String value) {
            addCriterion("creditor_name <>", value, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameGreaterThan(String value) {
            addCriterion("creditor_name >", value, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creditor_name >=", value, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameLessThan(String value) {
            addCriterion("creditor_name <", value, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameLessThanOrEqualTo(String value) {
            addCriterion("creditor_name <=", value, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameLike(String value) {
            addCriterion("creditor_name like", value, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameNotLike(String value) {
            addCriterion("creditor_name not like", value, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameIn(List<String> values) {
            addCriterion("creditor_name in", values, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameNotIn(List<String> values) {
            addCriterion("creditor_name not in", values, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameBetween(String value1, String value2) {
            addCriterion("creditor_name between", value1, value2, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorNameNotBetween(String value1, String value2) {
            addCriterion("creditor_name not between", value1, value2, "creditorName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoIsNull() {
            addCriterion("creditor_acct_no is null");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoIsNotNull() {
            addCriterion("creditor_acct_no is not null");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoEqualTo(String value) {
            addCriterion("creditor_acct_no =", value, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoNotEqualTo(String value) {
            addCriterion("creditor_acct_no <>", value, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoGreaterThan(String value) {
            addCriterion("creditor_acct_no >", value, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("creditor_acct_no >=", value, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoLessThan(String value) {
            addCriterion("creditor_acct_no <", value, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoLessThanOrEqualTo(String value) {
            addCriterion("creditor_acct_no <=", value, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoLike(String value) {
            addCriterion("creditor_acct_no like", value, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoNotLike(String value) {
            addCriterion("creditor_acct_no not like", value, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoIn(List<String> values) {
            addCriterion("creditor_acct_no in", values, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoNotIn(List<String> values) {
            addCriterion("creditor_acct_no not in", values, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoBetween(String value1, String value2) {
            addCriterion("creditor_acct_no between", value1, value2, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNoNotBetween(String value1, String value2) {
            addCriterion("creditor_acct_no not between", value1, value2, "creditorAcctNo");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameIsNull() {
            addCriterion("creditor_acct_name is null");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameIsNotNull() {
            addCriterion("creditor_acct_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameEqualTo(String value) {
            addCriterion("creditor_acct_name =", value, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameNotEqualTo(String value) {
            addCriterion("creditor_acct_name <>", value, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameGreaterThan(String value) {
            addCriterion("creditor_acct_name >", value, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("creditor_acct_name >=", value, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameLessThan(String value) {
            addCriterion("creditor_acct_name <", value, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameLessThanOrEqualTo(String value) {
            addCriterion("creditor_acct_name <=", value, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameLike(String value) {
            addCriterion("creditor_acct_name like", value, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameNotLike(String value) {
            addCriterion("creditor_acct_name not like", value, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameIn(List<String> values) {
            addCriterion("creditor_acct_name in", values, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameNotIn(List<String> values) {
            addCriterion("creditor_acct_name not in", values, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameBetween(String value1, String value2) {
            addCriterion("creditor_acct_name between", value1, value2, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctNameNotBetween(String value1, String value2) {
            addCriterion("creditor_acct_name not between", value1, value2, "creditorAcctName");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeIsNull() {
            addCriterion("creditor_acct_type is null");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeIsNotNull() {
            addCriterion("creditor_acct_type is not null");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeEqualTo(String value) {
            addCriterion("creditor_acct_type =", value, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeNotEqualTo(String value) {
            addCriterion("creditor_acct_type <>", value, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeGreaterThan(String value) {
            addCriterion("creditor_acct_type >", value, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("creditor_acct_type >=", value, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeLessThan(String value) {
            addCriterion("creditor_acct_type <", value, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeLessThanOrEqualTo(String value) {
            addCriterion("creditor_acct_type <=", value, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeLike(String value) {
            addCriterion("creditor_acct_type like", value, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeNotLike(String value) {
            addCriterion("creditor_acct_type not like", value, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeIn(List<String> values) {
            addCriterion("creditor_acct_type in", values, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeNotIn(List<String> values) {
            addCriterion("creditor_acct_type not in", values, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeBetween(String value1, String value2) {
            addCriterion("creditor_acct_type between", value1, value2, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAcctTypeNotBetween(String value1, String value2) {
            addCriterion("creditor_acct_type not between", value1, value2, "creditorAcctType");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdIsNull() {
            addCriterion("creditor_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdIsNotNull() {
            addCriterion("creditor_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdEqualTo(String value) {
            addCriterion("creditor_agent_id =", value, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdNotEqualTo(String value) {
            addCriterion("creditor_agent_id <>", value, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdGreaterThan(String value) {
            addCriterion("creditor_agent_id >", value, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("creditor_agent_id >=", value, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdLessThan(String value) {
            addCriterion("creditor_agent_id <", value, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdLessThanOrEqualTo(String value) {
            addCriterion("creditor_agent_id <=", value, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdLike(String value) {
            addCriterion("creditor_agent_id like", value, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdNotLike(String value) {
            addCriterion("creditor_agent_id not like", value, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdIn(List<String> values) {
            addCriterion("creditor_agent_id in", values, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdNotIn(List<String> values) {
            addCriterion("creditor_agent_id not in", values, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdBetween(String value1, String value2) {
            addCriterion("creditor_agent_id between", value1, value2, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andCreditorAgentIdNotBetween(String value1, String value2) {
            addCriterion("creditor_agent_id not between", value1, value2, "creditorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdIsNull() {
            addCriterion("debtor_id is null");
            return (Criteria) this;
        }

        public Criteria andDebtorIdIsNotNull() {
            addCriterion("debtor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDebtorIdEqualTo(String value) {
            addCriterion("debtor_id =", value, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdNotEqualTo(String value) {
            addCriterion("debtor_id <>", value, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdGreaterThan(String value) {
            addCriterion("debtor_id >", value, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdGreaterThanOrEqualTo(String value) {
            addCriterion("debtor_id >=", value, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdLessThan(String value) {
            addCriterion("debtor_id <", value, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdLessThanOrEqualTo(String value) {
            addCriterion("debtor_id <=", value, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdLike(String value) {
            addCriterion("debtor_id like", value, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdNotLike(String value) {
            addCriterion("debtor_id not like", value, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdIn(List<String> values) {
            addCriterion("debtor_id in", values, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdNotIn(List<String> values) {
            addCriterion("debtor_id not in", values, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdBetween(String value1, String value2) {
            addCriterion("debtor_id between", value1, value2, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorIdNotBetween(String value1, String value2) {
            addCriterion("debtor_id not between", value1, value2, "debtorId");
            return (Criteria) this;
        }

        public Criteria andDebtorNameIsNull() {
            addCriterion("debtor_name is null");
            return (Criteria) this;
        }

        public Criteria andDebtorNameIsNotNull() {
            addCriterion("debtor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDebtorNameEqualTo(String value) {
            addCriterion("debtor_name =", value, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameNotEqualTo(String value) {
            addCriterion("debtor_name <>", value, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameGreaterThan(String value) {
            addCriterion("debtor_name >", value, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameGreaterThanOrEqualTo(String value) {
            addCriterion("debtor_name >=", value, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameLessThan(String value) {
            addCriterion("debtor_name <", value, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameLessThanOrEqualTo(String value) {
            addCriterion("debtor_name <=", value, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameLike(String value) {
            addCriterion("debtor_name like", value, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameNotLike(String value) {
            addCriterion("debtor_name not like", value, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameIn(List<String> values) {
            addCriterion("debtor_name in", values, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameNotIn(List<String> values) {
            addCriterion("debtor_name not in", values, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameBetween(String value1, String value2) {
            addCriterion("debtor_name between", value1, value2, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorNameNotBetween(String value1, String value2) {
            addCriterion("debtor_name not between", value1, value2, "debtorName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoIsNull() {
            addCriterion("debtor_acct_no is null");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoIsNotNull() {
            addCriterion("debtor_acct_no is not null");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoEqualTo(String value) {
            addCriterion("debtor_acct_no =", value, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoNotEqualTo(String value) {
            addCriterion("debtor_acct_no <>", value, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoGreaterThan(String value) {
            addCriterion("debtor_acct_no >", value, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("debtor_acct_no >=", value, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoLessThan(String value) {
            addCriterion("debtor_acct_no <", value, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoLessThanOrEqualTo(String value) {
            addCriterion("debtor_acct_no <=", value, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoLike(String value) {
            addCriterion("debtor_acct_no like", value, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoNotLike(String value) {
            addCriterion("debtor_acct_no not like", value, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoIn(List<String> values) {
            addCriterion("debtor_acct_no in", values, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoNotIn(List<String> values) {
            addCriterion("debtor_acct_no not in", values, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoBetween(String value1, String value2) {
            addCriterion("debtor_acct_no between", value1, value2, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNoNotBetween(String value1, String value2) {
            addCriterion("debtor_acct_no not between", value1, value2, "debtorAcctNo");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameIsNull() {
            addCriterion("debtor_acct_name is null");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameIsNotNull() {
            addCriterion("debtor_acct_name is not null");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameEqualTo(String value) {
            addCriterion("debtor_acct_name =", value, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameNotEqualTo(String value) {
            addCriterion("debtor_acct_name <>", value, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameGreaterThan(String value) {
            addCriterion("debtor_acct_name >", value, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("debtor_acct_name >=", value, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameLessThan(String value) {
            addCriterion("debtor_acct_name <", value, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameLessThanOrEqualTo(String value) {
            addCriterion("debtor_acct_name <=", value, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameLike(String value) {
            addCriterion("debtor_acct_name like", value, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameNotLike(String value) {
            addCriterion("debtor_acct_name not like", value, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameIn(List<String> values) {
            addCriterion("debtor_acct_name in", values, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameNotIn(List<String> values) {
            addCriterion("debtor_acct_name not in", values, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameBetween(String value1, String value2) {
            addCriterion("debtor_acct_name between", value1, value2, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctNameNotBetween(String value1, String value2) {
            addCriterion("debtor_acct_name not between", value1, value2, "debtorAcctName");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeIsNull() {
            addCriterion("debtor_acct_type is null");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeIsNotNull() {
            addCriterion("debtor_acct_type is not null");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeEqualTo(String value) {
            addCriterion("debtor_acct_type =", value, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeNotEqualTo(String value) {
            addCriterion("debtor_acct_type <>", value, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeGreaterThan(String value) {
            addCriterion("debtor_acct_type >", value, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("debtor_acct_type >=", value, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeLessThan(String value) {
            addCriterion("debtor_acct_type <", value, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeLessThanOrEqualTo(String value) {
            addCriterion("debtor_acct_type <=", value, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeLike(String value) {
            addCriterion("debtor_acct_type like", value, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeNotLike(String value) {
            addCriterion("debtor_acct_type not like", value, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeIn(List<String> values) {
            addCriterion("debtor_acct_type in", values, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeNotIn(List<String> values) {
            addCriterion("debtor_acct_type not in", values, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeBetween(String value1, String value2) {
            addCriterion("debtor_acct_type between", value1, value2, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAcctTypeNotBetween(String value1, String value2) {
            addCriterion("debtor_acct_type not between", value1, value2, "debtorAcctType");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdIsNull() {
            addCriterion("debtor_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdIsNotNull() {
            addCriterion("debtor_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdEqualTo(String value) {
            addCriterion("debtor_agent_id =", value, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdNotEqualTo(String value) {
            addCriterion("debtor_agent_id <>", value, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdGreaterThan(String value) {
            addCriterion("debtor_agent_id >", value, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("debtor_agent_id >=", value, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdLessThan(String value) {
            addCriterion("debtor_agent_id <", value, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdLessThanOrEqualTo(String value) {
            addCriterion("debtor_agent_id <=", value, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdLike(String value) {
            addCriterion("debtor_agent_id like", value, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdNotLike(String value) {
            addCriterion("debtor_agent_id not like", value, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdIn(List<String> values) {
            addCriterion("debtor_agent_id in", values, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdNotIn(List<String> values) {
            addCriterion("debtor_agent_id not in", values, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdBetween(String value1, String value2) {
            addCriterion("debtor_agent_id between", value1, value2, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andDebtorAgentIdNotBetween(String value1, String value2) {
            addCriterion("debtor_agent_id not between", value1, value2, "debtorAgentId");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagIsNull() {
            addCriterion("accept_flag is null");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagIsNotNull() {
            addCriterion("accept_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagEqualTo(String value) {
            addCriterion("accept_flag =", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagNotEqualTo(String value) {
            addCriterion("accept_flag <>", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagGreaterThan(String value) {
            addCriterion("accept_flag >", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagGreaterThanOrEqualTo(String value) {
            addCriterion("accept_flag >=", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagLessThan(String value) {
            addCriterion("accept_flag <", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagLessThanOrEqualTo(String value) {
            addCriterion("accept_flag <=", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagLike(String value) {
            addCriterion("accept_flag like", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagNotLike(String value) {
            addCriterion("accept_flag not like", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagIn(List<String> values) {
            addCriterion("accept_flag in", values, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagNotIn(List<String> values) {
            addCriterion("accept_flag not in", values, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagBetween(String value1, String value2) {
            addCriterion("accept_flag between", value1, value2, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagNotBetween(String value1, String value2) {
            addCriterion("accept_flag not between", value1, value2, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIsNull() {
            addCriterion("reject_code is null");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIsNotNull() {
            addCriterion("reject_code is not null");
            return (Criteria) this;
        }

        public Criteria andRejectCodeEqualTo(String value) {
            addCriterion("reject_code =", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotEqualTo(String value) {
            addCriterion("reject_code <>", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeGreaterThan(String value) {
            addCriterion("reject_code >", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reject_code >=", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLessThan(String value) {
            addCriterion("reject_code <", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLessThanOrEqualTo(String value) {
            addCriterion("reject_code <=", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLike(String value) {
            addCriterion("reject_code like", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotLike(String value) {
            addCriterion("reject_code not like", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIn(List<String> values) {
            addCriterion("reject_code in", values, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotIn(List<String> values) {
            addCriterion("reject_code not in", values, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeBetween(String value1, String value2) {
            addCriterion("reject_code between", value1, value2, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotBetween(String value1, String value2) {
            addCriterion("reject_code not between", value1, value2, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectMessageIsNull() {
            addCriterion("reject_message is null");
            return (Criteria) this;
        }

        public Criteria andRejectMessageIsNotNull() {
            addCriterion("reject_message is not null");
            return (Criteria) this;
        }

        public Criteria andRejectMessageEqualTo(String value) {
            addCriterion("reject_message =", value, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageNotEqualTo(String value) {
            addCriterion("reject_message <>", value, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageGreaterThan(String value) {
            addCriterion("reject_message >", value, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageGreaterThanOrEqualTo(String value) {
            addCriterion("reject_message >=", value, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageLessThan(String value) {
            addCriterion("reject_message <", value, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageLessThanOrEqualTo(String value) {
            addCriterion("reject_message <=", value, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageLike(String value) {
            addCriterion("reject_message like", value, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageNotLike(String value) {
            addCriterion("reject_message not like", value, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageIn(List<String> values) {
            addCriterion("reject_message in", values, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageNotIn(List<String> values) {
            addCriterion("reject_message not in", values, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageBetween(String value1, String value2) {
            addCriterion("reject_message between", value1, value2, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andRejectMessageNotBetween(String value1, String value2) {
            addCriterion("reject_message not between", value1, value2, "rejectMessage");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalIsNull() {
            addCriterion("mandate_additional is null");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalIsNotNull() {
            addCriterion("mandate_additional is not null");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalEqualTo(String value) {
            addCriterion("mandate_additional =", value, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalNotEqualTo(String value) {
            addCriterion("mandate_additional <>", value, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalGreaterThan(String value) {
            addCriterion("mandate_additional >", value, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalGreaterThanOrEqualTo(String value) {
            addCriterion("mandate_additional >=", value, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalLessThan(String value) {
            addCriterion("mandate_additional <", value, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalLessThanOrEqualTo(String value) {
            addCriterion("mandate_additional <=", value, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalLike(String value) {
            addCriterion("mandate_additional like", value, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalNotLike(String value) {
            addCriterion("mandate_additional not like", value, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalIn(List<String> values) {
            addCriterion("mandate_additional in", values, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalNotIn(List<String> values) {
            addCriterion("mandate_additional not in", values, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalBetween(String value1, String value2) {
            addCriterion("mandate_additional between", value1, value2, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateAdditionalNotBetween(String value1, String value2) {
            addCriterion("mandate_additional not between", value1, value2, "mandateAdditional");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkIsNull() {
            addCriterion("mandate_remark is null");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkIsNotNull() {
            addCriterion("mandate_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkEqualTo(String value) {
            addCriterion("mandate_remark =", value, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkNotEqualTo(String value) {
            addCriterion("mandate_remark <>", value, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkGreaterThan(String value) {
            addCriterion("mandate_remark >", value, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("mandate_remark >=", value, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkLessThan(String value) {
            addCriterion("mandate_remark <", value, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkLessThanOrEqualTo(String value) {
            addCriterion("mandate_remark <=", value, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkLike(String value) {
            addCriterion("mandate_remark like", value, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkNotLike(String value) {
            addCriterion("mandate_remark not like", value, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkIn(List<String> values) {
            addCriterion("mandate_remark in", values, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkNotIn(List<String> values) {
            addCriterion("mandate_remark not in", values, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkBetween(String value1, String value2) {
            addCriterion("mandate_remark between", value1, value2, "mandateRemark");
            return (Criteria) this;
        }

        public Criteria andMandateRemarkNotBetween(String value1, String value2) {
            addCriterion("mandate_remark not between", value1, value2, "mandateRemark");
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