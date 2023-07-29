package com.pyw.a41variableparameter;

public class ArgsDemo1 {
    public static void main(String[] args) {
       /*
        假如需要定义一个方法求和，该方法可以灵活的完成如下需求：
        计算2个数据的和
        计算3个数据的和
        计算4个数据的和
        计算n个数据的和

        可变参数形参格式：数据类型...数据名
            这样定义可以传输任意长度的参数

        底层：
            底层就是一个数组，不过不需要我们自己创建，java会帮我们创建好
        小细节
            1.在方法的形参中最多只能写一个可变参数
            2.在方法中，如果除了可变参数的其它形参，那么可变参数要写在最后
       */

        System.out.println(getSum(10,20));
        System.out.println(getSum(10,20,30));
        System.out.println(getSum(10,20,30,40));
        System.out.println(getSum(10,20,30,40,50,60));


    }


    //计算2个数据的和
    public static int getSum(int a, int b) {
        return a + b;
    }

    //计算3个数据的和
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    //计算4个数据的和
    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int getSum(Integer...a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }


}
