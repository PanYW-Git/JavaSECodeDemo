package com.pyw.a50bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            //TODO 字节输入流循环读取
         */
        FileInputStream fis = new FileInputStream("src\\com\\pyw\\a50bytestream\\temp");

        //注意：调用一个read就会读取一次，读取一次就会移动一次指针
        int input;
        while ((input = fis.read()) !=-1){
            System.out.print((char)input);
        }
        fis.close();
    }
}
