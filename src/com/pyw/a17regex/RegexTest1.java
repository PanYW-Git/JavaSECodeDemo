package com.pyw.a17regex;

public class RegexTest1 {
    public static void main(String[] args) {
        /*
            TODO 需求 验证手机号码 验证座机电话号码 验证邮箱号码
            请编写正则表达式验证用户输入的手机号码是否满足要求。请编写正则表达式验证用户输入的邮箱号是否满足要求。请编写正则表达式验证用户输入的电话号码是否满足要求。
            验证手机号码 13112345678 13712345667 13945679027 139456790271
            验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
            验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        */

        //心得:
        //拿着一个正确的数据，从左到右依次去写。
        //13112345678
        //分成三部分:
        //第一部分:1 表示手机号码只能以1开头
        //第二部分:[3-9] 表示手机号码第二位只能是3-9之间的
        //第三部分:\\d{9} 表示任意数字可以出现9次，也只能出现9次
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));
        System.out.println("13712345667".matches(regex1));
        System.out.println("13945679027".matches(regex1));
        System.out.println("139456790271".matches(regex1));

        System.out.println("=========座机号码========");
        //验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
        //-? 一次或者0次
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));

        System.out.println("=========邮箱编号========");
        //邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        //第一部分：@的左边 可以是数字和字母 \w+任意字母数字下划线至少出现一次
        //第二部分：@ 只能出现一次
        //第三部分： 3.1 .的左边[\w&&^_]{2,10}
        String regex3 = "\\w+@[\\w&&[^_]]{2,10}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));

        //插件 any-rule 有常用的正则表达式
        //24小时正则表达式
        String regex4 = "(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";

    }
}
