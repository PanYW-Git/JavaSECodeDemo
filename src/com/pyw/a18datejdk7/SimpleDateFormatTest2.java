package com.pyw.a18datejdk7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest2 {
    public static void main(String[] args) throws ParseException {
        /* 需求:
            秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
            秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)

            小贾下单并付款的时间为:2023年11月11日 0:01:0
            小皮下单并付款的时间为:2023年11月11日 0:11:0
            用代码说明这两位同学有没有参加上秒杀活动?
         */
        //小贾下单并付款的时间为:2023年11月11日 0:01:0
        String strDate = "2023年11月11日 0:01:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(strDate);

        Long dateTime = date.getTime();
        checkOut(dateTime);

        //小皮下单并付款的时间为:2023年11月11日 0:11:0
        String strDate2 = "2023年11月11日 0:11:0";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date1 = sdf1.parse(strDate2);


        Long dateTime1 = date1.getTime();
        checkOut(dateTime1);
    }

    private static boolean checkOut(Long dateTime) throws ParseException {
        String startTime = "2023年11月11日 0:0:0";
        String endTime = "2023年11月11日 0:10:0";
        //1.转为时间戳形式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startTime);
        Date endDate = sdf.parse(endTime);
        if(dateTime<startDate.getTime()){
            System.out.println("超出时间");
            return true;
        }else if(dateTime>endDate.getTime()){
            System.out.println("超出时间");
            return true;
        }
        System.out.println("未超出时间");
        return false;
    }
}
