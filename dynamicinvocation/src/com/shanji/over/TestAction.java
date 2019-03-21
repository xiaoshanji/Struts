package com.shanji.over;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport
{
    public String Test() throws Exception
    {
        System.out.println("小山鸡");
        return "Test";
    }
    public String notfound() throws Exception
    {
        System.out.println("这是找不到页面的方法");
        return "notfound";
    }
}
