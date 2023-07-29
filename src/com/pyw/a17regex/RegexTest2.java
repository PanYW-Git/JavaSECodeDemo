package com.pyw.a17regex;

public class RegexTest2 {
    public static void main(String[] args) {
                /*
            正则表达式练习:
            需求
            请编写正则表达式验证用户名是否满足要求。要求:大小写字母，数字，下划线一共4-16位请编写正则表达式验证身份证号码是否满足要求。
            简单要求:18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x复杂要求:按照身份证号码的格式严格要求。

            身份证号码:
            41080119930228457x
            510801197609022309
            15040119810705387X
            130133197204039024
            430102197606046442
        */

        //用户名要求：大小写字母，数字，下划线一共4~16位
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        System.out.println("lisi".matches(regex1));
        System.out.println("wangwu".matches(regex1));

        System.out.println("=====身份证=====");
        //身份证号码的简单校验
//        String regex2 = "[1-9]\\d{16}(\\d|X|x)";
        //也可以这样写
        String regex2 = "[1-9]\\d{16}[\\dXx]";
        System.out.println("41080119930228457x".matches(regex2));
        System.out.println("510801197609022309".matches(regex2));
        System.out.println("15040119810705387X".matches(regex2));
        System.out.println("130133197204039024".matches(regex2));

        System.out.println("======身份证精确校验=====");
        //身份证号码的严格校验
        //前面6位：身份，市区，派出所等信息，第一位不能是0，后面5位是数字
        //年的前半段： 18 19 20
        //年的后半段： 任意数字出现两次
        //月： 01~09 11 12
        //日： 01~31
        //后面四位： 任意数字出现3次，最后一位可以的数字也可以是大写X或者小写x
        String regex3 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("41080119930228457x".matches(regex3));
        System.out.println("510801197609022309".matches(regex3));
        System.out.println("15040119810705387X".matches(regex3));
        System.out.println("130133197204039024".matches(regex3));


    }
}
