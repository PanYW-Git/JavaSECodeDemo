package com.pyw.a08oop.OOPTest2;

public class GoodsTest {
    public static void main(String[] args) {
        //TODO 定义数组存储3个商品对象
        //创建一个数组
        Goods[] goods = new Goods[3];

        //2.创建3个商品对象
        Goods g1 = new Goods("1","华为手机P40",5999,100);
        Goods g2 = new Goods("2","iphone 14",4999,50);
        Goods g3 = new Goods("3","保温杯",57,20);

        //3.把商品添加到数组中
        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;
        
        //4.遍历数组
        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].toString());
        }
    }
}
