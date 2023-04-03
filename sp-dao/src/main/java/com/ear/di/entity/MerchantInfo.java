package com.ear.di.entity;

import java.util.Date;

public class MerchantInfo {
    private Long id;

    private String merchantId;

    private String userId;

    private String merchantName;

    private String chnlAgentId;

    private String merchantPrivatId;

    private String merchantAdress;

    private String merchantPhone;

    private String merchantEmail;

    private String merchantStatus;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getChnlAgentId() {
        return chnlAgentId;
    }

    public void setChnlAgentId(String chnlAgentId) {
        this.chnlAgentId = chnlAgentId == null ? null : chnlAgentId.trim();
    }

    public String getMerchantPrivatId() {
        return merchantPrivatId;
    }

    public void setMerchantPrivatId(String merchantPrivatId) {
        this.merchantPrivatId = merchantPrivatId == null ? null : merchantPrivatId.trim();
    }

    public String getMerchantAdress() {
        return merchantAdress;
    }

    public void setMerchantAdress(String merchantAdress) {
        this.merchantAdress = merchantAdress == null ? null : merchantAdress.trim();
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public void setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone == null ? null : merchantPhone.trim();
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail == null ? null : merchantEmail.trim();
    }

    public String getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(String merchantStatus) {
        this.merchantStatus = merchantStatus == null ? null : merchantStatus.trim();
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