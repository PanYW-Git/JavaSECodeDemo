package com.pyw.a16api;

import com.google.gson.Gson;

public class ObjectDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //TODO object
        //Object是所有类的顶级父类
        //没有成员变量
        //空参构造

        //toString
        //Object的toString方法默认是打印的地址值
        //如果父类中的toStrig方法不满足我们的需求，可以重写toString方法
        //结论：如果我们打印一个对象想要看到属性值的话，那么重写toString方法就可以了
        //在重写的方法，把对象的属性值进行拼接
        Object obj = new Object();
        String str = obj.toString();
        System.out.println(str);



        //equals
        //object中的equals是比较两个对象的地址值是否一样
        //可以在实体类中使用alt+insert重写equals，重写后可以比较属性值
        String s = "123";
        System.out.println(s.equals("123"));

        //clone 克隆
        //细节:
        //方法在底层会帮我们创建一个对象,并把原对象中的数据拷贝过去。
        //书写细节:
        //1.重写Object中的clone方法
        //2.让javabean类实现Cloneable接口
        //3.创建原对象并调用clone就可以了
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "zhangsan", "1234qwer", "girl11", data);
        User u2 =(User)u1.clone();

        //objct中使用的是浅克隆  存在的问题，因为引用数据类型拷贝的是地址值如果原有值一旦发生改变，克隆后的也会变
        //想要进行深克隆，就需要重写clone方法并修改里面的方法体
        data[0] = 100;
        u1.setData(data);
        System.out.println(u1);
        System.out.println(u2);




        //常用深克隆方法
        // gson-2.6.2.jar第三方工具
        Gson gson = new Gson();
        //把对象变成一个字符串
        String s1 = gson.toJson(u1);
        System.out.println(s1);
        //再把字符串变为对象
        User u3 = gson.fromJson(s1, User.class);

        data[0] = 200;
        u1.setData(data);
        System.out.println(u3);


    }
}
