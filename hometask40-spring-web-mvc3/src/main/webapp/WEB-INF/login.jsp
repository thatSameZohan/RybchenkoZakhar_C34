<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/login?lang=ru">RU</a><br><a href="/login?lang=en">EN</a>
<sp:message code="login.title"/>
<form method="post" action=shop>
    <sp:message code="param.login"/>: <input type="text" name="login">${loginError}<br>
    <sp:message code="param.email"/>: <input type="text" name="email">${emailError}<br>
    <sp:message code="param.age"/>: <input type="number" name="age">${ageError}<br>
    <input type="submit" value="<sp:message code="button.reg"/>">
</form>
<%--<sf:form method="post" action="shop" modelAttribute="userprofile">--%>
<%--    <sf:input path="login" type="text"/><sf:errors path="login"/>--%>
<%--    <sf:input path="email" type="text"/><sf:errors path="email"/>--%>
<%--    <sf:input path="age" type="number"/><sf:errors path="age"/>--%>
<%--    <input type="submit" value="register">--%>
<%--</sf:form>--%>
</body>
</html>
