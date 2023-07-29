package com.pyw.a09string;

public class StringTest7 {
    public static void main(String[] args) {
        //TODO 敏感词替换
        String msg = "我操，哎哟！你tmd干嘛！";
        //敏感字符
        String[] arr = {"tmd","我操"};

        for (int i = 0; i < arr.length; i++) {
            msg = msg.replace(arr[i],"***");
        }
        System.out.println(msg);
    }
}
