package com.pyw.a50bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamErrDemo1 {
    public static void main(String[] args) {
       /*
       *
       *    利用try...catch...finally捕获拷贝文件中代码出现的异常
       *
       *
       * */


        //1.创建对象
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\itheima\\movie.mp4");
            fos = new FileOutputStream("myio\\copy.mp4");
            //2.拷贝
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            //e.printStackTrace();
        } finally {
            //3.释放资源
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
