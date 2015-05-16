var ttControllers = angular.module("ttControllers", []);

ttControllers.controller('MainPageCtrl', ['$scope', function ($scope) {
}]);

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

ttControllers.controller('TimeTableCtrl', ['$scope', '$routeParams', 'TimeTable', function ($scope, $routeParams, TimeTable) {
    $scope.timeTable = TimeTable.get({groupId: $routeParams.groupId});
}]);
