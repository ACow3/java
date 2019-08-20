<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
	<div class="container">
		<h1>Create New Ninja</h1>
		<p>
			<form:errors class="text-danger" path="newNinjaObj.*"></form:errors>
		</p>
		<form:form action="/ninja/new" method="post"
			modelAttribute="newNinjaObj">
			<p>
				<form:errors path="newNinjaObj.*"></form:errors>
				<form:label path="firstName">First Name</form:label>
				<form:input path="firstName" class="form-control col-6" />
			</p>
			<p>
				<form:label path="lastName">Last Name</form:label>
				<form:input path="lastName" class="form-control col-6" />

				<form:label path="age">Age</form:label>
				<form:input path="age" class="form-control col-6" />
			</p>

			<p>
				<form:select path="dojo" class="form-control col-6 mt-2">
					<c:forEach items="${Dojos}" var="dojo">
						<form:option value="${dojo.id}">
							<c:out value="${dojo.name}" />
						</form:option>
					</c:forEach>
				</form:select>
			</p>
			
			<input type="submit" value="Create Ninja" class="btn btn-primary mb-2" />
		</form:form>
	</div>
</body>
</html>