package com.pyw.a03switchcase;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        //switchcase的两种格式
        //基本格式
        int num = 10;
//        switch (num){
//            case 10:
//                break;
//            case 20:
//                System.out.println("二十");
//                break;
//            default:
//                System.out.println("没有这个数据");
//                break;
//        }

        //jdk12以后可以写为这种格式增加易读性 如果有多条语句用大括号括起来 case 值 -> {}
        switch (num){
            case 10 -> System.out.println("十");
            case 20 -> System.out.println("二十");
            default -> System.out.println("没有这个数据");
        }
    }
}
