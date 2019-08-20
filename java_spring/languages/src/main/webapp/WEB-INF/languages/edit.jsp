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
<title>Edit Language</title>
</head>
<body>
	<div class="mastercontainer">
		<div class="container">
			<h1>Edit Language</h1>

			<form:form action="/languages/${language.id}" method="post"
				modelAttribute="language">
				<input type="hidden" name="_method" value="put">
				<p>
					<form:label path="name">Name</form:label>
					<form:errors path="name" />
					<form:input path="name" />
				</p>
				<p>
					<form:label path="creator">Creator</form:label>
					<form:errors path="creator" />
					<form:textarea path="creator" />
				</p>
				<p>
					<form:label path="version">Version</form:label>
					<form:errors path="version" />
					<form:input path="version" />
				</p>
				<input type="submit" value="Submit" />
			</form:form>
		</div>
	</div>
</body>
</html>