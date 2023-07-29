package com.pyw.a05for_while_dowhile;

public class ForSkipLoppDemo2 {
    public static void main(String[] args) {
        //循环到3跳过当前循环
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("本次："+i);
            if(i==3){
                break;
            }
        }
    }
}
