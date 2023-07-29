package com.pyw.a76tcpchat.server;

import com.pyw.a76tcpchat.server.pojo.User;
import com.pyw.a76tcpchat.server.runnable.ChatServerRunnable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class App {
    public static ArrayList<Socket> list = new ArrayList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("             _nnnn_");
        System.out.println("            dGGGGMMb");
        System.out.println("           @p~qp~~qMb");
        System.out.println("           M|@||@) M|");
        System.out.println("           @,----.JM|");
        System.out.println("          JS^\\__/  qKL");
        System.out.println("         dZP        qKRb");
        System.out.println("        dZP          qKKb");
        System.out.println("       fZP            SMMb");
        System.out.println("       HZM            MMMM");
        System.out.println("       FqM            MMMM");
        System.out.println("     __| \".        |\\dS\"qML");
        System.out.println("     |    `.       | `' \\Zq");
        System.out.println("    _)      \\.___.,|     .'");
        System.out.println("    \\____   )MMMMMM|   .'");
        System.out.println("         `-'       `--'");

        System.out.println("\nWelcome to the pyw chat Server!");
        //获取服务端传输的信息
        ServerSocket ss = new ServerSocket(10086);
        //获取本地用户信息
        ArrayList<User> allUserInfo = getAllUserInfo();
        //来一个用户就开启一个多线程处理
        while (true){
            Socket socket = ss.accept();
            System.out.println("有客户端来信儿了~~~~");
            new Thread(new ChatServerRunnable(socket,allUserInfo)).start();
        }
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
        BufferedReader ois = new BufferedReader(new FileReader("D:\\Software\\java\\Project\\javaSE\\chat\\src\\top\\panyuwen\\server\\data\\user.txt"));
        String tempStr;
        while ((tempStr = ois.readLine()) != null) {
            String[] split = tempStr.split(":");
            users.add(new User(split[0], split[1]));
        }
        ois.close();
        return users;
    }
}
