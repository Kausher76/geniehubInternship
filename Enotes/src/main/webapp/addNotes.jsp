<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
UserDetails user1 = (UserDetails) session.getAttribute("userD");

if (user1 == null) {
	response.sendRedirect("login.jsp");
	session.setAttribute("Login-Error", "Please Login");
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>
<%@include file="all_component/allCss.jsp"%>
</head>
<body>
	<div class="containter-fluid">
		<%@include file="all_component/navbar.jsp"%>
		<div class="row">
			<div class="container mt-5">

				<!-- Note Input Form -->
				<form action="addNotesServlet" method="post">
					<h2 class="text-center">Add Your Notes</h2>
					<div class="form-group">

						<%
						UserDetails us = (UserDetails) session.getAttribute("userD");
						if (us != null) {
						%>
						<input type="hidden" value=" <%=us.getId()%> " name="uid">
						<%
						}
						%>
						<label for="noteTitle">Note Title</label> <input type="text"
							class="form-control" id="noteTitle"
							placeholder="Enter the title of your note" name="title" required>
					</div>

					<div class="form-group">
						<label for="noteBody">Note Body</label>
						<textarea class="form-control" id="noteBody" rows="12"
							placeholder="Enter the body of your note" name="content" required></textarea>
					</div>

					 <button type="submit" class="btn btn-primary mb-3 text-center">Add Note</button>
				</form>
			</div>
		</div>

	</div>
	<%@include file="all_component/footer.jsp"%>

</body>
</html>