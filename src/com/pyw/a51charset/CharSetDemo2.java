package com.pyw.a51charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class CharSetDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
       Java中编码的方法
            public byte[] getBytes()                        使用默认方式进行编码
            public byte[] getBytes(String charsetName)      使用指定方式进行编码

        Java中解码的方法
            String(byte[] bytes)                            使用默认方式进行解码
            String(byte[] bytes, String charsetName)        使用指定方式进行解码
        */

        //1.编码
        System.out.println("============编码===========");

        System.out.println("============UTF-8===========");
        String str = "你好啊sir";
        //在UTF-8中一个汉字3个byte 一个英文1个byte
        //汉字的二进制第一位都是1开头的（表示负数）
        //IDEA默认是UTF-8
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }

        System.out.println();
        System.out.println("===========GBK===============");
        //在GBK中一个汉字2个byte 一个英文1一个byte
        byte[] bytes2 = str.getBytes("GBK");
        for (int i = 0; i < bytes2.length; i++) {
            System.out.print(bytes2[i] + " ");
        }
        System.out.println();

        //解码
        //UTF-8
        System.out.println("========解码=============");
        System.out.println("========UTF-8=============");
        String str2 = new String(bytes);
        System.out.println(str2);

        System.out.println("========用GBK解码UTF-8=============");
        String str4 = new String(bytes2);
        //GBK使用2个byte存汉字，UFT-8使用3个字符存汉字，所以解码会出现乱码
        System.out.println(str4);

        System.out.println("========GBK=============");
        String str3 = new String(bytes2,"GBK");
        System.out.println(str3);
    }
}
