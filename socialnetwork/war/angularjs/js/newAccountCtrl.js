angular.module('newAccountCtrl',[])
	.controller('NewAccounrCtrl',['$scope','$location' function($scope, $location) {
		if($location.path() == '/login.jsp'){
			$scope.yes = 1;
		}
	}]);