package com.pyw.a01_logicaloperator;

import java.util.Scanner;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        /*键盘录入两个整数，如果其中一个是6，最终结果为true
        * 如果他们的和为6的倍数，最终输出为true
        * 其他情况都是false
        * */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a == 6 || b == 6 || ((a+b) % 6) == 0);
    }
}
