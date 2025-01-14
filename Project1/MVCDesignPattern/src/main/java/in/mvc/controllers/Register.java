package in.mvc.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.mvc.dbCon.DBCon;

@WebServlet("/regForm")
public class Register extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String myName = req.getParameter("name1");
		String myEmail = req.getParameter("em1");
		String myPass = req.getParameter("pass1");
		String myCity = req.getParameter("city1");
		
		
		
		
		try {
			Connection conn = DBCon.getConnection();
			
			String insert_query = "INSERT INTO register VALUES(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insert_query);
			
			ps.setString(1, myName);
			ps.setString(2, myEmail);
			ps.setString(3, myPass);
			ps.setString(4, myCity);
			
			
			int count = ps.executeUpdate();
			if(count > 0) {
				out.println(" <h3 style='color:green'>Registered Successfully</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			}
			else {
				out.println(" <h3 style='color:red'>User Not Registered</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.html");
				rd.include(req, resp);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
