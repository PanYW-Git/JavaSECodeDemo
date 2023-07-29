package com.pyw.a69threadtest.test4;

public class test {
    static final double MIN = 0.01;
    public static void main(String[] args) {
        int money = 50;
        int count = 2;
        double bounds = money - (count - 1) * MIN;
        System.out.println(bounds);
    }
}
