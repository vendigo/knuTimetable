ttControllers.controller('GroupAdminCtrl', ['$scope', '$routeParams', '$filter', '$window',
    'Groups', 'FacultyGroups', 'Group', 'GroupPairs', 'Pair', function ($scope, $routeParams, $filter, $window, Groups, FacultyGroups, Group, GroupPairs, Pair) {
        var saveMethod;
        $scope.facultyId = $routeParams.facultyId;

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
            $scope.group.faculty = {id:$scope.facultyId};
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
            var pair_id = $filter('entityId')(pair);
            Pair.delete({pairId: pair_id}, function () {
                loadPairs();
            });
        }

    }]);