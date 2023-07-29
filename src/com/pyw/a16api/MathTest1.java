package com.pyw.a16api;

import java.util.ArrayList;
import java.util.List;

public class MathTest1 {
    public static void main(String[] args) {
//        int num = 1634;
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if(checkSelfNum(i)){
                System.out.println(i+"是自幂数");
                count++;
            }
        }
        System.out.println("共计:" + count);
    }

    private static boolean checkSelfNum(int num) {
        int count = 0;
        int ge = 0;
        int temp = num;
        List<Integer> numList = new ArrayList<>();
        while (temp > 0) {
            numList.add(count,temp % 10);
            temp = temp / 10;
            count++;
        }
        double sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            double pow = Math.pow(numList.get(i),count);
            sum += pow;
        }
        if(sum == num){
            return true;
        }else {
            return false;
        }
    }
}
