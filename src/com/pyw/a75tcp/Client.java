package com.pyw.a75tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP协议，发送数据

        /*
        1.创建socket对象
        细节，在创建对象的同时会连接服务端
                如果连不上，代码会报错
         */
        //三次握手协议
        Socket socket = new Socket("127.0.0.1",10086);

        //2.可以从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();

        //写出数据
        os.write("你好啊你好啊".getBytes(StandardCharsets.UTF_8));

        //3.释放资源
        os.close();
        //四次挥手协议
        socket.close();


    }
}
