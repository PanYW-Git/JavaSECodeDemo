package com.pyw.a49file;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        /*
            在当前模块下的aaa文件中创建一个a.txt
         */
        String str2 = "src\\com\\pyw\\a49file\\bbb";
        File file2 = new File(str2);
        file2.mkdirs();
        file2.mkdir();

        String str = "src\\com\\pyw\\a49file\\bbb\\a.txt";
        File file1 = new File(str);
        file1.createNewFile();
    }
}
