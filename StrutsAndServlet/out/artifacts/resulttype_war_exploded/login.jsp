<%--
  Created by IntelliJ IDEA.
  User: 60234
  Date: 2019/3/28
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="addlist.action" method="post">
        <input type="text" name="user.username" placeholder="用户名" /><br />
        <input type="password" name="user.password" placeholder="密码" /><br />
        <input type="submit" value="提交" />
    </form>
    <s:iterator value="#userlist">
        用户名：<s:property value="username" /><br />
        密码:<s:property value="password" /><br />
    </s:iterator>
</body>
</html>
