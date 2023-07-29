package com.pyw.project.stutest;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //TODO 买机票 按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱
        //旺季 5~10头等舱9折，经济舱8.5折，淡季（11月到第二年4月）头等舱7折，经济舱6.5折
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入头等舱或经济舱 （1：头等舱 2:经济舱）");
        int level = sc.nextInt();
        System.out.println("打折后的机票价格为：" + planePriceCalc(price, month, level));

    }

    public static double planePriceCalc(double price, int month, int level) {
        double tirct = 0;
        if (month >= 5 && month <= 10) {
            // 使用ctrl+alt+M可以自动生成方法
            // 使用ctrl+p可查看方法中需要的参数
            tirct = extracted(price, level, 9, 8.5);
            return tirct;
        } else if ((month >= 11 && month <= 12) || (month <= 4 && month >=1)) {
            tirct = extracted(price, level, 7, 6.5);
            return tirct;
        }
        System.out.println("输入季节错误");
        return -1.0;
    }

    private static Double extracted(double price, int level, int i, double v) {
        double tirct;
        if (level == 1) {
            tirct = price * i;
            return tirct;
        } else if (level == 2) {
            tirct = price * v;
            return tirct;
        }
        return null;
    }
}
