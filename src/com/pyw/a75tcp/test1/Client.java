package com.pyw.a75tcp.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //多发数据

        //创建socket对象并连接服务器
        Socket socket = new Socket("127.0.0.1",10086);
        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        //2.写出数据
        while (true){
            System.out.println("请输入数据");
            String str = sc.nextLine();
            if("886".equals(str)){
                break;
            }
            os.write(str.getBytes());
        }

        //3.释放资源 流会自动关闭
        socket.close();
    }
}
