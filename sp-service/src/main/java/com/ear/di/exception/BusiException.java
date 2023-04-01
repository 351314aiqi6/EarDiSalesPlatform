package com.ear.di.exception;

import com.ear.di.enums.RespCode;

public class BusiException extends Exception {
    public BusiException(RespCode respCode, String message) {
        super(message);
        this.respCode = respCode;
    }

    public BusiException(RespCode respCode) {
        this.respCode = respCode;
    }

    private final RespCode respCode;

    public RespCode getRespCode() {
        return respCode;
    }
}
