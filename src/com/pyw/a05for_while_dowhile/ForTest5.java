package com.pyw.a05for_while_dowhile;

public class ForTest5 {
    public static void main(String[] args) {
        //TODO 逢7过 1~100的数字如果包含7或者7的倍数都说过，其他说数字
        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0 || i /10 % 10 == 7 || i % 10 == 7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
