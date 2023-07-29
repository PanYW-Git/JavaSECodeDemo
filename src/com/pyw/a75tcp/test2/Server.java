package com.pyw.a75tcp.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        //客户端：发送一条数据，接收服务端反馈的消息并打印
        //服务器：接收数据并打印，再给客户端反馈消息


        //1.创建对象并绑定10086端口
        ServerSocket ss = new ServerSocket(10086);

        //2.等待客户端连接
        Socket socket = ss.accept();

        //3.socket中获取输入流读取数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        //细节：
        //read方法会从连接通道中读取数据
        //但是，需要有一个结束标记，此处的循环才会停止
        //否则，程序就会一直停在read方法这里，等待读取下面的数据
        while ((b = isr.read()) != -1){
            System.out.println((char)b);
        }

        //4.回写数据
        String str = "到底有多开心？";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        //释放资源
        socket.close();
        ss.close();

    }
}
