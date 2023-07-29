package com.pyw.a50bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteInputStreamDemo5 {
    public static void main(String[] args) throws IOException {
      /*
          public int read(byte[] buffer)      一次读一个字节数组数据
      */



        //1.创建对象
        FileInputStream fis = new FileInputStream("myio\\a.txt");
        //2.读取数据
        byte[] bytes = new byte[2];
        //一次读取多个字节数据，具体读多少，跟数组的长度有关
        //返回值：本次读取到了多少个字节数据
        int len1 = fis.read(bytes);
        System.out.println(len1);//2
        String str1 = new String(bytes,0,len1);
        System.out.println(str1);


        int len2 = fis.read(bytes);
        System.out.println(len2);//2
        String str2 = new String(bytes,0,len2);
        System.out.println(str2);

        int len3 = fis.read(bytes);
        System.out.println(len3);// 1
        String str3 = new String(bytes,0,len3);
        System.out.println(str3);// ed



        //3.释放资源
        fis.close();


    }
}
