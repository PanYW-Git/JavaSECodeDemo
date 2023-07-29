package com.pyw.a05for_while_dowhile;

public class WhileTest {
    public static void main(String[] args) {
        //TODO 珠穆朗玛峰的高度是 844430毫米，一张纸的厚度是0.1毫米折叠多少次可以折叠成珠穆朗玛峰的高度
        double paper = 0.1;
        int count = 0;
        while (paper <= 8844430){
            paper = paper * 2;
            count++;
            System.out.println("当前次数："+count+" paper:"+paper);
        }
        System.out.println("折叠"+count+"次");
    }
}
