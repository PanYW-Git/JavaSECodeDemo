package com.pyw.a51charset;

import java.io.FileInputStream;
import java.io.IOException;

public class CharSetDemo1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/com/pyw/a51charset/temp/a.txt");
        int read;
        while ((read = fis.read()) != -1){
            System.out.println((char) read);
        }
        fis.close();
    }
}
