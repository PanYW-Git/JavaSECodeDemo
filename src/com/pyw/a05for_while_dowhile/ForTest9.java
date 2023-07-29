package com.pyw.a05for_while_dowhile;

import java.util.Random;
import java.util.Scanner;

public class ForTest9 {
    public static void main(String[] args) {
        //TODO 需求 随机生成7~15，用户输入一个数据判断两个是否相等
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Random r = new Random();
        //随机数生成 r.nextInt()生成范围为 0~输入的参数.
        // 1、范围头尾都减去一个值，让这个范围从0开始 -7 0~8
        // 2、尾补+1  0~8获取 参数填入9
        int rNum = r.nextInt(9) + 7;
        if (num == rNum) {
            System.out.println("匹配！用户输入：" + num + " 随机生成:" + rNum);
        } else {
            System.out.println("不匹配！用户输入：" + num + " 随机生成:" + rNum);

        }
        System.out.println();

    }
}
