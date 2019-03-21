package com.shanji.over;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class InputOutputAction extends ActionSupport
{
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String execute() throws Exception
    {
        ActionContext context = ActionContext.getContext();
        context.put("text",text);
        return SUCCESS;
    }
}
