package com.pyw.a17regex;

public class RegexDemo8 {
    public static void main(String[] args) {

        //TODO 字符串按照正则表达式切割/替换字符串
        //public string replaceAll(string regex,string newstr) 按照正则表达式的规则进行替换
        //public string[] split(string regex): 按照正则表达式的规则切割字符串

        /*
            有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
            要求1:把字符串中三个姓名之间的字母替换为vs
            要求2:把字符串中的三个姓名切割出来*/

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        //细节:
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就用第一个参数去替换。
        //要求1:把字符串中三个姓名之间的字母替换为vs
        String regex = "[\\w&&[^_]]+";
        String sEeplaceAll = s.replaceAll(regex, "vs");
        System.out.println(sEeplaceAll);

        //要求2:把字符串中的三个姓名切割出来
        String[] split = s.split(regex);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
