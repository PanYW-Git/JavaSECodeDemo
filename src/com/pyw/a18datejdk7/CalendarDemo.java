package com.pyw.a18datejdk7;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        //TODO Calendar类
        /*
            public static Calendar lgetInstance()               获取当前时间的日历对象
            public final Date getTime()                         获取日期对象
            public final setTime(Date date)                     给日历设置日期对象
            public long getTimeInMillis()                       拿到时间毫秒值
            public void setTimeInMillis(long millis)            给日历设置时间毫秒值
            public int get(int field)                           获取日期中的某个字段信息
            public void set(int field,int value)                修改日历的某个字段信息
            public void add(int field,int amount)               为某个字段增加/减少指定的值
        */

        //1.获取日历对象
        //细节1:Calendar是一个抽象类,不能直接new,而是通过一个静态方法获取到子类对象
        //底层原理:
        //会根据系统的不同时区来获取不同的日历对象,默认表示当前时间。
        //把会把时间中的纪元,年,月,日,时,分,秒,星期,等等的都放到一个数组当中
        //日 :纪元
        // 1 :年
        // 2 :月
        // 3 : 一年中的第几周
        // 4:一个月中的第几周
        // 5: 一个月中的第几天(日期)
        // ....

        //细节2:
        //月份:范围0~11 如果获取出来的是.那么实际上是1月。
        //星期:在老外的眼里,星期日是一周中的第一天
        //1(星期日) 2(星期一) 3(星期二) 4(星期三) 5(星期四) 6(星期五) 7(星期六)
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //2.修改一下日历代表的时间
        Date d = new Date();
        c.set(Calendar.YEAR, 2023);
        c.set(Calendar.MONTH,8);//月份是0~11
        c.set(Calendar.DAY_OF_MONTH,10);
        System.out.println(c);


        //调用方法在这个基础上增加一个月
        c.add(Calendar.MONTH,1);

        //java在Calendar类中,把索引对应的数字都定义成常量
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1; //范围是0~11 所以获取需要+1
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "-" + month + "-" + date + " " + getWeek(week));
    }

    //查表法：
    //表：容器
    //让数据根索引产生关系
    public static String getWeek(int index) {
        //定义一个数组,让汉字星期几 跟1~7产生对应关系
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        //根据索引返回对应的星期
        return arr[index];

    }
}
