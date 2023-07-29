package com.pyw.a49file;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public class test {
    private static HashMap<String,Integer> map = new HashMap();

    public static HashMap fileCount(File file){

        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            //判断是否为文件
            if(listFile.isFile()){
                //切割文件名，用来获取后缀名
                System.out.println(listFile.getName());
                String[] split = listFile.getName().split("\\.");
                Arrays.toString(split);
                String extension = "";
                if(split.length != 0){
                    extension = split[split.length-1];
                }
                //获取后缀名
                if(map.containsKey(extension)){
                    map.put(extension,map.get(extension)+1);
                }else {
                    map.put(extension,1);
                }
            }else {
                fileCount(listFile);
            }
        }
        return map;
    }
}
