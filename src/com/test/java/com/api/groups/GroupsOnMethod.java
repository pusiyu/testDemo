package com.api.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

//分组groups
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组方法11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组方法22222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组方法33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组方法44444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnClient(){
        System.out.println("这是服务端组之后运行的方法");
    }
}
