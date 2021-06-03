package com.unicom.common.util;

import com.unicom.common.exception.BaseException;
import com.unicom.common.exception.BusinessException;

import java.text.MessageFormat;

/**
 * @author haojintao
 * @since 2021-5-27
 */
public interface BusinessExceptionAssert extends IResponseEnum, Assert {
    @Override
    default BaseException exception(Object... args) {
        return new BusinessException(this, format(args));
    }

    @Override
    default BaseException exception(Throwable t, Object... args) {
        return new BusinessException(this, format(args), t);
    }

    default String format(Object... args){
        String msg = this.toString();
        for (int i = 0; i < args.length; i++) {
            msg += "[{"+i+"}]";
        }
        return MessageFormat.format(msg, args);
    }

}
