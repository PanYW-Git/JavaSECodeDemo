package com.pyw.a47function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class FunctionTest1 {
    public static void main(String[] args) {
        /*
        需求：
             集合中存储一些字符串的数据，比如：张三,23。
             收集到Student类型的数组当中
       */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");
        //2.先把字符串变成Student对象，然后再把Student对象收集起来
        Student[] students = list.stream()
                //注意使用stream转换时需要重写Student的构造方法，让他与map方法中需要重写的方法保持一致
                .map(Student::new)
                //创建新数组接收student
                .toArray(Student[]::new);
        System.out.println(Arrays.toString(students));
    }
}
