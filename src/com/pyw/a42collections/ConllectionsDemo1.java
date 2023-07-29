package com.pyw.a42collections;

import java.util.ArrayList;
import java.util.Collections;

public class ConllectionsDemo1 {
    /*
        public static <T> boolean addAll(Collection<T> c, T... elements)        批量添加元素
        public static void shuffle(List<?> list)                                打乱List集合元素的顺序
     */
    public static void main(String[] args) {
        //addAll  批量添加元素
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"123","abc","defg","hijk","456");
        System.out.println(list);

        //2.打乱集合
        Collections.shuffle(list);

        System.out.println(list);
    }
}
