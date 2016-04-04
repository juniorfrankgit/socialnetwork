<%@ page import="socialnetwork.model.User"%>
<%@ page import="socialnetwork.dao.Dao"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>

<html>
	<head>
		<title>bd containt</title>
		<meta charset="utf-8">
	</head>
	<body> 
		<%
			List<User> users = (List<User>) request.getAttribute("userslist");
		%>
		<ul>
			<% for (User user : users) {%>
				<li>
					<p>Username:  <%=user.getUsername()%> Password:  <%=user.getPassword()%></p>
				</li>
			<%}%>
		</ul>
	</body>
</html>