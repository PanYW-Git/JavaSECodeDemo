package com.pyw.a55convertstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            转换流
            作用：1、指定字符集读写数据（jdk11后已淘汰）
                 2、字节流想使用字符流中的方法了
            利用转换流按照指定字符编码读取(了解)

            因为JDK11：这种方式被淘汰了。替代方案(掌握)
            F:\JavaSE最新版\day29-IO（其他流）\资料\gbkfile.txt
        */
//        //1、创建对象并指定字符编码
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/com/pyw/a55convertstream/temp/gbkfile.txt"),"GBK");
//        //2、读取数据
//        int ch;
//        while((ch = isr.read()) != -1){
//            System.out.print((char) ch);
//        }
//        isr.close();

        FileReader fr = new FileReader("src/com/pyw/a55convertstream/temp/gbkfile.txt", Charset.forName("GBK"));
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char) ch);
        }
        fr.close();
    }
}
