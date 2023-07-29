package com.pyw.a05for_while_dowhile;

public class WhileDemo {
    public static void main(String[] args) {
        //需求 打印1~100
        /**
         * for 和 while的使用情况
         * for：知道循环次数和循环的范围
         * while：不知道循环的次数和循环的范围，只知道循环的结束条件
         *
         * ps：for的条件变量在for外不能使用，而while的变量可以
         *
         */

        int i = 1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
    }
}
