app.controller('pageController', function($scope) {
	/*Init*/
	$scope.activePage = 'main';

	/*Returns true if given page is active*/
	$scope.isActive = function(page) {
		return $scope.activePage === page;
	};
	/*Returns class="active" if given page is active*/
	$scope.activeOn = function(page) {
		return {'active': $scope.activePage === page};
	};
	/*Changes activePage to given*/
	$scope.goTo = function(page) {
		$scope.activePage = page;
	}
});

