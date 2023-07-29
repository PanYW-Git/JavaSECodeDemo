package com.pyw.a75tcp.test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {

    public static void main(String[] args) throws IOException {
        //客户端：发送一条数据，接收服务端反馈的消息并打印(多线程)
        //服务器：接收数据并打印，再给客户端反馈消息


        //1.创建对象并绑定10086端口
        ServerSocket ss = new ServerSocket(10086);



        while (true){
            //2.等待客户端连接
            Socket socket = ss.accept();

            //开启一条线程
            //一个用户对应服务器的一条线程
            new Thread(new MyRunnable(socket)).start();
        }


    }
}
