package com.pyw.a05for_while_dowhile;

public class WhileTest5 {
    public static void main(String[] args) {
        //TODO 力扣算法题：定义一个x 如果x是回文数那么打印true 如果不是打印false 回文数 如 12345654321 不调用方法使用循环的方式解决
        //自写方法，把左右两方拆开后进行比对，效率低！
        System.out.println(isPalindrome2(-1));
        //教程方法，将原来的整数从右往左再次排序与原有的数据进行对比是否一致

    }

    public static boolean isPalindrome2(int x) {
        int ge = 0;
        int num = 0;
        int tempx = x;
        while(tempx != 0){
            ge = tempx % 10;
            tempx = tempx / 10;
            num = num * 10 + ge;
        }
        System.out.println(num);
        if(x == num && x >= 0){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(int x) {
        int length = 0;
        Long digit = 1L;
        int start;
        int end;
        boolean flag = false;
        //判断当前数字的位数
        while (x >= digit) {
            length++;
            digit *= 10;
            System.out.println(x);
            System.out.println(digit);
        }
        System.out.println("length:"+length);
        if (x < 0) {
            flag = false;
        } else {
            if (length == 1 || length == 0) {
                return true;
            }
            for (int i = 0; i < length / 2; i++) {
                //获取回文数的前面位数
                start = x / (int) Math.pow(10, length - 1 - i) % 10;
                //获取回文数的后面位数
                if (i == 0) {
                    end = x % 10;
                } else {
                    end = x / (int) Math.pow(10, i) % 10;
                }
                System.out.println("start:"+start+"   end:"+end);
                if (start == end) {
                    flag = true;
                } else {
                    flag = false;
                    i = length / 2;
                }
            }
        }

        return flag;
    }



}
