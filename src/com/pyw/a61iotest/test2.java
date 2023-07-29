package com.pyw.a61iotest;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;
import org.apache.commons.io.FileUtils;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        /*
            糊涂包 生成假数据，并写道文件当中
         */
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //3.利用正则表达式获取数据
        List<String> familyNameTempList = ReUtil.findAll("(.{4})(，|。)",familyNameStr,1);
        List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)",boyNameStr,1);
        List<String> girlNameTempList = ReUtil.findAll("(.. ){4}..",girlNameStr,0);

        System.out.println(familyNameTempList);
        System.out.println(boyNameTempList);
        System.out.println(girlNameTempList);


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
        List<String> boyNameListTempToList = boyNameTempList.stream().distinct().toList();

        ArrayList boyNameList = new ArrayList();
        boyNameList.addAll(boyNameListTempToList);
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
        //5.生成数据
        //姓名（唯一）-性别-年龄
        ArrayList<String> infos = getInfos(familyNameList, boyNameList, girlNameList, 10, 20);
        System.out.println("生成的随机集合："+infos);

        //6.写出数据
        //糊涂包的相对路径是相对class文件
        FileUtil.writeLines(infos,"names.txt","UTF-8");
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
}
