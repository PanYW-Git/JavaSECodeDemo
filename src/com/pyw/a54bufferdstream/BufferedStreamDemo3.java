package com.pyw.a54bufferdstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
         *   字符缓冲输入流：
         *      构造方法：
         *           public BufferedReader(Reader r)
         *      特有方法：
         *           public String readLine()   读一整行
         *
         * */



        //1.创建字符缓冲输入流的对象
        BufferedReader br = new BufferedReader(new FileReader("src/com/pyw/a54bufferdstream/temp/a.txt"));
        //2.读取数据
        //细节：
        //readLine方法在读取的时候，一次读一整行，遇到回车换行结束
        //        但是他不会把回车换行读到内存当中

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        //3.释放资源
        br.close();

    }
}
