package com.pyw.a21test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //TODO 键盘录入一些1~100之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int sum = 0;
        while (true) {
            String input = sc.nextLine();
            int anInt = Integer.parseInt(input);
            if (anInt < 1 || anInt > 100) {
                System.out.println("录入的数据不在1~100之间");
                continue;
            }
            integerArrayList.add(anInt);
            sum += anInt;

            if (sum>200) {
                System.out.println("输入的数据已超过两百~");
                break;
            }

        }
    }
}
