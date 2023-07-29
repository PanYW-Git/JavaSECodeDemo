package com.pyw.a10list.ArrayListTest3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {
    public static void main(String[] args) {
        //TODO 定义一个集合，添加学生对象，并且遍历 ，通过键盘录入的方式
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userArrayList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("请输入名称");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();

            User user = new User(name,age);
            userArrayList.add(user);
        }

        for (int i = 0; i < userArrayList.size(); i++) {
            String s = "";
            if(i == 0){
                s = "[" + userArrayList.get(i) + ", ";
            } else if(i == userArrayList.size() - 1){
                s = userArrayList.get(i) + "]";
            } else {
                s = userArrayList.get(i) + ", ";
            }
            System.out.print(s);
        }
    }
}
