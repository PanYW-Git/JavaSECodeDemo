package com.pyw.a52charstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            第一步：创建对象
                public FileWriter(File file)                            创建字符输出流关联本地文件
                public FileWriter(String pathname)                      创建字符输出流关联本地文件
                public FileWriter(File file,  boolean append)           创建字符输出流关联本地文件，续写
                public FileWriter(String pathname,  boolean append)     创建字符输出流关联本地文件，续写

            第二步：读取数据
                void write(int c)                           写出一个字符
                void write(String str)                      写出一个字符串
                void write(String str, int off, int len)    写出一个字符串的一部分
                void write(char[] cbuf)                     写出一个字符数组
                void write(char[] cbuf, int off, int len)   写出字符数组的一部分

            第三步：释放资源
                public void close()                 释放资源/关流


                '我'    25105
        */
        FileWriter fw = new FileWriter("src/com/pyw/a52charstream/temp/helloWriter.txt",false);
        //根据字符集的编码方式进行编码，把编码之后的数据写道文件中去
        //idea默认uft-8
        //3byte
        fw.write(25105);//'我'    25105

        fw.write("你好啊！世界！");//英文状态下的!一个字节，中文状态下！三个字节

        char[] ch = {'a','b','我'};
        fw.write(ch);
        //关闭流
        fw.close();
    }
}
