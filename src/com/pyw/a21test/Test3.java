package com.pyw.a21test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        //TODO 自己实现toBinaryString方法 把十进制转为二进制
        int num = 123;
        int anInt = toBinaryInt(num);
        System.out.println(anInt);
    }

    private static int toBinaryInt(int num) {
        List<Integer> ints = new ArrayList<>();
        //除基取余法：不断的除以基数（几进制基数就是几）得到余数
        //直到商为0，再将余数倒着拼起来
        int temp = num;
        int result = 0;

        while (temp > 0) {
            ints.add(temp % 2);
            temp = temp / 2;
        }

        for (int i = ints.size() - 1; i >= 0; i--) {
            result = ints.get(i) + result * 10;
        }
        return result;
    }
}
