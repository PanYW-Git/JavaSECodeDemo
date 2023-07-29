package com.pyw.a49file;

import java.io.File;

public class FileTest4 {
    public static void main(String[] args) {
        /*
            删除文件夹
         */
        deleteDir(new File("src/com/pyw/a49file/bbb"));
    }

    public static void deleteDir(File file){
        File[] files = file.listFiles();
        if(files !=null) {
            for (File f : files) {
                deleteDir(f);
                f.delete();
            }
            file.delete();
        }else {
            return;
        }
    }
}
