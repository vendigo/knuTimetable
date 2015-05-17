var ttServices = angular.module('ttServices', ['ngResource']);

ttServices.factory('Faculties', ['$resource',
    function ($resource) {
        return $resource('/faculties', {}, {
            get: {method: 'GET'}
        });
    }]);

ttServices.factory('Faculty', ['$resource',
    function ($resource) {
        return $resource('/faculties/:facultyId', {}, {
            get: {method: 'GET', params: {facultyId:'facultyId'}},
            delete: {method: 'DELETE', params: {facultyId:'facultyId'}}
        });
    }]);

ttServices.factory('Groups', ['$resource',
    function ($resource) {
        return $resource('/faculties/:facultyId/groups', {}, {
            get: {method: 'GET', params: {facultyId:'facultyId'}}
        });
    }]);

ttServices.factory('Group', ['$resource',
    function ($resource) {
        return $resource('/groups/:groupId', {}, {
            get: {method: 'GET', params: {groupId:'groupId'}}
        });
    }]);

ttServices.factory('TimeTable', ['$resource',
    function ($resource) {
        return $resource('timetable/forGroup/:groupId', {}, {
            get: {method: 'GET', params: {groupId:'groupId'}}
        });
    }]);