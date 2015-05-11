var ttApp = angular.module('knuTimeTable', ['ngRoute', 'ttControllers', 'ttServices', 'ttFilters', 'ttDirectives']);

ttApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: 'partials/main-page.html',
                controller: 'MainPageCtrl'
            }).
            when('/faculty/:facultyId', {
                templateUrl: 'partials/faculty.html',
                controller: 'FacultyCtrl'
            }).
            when('/faculties/', {
                templateUrl: 'partials/faculties.html',
                controller: 'FacultiesCtrl'
            }).
            when('/timeTable/forGroup/:groupId', {
                templateUrl: 'partials/time-table.html',
                controller: 'TimeTableCtrl'
            }).
            otherwise({
                templateUrl: 'partials/404.html'
            });
    }]);