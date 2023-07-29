package com.pyw.a10list;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        //TODO 定义一个集合，添加字符串，并进行遍历 遍历格式为 [元素1，元素2，元素3]

        ArrayList<String> list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for (int i = 0; i < list.size(); i++) {
            String s = "";
            if(i == 0){
                s = "[" + list.get(i) + ", ";
            } else if(i == list.size() - 1){
                s = list.get(i) + "]";
            } else {
                s = list.get(i) + ", ";
            }
            System.out.print(s);
        }

        System.out.println(list);
    }
}
