package com.pyw.a54bufferdstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
         *
         *    字符缓冲输出流
         *      构造方法：
         *           public BufferedWriter(Writer r)
         *      特有方法：
         *           public void newLine()      跨平台的换行
         *
         *      注：BufferedWriter只增强，如果需要开启续写功能需要写在FileWriter里面
         * */


        //1.创建字符缓冲输出流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/pyw/a54bufferdstream/temp/copy2.txt",true));
        //2.写出数据
        bw.write("hhhh");
        bw.newLine();//BufferedWriter独有
        bw.write("你好啊兄弟！");
        bw.newLine();
        bw.write("你好啊大兄弟！");
        bw.newLine();
        bw.write("你好啊好兄弟！");
        //3.释放资源
        bw.close();







    }
}
