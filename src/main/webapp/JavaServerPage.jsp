<%@ page import="java.util.Date" %>

<%!
    long summa (int a, int b) {
        return a + b;
    }
%>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 26.05.2023
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My JSP</title>
</head>
<body>

<h1>Hello ${name}</h1>         <!-- достаем из памяти обьект с ключем name -->
<%new Date();%>                <!-- без '=' код выполнится, но мы не увидим результат -->
<%=new Date()%>                <!-- с '=' код выполнится и мы увидим результат (точка с запятой тут не ставится)-->
<h1>hello ${param.name}</h1>

<!-- есть скрытые объекты request, response -->
<%=request.getParameter("name")%>
<h1>Сумма 5 + 2 = <%=5+2%></h1>
<h1>Сумма 5 + 2 = <%=summa(5, 2)%></h1>
</body>
</html>
