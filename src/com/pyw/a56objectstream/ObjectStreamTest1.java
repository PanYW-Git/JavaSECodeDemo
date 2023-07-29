package com.pyw.a56objectstream;

import java.io.*;
import java.util.ArrayList;

public class ObjectStreamTest1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
            需求：
                将多个自定义对象序列化到文件中，但是对象的个数不确定，如何操作？
            多个对象序列化约定：
                把多个对象装到一个集合中去，序列化使用这个集合，读取也使用这个集合
         */
        //序列化
        outputStus();
        //反序列化
        inputStus();
    }

    private static void inputStus() throws IOException, ClassNotFoundException {
        //反序列化stu到程序中
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/pyw/a56objectstream/temp/stus.txt"));
        ArrayList students = (ArrayList) ois.readObject();
        for (Object student : students) {
            System.out.println(student);
        }
        ois.close();
    }

    /**
     * 序列化stu到本地
     * @throws IOException
     */
    private static void outputStus() throws IOException {
        //序列化stu到本地
        //创建对象
        ArrayList<Student> students = new ArrayList<>();
        Student stu1 = new Student("张三",23,"重庆");
        Student stu2 = new Student("李四",18,"北碚");
        Student stu3 = new Student("王五",19,"万州");

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        //1、序列化多个对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/pyw/a56objectstream/temp/stus.txt"));
        //2.放入本地
        oos.writeObject(students);
        //3.关闭流
        oos.close();
    }
}
