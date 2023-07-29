package com.pyw.a10list;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        //TODO 打印整数
        // char ----> Character 封装类
        // int  ----> Intger 封装类
        // 其他封装类都是首字母大写
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

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
    }
}
