<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Welcome to XYZ Bank</title>
</head>
<center>
<body>
<h2>Welcome to XYZ Bank</h2>
	<h3>Please Enter the Customer Details</h3>
		<c:url var="myAction" value="/addCustomer.obj"></c:url>
		<form:form action="addCustomer.obj" method="post" modelAttribute="customer">
			<table bgcolor="#DCDCDC">

			
				<tr>
				<td>Customer Name:<span style="color: red;">*</span></td>
					<td><form:input path="name" /></td>
					<td style="color: red;"><form:errors path="name"></form:errors></td>

				</tr>
				
				<tr>
				<td>Customer mail:<span style="color: red;">*</span></td>
					<td><form:input path="mail" /></td>
					<td style="color: red;"><form:errors path="mail"></form:errors></td>

				</tr>
				<tr>
				<td>Customer phone No:<span style="color: red;">*</span></td>
					<td><form:input path="phoneNo" /></td>
					<td style="color: red;"><form:errors path="phoneNo"></form:errors></td>

				</tr>
				<tr>
				<td>Customer Opening Balance:<span style="color: red;">*</span></td>
					<td><form:input  path="balance" pattern="^[1-9]+([0-9]+)*.([0]+)$"  /></td>
					<td style="color: red;"><form:errors path="balance"></form:errors></td>

				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="submit"
						value="Add_Customer"></input></td>
				</tr>
			</table>
		</form:form>
		<form>
		<table>
		<tr>
			<th>Pick your Operation</th>
		</tr>
		<tr>
			<td><a href="showHome.obj">Click here to go to Home Page</a></td>
		</tr>
	</table>
	</form>

</body>
</center>
</html>