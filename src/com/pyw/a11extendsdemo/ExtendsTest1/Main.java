package com.pyw.a11extendsdemo.ExtendsTest1;

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("1","pyw","work");
        lecturer.setId("1");
        lecturer.setName("pyw");
        lecturer.setWork("教学");
        lecturer.doWork();
        System.out.println(lecturer);
    }
}
