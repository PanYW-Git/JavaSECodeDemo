package com.pyw.a18datejdk7;

import java.util.Date;
import java.util.Random;

public class DateTest1 {
    public static void main(String[] args) {
        /*
         * 需求1：打印时间原点开始一年之后的时间
         * 需求2：定义任意两个Date对象，比较哪些时间在前，哪个在后
         * */
        //需求1：打印时间远点开始一年之后的时间
        Date d1 = new Date(0);
        long time = d1.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        d1.setTime(time);
        System.out.println(d1);

        //需求2：定义任意两个Date对象，比较哪些时间在前，哪个在后
        Random r = new Random();
        //创建两个时间对象
        Date d2 = new Date(Math.abs(r.nextInt()));
        Date d3 = new Date(Math.abs(r.nextInt()));
        long time2 = d2.getTime();
        long time3 = d3.getTime();
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time2 > time3 ? d2 : d3);
    }
}
