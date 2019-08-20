<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
</head>
<body>
	<div class="container">
		<h1>Create New Dojo</h1>
		<p>
			<form:errors class="text-danger" path="newDojoObj.*"></form:errors>
		</p>
		<form:form action="/dojo/new" method="post"
			modelAttribute="newDojoObj">
			<p>
				<form:errors path="newDojoObj.*"></form:errors>
				<form:label path="name">Name</form:label>
				<form:input path="name" class="form-control col-6" />
			</p>
			<input type="submit" value="Create Dojo" class="btn btn-primary" />
		</form:form>
	
	</div>
</body>
</html>
