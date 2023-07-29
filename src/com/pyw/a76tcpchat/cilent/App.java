package com.pyw.a76tcpchat.cilent;

import com.pyw.a76tcpchat.cilent.runnable.ChatClientRunnable;
import com.pyw.a76tcpchat.server.pojo.ChatInfo;
import com.pyw.a76tcpchat.server.pojo.User;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("正在连接服务器....");
        Socket socket = new Socket("127.0.0.1",10086);
        System.out.println("连接服务器成功！！！");
        String bear =
                        "  / \\__ / \\\n" +
                        "(    @  @   )\n" +
                        "  /    3  \\ \n" +
                        " /  /   \\  \\ \n" +
                        "/  /     \\  \\\n";

        System.out.println(bear);
        System.out.println("====欢迎来到pyw的小聊天室====");
        userOperationWhile:
        while (true) {
            System.out.println("请选择您需要的操作");
            System.out.println("1:登录 2：注册 0：退出");
            String userOperation = sc.nextLine();
            switch (userOperation) {
                case "1" -> login(socket);
                case "2" -> regist();
                case "0" -> {
                    System.out.println("感谢使用，再见");
                    break userOperationWhile;
                }
                default -> System.out.println("输入错误请重新输入");
            }
        }
    }

    /**
     * 注册
     */
    private static boolean regist() throws IOException, ClassNotFoundException {
        //获取存储的用户信息
        ArrayList<User> userDataList = getAllUserInfo();
        String username = "";
        String password = "";
        User user;
        registInput:
        while (true) {
            System.out.println("请输入用户名");
            username = sc.nextLine();
            for (User userData : userDataList) {
                if (userData.getUsername().equals(username)) {
                    System.out.println("该用户已存在，请重新输入");
                    continue registInput;
                }
            }
            System.out.println("请输入密码");
            password = sc.nextLine();
            user = new User(username, password);
            break;
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/pyw/a76tcpchat/data/user.txt", true));
        bw.write(user.getUsername() + ":" + user.getPassword());
        bw.newLine();
        bw.close();
        return true;
    }

    /**
     * 聊天
     *
     * @param username
     */
    private static void chat(String username) throws IOException {
        //获取用户输入
        System.out.println(username + "，欢迎您，请输入聊天内容");

        //封装聊天信息对象

    }

    private static void sendMsg(ChatInfo chatInfo) throws IOException {
        String content = sc.nextLine();
        String ip = InetAddress.getLocalHost().getHostAddress();

        Socket socket = new Socket("127.0.0.1", 10086);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(chatInfo.getContent());
        bw.newLine();
        bw.flush();
    }

    /**
     * 登录
     */
    private static boolean login(Socket socket) throws IOException, ClassNotFoundException {
        String username = "";
        String password = "";
        loginInput:
        while (true) {
            //第一行传操作，第二行传用户名密码
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("login");
            bw.newLine();
            System.out.println("请输入用户名");
            username = sc.nextLine();
            System.out.println("请输入密码");
            password = sc.nextLine();
            //发送登录信息
            String checkLogin = "username="+username+"&password="+password;
            bw.write(checkLogin);
            bw.newLine();
            bw.flush();

            //接收数据
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String result = br.readLine();
            System.out.println("result："+result);
            if ("1".equals(result)) {
                System.out.println("登录成功！！请开始聊天吧~");
                //接收信息
                new Thread(new ChatClientRunnable(socket)).start();
                //开始聊天
                talkAll(bw);
                break loginInput;
            }else {
                System.out.println("登录失败，请重新输入QAQ");
                //清空流里面的数据
            }
        }

        return true;
    }

    /**
     * 获取所有user
     *
     * @return 所有user的集合
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static ArrayList<User> getAllUserInfo() throws IOException, ClassNotFoundException {
        ArrayList<User> users = new ArrayList<>();
        BufferedReader ois = new BufferedReader(new FileReader("src/com/pyw/a76tcpchat/data/user.txt"));
        //TODO 遍历
        String tempStr;
        while ((tempStr = ois.readLine()) != null) {
            String[] split = tempStr.split(":");
            users.add(new User(split[0], split[1]));
        }
        ois.close();
        return users;
    }

    private static void talkAll(BufferedWriter bw) throws IOException {
        while (true){
            System.out.println("请输入你要给大家说的话把~~~  ps：如果不想聊天了可以输入【:q】");
            String talk = sc.nextLine();

            //输入:q退出程序
            if(talk.equals(":q")){
                break;
            }
            bw.write(talk);
            bw.newLine();
            bw.flush();
        }

    }
}
