var ttDirectives = angular.module('ttDirectives', []);

ttDirectives.directive('ttBack', function() {
    return {
        template: '<a href="javascript:history.back()">Повернутися назад</a>'
    };
});