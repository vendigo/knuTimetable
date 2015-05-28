var ttFilters = angular.module("ttFilters", []);

ttFilters.filter('local', function() {
    return function(input) {
            return strings[input]||input;
        }
});

ttFilters.filter('entityId', function() {
    return function(input) {
        var href = input._links.self.href;
        return href.split("/").pop();
    }
});