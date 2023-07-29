package com.pyw.a75tcp.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10086);

        Socket socket = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //br.readLine必须以换行符结尾，不然会一直阻塞导致后续代码无法执行
//        System.out.println(br.readLine());

        int b;
        while ((b = br.read()) != -1){
            System.out.print((char) b);
        }

        socket.close();
        ss.close();
    }
}
