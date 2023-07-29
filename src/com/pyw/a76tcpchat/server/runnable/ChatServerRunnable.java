package com.pyw.a76tcpchat.server.runnable;

import com.pyw.a76tcpchat.server.App;
import com.pyw.a76tcpchat.server.pojo.User;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerRunnable implements Runnable {
    private Socket socket;
    private ArrayList<User> allUserList;

    public ChatServerRunnable() {
    }

    public ChatServerRunnable(Socket socket, ArrayList<User> allUserList) {
        this.socket = socket;
        this.allUserList = allUserList;
    }

    @Override
    public void run() {
        try {
            System.out.println("进入线程咯~");
            //获取用户操作
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true){
                String userOperation = br.readLine();
                System.out.println("用户选择的操作:"+userOperation);
                //判断用户操作
                if ("login".equals(userOperation)) {
                    login(br);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void login(BufferedReader br) throws IOException {
        //登录
        //1.校验是否登录成功
        String userinfo = br.readLine();
        String username = userinfo.split("&")[0].replace("username=", "");
        String password = userinfo.split("&")[1].replace("password=", "");
        boolean loginSuccessFlag = false;
        System.out.println("开始校验登录信息~~~~~~");
        for (User user : allUserList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                //登录成功
                //返回服务端成功信息
                System.out.println(username + "，登录成功");
                writeMessageToClient("1");
                loginSuccessFlag = true;
                //把socket对象添加到list中，用于发送全部人信息
                App.list.add(socket);
                //接收信息并发送给全部人
                while (true){
                    if(talkAll(br, username)){
                        break;
                    }
                }
            }
        }
        if (loginSuccessFlag == false) {
            System.out.println(username + "，登录失败");
            writeMessageToClient("2");
        }
    }

    /**
     * 接收信息并发送给全部人
     */
    public boolean talkAll(BufferedReader br, String username) throws IOException {
        System.out.println("进入talkAll");
        String content = br.readLine();
        String sendAllUserContent = username + "发送来一条信息：" + content;
        System.out.println(sendAllUserContent);

        //群发给所有已登录的用户
        ArrayList<Socket> allLoginSockets = App.list;
        for (Socket loginSocket : allLoginSockets) {
            writeMessageToClient(sendAllUserContent, loginSocket);
        }
        if(":q".equals(content)){
            return true;
        }
        return false;
    }

    /**
     * 发送信息到客户端
     *
     * @param message 信息
     * @throws IOException
     */
    public void writeMessageToClient(String message) throws IOException {
        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }

    /**
     * 发送信息到指定客户端
     *
     * @param message 信息
     * @throws IOException
     */
    public void writeMessageToClient(String message, Socket socket) throws IOException {
        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }
}
