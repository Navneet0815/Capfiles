<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to XYZ BANK</h1>
	<h4>${message}</h4>
	<table>
		<tr>
			<th>Pick your Operation</th>
		</tr>
		<tr>
			<td><a href="showAddCustomer.obj">Add Customer</a></td>
		</tr>
		
		<tr>
			<td><a href="showDepositMoney.obj">Deposit Money</a></td>
		</tr>
		<tr>
			<td><a href="showWithdrawMoney.obj">Withdraw Money</a></td>
		</tr>
		
		<tr>
			<td><a href="showFundTransfer.obj">Fund Transfer</a></td>
		</tr>
	
		<tr>
			<td><a href="showCustomers.obj">Show All</a></td>
		</tr>
		<tr>
			<td><a href="showBalance.obj">Show Balance</a></td>
		</tr>
		<tr>
			<td><a href="showTransaction.obj">Show Transaction</a></td>
		</tr>
	
	</table>
</body>
</html>