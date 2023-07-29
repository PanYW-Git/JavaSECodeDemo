package com.pyw.a05for_while_dowhile;

import java.util.Random;
import java.util.Scanner;

public class ForTest8 {
    public static void main(String[] args) {
        //TODO 需求 随机生成0~10个数，用户输入一个数据判断两个是否相等
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Random r = new Random();
        int rNum = r.nextInt(11);
        if(num == rNum){
            System.out.println("匹配！用户输入："+num+" 随机生成:"+rNum);
        }else{
            System.out.println("不匹配！用户输入："+num+" 随机生成:"+rNum);

        }
        System.out.println();
    }
}
