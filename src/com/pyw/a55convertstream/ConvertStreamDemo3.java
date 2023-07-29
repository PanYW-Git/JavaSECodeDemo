package com.pyw.a55convertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            将本地文件中的GBK文件，转成UTF-8
         */

        /*
            将本地文件中的GBK文件，转成UTF-8
        */


        //1.JDK11以前的方案
       /* InputStreamReader isr = new InputStreamReader(new FileInputStream("myio\\b.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myio\\d.txt"),"UTF-8");

        int b;
        while((b = isr.read()) != -1){
            osw.write(b);
        }

        osw.close();
        isr.close();*/

        //替代方案
        FileReader fr = new FileReader("src/com/pyw/a55convertstream/temp/gbkfile.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("src/com/pyw/a55convertstream/temp/gbkfiletouft-8.txt",Charset.forName("UTF-8"));

        int b;
        while ((b = fr.read()) != -1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
