package com.pyw.a06array;

public class DoubleDimensionalArrayTest1 {
    public static void main(String[] args) {
        //TODO 记录每个季度的营业额，要求算出每个嫉妒的营业额和全年的总营业额
        /*
         * 一季度 22，66，44
         * 二季度 77，33，88
         * 三季度 25，45，65
         * 四季度 11，66，99
          */
        int[][] arr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };

        int yearSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int quarterSum = getSum(arr[i]);
            System.out.println("第"+(i+1)+"季的销售额为："+quarterSum);
            yearSum += quarterSum;
        }
        System.out.println("全年销售额为："+yearSum);
    }

    public static int getSum(int[] arr){
        int quarterSum = 0;
        for (int j = 0; j < arr.length; j++) {
            quarterSum = quarterSum + arr[j];

        }
        return quarterSum;

    }
}
