package com.pyw.a52charstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {


        FileWriter fw = new FileWriter("src/com/pyw/a52charstream/temp/test.txt");

        //此时运行是没有数据的，因为缓冲区有8192个字节，
        //如果不关闭流或者刷新或者不超过8192个字节，不会把缓冲区中的数据放到文件中
        for (int i = 0; i < 8192; i++) {
            fw.write('a');
        }

        fw.write('b');
        //刷新，会把数据放进去但是不会断开连接
        fw.flush();
        fw.write('c');
        //关闭流
//        fw.close();


    }
}
