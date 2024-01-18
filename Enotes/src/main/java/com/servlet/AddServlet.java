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

@WebServlet("/addNotesServlet")
public class AddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String idParam = req.getParameter("uid");
		int id = Integer.parseInt(idParam.trim());
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		PostDao dao = new PostDao(DBConnect.getConn());
		
		boolean f = dao.addPost(title, content, id);
		
		if(f) {
			HttpSession session = req.getSession();
			session.setAttribute("updateMsg", "Note Added Successfully");
			resp.sendRedirect("showNotes.jsp");
		}
		else {
			HttpSession session = req.getSession();
			session.setAttribute("wrongMsg", "Note Not Added Successfully");
			resp.sendRedirect("showNotes.jsp");
			
		}
		
		
	}
}
