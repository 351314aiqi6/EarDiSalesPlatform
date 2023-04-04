package com.ear.di.comm;

import cn.hutool.json.JSONUtil;
import com.ear.di.enums.RespCode;
import com.ear.di.exception.BusiException;

import java.util.List;
import java.util.Map;

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
    private final Object result;

    public Result(Integer code, Object result, String message) {
        this.code = code;
        this.result = result;
        this.message = message;

    }

    public static Result success(Object data) {
        return new Result(0, data, "交易成功");
    }

    public static Result judgeResult(boolean isSuccess, Object data, RespCode respCode) {
        if (isSuccess) {
            return success(data);
        } else {
            return error(data, respCode);
        }
    }

    public static Result error(Object data, BusiException exception) {
        return error(data, exception.getRespCode());
    }


    public static Result error(Object data, RespCode respCode) {
        return new Result(1, data, respCode.getRespMessage());
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

    public Object getResult() {
        return result;
    }

    public boolean dataIsNummOrEmpty() {
        if (result == null) {
            return true;
        } else {
            if (result instanceof List) {
                return ((List) result).isEmpty();
            }
            if (result instanceof Map) {
                return ((Map) result).isEmpty();
            }
        }
        return false;
    }

    public boolean isSuccess() {
        return code.equals(0);
    }
}
