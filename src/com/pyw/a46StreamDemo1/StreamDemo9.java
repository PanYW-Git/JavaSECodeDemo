package com.pyw.a46StreamDemo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamDemo9 {
    public static void main(String[] args) {
        /*
            //TODO Stream流中间方法
            void forEach(Consumer action)           遍历
            long count()                            统计
            toArray()                               收集流中的数据，放到数组中
       */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");


        //对每一个数据进行操作
        //Consumer的泛型：表示流中数据的类型
        //accept方法的形参s：依次表示流里面的每一个数据
        //方法体：对每一个数据的处理操作（打印）
        //返回值为void，所以是终结方法了
        System.out.println("====遍历====");
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.stream().forEach(s -> System.out.println(s));


        //统计
        System.out.println("====统计====");
        long count = list.stream().count();
        System.out.println(count);

        //toArray把结果放到数组中
        //toArray方法的参数的作用：负责创建一个指定类型的数组
        //toArray方法的底层，会一次得到流里面每一个数组，并把他放到数组中
        //toArray方法的返回值，是一个装着流里面所有数组的数组
        //IntFunction的泛型：具体类型的数组
        //apply的形参：流中数据的个数，要跟数组的长度保持一致
        //apply的返回值：具体类型的数组
        //方法体：就是创建数组
        //value：流里面的数组的长度是多少value就是多少
        System.out.println("====toArray把结果放到数组中====");
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("====toArray把结果放到数组中(Lambda)====");
        //Lambda表达式
        String[] arr2 = list.stream().toArray(len -> new String[len]);
        System.out.println(Arrays.toString(arr2));
    }

}
