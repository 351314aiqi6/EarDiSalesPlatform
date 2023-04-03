package com.ear.di.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseInfo {
    private Long id;

    private String purchaseId;

    private String purchaseUserId;

    private String goodsId;

    private Integer purchaseNumber;

    private String receiveAddress;

    private BigDecimal totalPrice;

    private String purchaseAdditional;

    private String purchaseStatus;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId == null ? null : purchaseId.trim();
    }

    public String getPurchaseUserId() {
        return purchaseUserId;
    }

    public void setPurchaseUserId(String purchaseUserId) {
        this.purchaseUserId = purchaseUserId == null ? null : purchaseUserId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public Integer getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(Integer purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPurchaseAdditional() {
        return purchaseAdditional;
    }

    public void setPurchaseAdditional(String purchaseAdditional) {
        this.purchaseAdditional = purchaseAdditional == null ? null : purchaseAdditional.trim();
    }

    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus == null ? null : purchaseStatus.trim();
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