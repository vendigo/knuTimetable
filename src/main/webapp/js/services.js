var ttServices = angular.module('ttServices', ['ngResource']);

ttServices.factory('Faculties', ['$resource',
    function ($resource) {
        return $resource('/faculties');
    }]);

ttServices.factory('Faculty', ['$resource',
    function ($resource) {
        return $resource('/faculties/:facultyId', {'facultyId':'@id'}, {
            'update':{method:'PATCH'}
        });
    }]);

ttServices.factory('Groups', ['$resource',
    function ($resource) {
        return $resource('/faculties/:facultyId/groups');
    }]);

ttServices.factory('Group', ['$resource',
    function ($resource) {
        return $resource('/groups/:groupId', {'groupId':'@id'});
    }]);

ttServices.factory('TimeTable', ['$resource',
    function ($resource) {
        return $resource('timetable/forGroup/:groupId');
    }]);