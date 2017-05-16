<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Life on Mars</title>
</head>
<%@ page import ="java.util.Date" %>
<body>

<h3>One way Ticket to live on Mars</h3>

<h3>Today date is : <%= new Date() %></h3>

<form method="post" action="Login">

Enter your ID  <input type= "text" name="userId" id="username"> </br>

Enter Password <input type = "password" name="pwd" id="password"></br>

<input type="submit" value = "Login" name="login" id="login"> 



</form>
</body>
</html>