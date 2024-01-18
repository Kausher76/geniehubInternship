<%@page import="com.Db.DBConnect"%>
<%@page import="com.Dao.PostDao"%>
<%@page import="com.User.Post"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
UserDetails user1 = (UserDetails) session.getAttribute("userD");

if (user1 == null) {
	response.sendRedirect("login.jsp");
	session.setAttribute("Login-Error", "Please_Login");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Notes</title>
<%@include file="all_component/allCss.jsp"%>
</head>
<body>
	<%
	Integer noteid = Integer.parseInt(request.getParameter("note_id"));
	
	PostDao post = new PostDao(DBConnect.getConn());
	Post po =  post.getDataById(noteid);
	%>
	<div class="containter-fluid">
		<%@include file="all_component/navbar.jsp"%>
		<div class="row">
			<div class="container mt-5">

				<!-- Note Input Form -->
				<form action="NoteEditServlet" method="post">
					<h2 class="text-center">Edit Your Notes</h2>
					<input type="hidden" value="<%=noteid%>" name = "noteid">
					<div class="form-group">


						<label for="noteTitle">Note Title</label> <input type="text"
							class="form-control" id="noteTitle" value ="<%=po.getTitle() %>"
							placeholder="Enter the title of your note" name="title" required>
					</div>

					<div class="form-group">
						<label for="noteBody">Note Body</label>
						<textarea class="form-control" id="noteBody" rows="12" 
							placeholder="Enter the body of your note" name="content" required> <%= po.getContent() %></textarea>
					</div>

					<button type="submit" class="btn btn-primary mb-3">Update
						Note</button>
				</form>
			</div>
		</div>

	</div>
	<%@include file="all_component/footer.jsp"%>

</body>
</html>