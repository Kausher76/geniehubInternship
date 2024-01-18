package com.servlet;

import java.io.IOException;

import com.Dao.UserDao;
import com.Db.DBConnect;
import com.User.UserDetails;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		UserDetails us = new UserDetails();
		us.setName(name);
		us.setEmail(email);
		us.setPassword(password);
		UserDao dao = new UserDao(DBConnect.getConn());
		boolean f = dao.addUser(us);
		HttpSession session;
		if(f) {
			session = req.getSession();
			session.setAttribute("registred", "Registered Successfully");
			resp.sendRedirect("register.jsp");
			
		}
		else {
			session = req.getSession();
			session.setAttribute("Failed_message", "Something Went Wrong");
			resp.sendRedirect("register.jsp");
			
		}
		
		
	}
}
