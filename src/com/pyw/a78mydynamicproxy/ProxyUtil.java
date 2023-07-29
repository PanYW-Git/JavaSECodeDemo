package com.pyw.a78mydynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    /**
     * 给明星的对象创建一个代理
     * @param bigStar 被代理的明星对象
     * @return 给明细创建的代理
     */
    public static Star createProxy(BigStar bigStar){
        /*
        外面的人想要大明星唱一首歌
            1.获取代理的对象
            ProxyUtil.createProxy(大明星对象);
            2.再调用代理的唱歌方法
            代理对象，唱歌的方法();

        java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法：

        public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
        参数一：用于指定用哪个类加载器，去加载生成的代理类
        参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
        参数三：用来指定生成的代理对象要干什么事情*/
        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),//是谁把当前的类加载到内存的
                new Class[]{Star.class}, //指定代理的接口
                //用来指定生成的代理对象要干什么事情

                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*
                            Object proxy：代理的对象
                            Method method: 要运行的方法 sing
                            Object[] args: 调用sing方法是，传递的实参
                         */
                        if("sing".equals(method.getName())){
                            System.out.println("准备话筒");
                            System.out.println("收钱");
                        } else if("dance".equals(method.getName())){
                            System.out.println("准备场地");
                            System.out.println("收钱");
                        }
                        //去找大明星唱歌或跳舞
                        //代码的表现形式就是唱歌或者跳舞
                        return method.invoke(bigStar,args);
                    }
                }
        );


        return star;


    }
}
