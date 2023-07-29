package com.pyw.a50bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         * //TODO 演示：字节输入流FileInputStream
         * 实现需求：读取文件中的数据。（暂时不写中文）
         *
         * 实现步骤：
         *       创建对象
         *          细节一：如果文件不存在，直接报错
         *       读取数据
         *          细节一：一次读取一个字节，读出来的是数据在ASCII码表上对应的数字
         *          细节二：读到文件末尾了，read方法返回-1
         *       释放资源
         *          每次使用完流之后必须释放资源
         * */
        FileInputStream fis = new FileInputStream("src\\com\\pyw\\a50bytestream\\temp\\c.txt");
        int read = fis.read();
        System.out.println((char)read);
        int read2 = fis.read();
        System.out.println((char)read2);
        int read3 = fis.read();
        System.out.println((char)read3);
        int read4 = fis.read();
        System.out.println((char)read4);
        fis.close();
    }
}
