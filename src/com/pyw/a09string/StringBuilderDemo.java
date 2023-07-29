package com.pyw.a09string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //容量：最多装多少
        //长度：已装了多少
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());//16 容量 默认容量16
        System.out.println(sb.length());//0 长度

        sb.append("qwertyuipoasdfghjklzxcvbnm");
        System.out.println(sb.capacity());//34 容量 如果超过16 16*2+2
        System.out.println(sb.length());//26 长度

        StringBuilder sb2 = new StringBuilder();
        sb2.append("qwertyuipoasdfghjklzxcvbnm0123456789");
        System.out.println(sb2.capacity());//36 容量 超过34与实际长度一致
        System.out.println(sb2.length());//36 长度
    }
}
