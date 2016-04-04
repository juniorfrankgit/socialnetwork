angular.module('socialnetwork', [])
	.controller('MainCtrl', ['$scope', function($scope) {
		$scope.hello = 'Hello World!';
		console.log('MainCtrl has been created');
		}]);