<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>



<center>
<body>
<form action="depositMoney.obj"  method="post">
	Account No: <input type="number" name="id" required/><br></br>
	Amount to deposit: <input type="number" name="amt"   min=0 required/><br></br>
	<input type="submit" value="Submit"/>
</form>




<a href="showHome.obj">Click
			Here To Go to Home</a>
</body>
</center>
</html>