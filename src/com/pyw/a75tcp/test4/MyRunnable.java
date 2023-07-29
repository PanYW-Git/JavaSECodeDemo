package com.pyw.a75tcp.test4;

import cn.hutool.core.io.FileUtil;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{

    Socket socket;

    public MyRunnable(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //定义输出文件的输出流
            //3.socket中获取输入流读取数据
            InputStream is = socket.getInputStream();
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/com/pyw/a75tcp/test4/serverimg/"+ UUID.randomUUID().toString().replace("-","")+".jpg"));
            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] bytes = new byte[1024];
            //细节：
            //read方法会从连接通道中读取数据
            //但是，需要有一个结束标记，此处的循环才会停止
            //否则，程序就会一直停在read方法这里，等待读取下面的数据
            int len;
            while ((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);

            }
            bos.close();

            //4.回写数据
            String str = "上传成功";
            OutputStream os = socket.getOutputStream();
            os.write(str.getBytes());

            //释放资源
            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            //释放资源
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
