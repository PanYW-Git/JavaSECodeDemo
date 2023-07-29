package com.pyw.a82annotation.annotationdemo3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    TODO 元注解：修饰注解的注解
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME) //控制下面的注解一直保留到运行时
public @interface AnootationDemo3 {
    String value();
    double aaa() default 100.0;
    String[] bbb();
}
