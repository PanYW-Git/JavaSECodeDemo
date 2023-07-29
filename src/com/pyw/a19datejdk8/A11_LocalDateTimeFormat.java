package com.pyw.a19datejdk8;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class A11_LocalDateTimeFormat {
    public static void main(String[] args) {
        //yyyy年MM月dd日 HH：mm：ss
        LocalDateTime dlt = LocalDateTime.ofInstant(Instant.ofEpochMilli(1689239703), ZoneId.systemDefault());
        //转换的格式
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //转换为指定格式
        String format = dlt.format(dtf);
        //输出字符串
        System.out.println(format);
    }
}
