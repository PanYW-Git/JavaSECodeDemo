package com.pyw.a61iotest;

import cn.hutool.core.io.FileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test6 {
    public static void main(String[] args) throws IOException {
        //1.把文件中的所有学生信息读取到内存中
        ArrayList<Student> list = new ArrayList<>();
        String src = "src/com/pyw/a61iotest/test6temp/stus.txt";
        BufferedReader br = new BufferedReader(new FileReader(src));
        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split("-");
            String name = split[0];
            String gender = split[1];
            int age = Integer.parseInt(split[2]);
            double weight = Double.parseDouble(split[3]);
            list.add(new Student(name, gender, age, weight));
        }
        br.close();
        System.out.println(list);

        //计算权重总和
        double weight = 0;
        for (Student stu : list) {
            weight += stu.getWeight();
        }
        System.out.println(weight);

        //计算每一个人的实际比重
        double[] studentWeight = new double[list.size()];
        int index = 0;
        for (Student stu : list) {
            studentWeight[index] = stu.getWeight() / weight;
            index++;
        }
        System.out.println("每个人的实际权重："+Arrays.toString(studentWeight));
        //4.计算每一个人的权重占比范围
        for (int i = 1; i < studentWeight.length; i++) {
            studentWeight[i] = studentWeight[i] + studentWeight[i - 1];
        }
        System.out.println("每个人的权重范围："+Arrays.toString(studentWeight));

        //5.随机抽取
        //获取0.0~1.0之间的随机数
        double number = Math.random();
        System.out.println("随机0.0~1.0");
        //判断number在arr中的位置
        //二分查找
        //返回值： - 插入点 -1

        //获取number这个数据在数组中的插入点位置
        //结果 = - 插入点 -1
        //插入点 = - 结果 -1
        int indexPoint = -Arrays.binarySearch(studentWeight, number) - 1;

        Student randomStudent = list.get(indexPoint);
        System.out.println(randomStudent);

        //6.修改当前学生权重
        randomStudent.setWeight(randomStudent.getWeight() / 2);
        System.out.println(list);

        //7.把集合放到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter(src));
        for (Student student : list) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
    }
}
