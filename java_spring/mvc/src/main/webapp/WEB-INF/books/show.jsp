<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Book</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div class="mastercontainer">
		<div class="container">
			<h1>
				<c:out value="${book.title}" />
			</h1>
			<p>
				Description:
				<c:out value="${book.description}" />
			</p>
			<p>
				Language:
				<c:out value="${book.language}" />
			</p>
			<p>
				Number of pages:
				<c:out value="${book.numberOfPages}" />
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