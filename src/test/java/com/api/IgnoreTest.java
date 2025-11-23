package com.api;

import org.testng.annotations.Test;

//忽略测试
public class IgnoreTest {

    @Test
    public void ignoreTest(){
        System.out.println("ignoreTest1测试用例");
    }

    //忽略测试，此测试用例不执行enabled=false
    @Test(enabled=false)
    public void ignoreTest2(){
        System.out.println("ignoreTest2用例执行");
    }
}
