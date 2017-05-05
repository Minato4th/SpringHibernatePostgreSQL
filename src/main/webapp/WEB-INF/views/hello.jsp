<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>
<div align="center">
    <h1>Our User</h1>

    <table border="1">
        <th>Id</th>
        <th>User</th>
        <th>Password</th>

        <c:forEach var="user" items="${userList}" varStatus="status">
            <tr>
                <td>${user.id}</td>
                <td>${user.login}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>


    </table>

    <p>${message} ${user.login}</p>

</div>
</body>
</html>