package com.pyw.project.studentmanagesystem;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class StudentManagerSystem {

    private static final int ADD_STUDENT = 1;
    private static final int DELETE_STUDENT = 2;
    private static final int UPDATE_STUDENT = 3;
    private static final int GET_STUDENT = 4;
    private static final int EXIT = 5;

    static ArrayList<Student> students = new ArrayList();


    static {
        //初始数据
        Student stu1 = new Student();
        stu1.setId("1");
        stu1.setName("pyw");
        stu1.setAge(25);
        stu1.setAddress("重庆市");

        Student stu2 = new Student();
        stu2.setId("2");
        stu2.setName("yzy");
        stu2.setAge(18);
        stu2.setAddress("重庆市");

        students.add(stu1);
        students.add(stu2);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {




        /**
         * 学生管理系统
         */





        //给循环起名，用于后面跳出
        loop:
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");

            System.out.println("请输入您需要使用的功能");
            int choose = sc.nextInt();
            switch (choose) {
                case ADD_STUDENT -> insertOne(students);
                case DELETE_STUDENT -> deleteOne(students);
                case UPDATE_STUDENT -> updateOne(students);
                case GET_STUDENT -> selectOne(students);
                case EXIT -> {
                    System.out.println("退出");
//                    System.exit(0); // 停止虚拟机运行 让所有的代码全部结束
                    break loop; //指定循环跳出
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }




    //增删改查方法

    public static boolean insertOne(ArrayList<Student> students) {
        System.out.println("请输入需要添加的学生信息");
        String stuId = "";
        while (true) {
            System.out.println("请输入id");
            stuId = sc.next();
            if (checkId(students, stuId)) {
                System.out.println("id已存在,请重新输入");
                continue;
            }
            break;
        }
        System.out.println("请输入名称");
        String stuName = sc.next();
        System.out.println("请输入年龄");
        int stuAge = sc.nextInt();
        System.out.println("请输入地址");
        String stuAdress = sc.next();

        //赋值

        Student stu = new Student();
        stu.setId(stuId);
        stu.setName(stuName);
        stu.setAge(stuAge);
        stu.setAddress(stuAdress);
        students.add(stu);
        return true;
    }

    public static boolean deleteOne(ArrayList<Student> students) {
        System.out.println("请输入需要删除的学生id");
        String stuId = sc.next();
        int index = selectListIndexById(students, stuId);
        if (index >= 0) {

            students.remove(index);
            System.out.println("删除成功");
            return true;
        }
        System.out.println("输入的id不存在，不需要删除，返回主菜单");
        return false;
    }

    public static boolean updateOne(ArrayList<Student> students) {
        System.out.println("请输入需要修改的学生id");
        String stuId = sc.next();
        int index = selectListIndexById(students, stuId);
        if (index < 0) {
            System.out.println("输入的id不存在，请重新输入");
            return false;
        }

        System.out.println("请输入名称");
        String stuName = sc.next();
        System.out.println("请输入年龄");
        int stuAge = sc.nextInt();
        System.out.println("请输入地址");
        String stuAdress = sc.next();

        Student stu = new Student();
        stu.setId(stuId);
        stu.setName(stuName);
        stu.setAge(stuAge);
        stu.setAddress(stuAdress);
        students.set(index, stu);
        return true;
    }

    public static Student selectOne(ArrayList<Student> students) {
        System.out.println("请输入需要查询的学生信息");
        if (students.size() == 0) {
            System.out.println("当前没有学生信息");
            return null;
        }

        System.out.println("id        姓名        年龄        家庭住址");
        for (int i = 0; i < students.size(); i++) {
            StringJoiner sj = new StringJoiner("         ");
            sj.add(students.get(i).getId());
            sj.add(students.get(i).getName());
            sj.add(String.valueOf(students.get(i).getAge()));
            sj.add(students.get(i).getAddress());
            System.out.println(sj);
        }

        return new Student();
    }


    //判断id在集合中是否存在
    public static boolean checkId(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                return true;
            }
        }
        return false;
    }

    //根据id查询下标
    public static int selectListIndexById(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }


}
