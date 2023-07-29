package com.pyw.a21test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //TODO 计算活了多少天
        //JDK7
        //1.计算出生年月日的毫秒值
        Date date = new Date();
        System.out.println(date);
        String birthdayStr = "2000-09-14 09:30:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date birthdayjdk7 = sdf.parse(birthdayStr);
        long birthdayjdk7Time = birthdayjdk7.getTime();
        //2.计算相差毫秒值
        long time = date.getTime();
        long daysTime = time - birthdayjdk7Time;
        //3.通过毫秒计算间隔多少天
        long day = daysTime / 1000 / 60 / 60 / 24;
        System.out.println(day);


        //JDK8
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2000,9,14,9,30,00);
        long between = ChronoUnit.DAYS.between(birthday, ldt);
        System.out.println(between);
    }
}
