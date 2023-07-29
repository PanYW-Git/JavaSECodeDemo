package com.pyw.a48exceptionDemo;

import java.text.ParseException;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        //编译时异常(在编译阶段，必须要手动处理，否则代码报错)
        /*String time = "2030年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);*/



        //运行时异常（在编译阶段是不需要处理的，是代码运行时出现的异常）
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[10]);//ArrayIndexOutOfBoundsException


    }
}
