package com.pyw.a35set;

public class Student2 implements Comparable<Student2> {
    //姓名
    private String name;
    //年龄
    private int age;
    //语文成绩
    private int chinese;
    //数学成绩
    private int math;
    //英语成绩
    private int english;

    //总成绩
    private int allScore;


    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     *
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + " 总分：" + allScore + "}";
    }


    /* 按照总分从高到低输出到控制台
     如果总分一样，按照语文成绩排
     如果语文一样，按照数学成绩排
     如果数学成绩一样，按照英语成绩排
     如果英文成绩一样，按照年龄排
     如果年龄一样，按照姓名的字母顺序排
     如果都一样，认为是同一个学生，不存。*/
    @Override
    public int compareTo(Student2 o) {
        //新增添加到集合的对象分数
        int thisScore = this.getChinese() + this.getEnglish() + this.getMath();
        //集合中元素的对象分数
        int listScore = o.getChinese() + o.getEnglish() + o.getMath();
        //为了后续遍历集合的时候看得到总分
        allScore = thisScore;
        //计算总分
        int result = thisScore - listScore;
        //如果总分一样，按照语文成绩排
        result = result == 0 ? this.getChinese() - o.getChinese() : result;
        result = result == 0 ? this.getMath() - o.getMath() : result;
        result = result == 0 ? this.getEnglish() - o.getEnglish() : result;
        result = result == 0 ? this.getAge() - o.getAge() : result;
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;
        System.out.println("========================");
        System.out.println("添加元素总分：" + thisScore);
        System.out.println("历史元素总分：" + listScore);
        return result;

    }
}
