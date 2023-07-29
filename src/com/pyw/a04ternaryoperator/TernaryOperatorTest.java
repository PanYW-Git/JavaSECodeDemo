package com.pyw.a04ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorTest {
    public static void main(String[] args) {
        //需求 有两只老虎体重通过键盘输入，判断体重是否相同
        Scanner scanner = new Scanner(System.in);
        int tigera = scanner.nextInt();
        int tigerb = scanner.nextInt();
        System.out.println(tigera == tigerb ? "相同" : "不相同");
    }
}
