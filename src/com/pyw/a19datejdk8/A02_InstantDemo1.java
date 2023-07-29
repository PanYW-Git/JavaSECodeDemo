package com.pyw.a19datejdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo1 {
    public static void main(String[] args) {
        /*
            static Instant now() 获取当前时间的Instant对象(标准时间)
            static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
            ZonedDateTime atZone(ZoneIdzone) 指定时区
            boolean isxxx(Instant otherInstant) 判断系列的方法
            Instant minusXxx(long millisToSubtract) 减少时间系列的方法
            Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        */

        //获取当前世界标准时间（如获取北京时间需要+8小时）
        Instant now = Instant.now();
        System.out.println(now);

        //2.根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L,1000*1000*1000); //1+1000*1000*1000纳秒 也就是2秒
        System.out.println(instant3);

        //3.指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        //4.指定时区
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);
        //5.判断
        // isBefore判断4是否在5之前
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);//true

        //isAfter判断4是否在5之后
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);//false


        //6.减少时间系列的方法
        Instant instant6 = Instant.ofEpochMilli(123456789L);
        System.out.println(instant6);

        //注：这个方法会生成一个新的对象，不会在原有基础上增加
        //减少
        Instant instant7 = instant6.minusSeconds(1L);
        System.out.println(instant7);

        //增加
        Instant instant8 = instant6.plusSeconds(1L);
        System.out.println(instant8);

    }
}
