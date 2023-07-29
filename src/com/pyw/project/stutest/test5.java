package com.pyw.project.stutest;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //TODO 需求 6名评委打分，分数范围是0~100之间的整数，选手最后得分为去掉最高分和最低分的平均分
        //方法1
//        method1();
        //方法2
        method2();
    }

    public static void method1(){
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        //获取评委打分
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评分打分");
            arr[i] = sc.nextInt();
            if (!(arr[i] >= 0 && arr[i] <= 100)) {
                System.out.println("输入的数据不在0~100中，请重新输入");
                arr[i] = 0;
                i--;
            }
        }

        //获取评分打分的最高分和最低分
        int tempMax = 0;
        int tempMin = 0;
        int[] finalArr = new int[4];
        //获取最高分和最低分的索引
        for (int i = 0; i < arr.length; i++) {
            if (arr[tempMax] < arr[i]) {
                tempMax = i;
                continue;
            }
            if (arr[tempMin] > arr[i]) {
                tempMin = i;
                continue;
            }
        }
        System.out.println("最大值索引" + tempMax + " 最小值索引" + tempMin);
        System.out.println("最大值：" + arr[tempMax] + " 最小值：" + arr[tempMin]);
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == tempMax || i == tempMin) {
                System.out.println(i + "为最值索引");
                continue;
            }
            System.out.println(i + " " + j);
            finalArr[j] = arr[i];
            j++;
        }

        //求平均数
        int sum = 0;
        for (int i = 0; i < finalArr.length; i++) {
            System.out.print("获取到的finalArr：");
            System.out.print(finalArr[i] + " ");
            sum += finalArr[i];
        }
        System.out.println("评委打分的平均分为：" + ((double) sum / (double) finalArr.length));
    }




    public static void method2(){
        //获取评委打分
        int[] arr = getScores();
        //求数组的最大值和最小值
        int max = getMax(arr);
        int min = getMin(arr);
        //求输入进来的数的合计
        int sum = getSum(arr);
        //求出去最大值最小值的平均值;
        int avg = getFinalScores(sum,max,min,arr.length);
        System.out.println("求和为："+sum+" 最大值为："+max+" 最小值为："+min+"最后值为："+avg);
    }

    public static int[] getScores(){
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        //获取评委打分
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评分打分");
            arr[i] = sc.nextInt();
            if (!(arr[i] >= 0 && arr[i] <= 100)) {
                System.out.println("输入的数据不在0~100中，请重新输入");
                arr[i] = 0;
                i--;
            }
        }
        return arr;
    }

    public static int getMax(int[] arr){
        int tempMax = arr[0];
        int[] finalArr = new int[4];
        //获取最高分和最低分的索引
        for (int i = 0; i < arr.length; i++) {
            if (tempMax < arr[i]) {
                tempMax = arr[i];
            }
        }
        return tempMax;
    }

    public static int getMin(int[] arr){
        //shift + F6可批量修改变量名称
        int tempMin = arr[0];
        int[] finalArr = new int[4];
        //获取最高分和最低分的索引
        for (int i = 0; i < arr.length; i++) {
            if (tempMin > arr[i]) {
                tempMin = arr[i];
            }
        }
        return tempMin;
    }

    public static int getSum(int[] arr){
        int tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i];
        }
        return tempSum;
    }

    public static int getFinalScores(int sum,int max,int min,int num){
        System.out.println(sum+" "+max+" "+min+" "+(num-2));
        return (sum-max-min) / (num - 2);
    }
}
