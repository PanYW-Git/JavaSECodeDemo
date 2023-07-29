package com.pyw.a46StreamDemo1;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //TODO 一堆零散数据   public static<T> Stream<T> of(T... values)   Stream接口中的静态方法

        //类型必须一致
        Stream.of(1,2,3,4,5).forEach(str -> System.out.println(str));
        //引用数据类型
        Stream.of("a","b","c").forEach(str -> System.out.println(str));




    }
}
