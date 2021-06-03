package com.unicom.common.util;

/**
 * @author haojintao
 * @since 2021-5-27
 * 统一响应封装
 */
public class BaseResponse<T> {

    private static final String SUCCESS = "200";

    private static final String ERROR = "500";

    private static final String CODE_NO_LOGIN = "300";

    private String code;

    private String msg;

    private T data;

    public BaseResponse(String code, String msg, T data) {
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
    }

    public BaseResponse(ResponseEnum responseEnum, T data) {
        this.setCode(responseEnum.getCode());
        this.setMsg(responseEnum.getMessage());
        this.setData(data);
    }

    public static <T> BaseResponse<T> success() {
        return new BaseResponse<T>(ResponseEnum.SUCCESS, null);
    }

    public static <T> BaseResponse<T> success(String message) {
        return new BaseResponse<T>(SUCCESS, message, null);
    }

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<T>(ResponseEnum.SUCCESS, data);
    }

    public static <T> BaseResponse<T> error() {
        return new BaseResponse<T>(ResponseEnum.EXCEPTION, null);
    }

    public static <T> BaseResponse<T> error(String message) {
        return new BaseResponse<T>(ERROR, message, null);
    }

    public static <T> BaseResponse<T> error(T data) {
        return new BaseResponse<T>(ResponseEnum.EXCEPTION, data);
    }

    public static <T> BaseResponse<T> error(String code, String message) {
        return new BaseResponse<T>(code, message, null);
    }

    public static <T> BaseResponse<T> error(IResponseEnum responseEnum) {
        return new BaseResponse<T>(responseEnum.getCode(), responseEnum.getMessage(), null);
    }

    public static <T> BaseResponse<T> error(IResponseEnum responseEnum, String message) {
        return new BaseResponse<T>(responseEnum.getCode(), message, null);
    }

    public static <T> BaseResponse<T> noLogin(String message) {
        return new BaseResponse<T>(CODE_NO_LOGIN, message, null);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
