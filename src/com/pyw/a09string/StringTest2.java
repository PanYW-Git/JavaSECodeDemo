package com.pyw.a09string;

public class StringTest2 {
    public static void main(String[] args) {
        //TODO 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用方法在控制台输出
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 2, 3, 1, 2, 3, 54};
        charsToString(arr);

    }

    public static String charsToString(int[] arr) {
        //定义str用于接收和返回
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            //结尾
            if (i == arr.length - 1) {
                str = str + arr[i];
                break;
            }
            //中间
            str = str + arr[i] + ", ";

        }
        str = str + "]";
        //打印
        System.out.println(str);
        //返回
        return str;
    }
}
