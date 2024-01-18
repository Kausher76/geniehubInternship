<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
UserDetails user2 = (UserDetails) session.getAttribute("userD");

if (user2 == null) {
	response.sendRedirect("login.jsp");
	session.setAttribute("Login-Error", "Please Login");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<%@include file="all_component/allCss.jsp"%>

<style>
.div-color {
	height: 80vh;
}
</style>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid div-color ">

		<div class="card py-5 ">
			<div class="card-body text-center">
				<img alt="" src="IMG/home4.jpeg" class="img-fluid mx-auto w-100 p-3"
					style="max-width: 300px">
				<h1>START TAKING YOUR NOTES</h1>
				<a href="addNotes.jsp" class="btn btn-outline-primary">ADD NOTES</a>

			</div>
		</div>
	</div>
	<%@include file="all_component/footer.jsp"%>
</body>
</html>