package com.shanji.over;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport
{
    @Override
    public String execute() throws Exception {
        return SUCCESS; 
    }
}
