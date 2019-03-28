package com.shanji.over;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;

public class UserList  extends ActionSupport
{
    private static ArrayList<User> list = new ArrayList<>();
    private User user;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception
    {
        list.add(user);
        ActionContext context = ActionContext.getContext();
        context.put("userlist",list);
        return SUCCESS;
    }
}
