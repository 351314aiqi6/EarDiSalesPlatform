package com.ear.di.enums;

public enum RespCode {
    SUCCESS("000000", "交易成功"),

    USER_OR_PASSWORD_ERROR("000001", "[用户名/密码][不存在/错误]"),

    USER_REGISTER_ERROR("000002", "用户注册失败"),

    LOGIN_USER_NAME_IS_EXIST("000003", "用户名已存在"),

    USER_IS_NOT_EXIST("000004", "用户不存在"),

    UPDATE_USER_ERROR("000005", "修改用户信息失败"),
    ;

    RespCode(String respCode, String respMessage) {
        this.respCode = respCode;
        this.respMessage = respMessage;
    }

    private final String respCode;

    private final String respMessage;

    public String getRespCode() {
        return respCode;
    }

    public String getRespMessage() {
        return respMessage;
    }
}
