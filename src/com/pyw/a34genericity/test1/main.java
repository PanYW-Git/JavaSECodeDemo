package com.pyw.a34genericity.test1;

import com.pyw.a34genericity.test1.domain.*;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        /*
            需求：
                定义一个继承结构：
                                    动物
                         |                           |
                         猫                          狗
                      |      |                    |      |
                   波斯猫   狸花猫                泰迪   哈士奇


                 属性：名字，年龄
                 行为：吃东西
                       波斯猫方法体打印：一只叫做XXX的，X岁的波斯猫，正在吃小饼干
                       狸花猫方法体打印：一只叫做XXX的，X岁的狸花猫，正在吃鱼
                       泰迪方法体打印：一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
                       哈士奇方法体打印：一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家

            测试类中定义一个方法用于饲养动物
                public static void keepPet(ArrayList<???> list){
                    //遍历集合，调用动物的eat方法
                }
            要求1：该方法能养所有品种的猫，但是不能养狗
            要求2：该方法能养所有品种的狗，但是不能养猫
            要求3：该方法能养所有的动物，但是不能传递其他类型
         */
        ArrayList<BossCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TidiDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();
        ArrayList<Test1> tests = new ArrayList<>();

        LiHuaCat l1 = new LiHuaCat();
        l1.setName("LiHua");
        l1.setAge(3);
        list2.add(l1);

        Test1 test = new Test1();
        tests.add(test);

        keepPet(list1);
        keepPet(list2);
        //不能传狗
//        keepPet(list3);
//        keepPet(list4);

        //不能传猫
//        keepPet2(list1);
//        keepPet2(list2);

        keepPet2(list3);
        keepPet2(list4);

        //所有动物都能传
        keepPet3(list1);
        keepPet3(list2);
        keepPet3(list3);
        keepPet3(list4);
        keepPet3(tests);
    }

    //要求1：该方法能养所有品种的猫，但是不能养狗
    public static void keepPet(ArrayList<? extends Cat> list){
        for (Cat cat : list) {
            cat.eat();
        }
    }

    //要求1：该方法能养所有品种的猫，但是不能养狗
    public static void keepPet2(ArrayList<? extends Dog> list){

    }

    //要求3：该方法能养所有的动物，但是不能传递其他类型
    public static void keepPet3(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
