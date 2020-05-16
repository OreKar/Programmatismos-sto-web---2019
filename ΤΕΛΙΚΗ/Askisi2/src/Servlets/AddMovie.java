package Servlets;


import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/AddMovie")
public class AddMovie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager
	                .getConnection("jdbc:mysql://localhost/cinemadb","root","test123");  
			      
			PreparedStatement ps=con.prepareStatement(  
			"insert into films (filmId, filmTitle, filmCategory, filmDescription) values(?, ?, ?, ?)");
			 ps.setInt(1, Integer.valueOf(request.getParameter("filmId"))); 
			 ps.setString(2,request.getParameter("filmTitle")); 
			 ps.setString(3,request.getParameter("filmCategory")); 
			 ps.setString(4,request.getParameter("filmDescription")); 
			 ps.executeUpdate(); 
			 ps.close(); 
	         con.close(); 
	         PrintWriter out = response.getWriter(); 
	         out.print("<div class=\"alert alert-success\">\r\n" + 
						"  <strong>SUCCESS!</strong> Movie added to the database.\r\n" + 
						"</div>");

			 out.close();
		}catch(Exception e) {
			System.out.println(e);
			PrintWriter out = response.getWriter(); 
			 out.print("<div class=\"alert alert-danger\">\r\n" + 
						"  <strong>ERROR!</strong> Something went wrong.\r\n" + 
						"</div>");
				RequestDispatcher rd=request.getRequestDispatcher("AddMovie.jsp");
				rd.include(request,response);
				out.close();
		}
	}

}
