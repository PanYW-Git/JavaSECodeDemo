package com.pyw.a57printstream;

import java.io.PrintStream;

public class PrintStreamDemo4 {
    public static void main(String[] args) {
        /*
        *       打印流的应用场景
        * */

        //获取打印流的对象，此打印流在虚拟机启动的时候，由虚拟机创建，默认指向控制台
        //特殊的打印流，系统中的标准输出流,是不能关闭，在系统中是唯一的。
        PrintStream ps = System.out;

        //调用打印流中的方法println
        //写出数据，自动换行，自动刷新
        ps.println("123");


        //不能关闭！！！除非重启虚拟机
        //ps.close();


        ps.println("你好你好");


        System.out.println("456");




    }
}
