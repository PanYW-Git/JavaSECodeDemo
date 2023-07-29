package com.pyw.a26test;

public class Test3 {
    public static void main(String[] args) {
        //TODO 有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个!以后每天猴子都吃当前剩下来的一半，然后再多吃一个，第10天的时候(还没吃)，发现只剩下一个桃子了，请问，最初总共多少个桃子?
        System.out.println(getEat(1));
        /*
        10d:1
        9d:2
        8d:4
        ....
        1d:2d个数*2+1
         */
    }

    public static int getEat(int day){
        if(day == 10){
            return 1;
        }

        return (getEat(day + 1) +1) *2;
    }
}
