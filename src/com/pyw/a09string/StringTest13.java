package com.pyw.a09string;

public class StringTest13 {
    public static void main(String[] args) {
        //TODO 给一个字符串，里面由若干个单词组成，单词前后用一些空格字符隔开
        //例： “luffy is still joyboy” 输出为6

        String str = "luffy is still joyboy";

        for (int i = str.length(); i > 0; i--) {
            if(str.charAt(i-1)==32){
                System.out.println(str.length() - i);
                break;
            }
        }
    }
}
