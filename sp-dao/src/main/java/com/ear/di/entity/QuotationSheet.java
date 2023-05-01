package com.ear.di.entity;

public class QuotationSheet {
    private Long id;

    private String goodsName;

    private String quotationValue;

    private String quotationTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getQuotationValue() {
        return quotationValue;
    }

    public void setQuotationValue(String quotationValue) {
        this.quotationValue = quotationValue == null ? null : quotationValue.trim();
    }

    public String getQuotationTime() {
        return quotationTime;
    }

    public void setQuotationTime(String quotationTime) {
        this.quotationTime = quotationTime == null ? null : quotationTime.trim();
    }
}