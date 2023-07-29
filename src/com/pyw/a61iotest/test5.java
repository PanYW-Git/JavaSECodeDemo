package com.pyw.a61iotest;

import cn.hutool.core.io.FileUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test5 {
    public static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。

          运行结果要求：
            被点到的学生不会再被点到。
            但是如果班级中所有的学生都点完了， 需要重新开启第二轮点名。
        核心思想
        点一个删一个
        */
        String studentSrc = "D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a61iotest\\test5temp\\stus.txt";
        String studentBakSrc = "D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a61iotest\\test5temp\\stusbak.txt";
        File file = new File(studentBakSrc);
        file.createNewFile();
        List<String> studentList = FileUtil.readLines(studentSrc, "UTF-8");
        if(studentList.size() == 0){
            FileUtil.moveContent(new File(studentBakSrc),new File(studentSrc),true);
            studentList = FileUtil.readLines(studentSrc, "UTF-8");
        }
        Collections.shuffle(studentList);
        String clickStudent = studentList.get(0);
        System.out.println("当前点到的学生：" + clickStudent);
        studentList.remove(0);
        ArrayList<String> clickStudents = new ArrayList<>();
        clickStudents.add(clickStudent);
        FileUtil.writeLines(clickStudents,studentBakSrc,"UTF-8",true);
        FileUtil.writeLines(studentList,studentSrc,"UTF-8");
    }
}
