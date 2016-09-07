'use strict';

var App = angular.module('myApp',['uiGmapgoogle-maps'])
.config(['uiGmapGoogleMapApiProvider', function (uiGmapGoogleMapApiProvider) {
        uiGmapGoogleMapApiProvider.configure({
            v: '3.22'
        });
}]);