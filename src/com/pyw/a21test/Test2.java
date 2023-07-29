package com.pyw.a21test;

public class Test2 {
    public static void main(String[] args) {
        /*
            TODO 自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
            字符串中只能是数字不能有其他字符最少一位，最多10位日不能开头
        */
        int anInt = fakerParseInt("12345678");
        System.out.println(anInt);
    }

    public static int fakerParseInt(String str){
        int result = 0;
        String regex = "[1-9]\\d{1,9}";
        boolean matches = str.matches(regex);
        if(matches == true){
            for (int i = 0; i < str.length(); i++) {
                int charInt = str.charAt(i);
                result = (charInt - 48) + result * 10;
            }
        }else {
            System.out.println("请输入纯数字且1~10位，不能以0开头");
        }
        return result;
    }
}
