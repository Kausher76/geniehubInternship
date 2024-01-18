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

@WebServlet("/login")
public class loginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		UserDetails us = new UserDetails();
		us.setEmail(email);
		us.setPassword(password);
		
		UserDao dao = new UserDao(DBConnect.getConn());
		UserDetails user = dao.loginuser(us);
		
		if(user != null) {
			
			HttpSession session = req.getSession();
			session.setAttribute("userD", user);
			resp.sendRedirect("home.jsp");
		}
		else {
			HttpSession session = req.getSession();
			session.setAttribute("login_faild", "Invalid Email Or Password");
			resp.sendRedirect("login.jsp");
		}
	}
}
