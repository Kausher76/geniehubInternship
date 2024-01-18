package com.servlet;

import java.io.IOException;

import com.Dao.PostDao;
import com.Db.DBConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/delete")
public class DeleteById extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer noteid = Integer.parseInt(req.getParameter("note_id"));
		PostDao dao = new PostDao(DBConnect.getConn());
		boolean i = dao.deletePost(noteid);
		if (i) {
			HttpSession session = req.getSession();
			session.setAttribute("updateMsg", "Deleted Successfully");
			resp.sendRedirect("showNotes.jsp");
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("wrongMsg", "Not Deleted");
			resp.sendRedirect("showNotes.jsp");

		}
	}
}
