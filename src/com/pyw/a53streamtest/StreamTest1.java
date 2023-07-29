package com.pyw.a53streamtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest1 {

    public static void main(String[] args) throws IOException {
        /*
            拷贝一个文件夹需要考虑子文件夹
         */

        File file = new File("src/com/pyw/a53streamtest/temp1");
        File to = new File("C:\\Users\\PYW\\Desktop\\temp1");
        copyDir(file,to);
    }

    public static void copyDir(File file,File to) throws IOException {
        to.mkdirs();
        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            if(listFile.isFile()){
                //当前是文件
                FileInputStream fis = new FileInputStream(listFile);
                //输出文件到新的位置，需要父文件夹路径+文件名
                FileOutputStream fos = new FileOutputStream(new File(to,listFile.getName()));

                //读取和写入文件
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }

                //关闭流
                fos.close();
                fis.close();
            }else {
                //当前是文件夹
                copyDir(listFile,new File(to,listFile.getName()));
            }
        }
    }
}
