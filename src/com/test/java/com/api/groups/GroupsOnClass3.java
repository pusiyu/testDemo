package com.api.groups;

import org.testng.annotations.Test;

//类测试
@Test(groups="teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3的teacher方法11111111");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3的teacher方法2222222");
    }
}
