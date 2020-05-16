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
@WebServlet("/AssignToCinema")
public class AssignToCinema extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager
	                .getConnection("jdbc:mysql://localhost/cinemadb","root","test123");  
			
           int fID = Integer.valueOf(request.getParameter("movie_id"));
			
			String movie = "";
			

		    PreparedStatement pts=con.prepareStatement("SELECT filmTitle FROM cinemadb.films WHERE filmId =?");
		     pts.setInt(1,fID);
		     pts.executeQuery();
		     
		     ResultSet rs=pts.executeQuery(); 
		     rs.next();
		 movie = rs.getString(1);
			
			
			      
			PreparedStatement ps=con.prepareStatement(  
			"insert into provoles (provoliID, provoliFilm, provoliStartDate, provoliEndDate, ContentAdmins_contentAdminsId, provoliCinema) values(?, ?, ?, ?, ?, ?)");
		   
			 ps.setInt(1, Integer.valueOf(request.getParameter("id"))); 
			 ps.setString(2, movie); 
			 ps.setString(3, request.getParameter("start_date")); 
			 ps.setString(4, request.getParameter("end_date"));
			 ps.setInt(5, Integer.valueOf(request.getParameter("contentadmin_id")));
			 ps.setInt(6, Integer.valueOf(request.getParameter("cinema_id")));
			 ps.executeUpdate(); 
			 ps.close(); 
	         con.close(); 
	         PrintWriter out = response.getWriter(); 
	         out.print("<div class=\"alert alert-success\">\r\n" + 
						"  <strong>SUCCESS!</strong> Assigned Movie with ID : " + request.getParameter("movie_id") + " to Cinema with ID : " + request.getParameter("cinema_id") + ".\r\n" + 
						"</div>");
				RequestDispatcher rd=request.getRequestDispatcher("AssignToCinema.jsp");
				rd.include(request,response);
				out.close();
	}catch(Exception e) {
		System.out.println(e);
		PrintWriter out = response.getWriter(); 
		 out.print("<div class=\"alert alert-danger\">\r\n" + 
					"  <strong>ERROR!</strong> Something went wrong.\r\n" + 
					"</div>");
			RequestDispatcher rd=request.getRequestDispatcher("AssignToCinema.jsp");
			rd.include(request,response);
			out.close();
	}
  }
}
