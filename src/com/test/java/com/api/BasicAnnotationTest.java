package com.api;

import org.testng.annotations.*;

public class BasicAnnotationTest{

    @Test
    public void testCase1(){
        System.out.println("测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }

    @BeforeMethod
    public void beforeTest(){
        System.out.println("测试方法之前");
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("测试方法之后");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是类之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是类之后运行工的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件前");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件后");
    }
}
