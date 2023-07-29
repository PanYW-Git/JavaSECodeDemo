package com.pyw.a61iotest;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {

    public static void main(String[] args) throws IOException {
    /*
        TODO 制造假数据

             获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
             获取男生名字：http://www.haoming8.cn/baobao/10881.html
             获取女生名字：http://www.haoming8.cn/baobao/7641.html
     */

        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据，把网址上的数据拼接成一个字符串
        String familyNameStr = webCrawier(familyNameNet);
        String boyNameStr = webCrawier(boyNameNet);
        String girlNameStr = webCrawier(girlNameNet);

//        System.out.println(familyNameStr);
//        System.out.println(boyNameStr);
//        System.out.println(girlNameStr);
        //3.通过正则表达式，把其中符合要求的数据获取出来
        ArrayList<String> familyNameTempList = getdate(familyNameStr, "(.{4})(，|。)", 1);//任意数据4个，后面可以是逗号可以是句号
        ArrayList<String> boyNameTempList = getdate(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);//获取两个汉字后面是、或。号的数据
        ArrayList<String> girlNameTempList = getdate(girlNameStr, "(.. ){4}..", 0);//两个中文+空格的组合出现4次

        //4.处理数据
        //姓名
        //把每一个姓拆开并添加到一个新的集合中
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                familyNameList.add(str.charAt(i) + "");
            }
        }
        System.out.println("姓集合：" + familyNameList);

        //男生名字
        //去重
        List<String> boyNameList = boyNameTempList.stream().distinct().toList();
        System.out.println("男生名集合：" + boyNameList);

        ArrayList<String> girlNameList = new ArrayList<>();
        //女生姓名
        //四个一组，空格隔开
        for (String str : girlNameTempList) {
            String[] temp = str.split(" ");
            for (int i = 0; i < temp.length; i++) {
                girlNameList.add(temp[i]);
            }
        }
        System.out.println("女生名集合：" + girlNameList);

        //5.生成数据
        //姓名（唯一）-性别-年龄
        ArrayList<String> infos = getInfos(familyNameList, boyNameTempList, girlNameList, 10, 20);
        System.out.println("生成的随机集合："+infos);

        //写入到本地文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/pyw/a61iotest/test3temp/stus.txt"));
        for (String info : infos) {
            bw.write(info);
            bw.newLine();
        }
        bw.close();

    }

    /**
     * 获取男生和女生的信息：张三（唯一）-男-23
     *
     * @param familyNameList 姓氏集合
     * @param boyNameList    男生名集合
     * @param girlNameList   女生名集合
     * @param createBoyNum   生成男生数量
     * @param creategrilNum  生成女生数量
     * @return 生成数据集合
     */
    public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int createBoyNum, int creategrilNum) {
        //创建随机数
        Random r = new Random();
        //创建返回用的集合
        ArrayList<String> resultList = new ArrayList<>();


        //1.生成不重复的名字
        //Set集合不会重复
        //生成男生名字
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == createBoyNum) {
                break;
            }
            String firstName = familyNameList.get(r.nextInt(familyNameList.size()));
            String endName = boyNameList.get(r.nextInt(boyNameList.size()));
            boyhs.add(firstName + endName);
        }
        System.out.println("随机生成男生的名字：" + boyhs);


        //生成女生名字
        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == creategrilNum) {
                break;
            }
            String firstName = familyNameList.get(r.nextInt(familyNameList.size()));
            String endName = girlNameList.get(r.nextInt(girlNameList.size()));
            girlhs.add(firstName + endName);
        }
        System.out.println("随机生成女生的名字：" + girlhs);

        //添加男生女生的名字到返回集合中，并拼接姓名和年龄
        for (String boyName : boyhs) {
            resultList.add(boyName + "-男-" + (r.nextInt(13) + 18)); //18~30岁
        }

        for (String girlName : girlhs) {
            resultList.add(girlName + "-女-" + (r.nextInt(8) + 18));//18~25
        }
        //打乱集合
        Collections.shuffle(resultList);
        return resultList;
    }


    /**
     * 根据正则表达式获取字符串中的数据
     *
     * @param str   字符串
     * @param regex 正则表达式
     * @param index 获取第几组数据
     * @return
     */
    public static ArrayList<String> getdate(String str, String regex, int index) {
        //1.创建集合存放数据
        ArrayList<String> list = new ArrayList<>();
        //2.按照正则表达式的规则，去获取数据
        Pattern pattern = Pattern.compile(regex);
        //按照pattern的规则到str中获取数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            //捕获分组，捕获第二个分组
            String group = matcher.group(index);
            list.add(group);
        }
        System.out.println("临时集合：" + list);
        return list;
    }

    /**
     * 从网络爬取数据，把数据拼接成字符串返回
     *
     * @param net 网址
     * @return 爬取到的所有数据
     */
    public static String webCrawier(String net) throws IOException {
        //1.定义StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2.创建一个url对象
        URL url = new URL(net);
        //3.连接这个网址
        //细节：保证网络是畅通，而且这个文案告知可以链接
        URLConnection conn = url.openConnection();
        //4.读取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
