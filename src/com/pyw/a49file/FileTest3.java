package com.pyw.a49file;

import java.io.File;
import java.util.Arrays;

public class FileTest3 {
    public static void main(String[] args) {
        /*
            找到电脑中所有以avi结尾的电影
         */
        checkMovie();
    }

    public static void checkMovie(){
        File[] files = File.listRoots();
        for (File file : files) {
            checkMovie(file);
        }
    }

    public static void checkMovie(File file){
        if(file.listFiles() ==null){
            return;
        }
        //判断当前路径下是否有.avi文件
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()){
                if(f.getName().endsWith(".avi")&&f.isFile()){
                    System.out.println(f);
                }
            }else {
                checkMovie(f);
            }
        }

    }
}
