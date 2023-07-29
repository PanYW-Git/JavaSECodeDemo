package com.pyw.a61iotest;

import java.io.File;
import java.io.IOException;

public class s {
    public static void main(String[] args) throws IOException {
        String studentBakSrc = "D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a61iotest\\test5temp\\stusbak.txt";
        File file = new File(studentBakSrc);
        file.createNewFile();
    }
}
