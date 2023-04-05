package com.ear.di.entity;

import java.util.Date;

public class UserLoginInfo {
    private Long id;

    private String userId;

    private Date loginDttm;

    private String loginIpAddress;

    private String loginAddressDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getLoginDttm() {
        return loginDttm;
    }

    public void setLoginDttm(Date loginDttm) {
        this.loginDttm = loginDttm;
    }

    public String getLoginIpAddress() {
        return loginIpAddress;
    }

    public void setLoginIpAddress(String loginIpAddress) {
        this.loginIpAddress = loginIpAddress == null ? null : loginIpAddress.trim();
    }

    public String getLoginAddressDesc() {
        return loginAddressDesc;
    }

    public void setLoginAddressDesc(String loginAddressDesc) {
        this.loginAddressDesc = loginAddressDesc == null ? null : loginAddressDesc.trim();
    }
}