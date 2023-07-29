package com.pyw.a16api;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //TODO BigDecimal 解决小数运算错误问题

        //double运算不精确，因为double的小数只存储52位，超出这个位数的会被舍弃
        //实例：
        System.out.println(0.09 + 0.01);
        System.out.println(0.216 - 0.1);
        System.out.println(0.226 * 0.01);
        System.out.println(0.09 / 0.1);

        /*
            构造方法获取BigDecimal对象
            public BigDecimal(double val) public BigDecimal(string val)

            静态方法获取BigDecimal对象
            public static BigDecimal valuef(double val)
        */

        System.out.println("==========BigDecimal==========");
        //1.通过传递double类型的小数来创建对象
        //细节:
        //这种方式有可能是不精确的，所以不建议使用！！！
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1);
        System.out.println(bd2);

        //通过传递字符串表示的小数来创建对象
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);

        //3.通过静态方法获取对象
        //细节:
        //1.如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
        //2.如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
        //3.如果我们传递的是0~10之间的整数，包含0，包含10，那么方法会返回已经创建好的对象，不会重新new
        BigDecimal bd6 = BigDecimal.valueOf(10);
        BigDecimal bd7 = BigDecimal.valueOf(10);
        System.out.println(bd6 == bd7);


        System.out.println("==========计算===========");
        //计算
        /*
            public BigDecimal add(BigDecimal val) 加法
            public BigDecimal subtract(BigDecimal val) 减法
            public BigDecimal multiply(BigDecimal val) 乘法
            public BigDecimal divide(BigDecimal val) 除法
            public BigDecimal divide(BigDecimal val，精确几位，舍入模式)除法
        */
        //1.加法
        BigDecimal bd8 = BigDecimal.valueOf(10.0);
        BigDecimal bd9 = BigDecimal.valueOf(2.0);
        BigDecimal bd10 = bd8.add(bd9);
        System.out.println(bd10);

        //2.减法
        BigDecimal bd13 = bd8.subtract(bd9);
        System.out.println(bd13);

        //3.乘法
        BigDecimal bd11 = bd8.multiply(bd9);
        System.out.println(bd11);//20.00

        //4.除法
        //四舍五入
        BigDecimal bd12 = bd8.divide(bd9, 2, RoundingMode.HALF_UP);
        System.out.println(bd12);//3.33
    }
}
