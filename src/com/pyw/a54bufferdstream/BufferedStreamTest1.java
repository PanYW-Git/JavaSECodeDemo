package com.pyw.a54bufferdstream;

import java.io.*;

public class BufferedStreamTest1 {
    public static void main(String[] args) {
        /*
            四种方式拷贝文件，并统计用时
            字节基本
         */
        long start = System.currentTimeMillis();
        //method1();          //最慢，不测试了 字节流的基本流：一次读写一个字节
        //method2();          //16.253秒     字节流的基本流：一次读写一个字节数组
        //method3();          //95.466秒     字节流的增强流：一次读写一个字节
        //method4();            //17.686秒   字节流的增强流：一次读写一个字节数组
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "秒");
    }


    //字节流的基本流：一次读写一个字节4,588,568,576 字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\aaa\\CentOS-7-x86_64-DVD-1810.iso");
        FileOutputStream fos = new FileOutputStream("myio\\copy.iso");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }

    //字节流的基本流：一次读写一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\aaa\\CentOS-7-x86_64-DVD-1810.iso");
        FileOutputStream fos = new FileOutputStream("myio\\copy.iso");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }

    //字节流的基本流：一次读写一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\aaa\\CentOS-7-x86_64-DVD-1810.iso"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy.iso"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
    }

    //字节流的基本流：一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\aaa\\CentOS-7-x86_64-DVD-1810.iso"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy.iso"));
        byte[] bytes = new byte[8192];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
