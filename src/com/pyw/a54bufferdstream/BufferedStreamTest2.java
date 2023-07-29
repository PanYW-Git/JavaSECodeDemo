package com.pyw.a54bufferdstream;

import java.io.*;
import java.util.*;

public class BufferedStreamTest2 {

    public static void main(String[] args) throws IOException {
        /*
            恢复出师表
         */

        //创建TreeMap集合用于接收数据，且根据TreeMap的特性会自动升序
        TreeMap<Integer,String> tm = new TreeMap<>();
        //读取文件
        BufferedReader br = new BufferedReader(new FileReader("src/com/pyw/a54bufferdstream/temp/csb.txt"));
        String line;
        while ((line = br.readLine()) != null){
            //获取键值
            int key = Integer.parseInt(line.substring(0,1));
            String value = line;
            tm.put(key,value);
        }
        br.close();

        //排序省略
        //写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/pyw/a54bufferdstream/temp/csbSort.txt"));
        Set<Map.Entry<Integer,String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();

    }
}
