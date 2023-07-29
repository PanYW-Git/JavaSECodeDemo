package com.pyw.a08oop.OOPTest2;

import java.util.Scanner;

public class GoodsTest2 {
    public static void main(String[] args) {
        //TODO 定义数组存储三部汽车对象
        //汽车属性，品牌，价格，颜色
        //创建三个汽车对象存储到数组当中
        Goods2[] goods = new Goods2[3];
        Scanner sc = new Scanner(System.in);
        Goods2 g1 = new Goods2();
        for (int i = 0; i < 3; i++) {
            System.out.println("请录入品牌");
            String brand = sc.next();
            System.out.println("请录入价格");
            double price = sc.nextDouble();
            System.out.println("请录入颜色");
            String color = sc.next();
            goods[i] = new Goods2(brand,price,color);
        }

        //打印数组
        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i]);
        }
        //计算平均数
        double sum = 0.0;
        //计算三部车的平均价格
        for (int i = 0; i < goods.length; i++) {
            sum +=goods[i].getPrice();
        }
        double avg = sum/goods.length;
        System.out.println("平均数为："+avg);

        //计算比价格平均值低的对象有几个，并打印
        int count = 0;
        for (int i = 0; i < goods.length; i++) {
            if(goods[i].getPrice()<avg){
                count++;
                System.out.println(goods[i].toString());
            }
        }
    }
}
