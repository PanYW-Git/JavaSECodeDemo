package com.pyw.a49file;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileDemo3 {
    public static void main(String[] args) {
        /*
        public long length()                返回文件的大小（字节数量）
        public String getAbsolutePath()     返回文件的绝对路径
        public String getPath()             返回定义文件时使用的路径
        public String getName()             返回文件的名称，带后缀
        public long lastModified()          返回文件的最后修改时间（时间毫秒值）
     */
        //1.length  返回文件的大小（字节数量）
        //细节1：这个方法只能获取文件的大小，单位是字节
        //如果单位我们要是M，G，可以不断的除以1024 len/1024 kb len/1024/1024 MB len/1024/1024/1024 GB
        //细节2：这个方法无法获取文件夹的大小
        //如果我们要获取一个文件夹的大小，需要把这个文件夹里面所有的文件大小都累加在一起。
        File f1 = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a49file\\aaa\\a.txt");
        long len = f1.length();
        System.out.println(len);//18

        File f2 = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a49file\\aaa");
        long len2 = f2.length();
        System.out.println(len2);//0

        System.out.println("====================================");

        //2.getAbsolutePath 返回文件的绝对路径
        File f3 = new File("D:\\aaa\\a.txt");
        String path1 = f3.getAbsolutePath();
        System.out.println(path1);

        File f4 = new File("JavaSECodeDemo\\src\\com\\pyw\\a49file\\aaa\\a.txt");
        String path2 = f4.getAbsolutePath();
        System.out.println(path2);

        System.out.println("====================================");

        //3.getPath 返回定义文件时使用的路径
        File f5 = new File("D:\\aaa\\a.txt");
        String path3 = f5.getPath();
        System.out.println(path3);//D:\aaa\a.txt

        //3.getPath 返回定义文件时使用的路径
        File f6 = new File("JavaSECodeDemo\\src\\com\\pyw\\a49file\\aaa\\a.txt");
        String path4 = f6.getPath();
        System.out.println(path4);//JavaSECodeDemo\src\com\pyw\a49file\aaa\a.txt

        System.out.println("====================================");


        //4.getName 获取名字
        //细节1：
        //a.txt:
        //      a 文件名
        //      txt 后缀名、扩展名
        //细节2：
        //文件夹：返回的就是文件夹的名字
        File f7 = new File("D:\\aaa\\a.txt");
        String name1 = f7.getName();
        System.out.println(name1);


        File f8 = new File("D:\\aaa\\bbb");
        String name2 = f8.getName();
        System.out.println(name2);//bbb

        System.out.println("====================================");

        //5.lastModified  返回文件的最后修改时间（时间毫秒值）
        File f9 = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a49file\\aaa\\a.txt");
        long time = f9.lastModified();
        System.out.println(time / 1000);//1667380952425

        //如何把时间的毫秒值变成字符串表示的时间呢？
        //课堂练习：
        //yyyy年MM月dd日 HH：mm：ss
        LocalDateTime dlt = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
        //格式转换
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String format = dlt.format(dtf);

        System.out.println(format);
    }
}
