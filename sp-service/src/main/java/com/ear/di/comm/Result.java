package com.ear.di.comm;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson2.JSON;
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
    private final Object data;

    public Result(Integer code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;

    }

    public static Result success(Object data) {
        return new Result(0, data, "交易成功");
    }

    public static Result judgeResult(boolean isSuccess , Object data, RespCode respCode) {
        if(isSuccess){
            return success( data);
        }else {
            return error(data,respCode);
        }
    }

    public static Result error(Object data, BusiException exception) {
        return error( data, exception.getRespCode());
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

    public Object getData() {
        return data;
    }

    public boolean dataIsNummOrEmpty(){
        if(data == null){
            return true;
        }else{
            if(data instanceof List){
                return ((List)data).isEmpty();
            }
            if(data instanceof Map){
                return ((Map)data).isEmpty();
            }
        }
        return false;
    }
}
