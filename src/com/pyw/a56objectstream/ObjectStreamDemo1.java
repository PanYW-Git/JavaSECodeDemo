package com.pyw.a56objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            序列化流

            需求：利用序列化流把一个对象写到本地文件中

           构造方法：
                public ObjectOutputStream(OutputStream out) 把基本流变成高级流

           成员方法：
                public final void writeObject(Object obj) 把对象序列化（写出）到文件中去

            注：使用序列化参考Student类
                1、实现Serializable接口
                2、固定版本号
                3、不想序列化到本地的对象可以加transient
         */

        //1、创建对象
        Student student = new Student("zhangsan",23,"重庆");

        //2、创建序列化流的对象/对象操作输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/pyw/a56objectstream/temp/stu.txt"));

        //3.写出数据
        oos.writeObject(student);//NotSerializableException 需要类中实现Serializable接口

        //4.关闭流
        oos.close();
    }
}
