package com.pyw.a74udp.udptest1;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SendMsgTest {
    public static void main(String[] args) throws IOException {
        /*
            UDP发送数据：数据来自键盘录入，直到输入的数据是886，发送数据结果
            UDP接受数据：因为接受段不知道发送端什么时候停止发送，所有采用死循环接收
         */
        //发送数据

        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        while (true){
            System.out.println("请输入数据");
            String str = sc.nextLine();


            byte[] bytes = str.getBytes();

            InetAddress address = InetAddress.getByName("127.0.0.1");

            int port = 10086;

            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

            ds.send(dp);
            System.out.println("发送成功");

            if(str.equals("886")){
                break;
            }
        }

        ds.close();

    }
}
