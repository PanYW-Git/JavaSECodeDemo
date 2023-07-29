package com.pyw.a48exceptionDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionDemo6 {
    public static void main(String[] args) throws IOException {
        /*
            //TODO 自己处理（捕获异常）
            格式：
                try {
                   可能出现异常的代码;
                } catch(异常类名 变量名) {
                   异常的处理代码;
                } finally{
                    一定会执行的代码，除非JVM退出
                }
             好处:可以让程序继续往下执行，不会停止
         */


        int[] arr = {1, 2, 3, 4, 5, 6};
        try{
            //可能出现异常的代码;
            System.out.println(arr[10]);//此处出现了异常，程序就会在这里创建一个ArrayIndexOutOfBoundsException对象
                                        //new ArrayIndexOutOfBoundsException();
                                        //拿着这个对象到catch的小括号中对比，看括号中的变量是否可以接收这个对象
                                        //如果能被接收，就表示该异常就被捕获（抓住），执行catch里面对应的代码
                                        //当catch里面所有的代码执行完毕，继续执行try...catch体系下面的其他代码
        }catch(ArrayIndexOutOfBoundsException e){
            //如果出现了ArrayIndexOutOfBoundsException异常，我该如何处理
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗？");

        FileOutputStream fos = new FileOutputStream("src\\com\\pyw\\a50bytestream\\temp\\a.txt");
        try {
            //1.创建对象
            //写出 输出流 OutputStream
            //本地文件 FileOutputStream
            //2.写出数据
            fos.write(97);//输出a
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //一定会执行的代码，除非JVM退出
            //3。释放资源
            fos.close();
        }

    }
}
