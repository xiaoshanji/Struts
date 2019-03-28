<%--
  Created by IntelliJ IDEA.
  User: 60234
  Date: 2019/3/28
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%--
    request：${requestScope.user}<br />
    session：${sessionScope.user}<br />
    Application：${applicationScope.user}<br />--%>
  <s:iterator value="#userlist">
      用户名：<s:property value="username" /><br />
      密码:<s:property value="password" /><br />
  </s:iterator>
  </body>
</html>
