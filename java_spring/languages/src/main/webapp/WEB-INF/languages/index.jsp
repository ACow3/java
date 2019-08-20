<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages</title>
</head>
<body>

	<div class="mastercontainer">
		<div class="container">

			<h1>All Languages</h1>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Name</th>
						<th scope="col">Creator</th>
						<th scope="col">Version</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${languages}" var="language">
						<tr>
							<td><c:out value="${language.name}" /></td>
							<td><c:out value="${language.creator}" /></td>
							<td><c:out value="${language.version}" /></td>
							<td><a class="btn btn-info mt-2" href="languages/${language.id}/edit">Edit</a>
								<a class="btn btn-danger mt-2" href="${language.id}">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a class="btn btn-success mt-2" href="/languages/new">Add Language</a>
		</div>
	</div>

</body>
</html>