<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Logowanie</title>
</head>
<body>
<form action="login" method="post">
    <label>Login: <input type="text" id="login" name="login"/></label><br/>
    <label>Hasło: <input type="password" id="password" name="password"/></label><br/>
    <input type="submit" value="Zaloguj"/>
</form>
${error}
</body>
</html>