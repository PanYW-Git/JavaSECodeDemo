package com.pyw.a17regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args) {
        //贪婪爬取 非贪婪爬取
        /*
            只写+和*表示贪婪匹配

            +? 非贪婪匹配
            *? 非贪婪匹配

            贪婪爬取:在爬取数据的时候尽可能的多获取数据
            非贪婪爬取:在爬取数据的时候尽可能的少获取数据

            ab+:
            贪婪爬取:abbbbbbbbbbbb
            非贪婪爬取:ab

            默认贪婪爬取
            如果我们在数量词+  * 的后面加上问好，那就是非贪婪爬取
        */
        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "经历了很多版木，目前企业中用的最多的是]ava8和]ava11，因为这两个是长期支持版木。" +
                "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        String regex = "ab+";
        String regex1 = "ab+?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
