package com.ear.di.entity;

import java.util.Date;

public class KOLInfo {
    private Long id;

    private String kolId;

    private String userId;

    private String kolName;

    private String performPlatform;

    private Long performNumber;

    private Long prePerformNumber;

    private Long performViewerNumber;

    private String kolAvatar;

    private Integer kolFollowers;

    private String kolIntroduce;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKolId() {
        return kolId;
    }

    public void setKolId(String kolId) {
        this.kolId = kolId == null ? null : kolId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getKolName() {
        return kolName;
    }

    public void setKolName(String kolName) {
        this.kolName = kolName == null ? null : kolName.trim();
    }

    public String getPerformPlatform() {
        return performPlatform;
    }

    public void setPerformPlatform(String performPlatform) {
        this.performPlatform = performPlatform == null ? null : performPlatform.trim();
    }

    public Long getPerformNumber() {
        return performNumber;
    }

    public void setPerformNumber(Long performNumber) {
        this.performNumber = performNumber;
    }

    public Long getPrePerformNumber() {
        return prePerformNumber;
    }

    public void setPrePerformNumber(Long prePerformNumber) {
        this.prePerformNumber = prePerformNumber;
    }

    public Long getPerformViewerNumber() {
        return performViewerNumber;
    }

    public void setPerformViewerNumber(Long performViewerNumber) {
        this.performViewerNumber = performViewerNumber;
    }

    public String getKolAvatar() {
        return kolAvatar;
    }

    public void setKolAvatar(String kolAvatar) {
        this.kolAvatar = kolAvatar == null ? null : kolAvatar.trim();
    }

    public Integer getKolFollowers() {
        return kolFollowers;
    }

    public void setKolFollowers(Integer kolFollowers) {
        this.kolFollowers = kolFollowers;
    }

    public String getKolIntroduce() {
        return kolIntroduce;
    }

    public void setKolIntroduce(String kolIntroduce) {
        this.kolIntroduce = kolIntroduce == null ? null : kolIntroduce.trim();
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