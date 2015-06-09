ttControllers.controller('PairAdminCtrl', ['$scope', '$routeParams', '$filter', '$window',
    'Pairs', 'Pair', function ($scope, $routeParams, $filter, $window, Pairs, Pair) {
        var saveMethod;

        if ($routeParams.action == "edit") {
            /*Edit excisting*/
            $scope.title = "EDIT";

            Pair.get({pairId: $routeParams.pairId}, function(pair) {
                $scope.pair = pair;
                $scope.pair.id = $routeParams.pairId;
            });

            saveMethod = function(pair) {
                Pair.update(pair);
            };

        } else if ($routeParams.action == "new") {
            /*Creation new*/
            $scope.title = "NEW";
            $scope.pair = {};
            $scope.pair.group = {id:$routeParams.groupId};
            saveMethod = function(pair) {
                Pairs.save(pair);
            };
        }

        /*Group saving*/
        $scope.savePair = function () {
            saveMethod($scope.pair);
            $window.location.href = "#/admin/faculties/"+$routeParams.facultyId+
            "/groups/edit/"+$routeParams.groupId;
        };
    }]);