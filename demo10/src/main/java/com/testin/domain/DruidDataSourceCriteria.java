package com.testin.domain;

import java.util.ArrayList;
import java.util.List;

public class DruidDataSourceCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DruidDataSourceCriteria() {
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

        public Criteria andDatasourceIsNull() {
            addCriterion("dataSource is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("dataSource is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("dataSource =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("dataSource <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("dataSource >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("dataSource >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("dataSource <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("dataSource <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("dataSource like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("dataSource not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("dataSource in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("dataSource not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("dataSource between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("dataSource not between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(String value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(String value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(String value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(String value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(String value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(String value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLike(String value) {
            addCriterion("created_date like", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotLike(String value) {
            addCriterion("created_date not like", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<String> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<String> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(String value1, String value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(String value1, String value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1IsNull() {
            addCriterion("commit_metadata_sha1 is null");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1IsNotNull() {
            addCriterion("commit_metadata_sha1 is not null");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1EqualTo(String value) {
            addCriterion("commit_metadata_sha1 =", value, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1NotEqualTo(String value) {
            addCriterion("commit_metadata_sha1 <>", value, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1GreaterThan(String value) {
            addCriterion("commit_metadata_sha1 >", value, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1GreaterThanOrEqualTo(String value) {
            addCriterion("commit_metadata_sha1 >=", value, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1LessThan(String value) {
            addCriterion("commit_metadata_sha1 <", value, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1LessThanOrEqualTo(String value) {
            addCriterion("commit_metadata_sha1 <=", value, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1Like(String value) {
            addCriterion("commit_metadata_sha1 like", value, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1NotLike(String value) {
            addCriterion("commit_metadata_sha1 not like", value, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1In(List<String> values) {
            addCriterion("commit_metadata_sha1 in", values, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1NotIn(List<String> values) {
            addCriterion("commit_metadata_sha1 not in", values, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1Between(String value1, String value2) {
            addCriterion("commit_metadata_sha1 between", value1, value2, "commitMetadataSha1");
            return (Criteria) this;
        }

        public Criteria andCommitMetadataSha1NotBetween(String value1, String value2) {
            addCriterion("commit_metadata_sha1 not between", value1, value2, "commitMetadataSha1");
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