package com.pyw.a50bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         * //TODO 演示：字节输出流FileOutputStream
         * 实现需求：写出一段文字到本地文件中。（暂时不写中文）
         *
         * 实现步骤：
         *       创建对象
         *       写出数据
         *       释放资源
         * */

        //1.创建对象
        //写出 输出流 OutputStream
        //本地文件 FileOutputStream
        FileOutputStream fos = new FileOutputStream("src\\com\\pyw\\a50bytestream\\temp\\a.txt");
        //2.写出数据
        fos.write(97);//输出a
        //3。释放资源
        fos.close();
    }
}
