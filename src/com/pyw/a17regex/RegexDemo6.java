package com.pyw.a17regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        //TODO 带有选择性的数据爬取
                /*
            有如下文本，按要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台


            TODO 需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
            需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
            需求3:爬取除了版本号为8，11.17的Java文本，
        */
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        String str1 = "JAva自从95年问世以来，经历了很多版本，目前企业中用的最多的是JaVA8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是JavA17，相信在未来不久JAVA17也会逐渐登上历史舞台";


        //1.定义正则表达式
        //?表示前面的数据
        //=表示需要拼接哪些东西
        //但是在获取的时候，只获取前半部分
        //需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
        String regex = "Java(?=8|11|17)";
        //忽略大小写(?i)
        String regex1 = "(?i)Java(?=8|11|17)";

        //需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
        String regex2 = "(?i)Java(8|11|17)";
        //?:获取整体全部的东西
        String regex3 = "(?i)Java(?:8|11|17)";

        //需求3:爬取除了版本号为8，11.17的Java文本，
        //?!除去哪些
        String regex4 = "(?i)Java(?!8|11|17)";

        Pattern p = Pattern.compile(regex4);
        Matcher matcher = p.matcher(str1);
        while (matcher.find()){
            String group = matcher.group();
            System.out.println(group);
        }
    }
}
