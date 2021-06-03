package com.unicom.common.exception;

import com.unicom.common.util.IResponseEnum;

/**
 * @author haojintao
 * @since 2021-5-27
 * 业务异常类，如用户不存在、记录不存在
 */
public class BusinessException extends BaseException {
    private static final long serialVersionUID = 1L;

    public BusinessException(IResponseEnum responseEnum, String message) {
        super(responseEnum, message);
    }

    public BusinessException(IResponseEnum responseEnum, String message, Throwable cause) {
        super(responseEnum, message, cause);
    }

}
