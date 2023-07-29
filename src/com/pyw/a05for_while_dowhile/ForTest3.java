package com.pyw.a05for_while_dowhile;

public class ForTest3 {
    public static void main(String[] args) {
        //TODO 需求 求1~100偶数和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
