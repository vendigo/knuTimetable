var ttServices = angular.module('ttServices', ['ngResource']);

ttServices.factory('Faculties', ['$resource',
    function ($resource) {
        return $resource('/faculties');
    }]);

ttServices.factory('Faculty', ['$resource',
    function ($resource) {
        return $resource('/faculties/:facultyId', {facultyId:"facultyId"});
    }]);

ttServices.factory('Groups', ['$resource',
    function ($resource) {
        return $resource('/faculties/:facultyId/groups', {facultyId:'facultyId'});
    }]);

ttServices.factory('Group', ['$resource',
    function ($resource) {
        return $resource('/groups/:groupId', {groupId:'groupId'});
    }]);

ttServices.factory('TimeTable', ['$resource',
    function ($resource) {
        return $resource('timetable/forGroup/:groupId', {groupId:'groupId'});
    }]);