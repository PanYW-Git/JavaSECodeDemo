package com.pyw.a05for_while_dowhile;

public class ForTest {

    public static void main(String[] args) {
        //TODO 需求 求数据1~5的和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
