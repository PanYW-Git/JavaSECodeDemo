package com.pyw.a53streamtest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.function.Function;

public class StreamTest4 {
    public static void main(String[] args) throws IOException {
        /*
            文本文件中有以下的数据
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
         */


        //1.读取数据
        FileReader fr = new FileReader("src/com/pyw/a53streamtest/temp1/a..txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        //2.排序


        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        //3.写出
        FileWriter fw = new FileWriter("src/com/pyw/a53streamtest/temp1/a..txt");
        String str = Arrays.toString(arr);
        str = str.replace(", ","-");
        str = str.substring(1, str.length()-1);
        fw.write(str);
        fw.close();
    }
}
