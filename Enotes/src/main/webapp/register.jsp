<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<%@include file="all_component/allCss.jsp"%>

<style type="text/css">
.div-color {
	background-image: linear-gradient(to right top, #c080a4, #b07ca8, #9e78aa, #8a75ab,
		#7473aa, #5a6fa3, #3f6b99, #22668d, #005d77, #005261, #00474b, #053b37
		);
	height: 575px;
}
</style>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>

	<div class="container-fluid div-color">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card mt-4">
					<div class="card-header text-center text-white bg-custom">
						<i class="fa fa-user-plus fa-3x " aria-hidden="true"></i>
						<h4>Registration</h4>
					</div>



					<%
					String rmes = (String) session.getAttribute("registred");
					if (rmes != null) {
					%>
					<div class="alert alert-success" role="alert"><%=rmes %> <a href = "login.jsp">Login</a></div>
					<%
					}
					%>

					<%
					String Failed_message = (String) session.getAttribute("Failed_message");
					if (Failed_message != null) {
					%>
					<div class="alert alert-danger" role="alert"><%=Failed_message %></div>
					<%
					}
					%>
					
					<% 
						session.removeAttribute("registred");
						session.removeAttribute("Failed_message");
					%>
					 
					


					<div class="card-body">
						<form action="userServlet" method="post">
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Full Name</label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="name">

							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Email</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="email">

							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1"
									placeholder="Password" name="password">
							</div>

							<button type="submit"
								class="btn btn-primary badge-pill btn-block">Register</button>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="all_component/footer.jsp"%>
				
</body>
</html>