<!DOCTYPE html>

<html ng-app="socialnetwork">
	
	<head>
		<title>Socialnetwork-login</title>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="/css/createUser.css">
	</head>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.min.js"></script>
	<script src="/angularjs/socialnetwork.js"></script>
	
	<body ng-controller="MainCtrl">
	   <header>
	    <h1 id="title1" >WELCOME TO THE SOCIAL NETWORK</h1>
		
		<form id="form1" method="post" action="">
				<h2 style="text-align:center">Login as a registered user</h2> 
			  	<div style="text-align:center" >
			  		<label>Username: </label><input type="text" name="username">
			  		<label>Password: </label><input type="password" name="password" >
			  		<input type="submit" value="Log In" id="loginbutton">
			  	</div>
			 
		</form>
		</header>
		<section><img src="socialnetwork.jpg" id="img1"></section>
		<footer>			
				 <form id="form2" method="post" action="login" >
		  			<h2 >Create an account</h2>	
		  			<div class="data">
		  			 	<input type="text" name="lastname" id="name" placeholder="Lastname">
		  			 	<input type="text" name="firstname" id="firstname" placeholder="firstname">
		  			 	<input type="text" name="email" id="email" placeholder="Email"><br>
		  			 	<input type="password" name="password" id="password" placeholder="Password"><br/>
		  			 	<input type="submit" id="createaccount" value="Create an account">
		  			</div>
		  			
				 </form> 
		</footer>

			
	</body>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.min.js"></script>
	<script src="/angularjs/socialnetwork.js"></script>
</html>
