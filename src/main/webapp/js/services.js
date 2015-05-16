var ttServices = angular.module('ttServices', ['ngResource']);

ttServices.factory('Faculties', ['$resource',
    function ($resource) {
        return $resource('/faculties', {}, {
            query: {method: 'GET'}
        });
    }]);

ttServices.factory('Faculty', ['$resource',
    function ($resource) {
        return $resource('/faculties/:facultyId', {}, {
            query: {method: 'GET', params: {facultyId:'facultyId'}}
        });
    }]);

ttServices.factory('Groups', ['$resource',
    function ($resource) {
        return $resource('/faculties/:facultyId/groups', {}, {
            query: {method: 'GET', params: {facultyId:'facultyId'}}
        });
    }]);

ttServices.factory('Group', ['$resource',
    function ($resource) {
        return $resource('/groups/:groupId', {}, {
            query: {method: 'GET', params: {groupId:'groupId'}}
        });
    }]);

ttServices.factory('TimeTable', ['$resource',
    function ($resource) {
        return $resource('groups/:groupId/pairs', {}, {
            query: {method: 'GET', params: {groupId:'groupId'}}
        });
    }]);