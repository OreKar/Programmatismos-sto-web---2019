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
<title>REMOVE ADMIN</title>
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
                    <h3>REMOVE ADMIN</h3>
                    <form action="RemoveA" method="post">
                        <div class="form-group">
                            <input type="number" class="form-control" placeholder="CONTENT ADMIN ID" value="" name="id"/>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="add" value="REMOVE" />
                        </div>
                    </form>
                </div>
            </div>
        </div>
</body>
</html>