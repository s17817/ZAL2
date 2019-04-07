<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Zarejestruj się</title>
</head>
<body>
Uzupełnij dane pola, aby się zarejestrować:<br/>
<form action="register" method="post">
    <label>Login: <input type="text" id="login" name="login"/></label><br/>
    <label>Hasło: <input type="password" id="password" name="password"/></label><br/>
    <label>Powtórz hasło: <input type="password" id="confirmPassword" name="confirmPassword"></label><br/>
    <label>E-mail: <input type="text" id="email" name="email"/></label><br/>
    <input type="submit" value="Zarejestruj się"/>
</form>
${error}
</body>
</html>