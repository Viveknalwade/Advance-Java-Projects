<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<%@include file="components/allcomponents.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>

<div class="container-fluid">

		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card mt-5">
					<div class="card-header text-center bg-custom">
					<i class="fa fa-user fa-3x" aria-hidden="true"></i>
					<h4>Login</h4>
					</div>
						<%
					String loginFailed = (String) session.getAttribute("login-failed");
					if (loginFailed != null) {
					%>
					<div class="alert alert-danger" role="alert"><%=loginFailed%></div>
					<%
					session.removeAttribute("login-failed");
					}
					%>
					<%
					String lgMsg = (String)session.getAttribute("logoutMsg");
					if(lgMsg != null){%>
					<div class="alert alert-success" role="alert"><%=lgMsg%></div>
					
					<%
						session.removeAttribute("logoutMsg");
					}
					%>
					
					<div class="card-body">
					
				
						<form action="loginServlet" method="post">
							<div class="form-group">
							<label >Enter Email</label> 
							 <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="uemail">
								
							</div>
							<div class="form-group">
								<label >Enter Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1" name="upassword"
								>
							</div>
							
							<button type="submit" class="btn btn-primary badge-pill btn-block">Login</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>