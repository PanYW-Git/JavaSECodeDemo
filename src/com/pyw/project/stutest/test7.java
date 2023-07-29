package com.pyw.project.stutest;

import java.util.Random;

public class test7 {
    public static void main(String[] args) {
        //直播抽奖，分别有 2，688，888，1000.10000五个奖金，抽到奖池输出数组
        //1.定义数组表示奖池
        int[] arr = {2,688,888,1000,10000};
        //方法1
//        luckyDraw1(arr);
        //方法2 把所有奖池的顺序打乱
        luckyDraw2(arr);

    }

    public static void luckyDraw2(int[] arr){
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int rIndex = r.nextInt(5);
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[rIndex];
            arr[rIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"已被抽出！！");
        }
    }

    public static void luckyDraw1(int[] arr){
        //2.定义数组表示抽奖的结果
        int[] finalArr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int rIndex = r.nextInt(5);
            //判断该数字是否已经抽取到
            if(contains(finalArr,arr[rIndex])){
                i--;
                continue;
            }else {
                finalArr[i] = arr[rIndex];
            }
        }

        for (int i = 0; i < finalArr.length; i++) {
            System.out.println(finalArr[i]+"已被抽出！！");
        }
    }
    //用于判断数组中是否存在已经抽取过的数据
    public static boolean contains(int[] arr,int price){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==price){
                return true;
            }
        }
        return false;
    }
}
