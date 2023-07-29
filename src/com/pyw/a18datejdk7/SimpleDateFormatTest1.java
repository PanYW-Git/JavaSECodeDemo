package com.pyw.a18datejdk7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {
    public static void main(String[] args) throws ParseException {
        //TODO 练习:一个人出生的年月日为1998-6-26
        //用这个字符串表示这个数据，转捍卫1998年6月26日
        String str = "1998-6-26";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String s = sdf1.format(date);
        System.out.println(s);
    }
}
