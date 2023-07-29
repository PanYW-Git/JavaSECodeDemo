package com.pyw.a03switchcase;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        //录入星期数，返回这天是工作日还是休息日
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这一天");
        }
    }
}
