package com.pyw.a49file;

import java.io.File;

public class FileTest5 {
    public static void main(String[] args) {
        /*
            统计文件夹大小
         */
        System.out.println("大小总计：" + fileSize(new File("D:\\")));
    }

    public static long fileSize(File file) {
        File[] listFiles = file.listFiles();
        long fileSum = 0;
        if (listFiles == null){
            System.out.println(file);
            return 0;
        }
        for (File listFile : listFiles) {
//            System.out.println(listFile);
            if (listFile.isFile()) {
                fileSum = fileSum + listFile.length();
            } else {
                fileSum = fileSum + fileSize(listFile);
            }
        }
        return fileSum;
    }
}
