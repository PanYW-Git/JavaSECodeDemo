package com.pyw.a63createthread;

import java.util.concurrent.Callable;

/*
    Callable的泛型表示要返回的结果，比如求1+1=2 返回2 那么返回值就是Integer
 */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        //求1~100之间的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
