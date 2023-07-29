package com.pyw.a49file;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.pyw.a49file.test.fileCount;

public class FileTest6 {

    public static void main(String[] args) {
        /**
         * 统计每种文件的个数并打印
         * 如：
         * txt:3个
         * doc:4个
         * jpg:6个
         * */
        String s = "FileDemo1.java";
        System.out.println("=========");
        HashMap countMap = fileCount(new File("src/com/pyw/a49file"));
        countMap.forEach((key,value)-> System.out.println(key+":"+value));
    }


}
