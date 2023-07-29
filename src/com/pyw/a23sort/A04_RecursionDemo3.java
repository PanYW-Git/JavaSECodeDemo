package com.pyw.a23sort;

public class A04_RecursionDemo3 {
    public static void main(String[] args) {
        //TODO 递归 求5的阶层
        //5! = 5 * 4 * 3 * 2 * 1
        System.out.println(getHierarchy(6));
    }

    public static int getHierarchy(int num){
        if(num == 1){
            return 1;
        }

        return num * getHierarchy(num-1);
    }
}
