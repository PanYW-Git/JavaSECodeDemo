package com.pyw.project.stutest;

public class test2 {
    public static void main(String[] args) {
        //TODO 找101-200之间的质数，并输出所有的质数
        for (int i = 101; i <= 200; i++) {
            if(findNum(i)){
                System.out.println(i+"为质数");
            }
        }
    }

    public static boolean findNum(int num){
        int result = 0;
        // 81 1* 81 3 * 27 9 * 9
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if( num%i == 0){
                return false;
            }
        }
        return true;
    }
}
