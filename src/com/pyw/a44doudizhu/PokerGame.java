package com.pyw.a44doudizhu;

import java.util.ArrayList;

public class PokerGame {
    static ArrayList<String> list = new ArrayList<>();
    //静态代码块：随着类的加载而加载，而且只执行一次
    static {
        //准备牌
        //"♦","♣","♥","♠"
        //"3","4","5","6","7","8","9","10","J","Q","K","A","2"
        String[] color = {"♦","♣","♥","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //牌盒添加
        for (String c : color) {
            //c表示每一种花色
            for (String s : number) {
                list.add(c+s);
            }
        }
        list.add("小王");
        list.add("大王");

    }


    public PokerGame() {
        System.out.println("准备好牌"+list);

        //洗牌


        //发牌

        //看牌
    }
}
