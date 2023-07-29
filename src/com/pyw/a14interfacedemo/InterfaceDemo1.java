package com.pyw.a14interfacedemo;

public interface InterfaceDemo1 {

    //TODO 接口

    //接口方法定义格式：public abstract 返回值类型 方法名(参数列表)
    public abstract void method1();

    //jdk8新增特性，允许在接口中定义默认方法，需要使用关键字default修饰
    //作用：解决接口升级的问题,例：如果新增了一个接口，那么实现他的所有实现类都会报错
    //格式 public default 返回值类型 方法名(参数列表){}

    /*
        注意事项
            默认方法不是抽象方法，所以不强制重写，如果重写不要加defalut关键字
            public可以省略，defalut不能省略
            如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写

     */
    public default void show(){}

    //静态方法
    //需要通过接口名.静态方法名调用
    public static void show1(){}


    //jdk9新特性，可以定义私有的接口
    //非静态私有：private 修饰符 返回值类型 返回值类型 方法名(参数列表)
    //静态私有：private static 返回值类型 返回值类型 方法名(参数列表){}

    //给默认方法defalut去服务的
    private void show3(){

    }

    //给静态默认方法defalut去服务的
    private static void show4(){

    }
}
