package com.pyw.a20integer;

public class A02_IntegerDemo2 {
    public static void main(String[] args) {
        //在以前包装类如何进行计算
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);

        //需求:要把两个数据进行相加得到结果3
        //对象之间是不能直接进行计算的。
        //步骤:
        //1.把对象进行拆箱，变成基本数据类型
        //2.相加
        //3.把得到的结果再次进行装箱(再变回包装类)

        int result = i1.intValue() + i2.intValue();
        Integer i3 = new Integer(result);
        System.out.println(i3);
    }
}
