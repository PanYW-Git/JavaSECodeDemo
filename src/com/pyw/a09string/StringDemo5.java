package com.pyw.a09string;

public class StringDemo5 {
    public static void main(String[] args) {
        //TODO 遍历字符串
        String str = "你好啊战地2042的m4a1";
        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //i表示字符串中的每一个索引
            System.out.println(str.charAt(i));
        }
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }
    }
}
