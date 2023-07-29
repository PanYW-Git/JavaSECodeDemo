package com.pyw.project.studentmanagesystem;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * 用户登录
         */
        ArrayList<User> users = new ArrayList();

        User user1 = new User(null, "pyw123", "123", "17729610591", "500103199805100919");
        User user2 = new User(null, "yzy456", "123", "17729610591", "500103199805100919");
        users.add(user1);
        users.add(user2);

        loginWhlie:
        while (true) {
            System.out.println("--------欢迎来到学生管理系统登录界面--------");
            System.out.println("请选择操作 1：登录 2：注册 3：忘记密码 4:退出");
            int chooseLogin = sc.nextInt();
            switch (chooseLogin) {
                case 1 -> {
                    if (login(users)) {
                        StudentManagerSystem.main(args);
                    } else {
                        System.out.println("登录失败，请检查用户名或密码");
                    }

                }
                case 2 -> register(users);
                case 3 -> forgetPwd(users);
                case 4 -> {
                    System.out.println("感谢您的使用，再见！");
                    break loginWhlie;
                }
                default -> System.out.println("没有这个选项请重新试一试");
            }

        }
    }


    /**
     * 登录
     */
    public static boolean login(ArrayList<User> users) {
        User user = new User();
        while (true) {
            System.out.println("请输入用户名");
            String username = sc.next();
            user = checkUsernameInList(users, username);
            if (user == null) {
                System.out.println("该用户不存在，请先注册吧！");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println("请输入密码");
            String password = sc.next();
            if (!password.equals(user.getPassword())) {
                System.out.println("密码错误，请检查后再试");
                continue;
            }
            break;
        }

        while (true) {
            String verificationCode = verificationCode();
            System.out.println("当前验证码：" + verificationCode);
            System.out.println("请输入验证码");
            String verificationCodeByUser = sc.next();
            if (!verificationCode.equals(verificationCodeByUser)) {
                System.out.println("验证码输入错误，请重新输入！");
                continue;
            }
            break;
        }
        System.out.println("恭喜您！登录成功！");

        return true;
    }

    //判断id在集合中是否存在
    public static User checkUsernameInList(ArrayList<User> users, String username) {
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())) {
                return users.get(i);
            }
        }
        return null;
    }

    public static String verificationCode() {
        //生成验证码
        //内容 可以是小写、大写字母，并且可以是数字
        //长度为5
        //内容中四位是字母，一位是数字，数字只有1位，可以出现在任意的位置
        Random r = new Random();
        //生成数字索引
        int rNum = r.nextInt(5);
        char[] chars = new char[5];
        //随机生成
        for (int i = 0; i < chars.length; i++) {
            if (i == rNum) {
                chars[i] = (char) (r.nextInt(9) + 48);
            } else {
                int rLetter = r.nextInt(52) + 1;
                if (rLetter < 26) {
                    chars[i] = (char) (rLetter + 65);
                } else {
                    chars[i] = (char) (rLetter - 26 + 97);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }


    /**
     * 注册
     *
     * @param users
     */
    public static void register(ArrayList<User> users) {
        System.out.println("欢迎来到注册页面");
        User user = new User();
        //用户名
        while (true) {
            System.out.println("请输入用户名");
            String username = sc.next();
            if (checkUsername(users, username)) {
                continue;
            }
            user.setUsername(username);
            break;
        }

        //密码
        while (true) {
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("请再输入一次密码");
            String rePassword = sc.next();
            if (!password.equals(rePassword)) {
                System.out.println("两次输入的密码不一致，请重新输入");
                continue;
            }
            user.setPassword(password);
            break;
        }

        //身份号
        while (true) {
            System.out.println("请输入身份证号码");
            String idNum = sc.next();
            if (checkIdNum(idNum)) {
                continue;
            }
            user.setIdNum(idNum);
            break;
        }

        //手机号
        while (true) {
            System.out.println("请输入手机号");
            String phone = sc.next();
            if (checkPhone(phone)) {
                continue;
            }
            user.setPhone(phone);
            break;
        }

        users.add(user);

        System.out.println("所有注册用户:" + users);

        System.out.println("恭喜你！注册成功！,注册的用户信息");


    }

    //检查手机号
    public static boolean checkPhone(String phone) {
        if (phone.length() != 11) {
            System.out.println("手机长度必须是11位");
            return true;
        }

        if (phone.charAt(0) == '0') {
            System.out.println("不能以0开头");
            return true;
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!(phone.charAt(i) >= '0' && phone.charAt(i) <= '9')) {
                System.out.println("必须都是数字");
                return true;
            }
        }
        return false;
    }

    //判断身份证号格式是否错误
    public static boolean checkIdNum(String idNum) {
        if (idNum.length() != 18) {
            System.out.println("身份证长度必须为18位");
            return true;
        }

        if (idNum.charAt(0) == '0') {
            System.out.println("身份证开头不能为0");
            return true;
        }

        for (int i = 0; i < idNum.length(); i++) {
            if (i < 17) {
                if (!(idNum.charAt(i) >= '0' && idNum.charAt(i) <= '9')) {
                    System.out.println("身份证号前17位必须为数字");
                    return true;
                }
            }


            if (i == 17) {
                if (!((idNum.charAt(i) >= '0' && idNum.charAt(i) <= '9') || (idNum.charAt(i) == 'x' || idNum.charAt(i) == 'X'))) {
                    System.out.println("身份证18为必须为数字，或者大小写x");
                    return true;
                }
            }
        }

        return false;
    }


    //判断用户名是否错误
    public static boolean checkUsername(ArrayList<User> users, String username) {
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())) {
                System.out.println("用户名已存在");
                return true;
            }
        }
        if (!(username.length() >= 3 && username.length() <= 15)) {
            System.out.println("输入的用户名长度必须在3~15位之间");
            return true;
        }
        int countNum = 0;
        int countLetter = 0;
        for (int i = 0; i < username.length(); i++) {
            char tempUsernameChat = username.charAt(i);
            //大小写字母计数
            if ((tempUsernameChat >= 'a' && tempUsernameChat <= 'z') || (tempUsernameChat >= 'A' && tempUsernameChat <= 'Z')) {
                countLetter++;
                continue;
            }
            //数字计数
            else if (tempUsernameChat >= 0 + 48 && tempUsernameChat <= 9 + 48) {
                countNum++;
                continue;
            }
            //其他情况
            else {
                System.out.println("输入的用户名只能是数字或者字符，请重新输入");
                return true;
            }
        }
        if (countLetter == 0 || countNum == 0) {
            System.out.println("输入的信息必须是数字或者大小写字母的组合，请重新输入");
            return true;
        }
        return false;
    }

    public static void forgetPwd(ArrayList<User> users) {
        User user = new User();
        while (true) {
            System.out.println("请输入需要修改密码的用户名");
            String username = sc.next();
            user = checkUsernameInList(users, username);
            if (user == null) {
                System.out.println("该用户不存在，请先注册吧！");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("请输入身份证号");
            String idNum = sc.next();
            if (checkIdNum(idNum)) {
                System.out.println("输入的身份证信息不正确，请重新输入");
                continue;
            }

            System.out.println("请输入手机号");
            String phone = sc.next();
            if (checkPhone(phone)) {
                System.out.println("输入的手机号不正确，请重新输入");
                continue;
            }

            if (!(user.getIdNum().equals(idNum) && user.getPhone().equals(phone))) {
                System.out.println("手机号或身份证不正确，请重新输入");
                continue;
            }

            System.out.println("请输入重置后的密码");
            String password = sc.next();
            int index = selectListIndexByName(users, user.getUsername());
            users.get(index).setPassword(password);
            break;
        }
    }

    //根据id查询下标
    public static int selectListIndexByName(ArrayList<User> students, String userName) {
        for (int i = 0; i < students.size(); i++) {
            if (userName.equals(students.get(i).getUsername())) {
                return i;
            }
        }
        return -1;
    }

}
