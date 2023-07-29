package com.pyw.a79xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XMLDemo1 {
    public static void main(String[] args) throws DocumentException {
        /*
            TODO 解析XML文件
         */

        //1.创建一个Dom4J框架提供的解析器对象
        SAXReader saxReader = new SAXReader();

        //2.使用saxReader对象，把需要解析的XML文件读成一个Document对象
        Document document = saxReader.read("src/com/pyw/a79xml/XMLDemo1.xml");

        //3.从文档对象中解析XML文件的全部数据
        Element rootElement = document.getRootElement();
        System.out.println("根元素名称："+rootElement.getName());

        //4.获取根元素下的全部一级子元素，
//        List<Element> elements = rootElement.elements();
        //获取根元素下的指定一级子元素
        List<Element> elements = rootElement.elements("user");
        for (Element element : elements) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("一级子元素"+element.getName());
        }


        //获取单个一级子元素
        Element user = rootElement.element("user");

        //5.获取元素的属性值（指定属性）
        System.out.println("======获取元素的属性值（指定属性）======");
        Attribute id = user.attribute("id");
        System.out.println("一级子元素的属性名"+id.getName());
        System.out.println("一级子元素的属性值"+id.getValue());
        //获取元素的属性值（全部属性）
        System.out.println("======获取元素的属性值（全部属性）======");
        List<Attribute> attributes = user.attributes();
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName()+":"+attribute.getValue());
        }

        //获取全部的文本内容，获取当前元素下的子元素文本值
        System.out.println("=====获取全部的文本内容，获取当前元素下的子元素文本值======");
        System.out.println(user.elementText("name"));
        System.out.println(user.elementText("sex"));

        Element data = rootElement.element("data");
        //获取文本
        System.out.println("=====获取文本======");
        System.out.println(data.getText());
        //获取文本（去除空格）
        System.out.println("=====获取文本（去除前后空格）======");
        System.out.println(data.getTextTrim());

    }
}
