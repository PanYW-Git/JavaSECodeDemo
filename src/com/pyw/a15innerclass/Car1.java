package com.pyw.a15innerclass;

public abstract class Car1 {
    private String carName;

    private int carAge;

    private String carColor;

    public Car1() {
    }

    public Car1(String carName, int carAge, String carColor) {
        this.carName = carName;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    public abstract void show();



}
