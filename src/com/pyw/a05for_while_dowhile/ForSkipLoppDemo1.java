package com.pyw.a05for_while_dowhile;

public class ForSkipLoppDemo1 {
    public static void main(String[] args) {
        //需求 跳过3 循环五次
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            if(i ==3){
                //结束本次循环，继续下次循环
                count++;
                continue;
            }
            System.out.println("本次："+ ++count);
        }
    }
}
