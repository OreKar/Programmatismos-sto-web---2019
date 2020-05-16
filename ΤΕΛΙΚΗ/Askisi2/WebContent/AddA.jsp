<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>ADD ADMIN</title>
</head>
<body>
<%
	if(session.getAttribute("username")==null){
		response.sendRedirect("login2.html");
	}
%>
<div class="container login-container">
            <div class="row">
                <div class="col-md-6 login-form-1">
                    <h3>ADD ADMIN</h3>
                    <form action="AddA" method="post">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="USERNAME" value="" name="user"/>
                        </div>
                         <div class="form-group">
                            <input type="password" class="form-control" placeholder="PASSWORD" value="" name="pass"/>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="add" value="ADD" />
                        </div>
                    </form>
                </div>
            </div>
        </div>
</body>
</html>