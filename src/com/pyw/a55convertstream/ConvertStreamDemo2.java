package com.pyw.a55convertstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码写出
        */


        //1.创建转换流的对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/com/pyw/a55convertstream/temp/a.txt"),"GBK");
        //2.写出数据
        osw.write("你好啊java");
        //3.释放资源
        osw.close();
    }
}
