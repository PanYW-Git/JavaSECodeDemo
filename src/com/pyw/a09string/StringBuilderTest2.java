package com.pyw.a09string;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        //TODO 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用方法在控制台输出
        int[] arr = {1,2,3};
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]+", ");
            }
        }
        sb.append("]");
        String str = sb.toString();
        System.out.println(str);
    }
}
