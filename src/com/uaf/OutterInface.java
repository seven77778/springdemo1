package com.uaf;

import java.lang.annotation.*;


/**
 * 标志是外部接口
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Inherited
public @interface OutterInface {

    String name() default "";
}
