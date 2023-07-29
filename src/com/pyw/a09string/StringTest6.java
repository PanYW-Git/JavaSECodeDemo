package com.pyw.a09string;

public class StringTest6 {
    public static void main(String[] args) {
        //TODO 身份证验证
        /*
         * 1、2：省份
         * 3、4：城市
         * 5、6：区县
         * 7-14：出生年月日
         * 15、16：所在地派出所
         * 17：性别（奇数男性、偶数女性）
         * 18：个人信息码（随机产生）
         *
         */
        String id = "500103199805100919";
        //获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

        //获取性别
        int sex = id.charAt(16) - 48;

        System.out.println("身份证号：" + id);
        System.out.println(year + "年" + month + "月" + day + "日");
        System.out.println("性别：" + (sex % 2 == 0 ? "女" : "男"));
    }
}
