package com.pyw.a19datejdk8;

import java.time.LocalTime;

public class A06_LocalTimeDemo {
    public static void main(String[] args) {
        // TODO 获取本地时间的日历对象。(包含 时分秒)
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间:" + nowTime);

        int hour = nowTime.getHour();//时
        System.out.println("hour: " + hour);

        int minute = nowTime.getMinute();//分
        System.out.println("minute: " + minute);

        int second = nowTime.getSecond();//秒
        System.out.println("second:" + second);

        int nano = nowTime.getNano();//纳秒
        System.out.println("nano:" + nano);
        System.out.println("------------------------------------");
        System.out.println(LocalTime.of(8, 20));//时分
        System.out.println(LocalTime.of(8, 20, 30));//时分秒
        System.out.println(LocalTime.of(8, 20, 30, 150));//时分秒纳秒
        LocalTime mTime = LocalTime.of(8, 20, 30, 150);

        //is系列的方法
        System.out.println(nowTime.isBefore(mTime));
        System.out.println(nowTime.isAfter(mTime));

        //with系列的方法，只能修改时、分、秒
        System.out.println(nowTime.withHour(10));

        //plus系列的方法，只能增加时、分、秒
        System.out.println(nowTime.plusHours(10));

        //计算时间比较精确
        //比如秒杀等场景


    }
}
