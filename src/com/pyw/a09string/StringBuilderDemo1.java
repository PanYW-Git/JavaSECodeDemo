package com.pyw.a09string;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //StringBuilder 可以堪称是一个容器，创建之后里面的内容是可以发生变化的
        //StringBuilder 与String的区别：
        //StringBuilder是把元素都存在同一个对象容器中，值可以发生变化
        //String 值是放在串池里面的，值不可以发生变化

        //1.创建对象
        StringBuilder sb = new StringBuilder("123");
        //2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //2.反转
        sb.reverse();

        //3.变为字符串
        String s = sb.toString();
//        System.out.println(s);

        //打印 打印的不是地址值，是内容
        //StringBuilder是java写好的类
        //java在底层做了特殊处理，打印对象不是地址值而是属性值
        System.out.println(sb);

    }
}
