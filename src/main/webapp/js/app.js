ttapp=angular.module('knuTimeTable', ['ngRoute']);

ttapp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: 'partials/main-page.html',
                controller: 'MainPageCtrl'
            }).
            when('/faculties/:facultyId', {
                templateUrl: 'partials/faculty.html',
                controller: 'FacultyCtrl'
            }).
            when('/faculties/', {
                templateUrl: 'partials/faculties.html',
                controller: 'FacultiesCtrl'
            }).
            otherwise({
                templateUrl: 'partials/404.html'
            });
    }]);