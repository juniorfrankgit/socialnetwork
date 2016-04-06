<!DOCTYPE html>

<html ng-app="socialnetwork">
	
	<head>
		<title>Socialnetwork-login</title>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="/css/createUser.css">
	</head>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.min.js"></script>
	<script src="/angularjs/js/socialnetwork.js"></script>
	
	<body ng-controller="MainCtrl">
	   <header>
	    <h1 id="title1" >WELCOME TO THE SOCIAL NETWORK</h1>
		<div ng-controller="LoginCtrl">
			<form id="form1" method="post" action="login_success">
					<h2 style="text-align:center">Login as a registered user</h2> 
				  	<div style="text-align:center" >
				  		<label>Email: </label><input type="text" name="email1">
				  		<label>Password: </label><input type="password" name="password1" >
				  		<input type="submit" value="Log In" id="loginbutton">
				  	</div>
				 
			</form>
		</div>
		</header>
		<section><img src="/img/socialnetwork.jpg" id="img1" ng-hide="yes"></section>
		
		<footer>
			<div ng-controller="NewAccountCtrl" >			
				 <form id="form2" method="post" action="registration_success">
		  			<h2 >Create an account</h2>	
		  			<div class="data">
		  			 	<input type="text" name="lastname" id="name" placeholder="Lastname">
		  			 	<input type="text" name="firstname" id="firstname" placeholder="firstname">
		  			 	<input type="text" name="email2" id="email" placeholder="Email"><br>
		  			 	<input type="password" name="password" id="password2" placeholder="Password"><br/>
		  			 	<input type="submit" id="createaccount" value="Create an account">
		  			</div>
		  			
				 </form> 
			</div>	
		</footer>

			
	</body>
</html>
