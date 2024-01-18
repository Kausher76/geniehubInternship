<%@page import="com.Db.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<style>
.back-img {
	background: url("IMG/home1.jpg");
	background-size: cover;
	background-position: center center;
	background-repeat: no-repeat;
	width: 100%;
	height: 80vh;
}
</style>
<meta charset="UTF-8">
<title>Home Page</title>
<%@include file="all_component/allCss.jsp"%>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>

	<div class="container-fluid back-img">
		<div class="text-center">
			<h1 class="text-white ">
				<i class="fa fa-book mt-5" aria-hidden="true"></i>eNotes Save Your
				Notes
			</h1>
			<a href="login.jsp" class="btn btn-light"><i
				class="fa fa-user-circle-o" aria-hidden="true"></i>Login</a> <a
				href="register.jsp" class="btn btn-light"><i
				class="fa fa-user-plus" aria-hidden="true"></i>Register</a>
		</div>
	</div>
	<%@include file="all_component/footer.jsp"%>

</body>
</html>