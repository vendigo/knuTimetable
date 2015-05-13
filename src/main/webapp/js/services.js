var ttServices = angular.module('ttServices', ['ngResource']);

ttServices.factory('Faculties', ['$resource',
    function ($resource) {
        return $resource('/faculties', {}, {
            query: {method: 'GET', isArray: false}
        });
    }]);

ttServices.factory('Faculty', ['$resource',
    function ($resource) {
        return $resource('/faculties/:facultyId', {}, {
            query: {method: 'GET', params: {facultyId:'facultyId'} ,isArray: false}
        });
    }]);

ttServices.factory('TimeTable', ['$resource',
    function ($resource) {
        return $resource('/timetables/full/forGroup/:groupId', {}, {
            query: {method: 'GET', params: {groupId:'timeTable'} ,isArray: true}
        });
    }]);