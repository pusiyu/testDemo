package com.api.suite;

import org.testng.annotations.Test;

//测试类1
public class LoginTest {

    @Test
    public void loginTb(){
        System.out.println("登录成功");
    }

    @Test
    public void loginTbFlash(){
        System.out.println("登录失败");
    }
}
