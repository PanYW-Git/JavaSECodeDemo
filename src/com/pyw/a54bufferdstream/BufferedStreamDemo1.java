package com.pyw.a54bufferdstream;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            需求：
                利用字节缓冲流拷贝文件
                    一次读写一个字节

             字节缓冲输入流的构造方法：
                public BufferedInputStream(InputStream is)
             字节缓冲输出流的构造方法：
                public BufferedOutputStream(OutputSream os)
         */
        //1.创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/com/pyw/a54bufferdstream/temp/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/com/pyw/a54bufferdstream/temp/copy.txt"));
        //2.循环读取并写到目的地
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        //释放资源
        bos.close();
        bis.close();
    }
}
