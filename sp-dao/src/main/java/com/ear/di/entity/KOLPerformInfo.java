package com.ear.di.entity;

import java.util.Date;

public class KOLPerformInfo {
    private Long id;

    private String perforId;

    private String kolId;

    private String merchantId;

    private String performGoodsIntroduce;

    private String performUrl;

    private Integer applyNumber;

    private Date performStartDttm;

    private Date performEndDttm;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerforId() {
        return perforId;
    }

    public void setPerforId(String perforId) {
        this.perforId = perforId == null ? null : perforId.trim();
    }

    public String getKolId() {
        return kolId;
    }

    public void setKolId(String kolId) {
        this.kolId = kolId == null ? null : kolId.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getPerformGoodsIntroduce() {
        return performGoodsIntroduce;
    }

    public void setPerformGoodsIntroduce(String performGoodsIntroduce) {
        this.performGoodsIntroduce = performGoodsIntroduce == null ? null : performGoodsIntroduce.trim();
    }

    public String getPerformUrl() {
        return performUrl;
    }

    public void setPerformUrl(String performUrl) {
        this.performUrl = performUrl == null ? null : performUrl.trim();
    }

    public Integer getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(Integer applyNumber) {
        this.applyNumber = applyNumber;
    }

    public Date getPerformStartDttm() {
        return performStartDttm;
    }

    public void setPerformStartDttm(Date performStartDttm) {
        this.performStartDttm = performStartDttm;
    }

    public Date getPerformEndDttm() {
        return performEndDttm;
    }

    public void setPerformEndDttm(Date performEndDttm) {
        this.performEndDttm = performEndDttm;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}