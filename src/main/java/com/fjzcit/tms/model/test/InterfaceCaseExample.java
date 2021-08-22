package com.fjzcit.tms.model.test;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterfaceCaseExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("content_type is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("content_type is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(Byte value) {
            addCriterion("content_type =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(Byte value) {
            addCriterion("content_type <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(Byte value) {
            addCriterion("content_type >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("content_type >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(Byte value) {
            addCriterion("content_type <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(Byte value) {
            addCriterion("content_type <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<Byte> values) {
            addCriterion("content_type in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<Byte> values) {
            addCriterion("content_type not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(Byte value1, Byte value2) {
            addCriterion("content_type between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("content_type not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentIsNull() {
            addCriterion("expected_response_content is null");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentIsNotNull() {
            addCriterion("expected_response_content is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentEqualTo(String value) {
            addCriterion("expected_response_content =", value, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentNotEqualTo(String value) {
            addCriterion("expected_response_content <>", value, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentGreaterThan(String value) {
            addCriterion("expected_response_content >", value, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentGreaterThanOrEqualTo(String value) {
            addCriterion("expected_response_content >=", value, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentLessThan(String value) {
            addCriterion("expected_response_content <", value, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentLessThanOrEqualTo(String value) {
            addCriterion("expected_response_content <=", value, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentLike(String value) {
            addCriterion("expected_response_content like", value, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentNotLike(String value) {
            addCriterion("expected_response_content not like", value, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentIn(List<String> values) {
            addCriterion("expected_response_content in", values, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentNotIn(List<String> values) {
            addCriterion("expected_response_content not in", values, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentBetween(String value1, String value2) {
            addCriterion("expected_response_content between", value1, value2, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseContentNotBetween(String value1, String value2) {
            addCriterion("expected_response_content not between", value1, value2, "expectedResponseContent");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeIsNull() {
            addCriterion("expected_response_type is null");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeIsNotNull() {
            addCriterion("expected_response_type is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeEqualTo(Byte value) {
            addCriterion("expected_response_type =", value, "expectedResponseType");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeNotEqualTo(Byte value) {
            addCriterion("expected_response_type <>", value, "expectedResponseType");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeGreaterThan(Byte value) {
            addCriterion("expected_response_type >", value, "expectedResponseType");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("expected_response_type >=", value, "expectedResponseType");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeLessThan(Byte value) {
            addCriterion("expected_response_type <", value, "expectedResponseType");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("expected_response_type <=", value, "expectedResponseType");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeIn(List<Byte> values) {
            addCriterion("expected_response_type in", values, "expectedResponseType");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeNotIn(List<Byte> values) {
            addCriterion("expected_response_type not in", values, "expectedResponseType");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeBetween(Byte value1, Byte value2) {
            addCriterion("expected_response_type between", value1, value2, "expectedResponseType");
            return (Criteria) this;
        }

        public Criteria andExpectedResponseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("expected_response_type not between", value1, value2, "expectedResponseType");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNull() {
            addCriterion("function_id is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("function_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(Integer value) {
            addCriterion("function_id =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(Integer value) {
            addCriterion("function_id <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(Integer value) {
            addCriterion("function_id >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("function_id >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(Integer value) {
            addCriterion("function_id <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("function_id <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<Integer> values) {
            addCriterion("function_id in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<Integer> values) {
            addCriterion("function_id not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(Integer value1, Integer value2) {
            addCriterion("function_id between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("function_id not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNull() {
            addCriterion("interface_type is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNotNull() {
            addCriterion("interface_type is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeEqualTo(Integer value) {
            addCriterion("interface_type =", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotEqualTo(Integer value) {
            addCriterion("interface_type <>", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThan(Integer value) {
            addCriterion("interface_type >", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("interface_type >=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThan(Integer value) {
            addCriterion("interface_type <", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("interface_type <=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIn(List<Integer> values) {
            addCriterion("interface_type in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotIn(List<Integer> values) {
            addCriterion("interface_type not in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeBetween(Integer value1, Integer value2) {
            addCriterion("interface_type between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("interface_type not between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andIsAjaxIsNull() {
            addCriterion("is_ajax is null");
            return (Criteria) this;
        }

        public Criteria andIsAjaxIsNotNull() {
            addCriterion("is_ajax is not null");
            return (Criteria) this;
        }

        public Criteria andIsAjaxEqualTo(Byte value) {
            addCriterion("is_ajax =", value, "isAjax");
            return (Criteria) this;
        }

        public Criteria andIsAjaxNotEqualTo(Byte value) {
            addCriterion("is_ajax <>", value, "isAjax");
            return (Criteria) this;
        }

        public Criteria andIsAjaxGreaterThan(Byte value) {
            addCriterion("is_ajax >", value, "isAjax");
            return (Criteria) this;
        }

        public Criteria andIsAjaxGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_ajax >=", value, "isAjax");
            return (Criteria) this;
        }

        public Criteria andIsAjaxLessThan(Byte value) {
            addCriterion("is_ajax <", value, "isAjax");
            return (Criteria) this;
        }

        public Criteria andIsAjaxLessThanOrEqualTo(Byte value) {
            addCriterion("is_ajax <=", value, "isAjax");
            return (Criteria) this;
        }

        public Criteria andIsAjaxIn(List<Byte> values) {
            addCriterion("is_ajax in", values, "isAjax");
            return (Criteria) this;
        }

        public Criteria andIsAjaxNotIn(List<Byte> values) {
            addCriterion("is_ajax not in", values, "isAjax");
            return (Criteria) this;
        }

        public Criteria andIsAjaxBetween(Byte value1, Byte value2) {
            addCriterion("is_ajax between", value1, value2, "isAjax");
            return (Criteria) this;
        }

        public Criteria andIsAjaxNotBetween(Byte value1, Byte value2) {
            addCriterion("is_ajax not between", value1, value2, "isAjax");
            return (Criteria) this;
        }

        public Criteria andIterationIdIsNull() {
            addCriterion("iteration_id is null");
            return (Criteria) this;
        }

        public Criteria andIterationIdIsNotNull() {
            addCriterion("iteration_id is not null");
            return (Criteria) this;
        }

        public Criteria andIterationIdEqualTo(Integer value) {
            addCriterion("iteration_id =", value, "iterationId");
            return (Criteria) this;
        }

        public Criteria andIterationIdNotEqualTo(Integer value) {
            addCriterion("iteration_id <>", value, "iterationId");
            return (Criteria) this;
        }

        public Criteria andIterationIdGreaterThan(Integer value) {
            addCriterion("iteration_id >", value, "iterationId");
            return (Criteria) this;
        }

        public Criteria andIterationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iteration_id >=", value, "iterationId");
            return (Criteria) this;
        }

        public Criteria andIterationIdLessThan(Integer value) {
            addCriterion("iteration_id <", value, "iterationId");
            return (Criteria) this;
        }

        public Criteria andIterationIdLessThanOrEqualTo(Integer value) {
            addCriterion("iteration_id <=", value, "iterationId");
            return (Criteria) this;
        }

        public Criteria andIterationIdIn(List<Integer> values) {
            addCriterion("iteration_id in", values, "iterationId");
            return (Criteria) this;
        }

        public Criteria andIterationIdNotIn(List<Integer> values) {
            addCriterion("iteration_id not in", values, "iterationId");
            return (Criteria) this;
        }

        public Criteria andIterationIdBetween(Integer value1, Integer value2) {
            addCriterion("iteration_id between", value1, value2, "iterationId");
            return (Criteria) this;
        }

        public Criteria andIterationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iteration_id not between", value1, value2, "iterationId");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("`method` is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("`method` is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(Integer value) {
            addCriterion("`method` =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(Integer value) {
            addCriterion("`method` <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(Integer value) {
            addCriterion("`method` >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("`method` >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(Integer value) {
            addCriterion("`method` <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(Integer value) {
            addCriterion("`method` <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<Integer> values) {
            addCriterion("`method` in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<Integer> values) {
            addCriterion("`method` not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(Integer value1, Integer value2) {
            addCriterion("`method` between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("`method` not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPreconditionIsNull() {
            addCriterion("precondition is null");
            return (Criteria) this;
        }

        public Criteria andPreconditionIsNotNull() {
            addCriterion("precondition is not null");
            return (Criteria) this;
        }

        public Criteria andPreconditionEqualTo(Integer value) {
            addCriterion("precondition =", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionNotEqualTo(Integer value) {
            addCriterion("precondition <>", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionGreaterThan(Integer value) {
            addCriterion("precondition >", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("precondition >=", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionLessThan(Integer value) {
            addCriterion("precondition <", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionLessThanOrEqualTo(Integer value) {
            addCriterion("precondition <=", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionIn(List<Integer> values) {
            addCriterion("precondition in", values, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionNotIn(List<Integer> values) {
            addCriterion("precondition not in", values, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionBetween(Integer value1, Integer value2) {
            addCriterion("precondition between", value1, value2, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionNotBetween(Integer value1, Integer value2) {
            addCriterion("precondition not between", value1, value2, "precondition");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieIsNull() {
            addCriterion("update_cookie is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieIsNotNull() {
            addCriterion("update_cookie is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieEqualTo(Byte value) {
            addCriterion("update_cookie =", value, "updateCookie");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieNotEqualTo(Byte value) {
            addCriterion("update_cookie <>", value, "updateCookie");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieGreaterThan(Byte value) {
            addCriterion("update_cookie >", value, "updateCookie");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieGreaterThanOrEqualTo(Byte value) {
            addCriterion("update_cookie >=", value, "updateCookie");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieLessThan(Byte value) {
            addCriterion("update_cookie <", value, "updateCookie");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieLessThanOrEqualTo(Byte value) {
            addCriterion("update_cookie <=", value, "updateCookie");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieIn(List<Byte> values) {
            addCriterion("update_cookie in", values, "updateCookie");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieNotIn(List<Byte> values) {
            addCriterion("update_cookie not in", values, "updateCookie");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieBetween(Byte value1, Byte value2) {
            addCriterion("update_cookie between", value1, value2, "updateCookie");
            return (Criteria) this;
        }

        public Criteria andUpdateCookieNotBetween(Byte value1, Byte value2) {
            addCriterion("update_cookie not between", value1, value2, "updateCookie");
            return (Criteria) this;
        }

        public Criteria andUriIsNull() {
            addCriterion("uri is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("uri is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("uri =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("uri <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("uri >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("uri >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("uri <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("uri <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("uri like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("uri not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("uri in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("uri not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("uri between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("uri not between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("system_id is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("system_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(Integer value) {
            addCriterion("system_id =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(Integer value) {
            addCriterion("system_id <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(Integer value) {
            addCriterion("system_id >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_id >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(Integer value) {
            addCriterion("system_id <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(Integer value) {
            addCriterion("system_id <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<Integer> values) {
            addCriterion("system_id in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<Integer> values) {
            addCriterion("system_id not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(Integer value1, Integer value2) {
            addCriterion("system_id between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("system_id not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andParameterIsNull() {
            addCriterion("`parameter` is null");
            return (Criteria) this;
        }

        public Criteria andParameterIsNotNull() {
            addCriterion("`parameter` is not null");
            return (Criteria) this;
        }

        public Criteria andParameterEqualTo(String value) {
            addCriterion("`parameter` =", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotEqualTo(String value) {
            addCriterion("`parameter` <>", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThan(String value) {
            addCriterion("`parameter` >", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThanOrEqualTo(String value) {
            addCriterion("`parameter` >=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThan(String value) {
            addCriterion("`parameter` <", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThanOrEqualTo(String value) {
            addCriterion("`parameter` <=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLike(String value) {
            addCriterion("`parameter` like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotLike(String value) {
            addCriterion("`parameter` not like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterIn(List<String> values) {
            addCriterion("`parameter` in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotIn(List<String> values) {
            addCriterion("`parameter` not in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterBetween(String value1, String value2) {
            addCriterion("`parameter` between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotBetween(String value1, String value2) {
            addCriterion("`parameter` not between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterSourceIsNull() {
            addCriterion("parameter_source is null");
            return (Criteria) this;
        }

        public Criteria andParameterSourceIsNotNull() {
            addCriterion("parameter_source is not null");
            return (Criteria) this;
        }

        public Criteria andParameterSourceEqualTo(String value) {
            addCriterion("parameter_source =", value, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceNotEqualTo(String value) {
            addCriterion("parameter_source <>", value, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceGreaterThan(String value) {
            addCriterion("parameter_source >", value, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceGreaterThanOrEqualTo(String value) {
            addCriterion("parameter_source >=", value, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceLessThan(String value) {
            addCriterion("parameter_source <", value, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceLessThanOrEqualTo(String value) {
            addCriterion("parameter_source <=", value, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceLike(String value) {
            addCriterion("parameter_source like", value, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceNotLike(String value) {
            addCriterion("parameter_source not like", value, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceIn(List<String> values) {
            addCriterion("parameter_source in", values, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceNotIn(List<String> values) {
            addCriterion("parameter_source not in", values, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceBetween(String value1, String value2) {
            addCriterion("parameter_source between", value1, value2, "parameterSource");
            return (Criteria) this;
        }

        public Criteria andParameterSourceNotBetween(String value1, String value2) {
            addCriterion("parameter_source not between", value1, value2, "parameterSource");
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