<%@page import="com.Db.DBConnect"%>
<%@page import="com.Dao.PostDao"%>
<%@page import="com.User.Post"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
UserDetails user3 = (UserDetails) session.getAttribute("userD");

if (user3 == null) {
	response.sendRedirect("login.jsp");
	session.setAttribute("Login-Error", "Please Login");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ShowNotes</title>
<%@include file="all_component/allCss.jsp"%>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>

	<%
	String updateMsg = (String) session.getAttribute("updateMsg");
	if (updateMsg != null) {
	%>
	<div class="alert alert-success" role="alert"><%=updateMsg%></div>
	<%
	session.removeAttribute("updateMsg");
	}
	%>

	<%
	String wrongMsg = (String) session.getAttribute("wrongMsg");
	if (wrongMsg != null) {
	%>
	<div class="alert alert-danger" role="alert"><%=wrongMsg%></div>
	<%
	session.removeAttribute("wrongMsg");
	}
	%>

	<div class="container">
		<h2 class="text-center">All Notes:</h2>
		<div class="row">
			<div class="col-md-12">
				<%
				if (user3 != null) {
					PostDao ob = new PostDao(DBConnect.getConn());
					List<Post> post = ob.getData(user3.getId());
					for (Post po : post) {
				%>

				<div class="card mt-3">
					<div class="card-body">
						<h5 class="card-title text-center"><%=po.getTitle()%></h5>
						<p><%=po.getContent()%></p>
						<p class="text-success">
							Published By:
							<%=user3.getName()%></p>
						<p class="text-success">
							Published Date:
							<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(po.getpDate())%></p>
						<div class="text-center mt-2">
							<a href="delete?note_id=<%=po.getId()%>" class="btn btn-danger">Delete</a>
							<a href="edit.jsp?note_id=<%=po.getId()%>"
								class="btn btn-primary">Edit</a>
						</div>
					</div>
				</div>



				<%
				}
				}
				%>



			</div>
		</div>
	</div>

</body>
</html>