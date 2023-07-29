package com.pyw.a82annotation.annotationdemo1;

/*
    如果注解中只有一个属性value() 特殊属性，value可以省略不写
 */
public @interface AnnotationDemo2 {
    String value();

    int age() default 23;
}
