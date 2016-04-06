<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="socialnetwork.model.User" %>


<html ng-app="socialnetwork">
	<%User u = (User) request.getAttribute("user");%>
	<head>
		<title><%=u.getFirstname()%></title>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="/css/welcome.css">
	</head>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.min.js"></script>
	<script src="/angularjs/js/socialnetwork.js"></script>
	
	<body >
	    <header>
	    	<h1 id="title1" >
	    		Welcome <%=u.getFirstname()+"  "+u.getLastname()%>
	    	</h1>
	    	<form method="post" action="logout">
	    		<input type="submit" value="logout" style="width:100px">
			</form>
		</header>
		<div class="profile">
			<img src="/img/unknown.jpg" class="profile"><br>
			<input id="file" TYPE="file" NAME="attachedfile" MAXLENGTH=70 ALLOW="text/*"><br>
			<label id="lab">Change your picture</label>
		</div>
	</body>
</html>
