package com.pyw.a82annotation.annotationdemo1;


//注解中的属性必须全部添加，除非有默认值
@AnnotationDemo1(aaa = "张三", ccc = {"JAVA", "Web"})
public class AnnotationClassDemo {

    @AnnotationDemo1(aaa = "李四", ccc = {"运维", "测试"})
    public void test1() {
    }

    @AnnotationDemo2("王五")
    public void test2() {
    }
}
