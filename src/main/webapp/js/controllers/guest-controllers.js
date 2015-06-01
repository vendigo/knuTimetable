var ttControllers = angular.module("ttControllers", []);

ttControllers.controller('FacultiesCtrl', ['$scope', '$filter', 'Faculties', 'Faculty', function ($scope, $filter, Faculties, Faculty) {
    var loadFaculties = function () {
        Faculties.get(function (data) {
            $scope.faculties = data._embedded && data._embedded.faculties;
        });
    };

    /*Initial loading*/
    loadFaculties();

    $scope.deleteFaculty = function (faculty) {
        var _facultyId = $filter('entityId')(faculty);
        Faculty.delete({facultyId: _facultyId}, function () {
            loadFaculties();
        });
    }
}]);

ttControllers.controller('FacultyCtrl', ['$scope', '$routeParams', 'Faculty', 'FacultyGroups', function ($scope, $routeParams, Faculty, FacultyGroups) {
    /*Load Faculty information*/
    $scope.faculty = Faculty.get({facultyId: $routeParams.facultyId});
    /*Load groups*/
    FacultyGroups.get({facultyId: $routeParams.facultyId} ,function (data) {
        $scope.groups = data._embedded && data._embedded.groups;
    });
}]);

ttControllers.controller('TimeTableCtrl', ['$scope', '$routeParams', 'TimeTable', function ($scope, $routeParams, TimeTable) {
    $scope.timetable = TimeTable.get({groupId: $routeParams.groupId});
}]);
