package com.ear.di.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KOLInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KOLInfoExample() {
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

        public Criteria andKolNameIsNull() {
            addCriterion("kol_name is null");
            return (Criteria) this;
        }

        public Criteria andKolNameIsNotNull() {
            addCriterion("kol_name is not null");
            return (Criteria) this;
        }

        public Criteria andKolNameEqualTo(String value) {
            addCriterion("kol_name =", value, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameNotEqualTo(String value) {
            addCriterion("kol_name <>", value, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameGreaterThan(String value) {
            addCriterion("kol_name >", value, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameGreaterThanOrEqualTo(String value) {
            addCriterion("kol_name >=", value, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameLessThan(String value) {
            addCriterion("kol_name <", value, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameLessThanOrEqualTo(String value) {
            addCriterion("kol_name <=", value, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameLike(String value) {
            addCriterion("kol_name like", value, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameNotLike(String value) {
            addCriterion("kol_name not like", value, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameIn(List<String> values) {
            addCriterion("kol_name in", values, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameNotIn(List<String> values) {
            addCriterion("kol_name not in", values, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameBetween(String value1, String value2) {
            addCriterion("kol_name between", value1, value2, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolNameNotBetween(String value1, String value2) {
            addCriterion("kol_name not between", value1, value2, "kolName");
            return (Criteria) this;
        }

        public Criteria andKolAvatarIsNull() {
            addCriterion("kol_avatar is null");
            return (Criteria) this;
        }

        public Criteria andKolAvatarIsNotNull() {
            addCriterion("kol_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andKolAvatarEqualTo(String value) {
            addCriterion("kol_avatar =", value, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarNotEqualTo(String value) {
            addCriterion("kol_avatar <>", value, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarGreaterThan(String value) {
            addCriterion("kol_avatar >", value, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("kol_avatar >=", value, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarLessThan(String value) {
            addCriterion("kol_avatar <", value, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarLessThanOrEqualTo(String value) {
            addCriterion("kol_avatar <=", value, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarLike(String value) {
            addCriterion("kol_avatar like", value, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarNotLike(String value) {
            addCriterion("kol_avatar not like", value, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarIn(List<String> values) {
            addCriterion("kol_avatar in", values, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarNotIn(List<String> values) {
            addCriterion("kol_avatar not in", values, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarBetween(String value1, String value2) {
            addCriterion("kol_avatar between", value1, value2, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolAvatarNotBetween(String value1, String value2) {
            addCriterion("kol_avatar not between", value1, value2, "kolAvatar");
            return (Criteria) this;
        }

        public Criteria andKolFollowersIsNull() {
            addCriterion("kol_followers is null");
            return (Criteria) this;
        }

        public Criteria andKolFollowersIsNotNull() {
            addCriterion("kol_followers is not null");
            return (Criteria) this;
        }

        public Criteria andKolFollowersEqualTo(Integer value) {
            addCriterion("kol_followers =", value, "kolFollowers");
            return (Criteria) this;
        }

        public Criteria andKolFollowersNotEqualTo(Integer value) {
            addCriterion("kol_followers <>", value, "kolFollowers");
            return (Criteria) this;
        }

        public Criteria andKolFollowersGreaterThan(Integer value) {
            addCriterion("kol_followers >", value, "kolFollowers");
            return (Criteria) this;
        }

        public Criteria andKolFollowersGreaterThanOrEqualTo(Integer value) {
            addCriterion("kol_followers >=", value, "kolFollowers");
            return (Criteria) this;
        }

        public Criteria andKolFollowersLessThan(Integer value) {
            addCriterion("kol_followers <", value, "kolFollowers");
            return (Criteria) this;
        }

        public Criteria andKolFollowersLessThanOrEqualTo(Integer value) {
            addCriterion("kol_followers <=", value, "kolFollowers");
            return (Criteria) this;
        }

        public Criteria andKolFollowersIn(List<Integer> values) {
            addCriterion("kol_followers in", values, "kolFollowers");
            return (Criteria) this;
        }

        public Criteria andKolFollowersNotIn(List<Integer> values) {
            addCriterion("kol_followers not in", values, "kolFollowers");
            return (Criteria) this;
        }

        public Criteria andKolFollowersBetween(Integer value1, Integer value2) {
            addCriterion("kol_followers between", value1, value2, "kolFollowers");
            return (Criteria) this;
        }

        public Criteria andKolFollowersNotBetween(Integer value1, Integer value2) {
            addCriterion("kol_followers not between", value1, value2, "kolFollowers");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceIsNull() {
            addCriterion("kol_introduce is null");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceIsNotNull() {
            addCriterion("kol_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceEqualTo(String value) {
            addCriterion("kol_introduce =", value, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceNotEqualTo(String value) {
            addCriterion("kol_introduce <>", value, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceGreaterThan(String value) {
            addCriterion("kol_introduce >", value, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("kol_introduce >=", value, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceLessThan(String value) {
            addCriterion("kol_introduce <", value, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceLessThanOrEqualTo(String value) {
            addCriterion("kol_introduce <=", value, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceLike(String value) {
            addCriterion("kol_introduce like", value, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceNotLike(String value) {
            addCriterion("kol_introduce not like", value, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceIn(List<String> values) {
            addCriterion("kol_introduce in", values, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceNotIn(List<String> values) {
            addCriterion("kol_introduce not in", values, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceBetween(String value1, String value2) {
            addCriterion("kol_introduce between", value1, value2, "kolIntroduce");
            return (Criteria) this;
        }

        public Criteria andKolIntroduceNotBetween(String value1, String value2) {
            addCriterion("kol_introduce not between", value1, value2, "kolIntroduce");
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