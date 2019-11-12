package com.anglia.mall;

public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResulltCode.SUCCESS.getCode(),ResulltCode.SUCCESS.getMessage(),data);
    }

    public static <T> CommonResult<T> success(T data,String message){
        return new CommonResult<T>(ResulltCode.SUCCESS.getCode(),message,data);
    }

    public static <T> CommonResult failed(){
        return failed(ResulltCode.FAILED);
    }

    public static <T> CommonResult<T> failed(String message){
        return new CommonResult<T>(ResulltCode.FAILED.getCode(),message,null);
    }

    public static <T> CommonResult failed(ErrorCode errorCode){
        return new CommonResult<T>(errorCode.getCode(),errorCode.getMessage(),null);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
