package com.pyw.a82annotation.annotationdemo1;

/**
 * TODO 自定义注解
 *
 * 注解本质是一个接口继承了Annotation接口，调用注解类实际上就是创建了Annotation接口的实现类
 * 注解中的属性都是抽象方法
 */
public @interface AnnotationDemo1 {
    String aaa();

    //提供默认值 default
    boolean flag() default true;

    String[] ccc();
}
