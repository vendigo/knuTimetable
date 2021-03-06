var ttApp = angular.module('knuTimeTable', ['ngRoute', 'ttControllers', 'ttServices', 'ttFilters', 'ttDirectives']);

/*User routes*/
ttApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: 'partials/main-page.html'
            }).
            when('/faculties/:facultyId', {
                templateUrl: 'partials/faculty.html',
                controller: 'FacultyCtrl'
            }).
            when('/faculties/', {
                templateUrl: 'partials/faculties.html',
                controller: 'FacultiesCtrl'
            }).
            when('/groups/:groupId/timetable', {
                templateUrl: 'partials/time-table.html',
                controller: 'TimeTableCtrl'
            }).
            otherwise({
                templateUrl: 'partials/404.html'
            });
    }]);

/*Admin routes*/
ttApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/admin/', {
                redirectTo: '/admin/faculties'
            }).
            when('/admin/faculties', {
                templateUrl: 'partials/admin/faculties.html',
                controller: 'FacultiesCtrl'
            }).when('/admin/faculties/:action/:facultyId', {
                templateUrl: 'partials/admin/faculty.html',
                controller: 'FacultyAdminCtrl'
            }).when('/admin/faculties/:action', {
                templateUrl: 'partials/admin/faculty.html',
                controller: 'FacultyAdminCtrl'
            }).when('/admin/faculties/:facultyId/groups/:action/:groupId', {
                templateUrl: 'partials/admin/group.html',
                controller: 'GroupAdminCtrl'
            }).when('/admin/faculties/:facultyId/groups/:action', {
                templateUrl: 'partials/admin/group.html',
                controller: 'GroupAdminCtrl'
            }).when('/admin/faculties/:facultyId/groups/:groupId/pairs/:action/:pairId', {
                templateUrl: 'partials/admin/pair.html',
                controller: 'PairAdminCtrl'
            }).when('/admin/faculties/:facultyId/groups/:groupId/pairs/:action', {
                templateUrl: 'partials/admin/pair.html',
                controller: 'PairAdminCtrl'
            });
    }]);