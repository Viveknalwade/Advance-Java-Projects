package in.mvc.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.mvc.dbCon.DBCon;
import in.mvc.model.User;


@WebServlet("/loginForm")
public class Login extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		String myEmail = req.getParameter("em1");
		String myPass = req.getParameter("pass1");
		try {
			
			Connection conn = DBCon.getConnection();
			
			String select_query = "SELECT * FROM register WHERE email=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(select_query);
			
			ps.setString(1,myEmail);
			ps.setString(2,myPass);
			
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				User user = new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCity(rs.getString("city"));
				
				HttpSession session = req.getSession();
				session.setAttribute("session_user", user);
				
				RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
				rd.forward(req, resp);
			}else {
				out.println("<h3 style='color:red'>Email or Password didnt match</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			}			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

