<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h1 style="color: #0066CC">Welcome to XYZ Bank</h1>
		<br />
		<br />

		
		<h3>Please Enter the Login Details</h3>
<br>
${message}<br><br>

<form action="login.obj">  
UserName: <input type="text" name="uname" required/><br>  
Pin : <input type="password" name="pin" required/><br> 
<input type="submit" name="submit" value="submit">  
</form> 
 <!--  <br> <a href="showLoginPage.obj">Back To Login Page</a>--> 

</body>
</html>
