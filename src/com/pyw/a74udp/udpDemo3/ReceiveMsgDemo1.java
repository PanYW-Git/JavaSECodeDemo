package com.pyw.a74udp.udpDemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMsgDemo1 {
    public static void main(String[] args) throws IOException {
        //接受数据

        //1.创建DatagramSocket对象（快递公司）
        //细节：
        //在接收的时候，一定要绑定端口，且端口要和发送的端口一致
        DatagramSocket ds = new DatagramSocket(10086);

        //2.接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        //该方法是阻塞的
        //程序执行到这一步会在这儿死等
        //等发送端发送消息
        ds.receive(dp);

        //3.解析数据包
        byte[] data = dp.getData();
        int len = dp.getLength();

        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println("接收到的数据" + new String(data,0,len));
        System.out.println("该数据是从" + address + "这台电脑中"+port+"端口发出");

        //释放资源
        ds.close();
    }
}
