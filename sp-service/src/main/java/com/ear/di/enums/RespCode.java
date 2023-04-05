package com.ear.di.enums;

public enum RespCode {
    SUCCESS("000000", "交易成功"),

    USER_OR_PASSWORD_ERROR("000001", "[用户名/密码][不存在/错误]"),

    USER_REGISTER_ERROR("000002", "用户注册失败"),

    LOGIN_USER_NAME_IS_EXIST("000003", "用户名已存在"),

    USER_IS_NOT_EXIST("000004", "用户不存在"),

    UPDATE_USER_ERROR("000005", "修改用户信息失败"),

    ADD_CHNL_INFO_ERROR("000006", "添加渠道商异常"),

    UPDATE_CHNL_INFO_ERROR("000007", "修改渠道商异常"),

    DATE_FORMATE_ERROR("000008", "日期格式不正确，日期格式需要yyyyMMdd"),

    MERCHANT_IS_ALREADY_EXIST("000009", "商户已存在"),

    MERCHANT_REGISTER_ERROR("000010", "商户注册失败"),

    MERCHANT_UPDATE_ERROR("000012", "商户信息修改失败"),

    MERCHANT_IS_NOT_EXIST("000011", "商户不存在"),

    CHNL_AGENT_NOT_EXIST("000013", "渠道商户不存在"),

    GOODS_IS_NOT_EXIST("000015", "商品不存在"),

    ADD_GOODS_ERROR("000014", "添加商品失败"),

    GOODS_UPDATE_ERROR("000016", "商品信息修改失败"),

    GOODS_STOCK_NOT_ENOUGH("000017", "商品库存不足"),

    PURCHASE_APPLY_ERROR("000018", "申购单申请失败"),

    MESSAGE_SEND_ERROR("000019", "信息发送失败"),

    REGISTER_KOL_ERROR("000020", "注册主播信息失败"),

    KOL_ALREADY_REGISTER("000021", "主播已注册"),

    KOL_NOT_EXIST("000022", "主播信息不存在"),

    UPDATE_KOL_ERROR("000023", "注册主播信息失败"),

    PERFORM_APPLY_ERROR("000024", "直播申请失败"),

    PERFORM_CANCEL_ERROR("000025", "直播取消失败"),

    PASSWORD_IS_ERROR("000027", "当前密码不正确"),

    PERFORM_NOT_EXIST("000026", "直播信息不存在"),
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
