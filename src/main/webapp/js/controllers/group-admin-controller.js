ttControllers.controller('GroupAdminCtrl', ['$scope', '$routeParams', '$filter', '$location',
    'Groups', 'Group', 'Pairs', 'Pair', function ($scope, $routeParams, $filter, $location, Groups, Group, Pairs, Pair) {
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
            saveMethod = function(group) {
                Groups.save(group);
            };
        }

        /*Group saving*/
        $scope.saveGroup = function () {
            saveMethod($scope.group);
        };

        var loadPairs = function() {
            Pairs.get({groupId:$scope.group.id}, function(pairs) {
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