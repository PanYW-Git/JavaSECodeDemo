package com.pyw.project.stutest;

import java.util.Random;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] createArr = createNum();
        System.out.print("中奖号码");
        for (int i = 0; i < createArr.length; i++) {
            System.out.print(createArr[i] + " ");
        }
        System.out.println();
        //2.用户输入彩票号码（红球+篮球）
        int[] userArr = userNum();
        //3.校验中奖
        //红球篮球中奖情况
        int redCount = 0;
        int blueCount = 0;
        //判断红球
        for (int i = 0; i < userArr.length - 1; i++) {
            int redNum = userArr[i];
            for (int j = 0; j < createArr.length - 1; j++) {
                if (createArr[j] == redNum) {
                    redCount++;
                    //找到了跳出循环继续判断下一个
                    break;
                }
            }
        }
        //判断蓝球
        if (createArr[6] == userArr[6]) {
            blueCount++;
        }
        System.out.println("中奖如下------》红球中奖次数：" + redCount + " 篮球中奖次数:" + blueCount);
        //根据红球的个数和篮球的个数判断中奖情况
        if((blueCount == 1 && redCount == 0)|| (blueCount ==1 && redCount ==1) || (blueCount ==1 && redCount ==2)){
            System.out.println("恭喜你！获得六等奖奖金为5元！！！");
        } else if((blueCount ==1 && redCount ==3) || (blueCount == 0 && redCount ==4)){
            System.out.println("恭喜你！获得五等奖奖金为10元！！！");
        } else if((redCount == 4 && blueCount ==1)|| (redCount ==5 && blueCount ==0)){
            System.out.println("恭喜你！获得四等奖奖金为200元！！！");
        } else if((redCount ==5 && blueCount ==1)){
            System.out.println("恭喜你！获得三等奖奖金为3000元！！！");
        } else if((redCount == 6 && blueCount ==0)){
            System.out.println("恭喜你！获得二等奖奖金为500万！！！");
        } else if((redCount == 6 && blueCount ==1)){
            System.out.println("恭喜你！获得一等奖奖金为1000万！！！");
        } else {
            System.out.println("系统出错了！！！！");
        }
    }


    public static int[] userNum() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红色求号码  规则要求红色球不得重复且输入的数字在1~33之间");
            int userNum = sc.nextInt();
            boolean flag = contains(arr, userNum);
            if (!flag && userNum >= 1 && userNum <= 33) {
                arr[i] = userNum;
                i++;
            } else {
                System.out.println("您输入的数字不符合规则，请重新输入");
            }
        }
        while (true) {
            System.out.println("请输入蓝色球号码  规则要求蓝色球的数字在1~16之间");
            int userNum = sc.nextInt();
            if (userNum >= 1 && userNum <= 16) {
                arr[arr.length - 1] = userNum;
                break;
            } else {
                System.out.println("本次没有中奖，谢谢惠顾~");
            }
        }

        return arr;
    }

    public static int[] createNum() {
        //创建数组存储6个红球，1个蓝球
        int[] arr = new int[7];
        //2.随机生成好嘛并添加到数组中
        //红球：不能重复的 123456
        //蓝球 可以根红球好嘛重复的5
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //获取红球号码
            int rNum = r.nextInt(33) + 1;
            boolean flag = contains(arr, rNum);
            if (!flag) {
                //把红球号码给数组
                arr[i] = rNum;
                i++;
            }
        }
        arr[arr.length - 1] = r.nextInt(16) + 1;

        return arr;
    }

    //用于判断数字在数组中是否存在
    public static boolean contains(int[] arr, int price) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == price) {
                return true;
            }
        }
        return false;
    }
}
