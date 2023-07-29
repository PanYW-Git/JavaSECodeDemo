package com.pyw.project.stutest;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //TODO 需求 对数字进行加密
        //规则如下：每位数加上5，再对10求余，最后将所有数字反转得到一串新数字
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        int sPassword = encryption(password);
        System.out.println("加密后的结果"+sPassword);
        int cPassword = decode(sPassword);
        System.out.println("解密后的结果"+cPassword);
    }

    /**
     * 整数转为整数数组
     */
    public static int[] changeIntToArr(int num){
        int index = calcNum(num);
        int[] passwordInt = new int[index];

        //获取当前数据的每一位到数组中
        int count = 0;
        int tempNum = num;
        System.out.print("数组中的数据为:");
        while (count < index) {
            passwordInt[index - count -1] = num / (int)Math.pow(10, count) % 10;
            count++;
        }
        System.out.println();
        System.out.print("数组中的数据为:");
        for (int i = 0; i < passwordInt.length; i++) {
            System.out.print(passwordInt[i]+" ");
        }
        System.out.println();
        return passwordInt;
    }

    /**
     * 计算数字的长度
     */
    public static int calcNum(int num){
        int flagNum = 0;
        while (num >= 1) {
            num = num / 10;
            System.out.println(num);
            flagNum++;
        }
        System.out.println("获取到的数字长度为："+flagNum);
        return flagNum;
    }

    /**
     * 反转
     */
    public static int[] reversal(int [] arr){
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] = temp;
        }
        System.out.println("反转后的结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }

    /**
     * 数组转为数字
     */
    public static int changeArrToInt(int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        return num;
    }
    /**
     * 加密
     * @param password
     * @return
     */
    public static int encryption(int password) {
        System.out.println("加密开始-----------------");
        //计算当前数字长度
        int flagNum = calcNum(password);
        int passwordTemp = password;
        //把int转为int数组
        int[] passwordInt = changeIntToArr(password);
        //每位数加上5再对10求余
        System.out.print("加上5再对10求余的结果");
        for (int i = 0; i < passwordInt.length; i++) {
            passwordInt[i] = (passwordInt[i] + 5) % 10;
            System.out.print(passwordInt[i]+" ");
        }
        System.out.println();
        //反转后的结果输出
        passwordInt = reversal(passwordInt);
        //将数组重新放入数字中
        password = changeArrToInt(passwordInt);
        System.out.println("password加密后的值："+password);
        return password;
    }

    /**
     * 解密
     * @return
     */
    public static int decode(int sPassword){
        System.out.println("解密开始----------------------");
        int[] passwordArr = changeIntToArr(sPassword);
        //反转
        passwordArr = reversal(passwordArr);
        for (int i = 0; i < passwordArr.length; i++) {
            System.out.println(passwordArr[i]);
        }
        //+5后%10解密 范围只可能在5~14之间 而5789%10 就是56789，0~4%10之前肯定是10~14
        for (int i = 0; i < passwordArr.length; i++) {
            if(passwordArr[i]>=0 && passwordArr[i]<=4){
                passwordArr[i] = passwordArr[i] * 10 - 5;
            }else {
                passwordArr[i] = passwordArr[i] - 5;
            }
        }

        //把arr转为int
        sPassword = changeArrToInt(passwordArr);
        return sPassword;
    }
}
