package com.shanji.over;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction  extends ActionSupport
{
    private String username;
    private String password;
    public String login() throws Exception
    {
        if(username.equals("xiaoshanji") && password.equals("179980"))
        {
            return SUCCESS;
        }
        return ERROR;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
