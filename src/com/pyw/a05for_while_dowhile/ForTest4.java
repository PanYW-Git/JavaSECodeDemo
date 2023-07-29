package com.pyw.a05for_while_dowhile;

import java.util.Scanner;

public class ForTest4 {
    public static void main(String[] args) {
        //TODO 需求 录入两个数字 在这两个范围中能被3和5整除的有多少个
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if(i%3 ==0 &&i%5==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
