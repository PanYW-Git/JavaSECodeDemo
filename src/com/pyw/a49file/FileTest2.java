package com.pyw.a49file;

import java.io.File;
import java.util.Arrays;

public class FileTest2 {
    public static void main(String[] args) {
        /*
            定义一个方法找某一个文件夹中，是否有以avi结尾的电影
            （暂时不需要考虑子文件夹）
         */
        File f1 = new File("src/com/pyw/a49file/aaa");
        //
        File[] list = f1.listFiles(file -> file.getName().endsWith(".avi")&&file.isFile());
        System.out.println(Arrays.toString(list));


    }
}
