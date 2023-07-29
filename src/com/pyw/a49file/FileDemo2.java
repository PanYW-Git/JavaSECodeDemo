package com.pyw.a49file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        /*
        public boolean isDirectory()        判断此路径名表示的File是否为文件夹
        public boolean isFile()             判断此路径名表示的File是否为文件
        public boolean exists()             判断此路径名表示的File是否存在
     */
        //1.对一个文件的路径进行判断
        File f1 = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a49file\\aaa\\a.txt");
        //是否是文件夹
        System.out.println(f1.isDirectory());//false
        //是否是文件
        System.out.println(f1.isFile());//true
        //路径是否存在
        System.out.println(f1.exists());//true

        System.out.println("================");
        //2.对一个文件夹的路径进行判断
        File f2 = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a49file\\aaa");
        //是否是文件夹
        System.out.println(f2.isDirectory());//true
        //是否是文件
        System.out.println(f2.isFile());//false
        //路径是否存在
        System.out.println(f2.exists());//true

        System.out.println("================");
        //3.对一个不存在的路径进行判断
        File f3 = new File("D:\\aaa\\c.txt");
        System.out.println(f3.isDirectory());//false
        System.out.println(f3.isFile());//false
        System.out.println(f3.exists());//false
    }
}
