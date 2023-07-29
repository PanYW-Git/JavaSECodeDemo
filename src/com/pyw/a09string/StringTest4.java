package com.pyw.a09string;

public class StringTest4 {
    public static void main(String[] args) {
        //TODO 金额转为大写
        double money = 42135.00;
        changeMoneyToBig(money);
    }

    public static String changeMoneyToBig(double money) {

        //初始化返回结果
        String result = "零佰零拾零万零千零佰零拾零元";
        char[] resultChars = result.toCharArray();

        //初始化0~9汉字
        char[] chineseNum = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};



        //money转为字符
        String moneyStr = money + "";
        //获取money逗号前的长度
        int moneyLen = moneyStr.indexOf(".");
        System.out.println("当前money长度为"+moneyLen);
        //money转为大写
        char[] temp = new char[moneyLen];
        for (int i = moneyLen; i > 0; i--) {
            //获取输入金额最后一位数字
            int index = Character.getNumericValue(moneyStr.charAt(i - 1));
            System.out.println("index:"+index);
            temp[i-1] = chineseNum[index];
        }


        for (int i = 0; i < resultChars.length/2; i++) {
            if(i == temp.length){
                break;
            }
            System.out.println("index   :  "+(((resultChars.length - 1)/2 - i) * 2));
            resultChars[((resultChars.length - 1)/2 - i) * 2] = temp[temp.length - i -1];
//            System.out.print(resultChars[resultChars.length/2 - 1]);
        }
        result = String.valueOf(resultChars);
        System.out.println(result);
        //返回
        return result;
    }
}
