package com.pyw.a75tcp.test5;

import com.pyw.a75tcp.test5.MyRunnable;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {

    public static void main(String[] args) throws IOException {
        //客户端：发送一条数据，接收服务端反馈的消息并打印(多线程线程优化版-增加线程池)
        //服务器：接收数据并打印，再给客户端反馈消息

        //创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, //核心线程数量
                16, //线程池总大小
                60, //空闲时间
                TimeUnit.SECONDS, //空闲时间单位
                new ArrayBlockingQueue<>(2), //阻塞队列
                Executors.defaultThreadFactory(), //线程池如何创建线程对象
                new ThreadPoolExecutor.AbortPolicy() //拒绝策略
        );


        //1.创建对象并绑定10086端口
        ServerSocket ss = new ServerSocket(10086);



        while (true){
            //2.等待客户端连接
            Socket socket = ss.accept();

            //开启一条线程
            //一个用户对应服务器的一条线程
            pool.submit(new MyRunnable(socket));
        }


    }
}
