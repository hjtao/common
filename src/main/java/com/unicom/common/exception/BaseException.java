package com.unicom.common.exception;

import com.unicom.common.util.IResponseEnum;

/**
 * @author haojintao
 * @since 2021-5-27
 * 基础异常类，与业务无关的异常
 */
public class BaseException extends RuntimeException {

    private IResponseEnum responseEnum;

    public BaseException(IResponseEnum responseEnum, String message) {
        super(message);
        this.responseEnum = responseEnum;
    }

    public BaseException(IResponseEnum responseEnum, String message, Throwable cause) {
        super(message, cause);
        this.responseEnum = responseEnum;
    }

    public IResponseEnum getResponseEnum() {
        return responseEnum;
    }

    public void setResponseEnum(IResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }

    /**
     * Returns a short description of this throwable.
     * The result is the concatenation of:
     * <ul>
     * <li> the {@linkplain Class#getName() name} of the class of this object
     * <li> ": " (a colon and a space)
     * <li> the result of invoking this object's {@link #getLocalizedMessage}
     *      method
     * </ul>
     * If {@code getLocalizedMessage} returns {@code null}, then just
     * the class name is returned.
     *
     * @return a string representation of this throwable.
     */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(getMessage() + "\n");
        for (StackTraceElement e : getStackTrace()) {
            string.append(e.toString() + "\n");
        }
        return string.toString();
    }
}
