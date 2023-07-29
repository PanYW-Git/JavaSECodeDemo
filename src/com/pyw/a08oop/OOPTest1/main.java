package com.pyw.a08oop.OOPTest1;

public class main {
    public static void main(String[] args) {
        //TODO 文字版格斗游戏
        Role role1 = new Role("杨子煜",100,'女');
        Role role2 = new Role("潘誉文",100,'男');
        System.out.println("创建的第一个角色信息：");
        role1.showRoleInfo();
        System.out.println("创建的第二个角色信息：");
        role2.showRoleInfo();

        // 开始格斗
        while(true){
            role1.attack(role2);
            if(role2.getBoold() == 0){
                System.out.println(role1.getName()+"K.O了" +role2.getName());
                break;
            }
            role2.attack(role1);
            if(role1.getBoold() == 0){
                System.out.println(role2.getName()+"K.O了" +role1.getName());
                break;
            }
        }
    }
}
