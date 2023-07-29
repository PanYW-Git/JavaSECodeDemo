package com.pyw.a74udp.udptest1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMsgTest {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        while (true){
            ds.receive(dp);

            //3.解析数据包
            byte[] data = dp.getData();

            int len = dp.getLength();
            String str = new String(data,0,len);
            InetAddress address = dp.getAddress();
            int port = dp.getPort();

            System.out.println("接收到的数据" + str);
            System.out.println("该数据是从" + address + "这台电脑中"+port+"端口发出");

            if("886".equals(str)){
                System.out.println("欢迎下次使用！！！");
                break;
            }
        }
    }
}
