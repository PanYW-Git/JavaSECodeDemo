package com.pyw.a75tcp.test6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议 B/S架构接收数据
        //其实浏览器就是客户端，这儿写的代码就是服务器

        //1.创建对象ServerSocker
        ServerSocket ss = new ServerSocket(10086);

        //2.监听客户端的连接
        Socket socket = ss.accept();

        //3.从连接通道中获取输入流读取数据
        InputStream is = socket.getInputStream();
        //字节流无法接收中文，把他装入转换流转为字符流
        InputStreamReader isr = new InputStreamReader(is,"UTF-8");
        //提高运行效率使用Buffer
        BufferedReader br = new BufferedReader(isr);
        int b;
        while ((b = br.read()) != -1){
            System.out.print((char) b);
        }

        //4.释放资源
        is.close();
        socket.close();
        ss.close();
    }
}
