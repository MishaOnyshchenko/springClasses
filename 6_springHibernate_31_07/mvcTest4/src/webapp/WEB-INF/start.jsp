<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hibernate</title>
</head>
<body>
<h1>Start!!!</h1>

<br/>
<ul>
    <c:forEach var="student" items ="${userList}">
        <li>${student.name}</li>
    </c:forEach>
</ul>
<br/>
<ul>
    <c:forEach var="student" items ="${userListModify}">
        <li>${student.name}</li>
    </c:forEach>
</ul>

<br/>
</body>
</html>