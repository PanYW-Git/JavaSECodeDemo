package com.pyw.a50bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamErrDemo3 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         *
         *    //TODO JDK9:IO流中捕获异常的写法
         *
         *
         * */

        FileInputStream fis = new FileInputStream("D:\\itheima\\movie.mp4");
        FileOutputStream fos = new FileOutputStream("myio\\copy.mp4");

        try (fis;fos) {
            //2.拷贝
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
