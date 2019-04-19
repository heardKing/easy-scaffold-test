package com.cuixx.es.common.repository.support.annotation;

import java.lang.annotation.*;

/**
 * 开启查询缓存
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableQueryCache {

    boolean value() default true;

}
