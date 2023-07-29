package com.pyw.a61iotest;

import cn.hutool.core.convert.NumberChineseFormatter;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.RandomUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test3 {

    public static void main(String[] args) {
        /*
            又一个文件里面存储了班级同学的信息，每一个信息占一行
            格式为：张三-男-23
            要求通过程序实现随机点名器

            运行效果：
                第一次运行程序：随机同学姓名1（只显示名字）
                第二次运行程序：随机同学姓名2（只显示名字）
                第三次运行程序：随机同学姓名3（只显示名字）
                ...
         */
        List<String> stus = FileUtil.readLines(new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a61iotest\\test3temp\\stus.txt"), "UTF-8");
        File runFile = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a61iotest\\test3temp\\run.txt");
        int count = Integer.parseInt(FileUtil.readUtf8String(runFile));

        count += 1;
        String countStr = NumberChineseFormatter.format(count, false);
        if(count ==3){
            System.out.println("第" + countStr + "次运行程序：随机同学张三");
        }else {
            Collections.shuffle(stus);
            System.out.println("第" + countStr + "次运行程序：随机同学" + stus.get(0).split("-")[0]);
        }
        File file = FileUtil.writeUtf8String(count+"",runFile);
    }
}
