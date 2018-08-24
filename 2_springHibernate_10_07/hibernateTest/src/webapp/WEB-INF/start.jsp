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

<br/>

<%--<c:redirect url = "newJsp.jsp"/>--%>


</body>
</html>
