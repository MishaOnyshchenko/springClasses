<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Михаил
  Date: 18.08.2018
  Time: 0:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hi</title>
</head>
<body>
<h1>Start!!!</h1>

<br/>
<ul>
    <c:forEach var="user" items ="${userList}">
        <li>${user.name}</li>
    </c:forEach>
</ul>
<br/>
<ul>
    <c:forEach var="user" items ="${userListModify}">
        <li>${user.name}</li>
    </c:forEach>
</ul>

</body>
</html>

