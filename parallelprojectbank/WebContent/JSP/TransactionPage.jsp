<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


  
<h3>${nulllist}</h3>
<c:if test="${fn:length(list) > 0}">	
<table border=1>
<h2>Your Transactions are:</h2>
<tr>
	    <th bgcolor="bisque">Transaction id</th>
		<th bgcolor="bisque">AccNo</th>
		<th bgcolor="bisque">Transaction type</th>
		<th bgcolor="bisque">Transaction amount</th>
		<th bgcolor="bisque">Transaction date</th>
		<th bgcolor="bisque">Transaction time</th>
	
	</tr> 
	<c:forEach var="List" items="${list}">
	
	
	
	
		<tr>
			<td>${List.transactionid}</td>
			<td>${List.accno}</td>
			<td>${List.transactiontype}</td>
			<td>${List.transactionamount}</td>
			<td>${List.transactiondate}</td>
			<td>${List.transactiontime}</td>
		</tr>
		
		
		
	</c:forEach>

		
</table>
</c:if>

<a href="showHome.obj">Click
			Here To Go to Home</a>
</body>
</html>