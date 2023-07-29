package com.pyw.a62properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        //1.创建集合
        Properties prop = new Properties();
        //2.读取本地Properties文件里面的数据
        FileInputStream fis = new FileInputStream("myiotest\\a.properties");
        prop.load(fis);
        fis.close();

        //3.打印集合
        System.out.println(prop);
    }
}
