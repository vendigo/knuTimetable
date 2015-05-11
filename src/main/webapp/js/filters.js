var ttFilters = angular.module("ttFilters", []);

ttFilters.filter('dayOfWeek', function() {
    return function(input) {
        switch (input) {
            case 'MONDAY':
                return 'Понеділок';
            case 'TUESDAY':
                return 'Вівторок';
            case 'WEDNESDAY':
                return 'Середа';
            case 'THURSDAY':
                return 'Четвер';
            case 'FRIDAY':
                return "П'ятниця";
            case 'SATURDAY':
                return 'Субота';
            case 'SUNDAY':
                return 'Неділя';
        }
    }
});