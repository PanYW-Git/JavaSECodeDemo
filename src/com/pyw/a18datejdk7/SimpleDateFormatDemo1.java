package com.pyw.a18datejdk7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //TODO SimpleDateFormat类
        //格式化：把时间变为我们喜欢的格式
        //解析：把字符串表示的时间转换为Date
        String str = "1998-05-10 09:30:00";


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        String format = sdf.format(date);
        System.out.println(format);

        //练习
        String str1 = "1998-05-10 09:30:00 星期三";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EE");
        Date date1 = sdf1.parse(str1);
        String format1 = sdf.format(date1);
        System.out.println(format1);
    }
}
