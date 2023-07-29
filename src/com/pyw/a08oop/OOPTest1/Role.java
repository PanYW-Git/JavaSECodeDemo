package com.pyw.a08oop.OOPTest1;

import java.util.Random;

public class Role {
    private String name;

    private int boold;

    private char gender;

    public Role() {
    }

    public Role(String name, int boold, char gender) {
        this.name = name;
        this.boold = boold;
        this.gender = gender;
        //随机长相
        this.setFace(gender);
    }


    public void setFace(char gender) {
        //长相是随机的
        Random r = new Random();
        if(gender =='男'){
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if(gender =='女'){
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "惨不忍睹";
        }
    }

    //长相是随机的
    private String face;
    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};





    public String getFace() {
        return face;
    }



    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return boold
     */
    public int getBoold() {
        return boold;
    }

    /**
     * 设置
     * @param boold
     */
    public void setBoold(int boold) {
        this.boold = boold;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void attack(Role role){
        //获取武功招式
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String attackShow = attacks_desc[index];
        System.out.printf(attackShow,getName(),role.getName());
        System.out.println();
        //计算造成的伤害 1~20点血

        int hurt = r.nextInt(20) + 1;
        int remainBoold = role.boold - hurt;
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        //修改挨揍人的血量
        role.setBoold(remainBoold);

        //受伤描述
        if(hurt <= 3){
            System.out.printf(injureds_desc[0],role.name);
        } else if(hurt > 3&&hurt <= 5){
            System.out.printf(injureds_desc[1],role.name);
        }else if(hurt > 5&&hurt <= 8){
            System.out.printf(injureds_desc[2],role.name);
        }else if(hurt > 8&&hurt <= 10){
            System.out.printf(injureds_desc[3],role.name);
        }else if(hurt > 10&&hurt <= 12){
            System.out.printf(injureds_desc[4],role.name);
        }else if(hurt > 12&&hurt <= 15){
            System.out.printf(injureds_desc[5],role.name);
        }else if(hurt > 15&&hurt <= 18){
            System.out.printf(injureds_desc[6],role.name);
        }else if(hurt > 18&&hurt <= 20){
            System.out.printf(injureds_desc[7],role.name);
        }else{
            System.out.printf(injureds_desc[0],role.name);
        }
        System.out.printf("  %s的血量剩余%s",role.name,role.boold);
        System.out.println();
    }

    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public void showRoleInfo(){
        System.out.println("姓名："+getName());
        System.out.println("血量："+getBoold());
        System.out.println("性别："+getGender());
        System.out.println("长相："+getFace());
    }

    public String toString() {
        return "Role{name = " + name + ", boold = " + boold + "}";
    }
}
