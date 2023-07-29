package com.pyw.a46StreamDemo1;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        /*
            创建集合添加元素，完成以下需求：
            1.把所有以“张”开头的元素存储到新集合中
            2.把“张”开头的，长度为3的元素再存储到新集合中
            3.遍历打印最终结果
        */
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

        //stream流
        list1.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));


        //1.把所有以“张”开头的元素存储到新集合中
        ArrayList<String> list2 = new ArrayList<>();

        for (String s : list1) {
            if (s.startsWith("张")) {
                list2.add(s);
            }
        }

        //2.把“张”开头的，长度为3的元素再存储到新集合中
        ArrayList<String> list3 = new ArrayList<>();

        for (String s : list2) {
            if (s.length() == 3) {
                list3.add(s);
            }
        }

        //3.遍历打印最终结果
        System.out.println(list2);
        System.out.println(list3);

    }
}
