package Servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddMovie
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager
	                .getConnection("jdbc:mysql://localhost/cinemadb","root","test123");  
			 
			
			
			PreparedStatement ps=con.prepareStatement(  
			"insert into customers (username, pass) values(?, ?)");
			 ps.setString(1,request.getParameter("user")); 
			 ps.setString(2,request.getParameter("pass")); 
			 ps.executeUpdate(); 
			 ps.close(); 
	         con.close(); 
	         PrintWriter out = response.getWriter(); 
	         out.print("<div class=\"alert alert-success\">\r\n" + 
						"  <strong>SUCCESS!</strong> CUSTOMER REGISTERED.\r\n" + 
						"</div>");

			 out.close();
		}catch(Exception e) {
			System.out.println(e);
			PrintWriter out = response.getWriter(); 
			 out.print("<div class=\"alert alert-danger\">\r\n" + 
						"  <strong>ERROR!</strong> Something went wrong.\r\n" + 
						"</div>");
				RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
				rd.include(request,response);
				out.close();
		}
	}

}
