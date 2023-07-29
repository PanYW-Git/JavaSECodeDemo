package com.pyw.a06array;

public class DoubleDimensionalArrayDemo2 {
    public static void main(String[] args) {
        //TODO 二维数组 动态定义 格式： 数据类型[][] 变量名 = new 数据类型[m][n] m为二维数组中一维数组的数量，n表示每个一维数组的长度
         int[][] arr = new int[2][2];

         //特殊情况一 两个长度不一样的二维数组
        int[][] arr2 = new int[2][];
        int[] arr21 ={1,2};
        int[] arr22 = {2,3,4,5};
        arr2[0] = arr21;
        arr2[1] = arr22;
    }
}
