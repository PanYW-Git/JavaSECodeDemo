package com.pyw.a69threadtest.test4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class MyThread extends Thread {

    static BigDecimal redPacket = new BigDecimal(100);
    static BigDecimal money = new BigDecimal(0);
    static int count = 3;

    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (redPacket == BigDecimal.valueOf(0)) {
                System.out.println(getName() + "没抢到红包");
            }else {
                Random r = new Random();

                if (count == 1) {
                    money = redPacket;
                    redPacket = BigDecimal.valueOf(0);
                } else {
                    // 100 - (count - 1) * 0.01 随机的最大范围，因为必须要随机三个包，第一次的结果为99.98 剩下0.02也可以分两个包
                    BigDecimal bounds = redPacket.subtract(BigDecimal.valueOf((count - 1)));
                    money = new BigDecimal(r.nextDouble(bounds.doubleValue())).setScale(2, RoundingMode.HALF_UP);
                    ;
                    redPacket = redPacket.subtract(money);
                    count--;
                }
                System.out.println(getName() + "用户，当前抽中的红包金额为：" + money + "红包剩余金额为：" + redPacket);
            }

        }
    }
}
