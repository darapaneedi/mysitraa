<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<meta http-equiv="Cache-Control"
	content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<title>RubikLife Health Care</title>
<%String contextName = application.getContextPath();%>
<script>var contextName = "<%=contextName %>";</script>
<link rel='stylesheet prefetch'
	href="<%=contextName %>/rubikLife/css/bootstrap.min.css">
	<link rel='stylesheet prefetch'
	href="<%=contextName %>/rubikLife/css/login.css">
	<script src="<%=contextName %>/rubikLife/js/jquery.min.js"></script>
<script src="<%=contextName %>/rubikLife/js/bootstrap.min.js"></script>
</head>
<body style="display: table; width: 100%" >
	<div style="display: table-cell; vertical-align: middle; text-align: center;">
		<div class="login-01">
			<div class="one-login">
				
				<form class="form" action="authenticate.htm">
				<div class="one-login-head">
					<input type="radio" name= "user" checked="checked" value="member" />Member&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" name= "user" value="dietitian" />Dietitian&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" name= "user" value="register" onclick="window.location='http://localhost/Portals/welcome.htm#/infoForm'"/>Register
				</div>
					<ul>
						<li>
						<input type="text" name="email" class="text" placeholder="Enter Email Id" tabindex="1" id="email">
						</li>
					</ul>
						<span style="color:red">	<%=request.getParameter("error")!=null?request.getParameter("error"):"" %></span>
					<div class="submit">
							<input type="submit" value="Sign In" tabindex="2">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>