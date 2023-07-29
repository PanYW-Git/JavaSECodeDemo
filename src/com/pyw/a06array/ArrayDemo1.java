package com.pyw.a06array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //TODO 数组定义格式 类型[] 数组名称 = new 类型[]{元素1,元素2,预算3....}
        //TODO 数组定义简化格式 类型[] 数组名称 = {元素1,元素2,预算3....}
        //TODO 数组一旦定义长度就是固定的了
        //需求 学生的年龄
        int[] ages = {15,18,17};
        int[] ages2 = new int[]{15,18,17};

        //学生的名字
        String[] names = {"张三","李四","王五"};
        String[] names2 = new String[]{"张三","李四","王五"};

        //学生的身高
        double[] height = {181.1,175.0,168.1};
        double[] height2 = new double[]{181.1,175.0,168.1};


        //TODO 扩展 直接输出数组，输出的是数组的地址值
        System.out.println(height2);
        /**输出结果为[D@4eec7777
         *  [表示是一个数组
         *  D表示是一个double类型的数据
         *  \@表示一个间隔符号，（固定格式没有含义）
         *  4eec7777 数组真正的地址值，十六进制
         *  平时习惯把这个整体叫做数组的地址值
         */


    }
}
