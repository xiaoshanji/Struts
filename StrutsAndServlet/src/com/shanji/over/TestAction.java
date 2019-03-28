package com.shanji.over;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class TestAction  extends ActionSupport implements ServletRequestAware, ServletContextAware, SessionAware
{
    private String username;
    private HttpServletRequest request;
    private ServletContext application;
    private Map<String,Object> session;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String execute() throws Exception
    {
//        ActionContext context = ActionContext.getContext();
//        context.put("user",username);
//        context.getSession().put("user",username + "session");
//        context.getApplication().put("user",username + "application");

//        HttpServletRequest request = ServletActionContext.getRequest();
//        HttpSession session = request.getSession();
//        session.setAttribute("user",username + "sesion");
//        ServletActionContext.getServletContext().setAttribute("user",username + "application");                    //application


        request.setAttribute("user",username);
        session.put("user",username + "session");
        application.setAttribute("user",username + "application");


        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest)
    {
        request = httpServletRequest;
    }

    @Override
    public void setSession(Map<String, Object> map)
    {
        session = map;
    }

    @Override
    public void setServletContext(ServletContext servletContext)
    {
        application = servletContext;
    }
}
