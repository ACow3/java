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
<title>New Language</title>
</head>
<body>
	<div class="mastercontainer">
		<div class="container">

			<h1>New Language</h1>
			<form:form action="/languages" method="post" modelAttribute="language">
				<p>
					<form:label class="col-6 mt-2" path="name">Name</form:label>
					<form:errors class="col-6 mt-2" path="name" />
					<form:input class="col-6 mt-2" path="name" />
				</p>
				<p>
					<form:label class="col-6 mt-2" path="creator">Creator</form:label>
					<form:errors class="col-6 mt-2" path="creator" />
					<form:textarea class="col-6 mt-2" path="creator" />
				</p>
				<p>
					<form:label class="col-6 mt-2" path="version">Version</form:label>
					<form:errors class="col-6 mt-2" path="version" />
					<form:input class="col-6 mt-2" path="version" />
				</p>
				<input type="submit" value="Submit" />
			</form:form>


		</div>
	</div>
</body>
</html>