var ttServices = angular.module('ttServices', ['ngResource']);

ttServices.factory('Faculties', ['$resource',
    function ($resource) {
        return $resource('/faculty', {}, {
            query: {method: 'GET', isArray: true}
        });
    }]);

ttServices.factory('Faculty', ['$resource',
    function ($resource) {
        return $resource('/faculty/:facultyId', {}, {
            query: {method: 'GET', params: {facultyId:'facultyId'} ,isArray: true}
        });
    }]);

ttServices.factory('TimeTable', ['$resource',
    function ($resource) {
        return $resource('/timetable/full/forGroup/:groupId', {}, {
            query: {method: 'GET', params: {groupId:'timeTable'} ,isArray: true}
        });
    }]);