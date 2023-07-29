package com.pyw.a38linkedhashmap;

import java.util.LinkedHashMap;

public class A01_LinkedHashMapDemo1 {
    public static void main(String[] args) {
        //TODO LinkedHashMap
        /*
            LinkedHashMap:
               由键决定：
                   有序、不重复、无索引。
               有序：
                   保证存储和取出的顺序一致
               原理：
                   底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序。
         */



        //1.创建集合
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        //2.添加元素
        lhm.put("a",123);
        lhm.put("a",111);
        lhm.put("c",789);
        lhm.put("b",456);
        lhm.put("d",101112);

        //3.打印集合
        System.out.println(lhm);

        //遍历与hashmap一致


    }
}
