package com.pyw.a09string;

public class StringTest12 {
    public static void main(String[] args) {
        //TODO 给两个字符串形式表达的非负整数，返回两个数的相乘的结果，不可以使用强制转型
        String num1 = "12345";
        String num2 = "123";

        int intNum1 = 0;
        int intNum2 = 0;
        //1.转为整数
        for (int i = 0; i < num1.length(); i++) {
            intNum1 = intNum1 * 10 +(num1.charAt(i) - 48);
        }
        System.out.println(intNum1);
        for (int i = 0; i < num2.length(); i++) {
            intNum2 = intNum2 * 10 +(num1.charAt(i) - 48);
        }
        System.out.println(intNum2);

        int x = (intNum1 * intNum2);
        //转为字符串
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        System.out.println(x);
    }
}
