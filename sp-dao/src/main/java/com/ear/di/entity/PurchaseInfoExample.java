package com.ear.di.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseInfoExample() {
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

        public Criteria andPurchaseIdIsNull() {
            addCriterion("purchase_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIsNotNull() {
            addCriterion("purchase_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdEqualTo(String value) {
            addCriterion("purchase_id =", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotEqualTo(String value) {
            addCriterion("purchase_id <>", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThan(String value) {
            addCriterion("purchase_id >", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_id >=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThan(String value) {
            addCriterion("purchase_id <", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThanOrEqualTo(String value) {
            addCriterion("purchase_id <=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLike(String value) {
            addCriterion("purchase_id like", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotLike(String value) {
            addCriterion("purchase_id not like", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIn(List<String> values) {
            addCriterion("purchase_id in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotIn(List<String> values) {
            addCriterion("purchase_id not in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdBetween(String value1, String value2) {
            addCriterion("purchase_id between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotBetween(String value1, String value2) {
            addCriterion("purchase_id not between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdIsNull() {
            addCriterion("purchase_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdIsNotNull() {
            addCriterion("purchase_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdEqualTo(String value) {
            addCriterion("purchase_user_id =", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdNotEqualTo(String value) {
            addCriterion("purchase_user_id <>", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdGreaterThan(String value) {
            addCriterion("purchase_user_id >", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_user_id >=", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdLessThan(String value) {
            addCriterion("purchase_user_id <", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdLessThanOrEqualTo(String value) {
            addCriterion("purchase_user_id <=", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdLike(String value) {
            addCriterion("purchase_user_id like", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdNotLike(String value) {
            addCriterion("purchase_user_id not like", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdIn(List<String> values) {
            addCriterion("purchase_user_id in", values, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdNotIn(List<String> values) {
            addCriterion("purchase_user_id not in", values, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdBetween(String value1, String value2) {
            addCriterion("purchase_user_id between", value1, value2, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdNotBetween(String value1, String value2) {
            addCriterion("purchase_user_id not between", value1, value2, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdIsNull() {
            addCriterion("payee_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdIsNotNull() {
            addCriterion("payee_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdEqualTo(String value) {
            addCriterion("payee_user_id =", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotEqualTo(String value) {
            addCriterion("payee_user_id <>", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdGreaterThan(String value) {
            addCriterion("payee_user_id >", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("payee_user_id >=", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdLessThan(String value) {
            addCriterion("payee_user_id <", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdLessThanOrEqualTo(String value) {
            addCriterion("payee_user_id <=", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdLike(String value) {
            addCriterion("payee_user_id like", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotLike(String value) {
            addCriterion("payee_user_id not like", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdIn(List<String> values) {
            addCriterion("payee_user_id in", values, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotIn(List<String> values) {
            addCriterion("payee_user_id not in", values, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdBetween(String value1, String value2) {
            addCriterion("payee_user_id between", value1, value2, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotBetween(String value1, String value2) {
            addCriterion("payee_user_id not between", value1, value2, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberIsNull() {
            addCriterion("purchase_number is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberIsNotNull() {
            addCriterion("purchase_number is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberEqualTo(Integer value) {
            addCriterion("purchase_number =", value, "purchaseNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberNotEqualTo(Integer value) {
            addCriterion("purchase_number <>", value, "purchaseNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberGreaterThan(Integer value) {
            addCriterion("purchase_number >", value, "purchaseNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_number >=", value, "purchaseNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberLessThan(Integer value) {
            addCriterion("purchase_number <", value, "purchaseNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_number <=", value, "purchaseNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberIn(List<Integer> values) {
            addCriterion("purchase_number in", values, "purchaseNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberNotIn(List<Integer> values) {
            addCriterion("purchase_number not in", values, "purchaseNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberBetween(Integer value1, Integer value2) {
            addCriterion("purchase_number between", value1, value2, "purchaseNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_number not between", value1, value2, "purchaseNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNull() {
            addCriterion("receive_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNotNull() {
            addCriterion("receive_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressEqualTo(String value) {
            addCriterion("receive_address =", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotEqualTo(String value) {
            addCriterion("receive_address <>", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThan(String value) {
            addCriterion("receive_address >", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receive_address >=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThan(String value) {
            addCriterion("receive_address <", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThanOrEqualTo(String value) {
            addCriterion("receive_address <=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLike(String value) {
            addCriterion("receive_address like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotLike(String value) {
            addCriterion("receive_address not like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIn(List<String> values) {
            addCriterion("receive_address in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotIn(List<String> values) {
            addCriterion("receive_address not in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressBetween(String value1, String value2) {
            addCriterion("receive_address between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotBetween(String value1, String value2) {
            addCriterion("receive_address not between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("receive_name =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("receive_name <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("receive_name like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("receive_name not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("receive_name in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNull() {
            addCriterion("receive_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNotNull() {
            addCriterion("receive_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneEqualTo(String value) {
            addCriterion("receive_phone =", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotEqualTo(String value) {
            addCriterion("receive_phone <>", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThan(String value) {
            addCriterion("receive_phone >", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receive_phone >=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThan(String value) {
            addCriterion("receive_phone <", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThanOrEqualTo(String value) {
            addCriterion("receive_phone <=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLike(String value) {
            addCriterion("receive_phone like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotLike(String value) {
            addCriterion("receive_phone not like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIn(List<String> values) {
            addCriterion("receive_phone in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotIn(List<String> values) {
            addCriterion("receive_phone not in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneBetween(String value1, String value2) {
            addCriterion("receive_phone between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotBetween(String value1, String value2) {
            addCriterion("receive_phone not between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalIsNull() {
            addCriterion("purchase_additional is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalIsNotNull() {
            addCriterion("purchase_additional is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalEqualTo(String value) {
            addCriterion("purchase_additional =", value, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalNotEqualTo(String value) {
            addCriterion("purchase_additional <>", value, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalGreaterThan(String value) {
            addCriterion("purchase_additional >", value, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_additional >=", value, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalLessThan(String value) {
            addCriterion("purchase_additional <", value, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalLessThanOrEqualTo(String value) {
            addCriterion("purchase_additional <=", value, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalLike(String value) {
            addCriterion("purchase_additional like", value, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalNotLike(String value) {
            addCriterion("purchase_additional not like", value, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalIn(List<String> values) {
            addCriterion("purchase_additional in", values, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalNotIn(List<String> values) {
            addCriterion("purchase_additional not in", values, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalBetween(String value1, String value2) {
            addCriterion("purchase_additional between", value1, value2, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseAdditionalNotBetween(String value1, String value2) {
            addCriterion("purchase_additional not between", value1, value2, "purchaseAdditional");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusIsNull() {
            addCriterion("purchase_status is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusIsNotNull() {
            addCriterion("purchase_status is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusEqualTo(String value) {
            addCriterion("purchase_status =", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotEqualTo(String value) {
            addCriterion("purchase_status <>", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusGreaterThan(String value) {
            addCriterion("purchase_status >", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_status >=", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusLessThan(String value) {
            addCriterion("purchase_status <", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusLessThanOrEqualTo(String value) {
            addCriterion("purchase_status <=", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusLike(String value) {
            addCriterion("purchase_status like", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotLike(String value) {
            addCriterion("purchase_status not like", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusIn(List<String> values) {
            addCriterion("purchase_status in", values, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotIn(List<String> values) {
            addCriterion("purchase_status not in", values, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusBetween(String value1, String value2) {
            addCriterion("purchase_status between", value1, value2, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotBetween(String value1, String value2) {
            addCriterion("purchase_status not between", value1, value2, "purchaseStatus");
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