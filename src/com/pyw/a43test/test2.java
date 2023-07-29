package com.pyw.a43test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        //TODO 自动点名器 70%概率随机到男生，30%随机到女生
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");
        Collections.addAll(girlList, "杜琦燕", "袁明媛", "李猜", "田蜜蜜");
        //创建随机数,设置比例70%30% 1表示男生，2表示女生
        int[] percentage = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        Random r = new Random();

        int boyCount = 0;
        int girlCount = 0;
        while (boyCount + girlCount <= 10000) {
            int percentageIndex = r.nextInt(10);
            if (percentage[percentageIndex] == 1) {
                //男生
                int boyIndex = r.nextInt(boyList.size());
                System.out.println(boyList.get(boyIndex));
                boyCount++;

            } else {
                //女生
                int girlIndex = r.nextInt(girlList.size());
                System.out.println(girlList.get(girlIndex));
                girlCount++;
            }
        }
        System.out.println(boyCount+"  "+girlCount);

    }
}
