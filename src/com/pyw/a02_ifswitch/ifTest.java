package com.pyw.a02_ifswitch;

import java.util.Scanner;

public class ifTest {
    public static void main(String[] args) {
        //需求 电影院售票100张 1~100，其中奇数表示左边，偶数表示右边，录入一个号数提示坐哪一边
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 0 && a <= 100) {
            if (a % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        }
    }
}
