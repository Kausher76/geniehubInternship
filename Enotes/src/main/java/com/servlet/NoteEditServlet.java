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
@WebServlet("/NoteEditServlet")
public class NoteEditServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Integer noteid = Integer.parseInt(req.getParameter("noteid"));
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			
			PostDao dao =new PostDao(DBConnect.getConn());
			boolean b = dao.postUpdate(noteid, title, content);
			if(b) {
				HttpSession session = req.getSession();
				session.setAttribute("updateMsg", "Notes Updated Successfully");
				resp.sendRedirect("showNotes.jsp");
			}
			else {
				HttpSession session = req.getSession();
				session.setAttribute("wrongMsg", "Notes Not Updated Successfully");
				resp.sendRedirect("showNotes.jsp");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
