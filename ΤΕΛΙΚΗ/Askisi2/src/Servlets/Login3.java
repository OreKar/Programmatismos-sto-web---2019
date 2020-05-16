package Servlets;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login3")
public class Login3 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("username");
		String p = request.getParameter("password");
		
		if(LoginDao3.validate(n,p)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", n);
			response.sendRedirect("Customer.jsp");
		}
		else {
			out.print("<div class=\"alert alert-danger\">\r\n" + 
					"  <strong>SORRY INVALID USERNAME OR PASSWORD!</strong> Please try again.\r\n" + 
					"</div>");
			RequestDispatcher rd=request.getRequestDispatcher("login3.html");
			rd.include(request,response);
		}
		
		out.close();
	}

}