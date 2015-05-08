var ttControllers = angular.module("ttControllers", []);

ttControllers.controller('MainPageCtrl', ['$scope', function ($scope) {
}]);

ttControllers.controller('FacultiesCtrl', ['$scope', 'Faculties', function ($scope, Faculties) {
    $scope.faculties = Faculties.query();
}]);

ttControllers.controller('FacultyCtrl', ['$scope', '$routeParams', 'Faculty', function ($scope, $routeParams, Faculty) {
    $scope.faculty = Faculty.get({facultyId: $routeParams.facultyId});
}]);

ttControllers.controller('TimeTableCtrl', ['$scope', '$routeParams', 'TimeTable', function ($scope, $routeParams, TimeTable) {
    $scope.timeTable = TimeTable.get({groupId: $routeParams.groupId});
}]);
