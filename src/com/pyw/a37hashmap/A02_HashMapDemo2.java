package com.pyw.a37hashmap;

import java.util.*;

public class A02_HashMapDemo2 {
    public static void main(String[] args) {
        /*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是（A、B、C、D）,
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */
        //1.需要先让同学们投票
        //定义一个数组，存储4个景点
        String[] areas = {"A","B","C","D"};
        //利用随机数模拟80个同学的投票，并把投票的结果存储起来
        Random r = new Random();
        HashMap<String,Integer> countMap = new HashMap<>();
        //2.如果要统计的东西比较多，不方便使用计数器思想
        //我们可以定义map集合，利用集合进行统计。
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4);
            String area = areas[index];
            if(countMap.containsKey(area)){
                Integer mapArea = countMap.get(area);
                countMap.put(area,++mapArea);
            }else {
                countMap.put(area,1);
            }
        }
//        countMap.put("A",25);
//        countMap.put("B",25);
//        countMap.put("C",5);
//        countMap.put("D",25);
        System.out.println("投票情况：");
        countMap.forEach((key,value)->System.out.println(key+"--->"+value));
        //3.求最大值
        Set<Map.Entry<String, Integer>> entries = countMap.entrySet();
        int max = -1;
        List<String> maxArea = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entries) {
            int value = entry.getValue();
            if(value >= max){
                max = value;
                //有可能几个投票是一样的
                if(value == max){
                    maxArea.add(entry.getKey());
                }else {
                    maxArea.clear();
                    maxArea.add(entry.getKey());
                }
            }
        }
        System.out.println("投票最高的景区为："+maxArea);

    }
}
