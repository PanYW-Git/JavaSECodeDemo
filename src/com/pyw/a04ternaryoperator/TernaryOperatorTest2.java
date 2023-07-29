package com.pyw.a04ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorTest2 {
    public static void main(String[] args) {
        //需求 有三个和尚身高通过键盘录入，判断谁的身高最高
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a > b ? a > c ? a : c : b > c ? b : c);


    }
}
