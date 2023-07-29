package com.pyw.a49file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        /*
        public File(String pathname)                根据文件路径创建文件对象
        public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
        public File(File  parent, String child)     根据父路径对应文件对象和子路径名字符串创建文件对象

        C:\Users\alienware\Desktop

        windows路径：\
        linux路径:/

        \:转义字符
    */
        //1.根据字符串表示的路径，变成File对象
        String str = "C:\\Users\\PYW\\Desktop\\a.txt";
        File file1 = new File(str);
        System.out.println(file1);//C:\Users\PYW\Desktop\a.txt

        //2.父级路径：C:\Users\PYW\Desktop
        //子级路径：a.txt
        String parent = "C:\\Users\\PYW\\Desktop";
        String child = "a.txt";
        File file2 = new File(parent,child);
        System.out.println(file2);

        //3.把一个File表示的路径和String表示的路径进行拼接
        File file3 = new File("C:\\Users\\PYW\\Desktop");
        File file4 = new File(file3,"a.txt");
        System.out.println(file4);
    }
}
