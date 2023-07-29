package com.pyw.a81junit;


import org.junit.*;

/**
   测试类
 */
public class TestUserService {

    // 修饰实例方法的

    //每个测试方法运行之前都执行一次
    @Before
    public void before(){
        System.out.println("===before方法执行一次===");
    }

    //每个测试方法运行之后都执行一次
    @After
    public void after(){
        System.out.println("===after方法执行一次===");
    }

    // 修饰静态方法
    //在执行所有的测试方法之前执行一次
    @BeforeClass
    public static void beforeClass(){
        System.out.println("===beforeClass方法执行一次===");
    }

    //在执行所有的测试方法之后执行一次
    @AfterClass
    public static void afterClass(){
        System.out.println("===afterClass方法执行一次===");
    }


    /**
       测试方法
       注意点：
            1、必须是公开的，无参数 无返回值的方法
            2、测试方法必须使用@Test注解标记。
     */
    @Test
    public void testLoginName(){
        UserService userService = new UserService();
        String rs = userService.loginName("admin","123");

        // 进行预期结果的正确性测试：断言。
        //参数一：信息
        //参数二：预测结果
        //参数三：实际结果
        Assert.assertEquals("您的登录业务可能出现问题", "登录成功", rs );
    }

    @Test
    public void testSelectNames(){
        UserService userService = new UserService();
        userService.selectNames();
    }

}
