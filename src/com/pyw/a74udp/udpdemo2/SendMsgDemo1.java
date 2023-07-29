package com.pyw.a74udp.udpdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.nio.charset.StandardCharsets;

public class SendMsgDemo1 {
    public static void main(String[] args) throws IOException {
        //TODO 网络传输 发送数据 组播

        //1.创建DatagramSocket对象（快递公司）
        //细节：
        //绑定端口，以后我们就是通过这个端口往外发送数据
        //空参：所有可用的端口中随机一个进行使用
        //有参：指定端口号进行绑定
        //udp的特点 传输快，传输数据较小最大64kb，数据不安全，udp不会管数据成功或失败
        MulticastSocket ms = new MulticastSocket();

        //2.打包数据
        String str = "你好骚啊！！！";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        //指定组播地址
        InetAddress address = InetAddress.getByName("224.0.0.3");
        //发送到另外一台电脑的端口号
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        //发送数据
        ms.send(dp);

        //释放资源
        ms.close();
    }
}
