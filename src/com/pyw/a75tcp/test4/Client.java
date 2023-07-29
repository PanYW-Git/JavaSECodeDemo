package com.pyw.a75tcp.test4;

import cn.hutool.core.io.FileUtil;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端：上传文件到服务器
        //服务器：上传到服务器返回


        //1.创建Socket对象并连接服务端
        Socket socket = new Socket("127.0.0.1",10086);

        //获取本地文件
        BufferedInputStream bisImg = FileUtil.getInputStream("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a75tcp\\test4\\img\\ee5300e0743945b8b3b6b87aaba69478.jpg");

        //2.写出数据
        String str = "见到你很高兴！";
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bisImg.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.flush();
        bisImg.close();
        //写出一个结束标记
        socket.shutdownOutput();


        //3.接收服务端回写的数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        System.out.println("服务器反馈：");
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }


        //释放资源
        os.close();
        socket.close();
    }
}
