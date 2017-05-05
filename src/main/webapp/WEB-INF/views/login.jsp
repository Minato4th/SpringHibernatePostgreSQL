<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>
<div align="center">
    <%--<form:form id="loginForm" method="post" action="login" modelAttribute="loginBean">

        <form:label path="username">Enter your user-name</form:label>
        <form:input id="username" name="username" path="username" /><br>
        <form:label path="username">Please enter your password</form:label>
        <form:password id="password" name="password" path="password" /><br>
        <input type="submit" value="Submit" />
    </form:form>--%>
        <h2>Please Login</h2>
        <form:form method="POST" modelAttribute="user">
        <table border="0">
            <tr>
                <td>Login:</td>
                <td><form:input path="login"/></td>
            </tr>

            <tr>
                <td>Password:</td>
                <td><form:input path="password"/></td>
            </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="Login" /></td>
            </tr>

        </table>
        </form:form>

        <p>${message}</p>

</div>
</body>
</html>
