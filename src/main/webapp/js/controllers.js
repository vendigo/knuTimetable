var ttControllers = angular.module("ttControllers", []);

ttControllers.controller('MainPageCtrl', ['$scope', function ($scope) {
}]);

ttControllers.controller('FacultiesCtrl', ['$scope', 'Faculties', function ($scope, Faculties) {
    var queryResult = Faculties.query();
    queryResult.$promise.then(function(data) {
        $scope.faculties = data._embedded.faculties;
    })
}]);

ttControllers.controller('FacultyCtrl', ['$scope', '$routeParams', 'Faculty', function ($scope, $routeParams, Faculty) {
    var queryResult = Faculty.get({facultyId: $routeParams.facultyId});

    $scope.faculty = queryResult;

    /*queryResult.$promise.then(function(data) {
        $scope.faculty = data._embedded.faculty
    });*/
}]);

ttControllers.controller('TimeTableCtrl', ['$scope', '$routeParams', 'TimeTable', function ($scope, $routeParams, TimeTable) {
    $scope.timeTable = TimeTable.get({groupId: $routeParams.groupId});
}]);
