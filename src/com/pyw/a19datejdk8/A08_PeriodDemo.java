package com.pyw.a19datejdk8;

import java.time.LocalDate;
import java.time.Period;

public class A08_PeriodDemo {
    public static void main(String[] args) {
        // 当前本地 年月日
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // 生日的 年月日
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        System.out.println(birthDate);

        Period period = Period.between(birthDate, today);//第二个参数减第一个参数

        System.out.println("相差的时间间隔对象:" + period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());//总月份
    }
}
