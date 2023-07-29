package com.pyw.a25lambda;

import java.util.Arrays;

public class LambdaTest1 {
    public static void main(String[] args) {
        //TODO 需求：定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
        //ps:按照字符串长度排序，短的在前，长的在后，不比较里面的内容
        String[] strings = {"abc","a","ab","weqwqweqweqweq","qwe","dfsd","qweqwe","aqweaxd"};
        Arrays.sort(strings,(String o1,String o2) ->{
            return o1.length() - o2.length();
        });
        System.out.println(Arrays.toString(strings));

        //简写倒序
        Arrays.sort(strings,(o1,o2) -> o2.length() - o1.length());
        System.out.println(Arrays.toString(strings));
    }
}
