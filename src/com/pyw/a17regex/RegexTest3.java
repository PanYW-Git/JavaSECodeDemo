package com.pyw.a17regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest3 {
    public static void main(String[] args) {
        //TODO 把下面文本中的座机电话，邮箱，手机号，热线都爬取出来
                /*
            需求:把下面文本中的座机电话，邮箱，手机号，热线都爬取出来。
            来黑马程序员学习Java，
            手机号:18512516758，18512508907或者联系邮箱:boniu@itcast.cn，
            座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn，
            热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090

            手机号的正则表达式:1[3-9]\d{9}
            邮箱的正则表达式:\w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}座机电话的正则表达式:θ\d{2,3}-?[1-9]\d{4,9}
            热线电话的正则表达式:400-?[1-9]\\d{2}-?[1-9]\\d{3}

        */
        String str = "     来黑马程序员学习Java，\n" +
                "手机号:18512516758，18512508907或者联系邮箱:boniu@itcast.cn，\n" +
                "座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn，\n" +
                "热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090\n" +
                "手机号的正则表达式:1[3-9]\\d{9}\n" +
                "邮箱的正则表达式:\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}座机电话的正则表达式:θ\\d{2,3}-?[1-9]\\d{4,9}\n" +
                "热线电话的正则表达式:400-?[1-9]\\d{2}-?[1-9]\\d{3}";
        String regexPhone = "(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                "|(0\\\\d{2,3}-?[1-9]\\\\d{4,9})" +
                "|(400-?[1-9]\\d{2}-?[1-9]\\d{3})";
        Pattern p = Pattern.compile(regexPhone);
        Matcher matcherPhone = p.matcher(str);


        while (matcherPhone.find()){
            String group = matcherPhone.group();
            System.out.println("手机号码：");
            System.out.println(group);
        }
    }
}
