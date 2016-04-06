angular.module('loginCtrl',[])
	.controller('LoginCtrl',['$scope','$location' function($scope,$location) {
		
		if($location.path() == '/login.jsp'){
			$scope.yes = 0;
		}
	}]);