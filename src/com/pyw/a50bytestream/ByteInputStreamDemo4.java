package com.pyw.a50bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class ByteInputStreamDemo4 {
    /*
        //TODO 拷贝文件

        注：这个只能拷贝比较小的文件，大文件看后续文件夹

        //练习，统计一下拷贝时间，单位毫秒
     */


    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\PYW\\Desktop\\day28-IO（字节流&字符流）\\笔记\\IO流（字节流&字符流）.md");
        FileOutputStream fos = new FileOutputStream("src\\com\\pyw\\a50bytestream\\temp\\copy.md");
        //2.拷贝
        //核心思想，边读边写
        Long start = Instant.now().toEpochMilli();
        int input;
        while ((input = fis.read()) != -1){
            fos.write(input);
        }
        Long end = Instant.now().toEpochMilli();
        System.out.println(end - start + " ms");

        //规则：先开的最后再关闭
        fos.close();
        fis.close();
    }
}
