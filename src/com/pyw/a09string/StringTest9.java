package com.pyw.a09string;

public class StringTest9 {
    public static void main(String[] args) {
        //TODO 给定两个字符串,A和 B。A的旋转操作就是将A最左边的字符移动到最右边
        //例如,若A='abcde'，在移动一次之后结果就是'bcdea'
        // 如果在若干次调整操作之后，A 能变成B，那么返回True。如果不能匹配成功，则返回false
        String strA = "abcdefg";
        String strB = "defgabc";

        //方法一
//        System.out.println("最终结果："+checkStrAAndStrB(strA, strB));





        //方法二
        String strATemp = strA;
        boolean flag = false;
        for (int i = 0; i < strA.length() - 1; i++) {
            strATemp = rotate(strATemp);
            if(strATemp.equals(strB)){
                flag = true;
                System.out.println("成功！当前循环次数为"+ (i+1) +"次 替换的结果：" + strATemp);
                break;
            }
            else {
                System.out.println("失败！当前循环次数为"+ (i+1) +"次 替换的结果：" + strATemp);

            }
        }
    }

    //方法1
    //这个方法是左右替换，与题目不太符合
    public static boolean checkStrAAndStrB(String strA,String strB){
        boolean flag = false;
        String tempStr = "";

        for (int i = 0; i < strA.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < strA.length(); j++) {


                if(j == i){
                    //替换前一个
                    sb.append(strA.charAt(strA.length() - 1 - j));
                }else if(j == strA.length() - 1 - i){
                    //替换后一个
                    sb.append(strA.charAt(i));
                }else {
                    sb.append(strA.charAt(j));
                }
            }
            strA = sb.toString();

            if(strA.equals(strB)){
                System.out.println("成功！当前循环次数为"+ (i+1) +"次 替换的结果：" + sb);
                flag = true;
                break;
            }else {
                System.out.println("失败！当前循环次数为"+ (i+1) +"次 替换的结果：" + sb);
                flag = false;
            }


        }

        return flag;
    }

    //方法2
    public static String rotate(String str){
        //获取第一个字符，然后再截取后续所有字符
        char first = str.charAt(0);

        String end = str.substring(1);

        return end + first;
    }

}
