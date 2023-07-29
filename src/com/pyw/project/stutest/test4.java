package com.pyw.project.stutest;

public class test4 {
    public static void main(String[] args) {
        //TODO 需求 把数组中的元素赋值到新数组中去
        int[] arrOld = {1,2,3,4,5};
        int[] arrNew = new int[arrOld.length];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = arrOld[i];
        }

        for (int i = 0; i < arrNew.length; i++) {
            System.out.println(arrNew[i]);
        }
    }
}
