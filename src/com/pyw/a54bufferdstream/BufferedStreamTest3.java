package com.pyw.a54bufferdstream;

import java.io.*;

public class BufferedStreamTest3 {

    private static int useCount = 1;

    public static void main(String[] args) throws IOException {
            /*
                实现一个验证程序运行次数的小程序，要求如下：
                1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
                2.程序运行演示如下:
                    第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
                    第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
                    第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
                    第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
           */
        //1.把文件中的数字读取到内存中
        //原则：
        //IO：随用随创建
        //    什么时候不用什么时候关闭

        File countLoginFile = new File("src/com/pyw/a54bufferdstream/temp/countLogin.txt");
        BufferedWriter bw = null;
        //判断文件是否存在
        if (!countLoginFile.exists()) {
            //文件不存在
            //写入文件 写入时会把文件清空
            System.out.println("文件不存在");
            countLoginFile.createNewFile();
            bw = new BufferedWriter(new FileWriter(countLoginFile));
            bw.write(useCount + "");
            bw.close();
        } else {
            //文件存在
            System.out.println("文件存在");
            //读取文件
            BufferedReader br = new BufferedReader(new FileReader(countLoginFile));
            //把使用软件次数+1
            useCount = Integer.parseInt(br.readLine()) + 1;
            br.close();
            //写入文件 写入时会把文件清空
            bw = new BufferedWriter(new FileWriter(countLoginFile));
            bw.write(useCount + "");
            bw.close();
        }
        //输出提示
        if(useCount<=3){
            System.out.println("欢迎使用本软件，第" + useCount + "次使用免费~");
        }else {
            System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用~");
        }
    }
}
