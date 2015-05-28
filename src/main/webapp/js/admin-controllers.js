var ttAdminControllers = angular.module("ttAdminControllers", []);

ttControllers.controller('FacultyAdminCtrl', ['$scope', '$routeParams', '$filter', '$location',
    'Faculty', 'Faculties', 'Groups', function ($scope, $routeParams, $filter, $location, Faculty, Faculties, Groups) {
        var saveMethod;

        if ($routeParams.action == "edit") {
            /*Edit excisting*/
            $scope.title = "EDIT";
            $scope.faculty = Faculty.get({facultyId: $routeParams.facultyId});
            $scope.faculty.id = $filter('entityId')(object);
            $scope.groups = Groups.get($scope.faculty.id);
            saveMethod = Faculty.save;
        } else if ($routeParams.action == "new") {
            /*Creation new*/
            $scope.title = "NEW";
            $scope.faculty = {
                name: "",
                description: ""
            };
            saveMethod = Faculties.save;
        }

        /*Groups*/


        /*Faculty saving*/
        $scope.saveFaculty = function () {
            saveMethod($scope.faculty);
            $location.path("/admin/faculties");
        };

    }]);
