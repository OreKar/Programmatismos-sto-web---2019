package Servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowProvoles")
public class ShowProvoles extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html><html><head><link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n" + 
				"<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n" + 
				"<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n" + 
				"<meta charset=\"UTF-8\"></head><body><h3>ALL AVAILABLE MOVIES</h3>" +
		"<table border='1' style=\"border: solid 1px #DDEEEE;border-collapse: collapse;border-spacing: 0;font: normal 13px Arial, sans-serif\">"
		+ "<tr><th style=\"background-color: #DDEFEF;border: solid 1px #DDEEEE;color: #336B6B;padding: 10px;text-align: left;text-shadow: 1px 1px 1px #fff; \">ID</th>"
		+ "<th style=\"background-color: #DDEFEF;border: solid 1px #DDEEEE;color: #336B6B;padding: 10px;text-align: left;text-shadow: 1px 1px 1px #fff; \">FILM</th>"
		+ "<th style=\"background-color: #DDEFEF;border: solid 1px #DDEEEE;color: #336B6B;padding: 10px;text-align: left;text-shadow: 1px 1px 1px #fff; \">CINEMA</th>"
		+ "<th style=\"background-color: #DDEFEF;border: solid 1px #DDEEEE;color: #336B6B;padding: 10px;text-align: left;text-shadow: 1px 1px 1px #fff; \">START DATE</th>"
		+ "<th style=\"background-color: #DDEFEF;border: solid 1px #DDEEEE;color: #336B6B;padding: 10px;text-align: left;text-shadow: 1px 1px 1px #fff; \">END DATE</th>"
		+ "<th style=\"background-color: #DDEFEF;border: solid 1px #DDEEEE;color: #336B6B;padding: 10px;text-align: left;text-shadow: 1px 1px 1px #fff; \">NUMBER OF RESERVATIONS</th>"
		+ "<th style=\"background-color: #DDEFEF;border: solid 1px #DDEEEE;color: #336B6B;padding: 10px;text-align: left;text-shadow: 1px 1px 1px #fff; \">AVAILABILITY</th>"
		+ "<th style=\"background-color: #DDEFEF;border: solid 1px #DDEEEE;color: #336B6B;padding: 10px;text-align: left;text-shadow: 1px 1px 1px #fff; \"></th></tr>");
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager
	                .getConnection("jdbc:mysql://localhost/cinemadb","root","test123"); 
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM Provoles");
			while(rs.next()) {
				out.print("<tr><td style=\"border: solid 1px #DDEEEE;color: #333;padding: 10px; text-shadow: 1px 1px 1px #fff;\">");
				out.println(rs.getInt(1));
				out.print("</td>");
				out.print("<td style=\"border: solid 1px #DDEEEE;color: #333;padding: 10px; text-shadow: 1px 1px 1px #fff;\">");
				out.println(rs.getString(2));
				out.print("</td>");
				out.print("<td style=\"border: solid 1px #DDEEEE;color: #333;padding: 10px; text-shadow: 1px 1px 1px #fff;\">");
				out.println(rs.getInt(3));
				out.print("</td>");
				out.print("<td style=\"border: solid 1px #DDEEEE;color: #333;padding: 10px; text-shadow: 1px 1px 1px #fff;\">");
				out.println(rs.getString(4));
				out.print("</td>");
				out.print("<td style=\"border: solid 1px #DDEEEE;color: #333;padding: 10px; text-shadow: 1px 1px 1px #fff;\">");
				out.println(rs.getString(5));
				out.print("</td>");
				out.print("<td style=\"border: solid 1px #DDEEEE;color: #333;padding: 10px; text-shadow: 1px 1px 1px #fff;\">");
				out.println(rs.getInt(6));
				out.print("</td>");
				out.print("<td style=\"border: solid 1px #DDEEEE;color: #333;padding: 10px; text-shadow: 1px 1px 1px #fff;\">");
				out.println(rs.getString(7));
				out.print("</td></tr>");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		out.print("</table></body></html>");
	}

}
