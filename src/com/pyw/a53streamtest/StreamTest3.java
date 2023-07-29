package com.pyw.a53streamtest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;

public class StreamTest3 {
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
        while ((ch = fr.read()) != -1){
            sb.append((char) ch);
        }
        fr.close();
        //2.排序
        String str = sb.toString();
        String[] arrStr = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrStr) {
            list.add(Integer.parseInt(s));
        }

        Collections.sort(list);
        System.out.println(list);

        //写出
        FileWriter fw = new FileWriter("src/com/pyw/a53streamtest/temp1/a..txt");
        StringJoiner sj = new StringJoiner("-","","");
        for (Integer integer : list) {
            sj.add(integer+"");
        }
        fw.write(sj.toString());

        fw.close();
    }
}
