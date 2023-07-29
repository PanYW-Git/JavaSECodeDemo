package com.pyw.a05for_while_dowhile;

public class test {
    public static void main(String[] args) {
        System.out.println(1000000000L * 10);
        System.out.println(isPalindrome(1410110141));
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
