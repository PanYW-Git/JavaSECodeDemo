package com.pyw.a15innerclass;

public class Car {
    private String carName;

    private int carAge;

    private String carColor;

    public Car(String carName, int carAge, String carColor) {
        this.carName = carName;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    public void show(){
        //是打印调用者车的名字
        System.out.println(carName);
        //在代码中没有发动机的对象
        Engine en = new Engine();
        System.out.println(en.engineName);
    }



    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
