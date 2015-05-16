var ttControllers = angular.module("ttControllers", []);

ttControllers.controller('FacultiesCtrl', ['$scope', 'Faculties', function ($scope, Faculties) {
    var facultiesPromise = Faculties.get();
    facultiesPromise.$promise.then(function(data) {
        $scope.faculties = data._embedded.faculties;
    })
}]);

ttControllers.controller('FacultyCtrl', ['$scope', '$routeParams', 'Faculty', 'Groups', function ($scope, $routeParams, Faculty, Groups) {
    $scope.faculty = Faculty.get({facultyId: $routeParams.facultyId});

    var groupPromise = Groups.get({facultyId: $routeParams.facultyId});
    groupPromise.$promise.then(function(data) {
        $scope.groups = data._embedded.groups;
    });

}]);

ttControllers.controller('TimeTableCtrl', ['$scope', '$routeParams', 'TimeTable', 'Group', function ($scope, $routeParams, TimeTable, Group) {
    $scope.group = Group.get({groupId: $routeParams.groupId});

    var timeTablePromise = TimeTable.get({groupId: $routeParams.groupId});
    timeTablePromise.$promise.then(function(data) {
        $scope.pairs = data._embedded.pairs;
    });

}]);
