package com.pyw.a09string;

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        //TODO 字符串反转
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reString(str);
    }

    public static String reString(String str){
        String result = "";
        for (int i = str.length(); i > 0; i--) {
            result = result + str.charAt(i - 1);
        }
        System.out.println(result);
        return result;
    }
}
