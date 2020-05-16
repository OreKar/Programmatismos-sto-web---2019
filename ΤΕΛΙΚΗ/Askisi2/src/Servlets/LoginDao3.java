package Servlets;
import java.sql.*;

public class LoginDao3 {
	public static boolean validate(String username,String password){  
		boolean status=false;  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager
                .getConnection("jdbc:mysql://localhost/cinemadb","root","test123");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from customers where username=? and pass=?");  
		ps.setString(1,username);  
		ps.setString(2,password);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
}
