package com.pyw.a09string;

import java.util.Random;
import java.util.Scanner;

public class StringTest10 {
    public static void main(String[] args) {
        //TODO 键盘输入任意字符串，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        Random r = new Random();
        char temp;
        for (int i = 0; i < str.length(); i++) {
            int index = r.nextInt(str.length() - 1);
            temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        System.out.println(sb);
    }
}
