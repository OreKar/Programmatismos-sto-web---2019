package Servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AssingToCinema
 */
@WebServlet("/Modify")
public class Modify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager
	                .getConnection("jdbc:mysql://localhost/cinemadb","root","test123");  
			

			
			       
			PreparedStatement ps=con.prepareStatement(  
			"UPDATE provoles SET provoliFilm =? , provoliCinema=?, provoliStartDate=?, provoliEndDate=?, provoliNumberOfReservations=?, provoliIsAvailable=?  WHERE provoliID = ? ");
			
		   
			 //ps.setInt(1, Integer.valueOf(request.getParameter("id"))); 
			 ps.setString(1, request.getParameter("movie")); 
			 ps.setString(2, request.getParameter("cinema")); 
			 ps.setString(3, request.getParameter("start_date")); 
			 ps.setString(4, request.getParameter("end_date"));
			 ps.setInt(5, Integer.valueOf(request.getParameter("reserv")));
			 ps.setString(6,request.getParameter("available"));
			 ps.setInt(7, Integer.valueOf(request.getParameter("id"))); 
			 ps.executeUpdate(); 
			 ps.close(); 
	         con.close(); 
	         PrintWriter out = response.getWriter(); 
	         out.print("<div class=\"alert alert-success\">\r\n" + 
						"  <strong>SUCCESS!</strong> CHANGED PROVOLI WITH ID  : " + request.getParameter("id")+ ".\r\n" + 
						"</div>");
				RequestDispatcher rd=request.getRequestDispatcher("Modify.jsp");
				rd.include(request,response);
				out.close();
	}catch(Exception e) {
		System.out.println(e);
		PrintWriter out = response.getWriter(); 
		 out.print("<div class=\"alert alert-danger\">\r\n" + 
					"  <strong>ERROR!</strong> Something went wrong.\r\n" + 
					"</div>");
			RequestDispatcher rd=request.getRequestDispatcher("Modify.jsp");
			rd.include(request,response);
			out.close();
	}
  }
}

