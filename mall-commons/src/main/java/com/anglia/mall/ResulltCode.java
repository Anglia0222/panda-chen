package com.anglia.mall;

public enum ResulltCode implements ErrorCode{
    SUCCESS(200,"操作成功"),
    FAILED(400,"操作失败");

    private long code;

    private String message;

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private ResulltCode(long code, String message) {
        this.code = code;
        this.message = message;
    }
}
