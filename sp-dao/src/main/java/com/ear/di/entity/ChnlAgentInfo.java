package com.ear.di.entity;

import java.util.Date;

public class ChnlAgentInfo {
    private Long id;

    private String chnlAgentId;

    private String userId;

    private String chnlAgentName;

    private String chnlAgentEmail;

    private String chnlAgentAddress;

    private String chnlAgentMobilePhone;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChnlAgentId() {
        return chnlAgentId;
    }

    public void setChnlAgentId(String chnlAgentId) {
        this.chnlAgentId = chnlAgentId == null ? null : chnlAgentId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getChnlAgentName() {
        return chnlAgentName;
    }

    public void setChnlAgentName(String chnlAgentName) {
        this.chnlAgentName = chnlAgentName == null ? null : chnlAgentName.trim();
    }

    public String getChnlAgentEmail() {
        return chnlAgentEmail;
    }

    public void setChnlAgentEmail(String chnlAgentEmail) {
        this.chnlAgentEmail = chnlAgentEmail == null ? null : chnlAgentEmail.trim();
    }

    public String getChnlAgentAddress() {
        return chnlAgentAddress;
    }

    public void setChnlAgentAddress(String chnlAgentAddress) {
        this.chnlAgentAddress = chnlAgentAddress == null ? null : chnlAgentAddress.trim();
    }

    public String getChnlAgentMobilePhone() {
        return chnlAgentMobilePhone;
    }

    public void setChnlAgentMobilePhone(String chnlAgentMobilePhone) {
        this.chnlAgentMobilePhone = chnlAgentMobilePhone == null ? null : chnlAgentMobilePhone.trim();
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