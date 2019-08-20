<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Language</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div class="mastercontainer">
		<div class="container">
			<h1>
				<c:out value="${language.name}" />
			</h1>
			<p>
				Creator:
				<c:out value="${language.creator}" />
			</p>
			<p>
				Version:
				<c:out value="${language.version}" />
			</p>
			<a href="/books/${book.id}/edit">Edit Book</a>
			<form action="/books/${book.id}" method="post">
				<input type="hidden" name="_method" value="delete"> <input
					type="submit" value="Delete">
			</form>
		</div>
	</div>
</body>
</html>