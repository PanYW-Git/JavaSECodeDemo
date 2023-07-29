package com.pyw.a05for_while_dowhile;

import java.util.Scanner;

public class ForTest7 {
    public static void main(String[] args) {
        //TODO 需求 用户输入一个正整数，判断这个数是否是质数
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        boolean flag = false;
//        for (int i = 2; i <= num - 1; i++) {
//            if (num % i == 0) {
//                flag = true;
//                break;
//            }
//        }
//
//        if(flag){
//            System.out.println(num+"为偶数");
//        }else{
//            System.out.println(num+"为质数");
//        }

        //TODO 方法二：例81 可分为 1*81 3*27 9*9 输入数据的平方根是左右两边的最大值，所以用平方根做就可以了
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println(num+"为偶数");
        }else{
            System.out.println(num+"为质数");
        }
    }
}
