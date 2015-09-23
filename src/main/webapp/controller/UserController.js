var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
	$scope.contacts = [ "hi@email.c1111111111om", "hello@email.com" ];

	$http.get('userByIdAction', {
		params : {
			userId : 1,
		}
	}).success(function(data, status, headers, config) {
		$scope.items = data;
		$scope.json = angular.fromJson(data);
	});
});