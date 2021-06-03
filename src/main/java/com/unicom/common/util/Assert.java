package com.unicom.common.util;

import com.unicom.common.exception.BaseException;
import org.springframework.lang.Nullable;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.Collection;

/**
 * @author haojintao
 * @since 2021-5-27
 */
public interface Assert {

    /**
     * 创建异常
     *
     * @param args
     * @return BaseException
     */
    BaseException exception(Object... args);

    /**
     * 创建异常
     *
     * @param t
     * @param args
     * @return BaseException
     */
    BaseException exception(Throwable t, Object... args);

    /**
     * <p>断言对象<code>obj</code>非空。如果对象<code>obj</code>为空，则抛出异常
     *
     * @param obj 待判断对象
     */
    default void assertNotNull(@Nullable Object obj) {
        if (obj == null) {
            throw exception(obj);
        }
    }

    /**
     * <p>断言对象<code>obj</code>非空。如果对象<code>obj</code>为空，则抛出异常
     * <p>异常信息<code>message</code>支持传递参数方式，避免在判断之前进行字符串拼接操作
     *
     * @param obj  待判断对象
     * @param args message占位符对应的参数列表
     */
    default void assertNotNull(@Nullable Object obj, Object... args) {
        if (obj == null) {
            throw exception(args);
        }
    }

    /**
     * <p>断言对象<code>obj</code>非空。如果对象<code>obj</code>为空，则抛出异常
     *
     * @param array 待判断对象
     */
    default void assertNotEmpty(@Nullable Object[] array) {
        if (ObjectUtils.isEmpty(array)) {
            throw exception(array);
        }
    }

    /**
     * <p>断言对象<code>obj</code>非空。如果对象<code>obj</code>为空，则抛出异常
     * <p>异常信息<code>message</code>支持传递参数方式，避免在判断之前进行字符串拼接操作
     *
     * @param array 待判断对象
     * @param args  message占位符对应的参数列表
     */
    default void assertNotEmpty(@Nullable Object array, Object... args) {
        if (ObjectUtils.isEmpty(array)) {
            throw exception(args);
        }
    }

    /**
     * <p>断言对象<code>obj</code>非空。如果对象<code>obj</code>为空，则抛出异常
     *
     * @param collection 待判断对象
     */
    default void assertNotEmpty(@Nullable Collection<?> collection) {
        if (CollectionUtils.isEmpty(collection)) {
            throw exception(collection);
        }
    }

    /**
     * <p>断言对象<code>obj</code>非空。如果对象<code>obj</code>为空，则抛出异常
     * <p>异常信息<code>message</code>支持传递参数方式，避免在判断之前进行字符串拼接操作
     *
     * @param collection 待判断对象
     * @param args       message占位符对应的参数列表
     */
    default void assertNotEmpty(@Nullable Collection<?> collection, Object... args) {
        if (CollectionUtils.isEmpty(collection)) {
            throw exception(args);
        }
    }
}
