<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninjas by Dojo</title>
</head>
<body>
	<div class="container">
	<h1 class="display-1"><c:out value="${Dojo.name}" /> Location Ninjas</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">First Name</th>
					<th scope="col">Last Name</th>
					<th scope="col">Age</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ Ninjas }" var="ninja">
				<tr>
					<th scope="row"><c:out value="${ninja.firstName}" /></th>
					<td><c:out value="${ninja.lastName}" /></td>
					<td><c:out value="${ninja.age}" /></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>