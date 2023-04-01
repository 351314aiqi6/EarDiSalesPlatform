package com.ear.di.comm;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson2.JSON;
import com.ear.di.exception.BusiException;

public class Result {
    /**
     * 响应码
     */
    private final Integer code;

    /**
     * 响应描述
     */
    private final String message;

    /**
     * 响应数据
     */
    private final Object data;

    public Result(Integer code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;

    }

    public static Result success(Object data) {
        return new Result(0, data, "交易成功");
    }

    public static Result error(Object data, BusiException exception) {
        return new Result(1, data, exception.getRespCode().getRespMessage());
    }

    @Override
    public String toString() {
        return JSONUtil.toJsonStr(this);
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
