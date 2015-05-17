var ttControllers = angular.module("ttControllers", []);

ttControllers.controller('FacultiesCtrl', ['$scope', '$filter', 'Faculties', 'Faculty', function ($scope, $filter, Faculties, Faculty) {
    var loadFaculties = function () {
        Faculties.get().$promise.then(function (data) {
            $scope.faculties = data._embedded.faculties;
        });
    };

    /*Initial loading*/
    loadFaculties();

    $scope.deleteFaculty = function (faculty) {
        var _facultyId = $filter('entityId')(faculty);
        console.log("deleting facultyId: " + _facultyId);
        Faculty.delete({facultyId: _facultyId}).$promise.then(function (data) {
            loadFaculties();
        });
    }
}]);

ttControllers.controller('FacultyCtrl', ['$scope', '$routeParams', 'Faculty', 'Groups', function ($scope, $routeParams, Faculty, Groups) {
    /*Load Faculty information*/
    $scope.faculty = Faculty.get({facultyId: $routeParams.facultyId});
    /*Load groups*/
    var groupPromise = Groups.get({facultyId: $routeParams.facultyId});
    groupPromise.$promise.then(function (data) {
        $scope.groups = data._embedded.groups;
    });
}]);

ttControllers.controller('FacultyAdminCtrl', ['$scope', '$routeParams', '$window', 'Faculty', 'Faculties', function ($scope, $routeParams, $window, Faculty, Faculties) {
    /*Edit*/
    if ($routeParams.action == "edit") {
        $scope.title = "EDIT";
        $scope.faculty = Faculty.get({facultyId: $routeParams.facultyId});
    } else if ($routeParams.action == "new") {
        $scope.title = "NEW";
        $scope.faculty = {
            name: "",
            description: ""
        };
    }

    $scope.saveFaculty = function () {
        Faculties.save($scope.faculty);
        $window.location.href = "#/admin/faculties/";
    }

}]);

ttControllers.controller('TimeTableCtrl', ['$scope', '$routeParams', 'TimeTable', function ($scope, $routeParams, TimeTable) {
    $scope.timetable = TimeTable.get({groupId: $routeParams.groupId});
}]);
