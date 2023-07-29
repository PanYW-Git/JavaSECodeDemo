package com.pyw.a46StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        /*
        //TODO 将两个集合合并后再转为自定义封装对象练习
        现在有两个ArrayList集合，分别存储6名男演员的名字和年龄以及6名女演员的名字和年龄。
        姓名和年龄中间用逗号隔开。
        比如：张三,23
        要求完成如下的操作：
        1，男演员只要名字为3个字的前两人
        2，女演员只要姓杨的，并且不要第一个
        3，把过滤后的男演员姓名和女演员姓名合并到一起
        4，将上一步的演员信息封装成Actor对象。
        5，将所有的演员对象都保存到List集合中。
        备注：演员类Actor，属性有：name，age

        男演员：  "蔡坤坤,24" , "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27"
        女演员：  "赵小颖,35" , "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33"
      */
        ArrayList<String> actor = new ArrayList<>();
        Collections.addAll(actor,"蔡坤坤,24" , "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");

        ArrayList<String> actress = new ArrayList<>();
        Collections.addAll(actress,"赵小颖,35" , "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        //1，男演员只要名字为3个字的前两人
        int count = 0;
        List<String> newActor = actor.stream()
                //获取名字为三个字
                .filter(s -> s.split(",")[0].length() == 3)
                //获取前两个数据
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(newActor);

        List<String> newActress = actress.stream()
                //获取名字为杨开头的
                .filter(s -> s.startsWith("杨"))
                //获取第一个数据
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(newActress);

        List<Actor> actorList = Stream.concat(newActor.stream(), newActress.stream())
                .map(s -> new Actor(s.split(",")[0], Integer.valueOf(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(actorList);
    }
}
