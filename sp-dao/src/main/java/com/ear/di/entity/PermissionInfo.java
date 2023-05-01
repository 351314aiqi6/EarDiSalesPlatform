package com.ear.di.entity;

public class PermissionInfo {
    private Integer id;

    private String userRole;

    private String permissionName;

    private Boolean permissionValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public Boolean getPermissionValue() {
        return permissionValue;
    }

    public void setPermissionValue(Boolean permissionValue) {
        this.permissionValue = permissionValue;
    }
}