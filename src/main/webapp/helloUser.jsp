<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 30.05.2023
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
<h1>Hello ${name}</h1>

<c:if test="${arrayUsers != null}">
    <c:out value="arrayUsers is not null"/>
</c:if>
<c:forEach var="user" items="${arrayUsers}">
    <c:out value="${user}"/>
</c:forEach>
</body>
</html>
