app.controller('facultiesController', function($scope, $http) {
	$http.get('/guest/faculty').success(function(response) {
		$scope.faculties = response;
	});
});