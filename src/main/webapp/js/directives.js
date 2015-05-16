var ttDirectives = angular.module('ttDirectives', []);

ttDirectives.directive('ttBack', function() {
    return {
        template: '<a href="javascript:history.back()">Повернутися назад</a>'
    };
});

ttDirectives.directive('ttButtonBack', function() {
    return {
        template: '<a href="javascript:history.back()"><span class="glyphicon glyphicon-arrow-left"></span></a>'
    };
});