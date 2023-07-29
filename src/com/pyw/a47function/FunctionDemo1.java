package com.pyw.a47function;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        //TODO 需求：创建一个数组，进行倒序排列
        Integer[] arr = {3, 5, 4, 1, 6, 2};

        //匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });
        System.out.println(Arrays.toString(arr));

        //Lambda表达式简化格式
        Arrays.sort(arr,(o1,o2) -> o2-o1);
        System.out.println(Arrays.toString(arr));

        //方法引用
        //1、引用除必须是函数式接口
        //2、被引用的方法需要已存在（可以是java写好的，也可以是第三方的工具类）
        //3、被引用的形参和返回值需要跟抽象方法的形参喝返回值保持一致
        //4、被引用的方法的功能需要满足当前的要求

        //表示引用FunctionDemo1类里面的subAbstract方法
        //把这个方法当作抽象方法的方法体
        //：：方法引用符
        Arrays.sort(arr,FunctionDemo1::subAbstract);
        System.out.println(Arrays.toString(arr));

    }

    public static int subAbstract(int num1,int num2){
        return num1 - num2;
    }
}
