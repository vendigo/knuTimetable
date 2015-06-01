ttControllers.controller('FacultyAdminCtrl', ['$scope', '$routeParams', '$filter', '$window',
    'Faculty', 'Faculties', 'FacultyGroups', 'Group', function ($scope, $routeParams, $filter, $window, Faculty, Faculties, FacultyGroups, Group) {
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
            $window.location.href = "#/admin/faculties";
        };

        var loadGroups = function() {
            FacultyGroups.get({facultyId:$scope.faculty.id}, function(groups) {
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