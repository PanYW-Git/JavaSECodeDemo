package com.pyw.a34genericity;

public class GenericsDemo4 {
    public static void main(String[] args) {
        /*
            泛型接口的两种使用方式：
                1.实现类给出具体的类型
                2.实现类延续泛型，创建实现类对象时再确定类型
        */

        //已指定泛型了，MyArrayList3实现时没有泛型，不需尖括号<String>再指定了
        MyArrayList3 list = new MyArrayList3();
        list.add("123");
        System.out.println(list);

        //未指定泛型了，MyArrayList3实现时没有指定泛型，需尖括号<>指定类型
        MyArrayList31<String> listString = new MyArrayList31();
        listString.add("456");
        System.out.println(listString);


    }
}
