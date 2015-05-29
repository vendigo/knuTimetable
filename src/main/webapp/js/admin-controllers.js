var ttAdminControllers = angular.module("ttAdminControllers", []);

ttControllers.controller('FacultyAdminCtrl', ['$scope', '$routeParams', '$filter', '$location',
    'Faculty', 'Faculties', 'Groups', function ($scope, $routeParams, $filter, $location, Faculty, Faculties, Groups) {
        var saveMethod;

        if ($routeParams.action == "edit") {
            /*Edit excisting*/
            $scope.title = "EDIT";

            Faculty.get({facultyId: $routeParams.facultyId}, function(faculty) {
                $scope.faculty = faculty;
                $scope.faculty.id = $filter('entityId')($scope.faculty);
                loadGroups();
            });

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

        /*Faculty saving*/
        $scope.saveFaculty = function () {
            saveMethod($scope.faculty);
            $location.path("/admin/faculties");
        };

        var loadGroups = function() {
            Groups.get({facultyId:$scope.faculty.id}, function(groups) {
                $scope.groups = groups._embedded.groups;
            });
        };

        /*Group deleting*/
        $scope.deleteGroup = function (group) {
            var _groupId = $filter('entityId')(group);
            Faculty.delete({groupId: _groupId}, function () {
                loadGroups();
            });
        }

    }]);
