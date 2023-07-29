package com.pyw.a79xml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class XMLDemo2 {
    public static void main(String[] args) throws IOException {
        //写出到本地XML，建议不用dom4j框架，太麻烦，直接拼接就可以了
        /*
        <book>
            <name>从入门到跑路</name>
            <author>zhangsan</author>
            <price>119.98</price>
        </book>
         */
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        sb.append("<book>\n");
        sb.append("\t<name>").append("从入门到跑路").append("</name>\n");
        sb.append("\t<author>").append("zhangsan").append("</author>\n");
        sb.append("\t<price>").append("119.98").append("</price>\n");
        sb.append("</book>\n");

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/pyw/a79xml/XMLDemo2.xml"));
        bw.write(sb.toString());
        bw.close();
    }
}
