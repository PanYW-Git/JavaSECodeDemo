package com.pyw.a06array;

public class DoubleDimensionalArrayDemo1 {
    public static void main(String[] args) {
        //TODO 二维数组的定义格式 静态初始化 数据类型[][] 数组名 = new 数据类型[][]{{元素1，元素2},{元素1，元素2}}
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        //简化格式,标准格式，把每一个一维数组单独写成一行
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };


        //获取元素
        System.out.println(arr2[0]); //表示获取二维数组中的第一个一维数组的地址值

        System.out.println(arr2[0][0]);//arr[0][0]获取第一个数组中的0索引元素

        System.out.println(arr2[1][4]);//打印数字8

        //3.遍历二维数组
        System.out.println("============================");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }

        //4.遍历二维数组 第一个数组一行，第二个数组一行，用空格隔开
        System.out.println("============================");
        //遍历二维数组，得到里面的一个二维数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("第"+(i+1)+"个数组为：");
            //内循环：遍历医院数组，得到里面的每个数组
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
