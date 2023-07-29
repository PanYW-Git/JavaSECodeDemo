package com.pyw.a46StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        /*
            TODO 把1~10添加进集合，过滤奇数，只留下偶数将结果保存起来
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> list1 = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
