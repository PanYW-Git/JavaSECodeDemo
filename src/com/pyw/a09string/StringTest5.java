package com.pyw.a09string;

public class StringTest5 {
    public static void main(String[] args) {
        //TODO 手机号屏蔽
        //substring 一个参数 默认从索引开始截到末尾， 两个参数 第一个参数索引开始截，后一个参数索引前为止


        //1.获取手机号码
        String phoneNum = "17788888888";

        //2.截取手机号码前三位
        String phoneHead = phoneNum.substring(0, 3);

        //3.截取手机号后四位
        String phoneEnd = phoneNum.substring(7);

        //4.拼接
        String phoneNumS = phoneHead + "xxxx" + phoneEnd;
        System.out.println(phoneNumS);
    }
}
