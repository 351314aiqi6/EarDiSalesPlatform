package com.ear.di.enums;

public enum RespCode {
    SUCCESS("000000", "交易成功"),

    USER_OR_PASSWORD_ERROR("000001", "[用户名/密码][不存在/错误]"),
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
