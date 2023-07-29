package com.pyw.a05for_while_dowhile;

import java.util.Scanner;

public class ForTest6 {
    public static void main(String[] args) {
        //TODO 键盘输入一个大于等于2的整数求平方根，结果只保留整数
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int x = 1;
        for (int i = 1; i < num; i++) {
            if(i*i == num){
                System.out.println(num+"平方根整数部分"+i);
                //找到了就可以不执行循环后面部分了，节省效率
                break;
            }else if(i*i > num){
                System.out.println(num+"平方根整数部分"+(i-1));
                break;
            }
        }

    }
}
