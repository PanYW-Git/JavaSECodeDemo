package com.pyw.a25lambda;

import com.pyw.a14interfacedemo.Swimming;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //TODO Lambda表达式
        /*
            函数式编程：忽略面向对象的复杂语法，强调做什么，而不是谁去做
            语法：() -> {}
            ():形参
            ->:固定格式
            {}:方法的方法体
            注意点：
                1.Lambda表达式可以用来简化匿名内部类的书写
                2.Lambda表达式只能简化函数式接口的匿名内部类的写法
                    函数式接口：有且只有一个抽象方法的接口叫做函数式接口，接口上方可加@Functioonalinterface
         */
        Integer[] arr3 = {10, 2, 5, 1, 4, 3, 6, 7, 8, 9};
        Arrays.sort(arr3, (Integer o1, Integer o2) ->{
//                return o1 - o2;//升序排序
            return o2 - o1;//降序排序
        });
        System.out.println(Arrays.toString(arr3));

        //以前的调用方式
        //1.利用匿名内部类的形式去调用下面的方法
        //调用一个方法的时候，如果方法的形参是一个接口，那么我们要传递这个接口的实现类对象
        //如果实现类对象只要用到一次，就可以用匿名内部类的形式进行书写
        method(new Swiming() {
            @Override
            public void swim() {
                System.out.println("InnerClass正在游泳...");
            }
        });

        //Lambda表达式完整格式
        method(() ->{
            System.out.println("Lambda正在游泳");
        });

        //Lambda表达式省略写法
        //Lambda表达式方法只有一行，大括号，分号，return可以省略，以上几个需要同时一起省略
        method(() -> System.out.println("Lambda正在游泳"));
        Arrays.sort(arr3, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr3));
    }

    public static void method(Swiming s){
        s.swim();
    }
}

interface Swiming{
    void swim();
}
