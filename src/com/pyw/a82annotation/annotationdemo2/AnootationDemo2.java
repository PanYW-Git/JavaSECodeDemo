package com.pyw.a82annotation.annotationdemo2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    TODO 元注解：修饰注解的注解
 */
@Target(ElementType.TYPE) //当前被修饰的注解只能用在类上
@Retention(RetentionPolicy.RUNTIME) //控制下面的注解一直保留到运行时
public @interface AnootationDemo2 {
}
