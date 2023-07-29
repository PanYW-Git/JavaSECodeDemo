package com.pyw.a19datejdk8;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneIDDemo1 {
    public static void main(String[] args) {
        //TODO ZoneID类 时区
        /*
        static Set<string> getAvailableZoneIds() 获取Java中支持的所有时区
        static ZoneId systemDefault() 获取系统默认时区
        static Zoneld of(string zoneld) 获取一个指定时区
        */

        //1.获取所有时区名称
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);//获取所有时区
        System.out.println(availableZoneIds.size());//一共有603个时区

        //2.获取当前默认时区
        ZoneId zoneId = ZoneId.systemDefault();//获取默认时区
        System.out.println(zoneId);

        //3.获取指定时区
        ZoneId zoneId1 = ZoneId.of("America/Cuiaba");
        System.out.println(zoneId1);
    }
}
