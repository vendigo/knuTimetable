var ttAdminControllers = angular.module("ttAdminControllers", []);

ttControllers.controller('FacultyAdminCtrl', ['$scope', '$routeParams', '$filter', '$location',
    'Faculty', 'Faculties', 'Groups', 'Group', function ($scope, $routeParams, $filter, $location, Faculty, Faculties, Groups, Group) {
        var saveMethod;

        if ($routeParams.action == "edit") {
            /*Edit excisting*/
            $scope.title = "EDIT";

            Faculty.get({facultyId: $routeParams.facultyId}, function(faculty) {
                $scope.faculty = faculty;
                $scope.faculty.id = $routeParams.facultyId;
                loadGroups();
            });

            saveMethod = function(faculty) {
                Faculty.update(faculty);
            };

        } else if ($routeParams.action == "new") {
            /*Creation new*/
            $scope.title = "NEW";
            saveMethod = function(faculty) {
                Faculties.save(faculty);
            };
        }

        /*Faculty saving*/
        $scope.saveFaculty = function () {
            saveMethod($scope.faculty);
            $location.path("/admin/faculties");
        };

        var loadGroups = function() {
            Groups.get({facultyId:$scope.faculty.id}, function(groups) {
                $scope.groups = groups._embedded && groups._embedded.groups;
            });
        };

        /*Group deleting*/
        $scope.deleteGroup = function (group) {
            var group_id = $filter('entityId')(group);
            Group.delete({groupId: group_id}, function () {
                loadGroups();
            });
        }

    }]);