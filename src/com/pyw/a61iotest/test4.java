package com.pyw.a61iotest;

import cn.hutool.core.convert.NumberChineseFormatter;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        /*需求：
            一个文件里面存储了班级同学的信息，格式为：张三-男-23
            每一个学生信息占一行。
            要求通过程序实现随机点名器。
            70%的概率随机到男生
            30%的概率随机到女生
            随机100万次，统计结果。看生成男生和女生的比例是不是接近于7：3
        */

        List<String> stus = FileUtil.readLines(new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a61iotest\\test3temp\\stus.txt"), "UTF-8");

        //存储男生女生
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> grilList = new ArrayList<>();

        //把stus里面的学生分别放入男生女生集合中
        for (String stu : stus) {
            String[] splitStu = stu.split("-");
            if("男".equals(splitStu[1])){
                boyList.add(splitStu[0]);
            }else {
                grilList.add(splitStu[0]);
            }
        }
        System.out.println(boyList);
        System.out.println(grilList);
        Random r = new Random();
        int boyCount = 0;
        int girlCount = 0;
        for (int i = 0; i < 1000000; i++) {
            int ran = r.nextInt(10)+1;
            if(ran<=3){
                Collections.shuffle(boyList);
                System.out.println(boyList.get(0));
                boyCount++;
            }else {
                Collections.shuffle(grilList);
                System.out.println(grilList.get(0));
                girlCount++;
            }
        }

        System.out.println("boy:"+boyCount);
        System.out.println("girl:"+girlCount);
    }
}
