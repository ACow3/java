<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Books</title>
</head>
<body>
	<div class="mastercontainer">
		<div class="container">

			<h1>All Books</h1>
			<table class="table-bordered">
				<thead>
					<tr>
						<th>Title</th>
						<th>Description</th>
						<th>Language</th>
						<th>Number of Pages</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${books}" var="book">
						<tr>
							<td><c:out value="${book.title}" /></td>
							<td><c:out value="${book.description}" /></td>
							<td><c:out value="${book.language}" /></td>
							<td><c:out value="${book.numberOfPages}" /></td>
							<td><a class="btn btn-info mt-2" href="/books/show/${book.id}">Show</a></td>	
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a class="btn btn-warning mt-2" href="/books/new">New Book</a>

		</div>
	</div>


</body>
</html>