package com.pyw.a50bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;

public class ByteInputStreamDemo6 {
    public static void main(String[] args) throws IOException {
        /*
          public int read(byte[] buffer)      一次读一个字节数组数据
      */

        //创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\PYW\\Desktop\\day28-IO（字节流&字符流）\\笔记\\IO流（字节流&字符流）.md");
        FileOutputStream fos = new FileOutputStream("src\\com\\pyw\\a50bytestream\\temp\\copy.md");

        //2.读取数据
        byte[] tempArr = new byte[1024*1024*5];//一次读取5兆的数据
        //一次读取多个字节数据，具体读多少时跟数组长度有关的
        //返回值：本次读取到了多少个字节数据
        //并且会把本次读取的数据放到数组当中
        int readByArrLen;
        long start = Instant.now().toEpochMilli();
        while((readByArrLen = fis.read(tempArr)) != -1){
            fos.write(tempArr,0,readByArrLen);
        }
        long end = Instant.now().toEpochMilli();
        System.out.println(end - start + " ms");
        //关闭流
        fos.close();
        fis.close();
    }
}
