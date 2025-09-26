<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action=shop>
    Login <input type="text" name="login">${loginError}<br>
    Email <input type="text" name="email">${emailError}<br>
    Age <input type="number" name="age">${ageError}<br>
    <input type="submit" value="register">
</form>
</body>
</html>
