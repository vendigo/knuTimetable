ttControllers.controller('GroupAdminCtrl', ['$scope', '$routeParams', '$filter', '$window',
    'Faculty', 'Groups', 'FacultyGroups', 'Group', 'GroupPairs', 'Pair', function ($scope, $routeParams, $filter, $window, Faculty, Groups, FacultyGroups, Group, GroupPairs, Pair) {
        var saveMethod;

        if ($routeParams.action == "edit") {
            /*Edit excisting*/
            $scope.title = "EDIT";

            Group.get({groupId: $routeParams.groupId}, function(group) {
                $scope.group = group;
                $scope.group.id = $routeParams.groupId;
                loadPairs();
            });

            saveMethod = function(group) {
                Group.update(group);
            };

        } else if ($routeParams.action == "new") {
            /*Creation new*/
            $scope.title = "NEW";
            $scope.group = {};
            Faculty.get({facultyId:$routeParams.facultyId}, function(faculty) {
                $scope.group.faculty = faculty;
            });
            saveMethod = function(group) {
                Groups.save(group);
            };
        }

        /*Group saving*/
        $scope.saveGroup = function () {
            saveMethod($scope.group);
            $window.location.href = "#/admin/faculties/edit/"+$routeParams.facultyId;
        };

        var loadPairs = function() {
            GroupPairs.get({groupId:$scope.group.id}, function(pairs) {
                $scope.pairs = pairs._embedded && pairs._embedded.pairs;
            });
        };

        /*Pair deleting*/
        $scope.deletePair = function (pair) {
            var pair_id = $filter('pairId')(pair);
            Pair.delete({pairId: pair_id}, function () {
                loadPairs();
            });
        }

    }]);