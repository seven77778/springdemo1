package com.uaf;

import java.lang.annotation.*;


/**
 * ��־���ⲿ�ӿ�
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Inherited
public @interface OutterInface {

    String name() default "";
}
