package com.ear.di.entity;

import java.util.Date;

public class KOLPerformInfo {
    private Long id;

    private String perforId;

    private String performTitle;

    private String kolId;

    private String merchantId;

    private String performPlatform;

    private String performGoodsIntroduce;

    private String performUrl;

    private Integer applyNumber;

    private Long performStartDttm;

    private Long performEndDttm;

    private String performStatus;

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

    public String getPerformTitle() {
        return performTitle;
    }

    public void setPerformTitle(String performTitle) {
        this.performTitle = performTitle == null ? null : performTitle.trim();
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

    public String getPerformPlatform() {
        return performPlatform;
    }

    public void setPerformPlatform(String performPlatform) {
        this.performPlatform = performPlatform == null ? null : performPlatform.trim();
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

    public Long getPerformStartDttm() {
        return performStartDttm;
    }

    public void setPerformStartDttm(Long performStartDttm) {
        this.performStartDttm = performStartDttm;
    }

    public Long getPerformEndDttm() {
        return performEndDttm;
    }

    public void setPerformEndDttm(Long performEndDttm) {
        this.performEndDttm = performEndDttm;
    }

    public String getPerformStatus() {
        return performStatus;
    }

    public void setPerformStatus(String performStatus) {
        this.performStatus = performStatus == null ? null : performStatus.trim();
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