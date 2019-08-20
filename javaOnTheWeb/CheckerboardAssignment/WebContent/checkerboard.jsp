<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
 --><title>Checkerboard</title>
<style>
.container {
	text-align: center;
	width: 1200px;
	height: 800px;
}

.cb_title {
	font-size: 35pt;
	text-align: center;
}

.red_box {
	width: 100px;
	height: 100px;
	background-color: red;
	display: inline-block;
}

.blue_box {
	width: 100px;
	height: 100px;
	background-color: blue;
	display: inline-block;
}
</style>
</head>
<body>

	<div class="mastercontainer">
		<div class="container mt-5">

			<%
		
			int width=0; int height=0;
			if(request.getParameter("width") != null) {
				width = Integer.parseInt(request.getParameter("width"));
			}
		
				if(request.getParameter("height") != null){
					height = Integer.parseInt(request.getParameter("height"));
		
		
				}%>
			<h1>
				Checkerboard
				<%= width %>w X
				<%= height %>h
			</h1>
			<% 
					for(int i=0; i<height; i++){
						if(i%2 == 0){ %>
			<div class="even">
				<% for(int j=0; j<width; j++){
									if(j%2 == 0){ %>
				<div class="red_box"></div>
				<% } else { %>
				<div class="blue_box"></div>
				<% }
						} %>
			</div>

			<div class="odd">
				<% for(int j=0; j<width; j++){
									if(j%2 == 0){ %>
				<div class="blue_box"></div>
				<% } else { %>
				<div class="red_box"></div>
				<% }
						} %>
			</div>


			<% } %>
			<% } %>
		</div>

	</div>

</body>
</html>