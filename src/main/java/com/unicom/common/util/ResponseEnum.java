package com.unicom.common.util;

/**
 * @author haojintao
 * @since 2021-5-27
 * 响应枚举类
 * 如果需要增加其他响应，可直接修改此类或集成此类
 */
public enum ResponseEnum implements BusinessExceptionAssert, IResponseEnum {
    /**
     * 成功
     */
    SUCCESS("200", "成功"),
    /**
     * 自定义系统异常
     */
    EXCEPTION("5000", "系统异常"),
    /**
     * 空指针异常
     */
    NULL_EXCEPTION("5001", "空指针异常"),
    /**
     * 数据不存在异常
     */
    DATA_NOT_FOUND_EXCEPTION("5002", "数据不存在异常");

    /**
     * 返回码
     */
    private String code;
    /**
     * 返回消息
     */
    private String message;

    ResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResponseEnum[" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ']';
    }
}
