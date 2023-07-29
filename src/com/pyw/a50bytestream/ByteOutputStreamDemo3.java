package com.pyw.a50bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        //TODO
           void write(int b)                       一次写一个字节数据
           void write(byte[] b)                    一次写一个字节数组数据
           void write(byte[] b, int off, int len)  一次写一个字节数组的部分数据
           参数一：
                数组
           参数二：
                起始索引  0
           参数三：
                个数      3
        */
        //1.创建对象
        FileOutputStream fos = new FileOutputStream("src\\com\\pyw\\a50bytestream\\temp\\b.txt");
        //2.写出数据
        fos.write(97);//a
        fos.write(98);//b
        //传数组
        byte[] arr = {97,98,99,100};
        fos.write(arr);
        //从1索引开始写两个
        fos.write(arr,1,2);//b c

        //3.释放资源
        fos.close();
    }
}
