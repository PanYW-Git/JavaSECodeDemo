package com.pyw.a58zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            压缩一个文件夹变为压缩包
         */

        //1.创建File对象表示要压缩的文件夹
        File src = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a58zipstream\\temp\\temp");

        //2.创建File对象表示压缩包放在哪里（压缩包的父路径）
        File destParent = src.getParentFile(); // D:\Software\java\Project\javaSE\JavaSECodeDemo\src\com\pyw\a58zipstream\temp\
        //3.创建File对象表示压缩包的路径
        File dest = new File(destParent,src.getName() + ".zip");        //4.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //5.获取src里面的每一个文件，变成ZipEntry对象，放到压缩包中
        toZip(src, zos, src.getName());
        //6.关闭流
        zos.close();
    }

    /**
     * 获取src里面的每一个文件，变成ZipEntry对象，放到压缩包中
     *
     * @param src  数据源
     * @param zos  压缩流（已关联好了压缩包）
     * @param name 压缩包内部的路径
     */
    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        //1.进入src文件夹
        File[] files = src.listFiles();
        for (File file : files) {
            //file 表示当前src下的每一个文件或文件夹
            if (file.isFile()) {
                //判断=文件，变成ZipEntry对象，放到压缩包中
                //ZipEntry表示压缩包内部的路径，所以不能使用绝对路径，否则会创建D：\\文件
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);
                //读取文件中的数据，写到压缩包
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            } else {
                //判断=文件夹，递归
                toZip(file,zos,name + "\\" + file.getName());
            }
        }
    }


}
