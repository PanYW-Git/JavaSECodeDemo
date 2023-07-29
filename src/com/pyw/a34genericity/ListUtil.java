package com.pyw.a34genericity;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){}

    //类中定义一个静态方法addAll，用来添加多个集合的元素

    /*
    * 参数一：集合
    * 参数二~最后：要添加的预算
     */

    //泛型方法：修饰符(例：public static 以上两个都是修饰符)<泛型名称> 返回值类型 方法名称(参数1,参数2,.......)
    //可变参数
    public static<E> void addAll(ArrayList<E> list,E...e){
        for (E elem : e) {
            list.add(elem);
        }
    }
}
