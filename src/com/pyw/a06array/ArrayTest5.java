package com.pyw.a06array;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        /*TODO 生成10个1~100的随机数存入数组
        * 求出所有数据的和
        * 求所有数据的平均数
        * 统计有多少个数比平均数小
        * */
        int[] arr = new int[10];
        Random r = new Random();
        int sum = 0;
        double ave = 0.0;
        int bedNumCount = 0;
        //将随机数赋值给数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101)+1;
            //
            System.out.println("生成第"+(i+1)+"个的随机数："+arr[i]);
        }
        //计算所有数据的和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //计算所有数据的平均数
        ave = (double) sum / (double) arr.length;

        //统计有多少个数比平均数小
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ave) {
                bedNumCount++;
            }
        }

        System.out.println("生成随机数的信息如下   合计："+sum+" 平均数"+ave+" 小于平均数"+ bedNumCount);



    }
}
