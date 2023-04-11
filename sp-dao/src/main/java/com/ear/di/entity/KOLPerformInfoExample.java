package com.ear.di.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KOLPerformInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KOLPerformInfoExample() {
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

        public Criteria andPerforIdIsNull() {
            addCriterion("perfor_id is null");
            return (Criteria) this;
        }

        public Criteria andPerforIdIsNotNull() {
            addCriterion("perfor_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerforIdEqualTo(String value) {
            addCriterion("perfor_id =", value, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdNotEqualTo(String value) {
            addCriterion("perfor_id <>", value, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdGreaterThan(String value) {
            addCriterion("perfor_id >", value, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdGreaterThanOrEqualTo(String value) {
            addCriterion("perfor_id >=", value, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdLessThan(String value) {
            addCriterion("perfor_id <", value, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdLessThanOrEqualTo(String value) {
            addCriterion("perfor_id <=", value, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdLike(String value) {
            addCriterion("perfor_id like", value, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdNotLike(String value) {
            addCriterion("perfor_id not like", value, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdIn(List<String> values) {
            addCriterion("perfor_id in", values, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdNotIn(List<String> values) {
            addCriterion("perfor_id not in", values, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdBetween(String value1, String value2) {
            addCriterion("perfor_id between", value1, value2, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerforIdNotBetween(String value1, String value2) {
            addCriterion("perfor_id not between", value1, value2, "perforId");
            return (Criteria) this;
        }

        public Criteria andPerformTitleIsNull() {
            addCriterion("perform_title is null");
            return (Criteria) this;
        }

        public Criteria andPerformTitleIsNotNull() {
            addCriterion("perform_title is not null");
            return (Criteria) this;
        }

        public Criteria andPerformTitleEqualTo(String value) {
            addCriterion("perform_title =", value, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleNotEqualTo(String value) {
            addCriterion("perform_title <>", value, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleGreaterThan(String value) {
            addCriterion("perform_title >", value, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleGreaterThanOrEqualTo(String value) {
            addCriterion("perform_title >=", value, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleLessThan(String value) {
            addCriterion("perform_title <", value, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleLessThanOrEqualTo(String value) {
            addCriterion("perform_title <=", value, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleLike(String value) {
            addCriterion("perform_title like", value, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleNotLike(String value) {
            addCriterion("perform_title not like", value, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleIn(List<String> values) {
            addCriterion("perform_title in", values, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleNotIn(List<String> values) {
            addCriterion("perform_title not in", values, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleBetween(String value1, String value2) {
            addCriterion("perform_title between", value1, value2, "performTitle");
            return (Criteria) this;
        }

        public Criteria andPerformTitleNotBetween(String value1, String value2) {
            addCriterion("perform_title not between", value1, value2, "performTitle");
            return (Criteria) this;
        }

        public Criteria andKolIdIsNull() {
            addCriterion("kol_id is null");
            return (Criteria) this;
        }

        public Criteria andKolIdIsNotNull() {
            addCriterion("kol_id is not null");
            return (Criteria) this;
        }

        public Criteria andKolIdEqualTo(String value) {
            addCriterion("kol_id =", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdNotEqualTo(String value) {
            addCriterion("kol_id <>", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdGreaterThan(String value) {
            addCriterion("kol_id >", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdGreaterThanOrEqualTo(String value) {
            addCriterion("kol_id >=", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdLessThan(String value) {
            addCriterion("kol_id <", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdLessThanOrEqualTo(String value) {
            addCriterion("kol_id <=", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdLike(String value) {
            addCriterion("kol_id like", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdNotLike(String value) {
            addCriterion("kol_id not like", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdIn(List<String> values) {
            addCriterion("kol_id in", values, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdNotIn(List<String> values) {
            addCriterion("kol_id not in", values, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdBetween(String value1, String value2) {
            addCriterion("kol_id between", value1, value2, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdNotBetween(String value1, String value2) {
            addCriterion("kol_id not between", value1, value2, "kolId");
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

        public Criteria andPerformPlatformIsNull() {
            addCriterion("perform_platform is null");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformIsNotNull() {
            addCriterion("perform_platform is not null");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformEqualTo(String value) {
            addCriterion("perform_platform =", value, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformNotEqualTo(String value) {
            addCriterion("perform_platform <>", value, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformGreaterThan(String value) {
            addCriterion("perform_platform >", value, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("perform_platform >=", value, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformLessThan(String value) {
            addCriterion("perform_platform <", value, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformLessThanOrEqualTo(String value) {
            addCriterion("perform_platform <=", value, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformLike(String value) {
            addCriterion("perform_platform like", value, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformNotLike(String value) {
            addCriterion("perform_platform not like", value, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformIn(List<String> values) {
            addCriterion("perform_platform in", values, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformNotIn(List<String> values) {
            addCriterion("perform_platform not in", values, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformBetween(String value1, String value2) {
            addCriterion("perform_platform between", value1, value2, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformPlatformNotBetween(String value1, String value2) {
            addCriterion("perform_platform not between", value1, value2, "performPlatform");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceIsNull() {
            addCriterion("perform_goods_introduce is null");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceIsNotNull() {
            addCriterion("perform_goods_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceEqualTo(String value) {
            addCriterion("perform_goods_introduce =", value, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceNotEqualTo(String value) {
            addCriterion("perform_goods_introduce <>", value, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceGreaterThan(String value) {
            addCriterion("perform_goods_introduce >", value, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("perform_goods_introduce >=", value, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceLessThan(String value) {
            addCriterion("perform_goods_introduce <", value, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceLessThanOrEqualTo(String value) {
            addCriterion("perform_goods_introduce <=", value, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceLike(String value) {
            addCriterion("perform_goods_introduce like", value, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceNotLike(String value) {
            addCriterion("perform_goods_introduce not like", value, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceIn(List<String> values) {
            addCriterion("perform_goods_introduce in", values, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceNotIn(List<String> values) {
            addCriterion("perform_goods_introduce not in", values, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceBetween(String value1, String value2) {
            addCriterion("perform_goods_introduce between", value1, value2, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformGoodsIntroduceNotBetween(String value1, String value2) {
            addCriterion("perform_goods_introduce not between", value1, value2, "performGoodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andPerformUrlIsNull() {
            addCriterion("perform_url is null");
            return (Criteria) this;
        }

        public Criteria andPerformUrlIsNotNull() {
            addCriterion("perform_url is not null");
            return (Criteria) this;
        }

        public Criteria andPerformUrlEqualTo(String value) {
            addCriterion("perform_url =", value, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlNotEqualTo(String value) {
            addCriterion("perform_url <>", value, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlGreaterThan(String value) {
            addCriterion("perform_url >", value, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlGreaterThanOrEqualTo(String value) {
            addCriterion("perform_url >=", value, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlLessThan(String value) {
            addCriterion("perform_url <", value, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlLessThanOrEqualTo(String value) {
            addCriterion("perform_url <=", value, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlLike(String value) {
            addCriterion("perform_url like", value, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlNotLike(String value) {
            addCriterion("perform_url not like", value, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlIn(List<String> values) {
            addCriterion("perform_url in", values, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlNotIn(List<String> values) {
            addCriterion("perform_url not in", values, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlBetween(String value1, String value2) {
            addCriterion("perform_url between", value1, value2, "performUrl");
            return (Criteria) this;
        }

        public Criteria andPerformUrlNotBetween(String value1, String value2) {
            addCriterion("perform_url not between", value1, value2, "performUrl");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIsNull() {
            addCriterion("apply_number is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIsNotNull() {
            addCriterion("apply_number is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumberEqualTo(Integer value) {
            addCriterion("apply_number =", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotEqualTo(Integer value) {
            addCriterion("apply_number <>", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberGreaterThan(Integer value) {
            addCriterion("apply_number >", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_number >=", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLessThan(Integer value) {
            addCriterion("apply_number <", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("apply_number <=", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIn(List<Integer> values) {
            addCriterion("apply_number in", values, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotIn(List<Integer> values) {
            addCriterion("apply_number not in", values, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberBetween(Integer value1, Integer value2) {
            addCriterion("apply_number between", value1, value2, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_number not between", value1, value2, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberIsNull() {
            addCriterion("apply_max_number is null");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberIsNotNull() {
            addCriterion("apply_max_number is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberEqualTo(Integer value) {
            addCriterion("apply_max_number =", value, "applyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberNotEqualTo(Integer value) {
            addCriterion("apply_max_number <>", value, "applyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberGreaterThan(Integer value) {
            addCriterion("apply_max_number >", value, "applyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_max_number >=", value, "applyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberLessThan(Integer value) {
            addCriterion("apply_max_number <", value, "applyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberLessThanOrEqualTo(Integer value) {
            addCriterion("apply_max_number <=", value, "applyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberIn(List<Integer> values) {
            addCriterion("apply_max_number in", values, "applyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberNotIn(List<Integer> values) {
            addCriterion("apply_max_number not in", values, "applyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberBetween(Integer value1, Integer value2) {
            addCriterion("apply_max_number between", value1, value2, "applyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andApplyMaxNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_max_number not between", value1, value2, "applyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmIsNull() {
            addCriterion("perform_start_dttm is null");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmIsNotNull() {
            addCriterion("perform_start_dttm is not null");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmEqualTo(Long value) {
            addCriterion("perform_start_dttm =", value, "performStartDttm");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmNotEqualTo(Long value) {
            addCriterion("perform_start_dttm <>", value, "performStartDttm");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmGreaterThan(Long value) {
            addCriterion("perform_start_dttm >", value, "performStartDttm");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmGreaterThanOrEqualTo(Long value) {
            addCriterion("perform_start_dttm >=", value, "performStartDttm");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmLessThan(Long value) {
            addCriterion("perform_start_dttm <", value, "performStartDttm");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmLessThanOrEqualTo(Long value) {
            addCriterion("perform_start_dttm <=", value, "performStartDttm");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmIn(List<Long> values) {
            addCriterion("perform_start_dttm in", values, "performStartDttm");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmNotIn(List<Long> values) {
            addCriterion("perform_start_dttm not in", values, "performStartDttm");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmBetween(Long value1, Long value2) {
            addCriterion("perform_start_dttm between", value1, value2, "performStartDttm");
            return (Criteria) this;
        }

        public Criteria andPerformStartDttmNotBetween(Long value1, Long value2) {
            addCriterion("perform_start_dttm not between", value1, value2, "performStartDttm");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmIsNull() {
            addCriterion("perform_end_dttm is null");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmIsNotNull() {
            addCriterion("perform_end_dttm is not null");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmEqualTo(Long value) {
            addCriterion("perform_end_dttm =", value, "performEndDttm");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmNotEqualTo(Long value) {
            addCriterion("perform_end_dttm <>", value, "performEndDttm");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmGreaterThan(Long value) {
            addCriterion("perform_end_dttm >", value, "performEndDttm");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmGreaterThanOrEqualTo(Long value) {
            addCriterion("perform_end_dttm >=", value, "performEndDttm");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmLessThan(Long value) {
            addCriterion("perform_end_dttm <", value, "performEndDttm");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmLessThanOrEqualTo(Long value) {
            addCriterion("perform_end_dttm <=", value, "performEndDttm");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmIn(List<Long> values) {
            addCriterion("perform_end_dttm in", values, "performEndDttm");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmNotIn(List<Long> values) {
            addCriterion("perform_end_dttm not in", values, "performEndDttm");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmBetween(Long value1, Long value2) {
            addCriterion("perform_end_dttm between", value1, value2, "performEndDttm");
            return (Criteria) this;
        }

        public Criteria andPerformEndDttmNotBetween(Long value1, Long value2) {
            addCriterion("perform_end_dttm not between", value1, value2, "performEndDttm");
            return (Criteria) this;
        }

        public Criteria andPerformStatusIsNull() {
            addCriterion("perform_status is null");
            return (Criteria) this;
        }

        public Criteria andPerformStatusIsNotNull() {
            addCriterion("perform_status is not null");
            return (Criteria) this;
        }

        public Criteria andPerformStatusEqualTo(String value) {
            addCriterion("perform_status =", value, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusNotEqualTo(String value) {
            addCriterion("perform_status <>", value, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusGreaterThan(String value) {
            addCriterion("perform_status >", value, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusGreaterThanOrEqualTo(String value) {
            addCriterion("perform_status >=", value, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusLessThan(String value) {
            addCriterion("perform_status <", value, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusLessThanOrEqualTo(String value) {
            addCriterion("perform_status <=", value, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusLike(String value) {
            addCriterion("perform_status like", value, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusNotLike(String value) {
            addCriterion("perform_status not like", value, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusIn(List<String> values) {
            addCriterion("perform_status in", values, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusNotIn(List<String> values) {
            addCriterion("perform_status not in", values, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusBetween(String value1, String value2) {
            addCriterion("perform_status between", value1, value2, "performStatus");
            return (Criteria) this;
        }

        public Criteria andPerformStatusNotBetween(String value1, String value2) {
            addCriterion("perform_status not between", value1, value2, "performStatus");
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