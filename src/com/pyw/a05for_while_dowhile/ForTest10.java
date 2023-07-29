package com.pyw.a05for_while_dowhile;

import java.util.Random;
import java.util.Scanner;

public class ForTest10 {


    public static void main(String[] args) {
        //TODO 猜数小游戏
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;
        Random r = new Random();
        //随机数生成 r.nextInt()生成范围为 0~输入的参数.
        // 1、范围头尾都减去一个值，让这个范围从0开始 -7 0~8
        // 2、尾补+1  0~8获取 参数填入9
        int rNum = r.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入你要猜的数字");
            num = sc.nextInt();
            count++;
            if(count == 5){
                System.out.println("猜中了");
                break;
            }
            if (num > rNum) {
                System.out.println("大了");
            } else if(num < rNum){
                System.out.println("小了");
            }else {
                System.out.println("恭喜你！答对了！");
                break;
            }
        }
    }

}
