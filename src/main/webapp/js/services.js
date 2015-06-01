var ttServices = angular.module('ttServices', ['ngResource']);

/*Faculties*/
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

/*Groups*/
ttServices.factory('Groups', ['$resource',
    function ($resource) {
        return $resource('/groups');
    }]);

ttServices.factory('FacultyGroups', ['$resource',
    function ($resource) {
        return $resource('groups/search/findByFaculty_Id?id=:facultyId');
    }]);
ttServices.factory('Group', ['$resource',
    function ($resource) {
        return $resource('/groups/:groupId', {'groupId':'@id'}, {
            'update':{method:'PATCH'}
        });
    }]);

/*Pairs*/
ttServices.factory('Pairs', ['$resource',
    function ($resource) {
        return $resource('/pairs/');
    }]);
ttServices.factory('GroupPairs', ['$resource',
    function ($resource) {
        return $resource('/pairs/search/findByGroup_Id?id=:groupId');
    }]);
ttServices.factory('Pair', ['$resource',
    function ($resource) {
        return $resource('/pairs/:pairId', {'pairId':'@id'}, {
            'update':{method:'PATCH'}
        });
    }]);

/*Timetable*/
ttServices.factory('TimeTable', ['$resource',
    function ($resource) {
        return $resource('timetable/forGroup/:groupId');
    }]);