package com.pyw.a50bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
         * //TODO 演示：字节输出流FileOutputStream
         * 实现需求：写出一段文字到本地文件中。（暂时不写中文）
         *
         * 实现步骤：
         *       创建对象
         *          细节1：参数是字符串表示的路径或者是File对象都是可以的
         *          细节2：文件不存在会创建新的文件，要保证父级路径是存在的
         *          细节3：如果文件已存在则会清空文件
         *       写出数据
         *          细节：write方法的参数是整数，但实际上写道本地文件中的是整数在ASII上对呀的字符
         *          97 -> a
         *          100-> d
         *       释放资源
         *          每次使用完流之后都要释放资源
         * */

        //1.创建对象
        //写出 输出流 OutputStream
        //本地文件 FileOutputStream
        FileOutputStream fos = new FileOutputStream("src\\com\\pyw\\a50bytestream\\temp\\a.txt");
        //2.写出数据
        fos.write(97);//输出a
        //3。释放资源
        fos.close();
    }
}
