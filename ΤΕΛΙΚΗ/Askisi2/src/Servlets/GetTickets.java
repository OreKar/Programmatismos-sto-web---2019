package Servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddMovie
 */
@WebServlet("/GetTickets")
public class GetTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager
	                .getConnection("jdbc:mysql://localhost/cinemadb","root","test123");  
			
			response.setContentType("text/html"); 
	        PrintWriter out = response.getWriter(); 
	        
	        HttpSession session = request.getSession(false); 
	        
	        String un = (String)session.getAttribute("username"); 
	        
	  
			
			int fID = Integer.valueOf(request.getParameter("provoliID"));
				
				String movie = "";
				

			    PreparedStatement pts=con.prepareStatement("SELECT provoliFilm FROM cinemadb.provoles WHERE provoliID =?");
			     pts.setInt(1,fID);
			     pts.executeQuery();
			     
			     ResultSet rs=pts.executeQuery(); 
			     rs.next();
			 movie = rs.getString(1);
			      
			PreparedStatement ps=con.prepareStatement(  
			"insert into history (username, film, tickets) values(?, ?, ?)");
			 ps.setString(1,un);
			 ps.setString(2,movie);
			 ps.setString(3,request.getParameter("Ntickets")); 
			 ps.executeUpdate(); 
			 ps.close(); 
	         con.close(); 
	         PrintWriter out1 = response.getWriter(); 
	         out1.print("<div class=\"alert alert-success\">\r\n" + 
					    	"  <strong>SUCCESS!</strong> Tickets bought!.\r\n" + 
						"</div>");

			 out1.close();
		}catch(Exception e) {
			System.out.println(e);
			PrintWriter out = response.getWriter(); 
			 out.print("<div class=\"alert alert-danger\">\r\n" + 
						"  <strong>ERROR!</strong> Something went wrong.\r\n" + 
						"</div>");
				RequestDispatcher rd=request.getRequestDispatcher("GetTickets.jsp");
				rd.include(request,response);
				out.close();
		}
	}

}
