package com.pyw.a21test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) throws ParseException {
        //TODO 判断一个年份是闰年还是平年
                /*
            判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:
            二月有29天是闰年一年有366天是闰年
        */
        //思路一：设置日期为3月1号把日期向前减一天看是不是29号，如果是29号则是闰年
        //jdk7
        //我们可以把时间设置为2000年3月1日
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);
        //月份的范围:0~11
        //再把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH, -1);
        //看当前的时间是28号还是29号?
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);


        //jdk8
        //月份的范围:1~12
        //设定时间为2000年的3月1日
        LocalDate ld = LocalDate.of(2000, 3, 1);
        //把时间往前减一天
        LocalDate ld2 = ld.minusDays(1);
        //获取这一天是一个月中的几号
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        //TODO isLeapYear方法 判断当前年度是不是平润年
        //true:闰年
        //false:平年
        System.out.println(ld.isLeapYear());


        //思路二：
        // 算1月1号到第二年1月1号有多少天？
        // 算2月1号到3月1号有多少天
        int year = 2024;

        //jdk8
        //方式一 jdk8一年有366天的是闰年
        LocalDateTime ldtStart1 = LocalDateTime.of(year, 1, 1, 0, 0, 0);
        LocalDateTime ldtEnd1 = LocalDateTime.of(year, 12, 31, 0, 0, 0);
        long between = ChronoUnit.DAYS.between(ldtStart1, ldtEnd1) + 1;//需要加一，因为between是之间会少一位数
        System.out.println(between);
        if (between == 366) {
            System.out.println("是闰年");
        } else {
            System.out.println("是平年");
        }
        //方式二 jdk8二月有29天的是闰年
        LocalDateTime ldtStart2 = LocalDateTime.of(year, 2, 1, 0, 0, 0);
        LocalDateTime ldtEnd2 = LocalDateTime.of(year, 3, 1, 0, 0, 0);
        long betweenMonth = ChronoUnit.DAYS.between(ldtStart2, ldtEnd2);
        System.out.println(betweenMonth);
        if (betweenMonth == 29) {
            System.out.println("是闰年");
        } else {
            System.out.println("是平年");
        }

        //jdk7
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //方式一 jdk7一年有366天的是闰年
        String yearStartStr = year + "-01-01 00:00:00";
        String yearEndStr = (year+1) + "-01-01 00:00:00";
        Date dateStart = sdf1.parse(yearStartStr);
        Date dateEnd = sdf1.parse(yearEndStr);
        long dateStartTime = dateStart.getTime();
        long dateEndTime = dateEnd.getTime();
        long day1 = (dateEndTime - dateStartTime) / 1000 / 60 / 60 / 24;
        System.out.println(day1);
        if (between == 366) {
            System.out.println("是闰年");
        } else {
            System.out.println("是平年");
        }
        //方式二 jdk7一年有366天的是闰年
        String yearStartStr2 = year + "-02-01 00:00:00";
        String yearEndStr2 = year + "-03-01 00:00:00";
        Date dateStart2 = sdf1.parse(yearStartStr2);
        Date dateEnd2 = sdf1.parse(yearEndStr2);
        long dateStartTime2 = dateStart2.getTime();
        long dateEndTime2 = dateEnd2.getTime();
        long day3 = (dateEndTime2 - dateStartTime2) / 1000 / 60 / 60 / 24;
        System.out.println(day3);
        if (day3 == 29) {
            System.out.println("是闰年");
        } else {
            System.out.println("是平年");
        }
    }
}
