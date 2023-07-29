package com.pyw.a07method;

public class MethodTest3 {
    public static void main(String[] args) {
        //定义两个方法，比较两个长方形的面积
        System.out.println(getCheck(5, 10, 7, 8));
    }

    //求长方形面积方法
    public static double getArea(double width,double height){
        return width * height;
    }

    //比较面积
    public static String getCheck(double width1,double height1,double with2 ,double height2){
        double v1 = getArea(width1,height1);
        double v2 = getArea(with2,height2);
        return v1 > v2 ? "长方形1的面积为："+v1+" 长方形2的面积为："+v2+"传入的1比较大面积为："+v1:"长方形1的面积为："+v1+" 长方形2的面积为："+v2+"传入的2比较大面积为："+v2;
    }
}
