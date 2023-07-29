package com.pyw.a76tcpchat.cilent.runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClientRunnable implements Runnable{
    private Socket socket;

    public ChatClientRunnable(){

    }

    public ChatClientRunnable(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {

        while (true){
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String msg;
                while ((msg = br.readLine()) !=null){
                    System.out.println(msg);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
