package com.pyw.a58zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            压缩流
                需求：
                把一个txt文件压缩为压缩包
         */
        //1.创建File对象表示要压缩的文件
        File src = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a58zipstream\\temp\\temp\\a.txt");

        //2.创建File对象表示压缩包的位置
        File dest = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a58zipstream\\temp\\temp");

        //压缩方法
        toZip(src, dest);
    }

    /**
     * 压缩
     *
     * @param src  要压缩的文件
     * @param dest 要压缩包的位置
     */
    public static void toZip(File src, File dest) throws IOException {
        //1.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        //2.创建ZipEntry对象，表示压缩包里面的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("a.txt");
        //3.把ZipEntry对象放到压缩包当中
        zos.putNextEntry(entry);
        //4.把src文件中的数据写道压缩包中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
