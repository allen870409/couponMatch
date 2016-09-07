'use strict';

App.controller('CouponMatchController', ['$scope', '$log', 'uiGmapGoogleMapApi', 'CouponMatchService', '$window', function($scope, $log, uiGmapGoogleMapApi ,CouponMatchService, $window) {
    var self = this;
    uiGmapGoogleMapApi.then(function(maps) {

        $scope.map = {
            center: { latitude: 35.681382, longitude: 139.766084 },
            zoom: 12
        };
        self.coupons = [];
        self.markers = [];
        $scope.$log = $log;


        var onMarkerClicked = function (marker) {
//           console.log(marker)
//           var a = angular.filter(self.coupons, function(c){
//               return c.id === marker.id
//           })
//            console.log(a)
            $window.open(marker.url, '_blank');
        };


        self.fetchAllCoupons = function(){
            CouponMatchService.fetchAllCoupons()
                .then(
                function(d) {
                    self.coupons = d;
                    angular.forEach(d, function(v, k){
                         self.markers.push({
                             id: v.id,
                             title : v.title,
                             latitude : v.lat,
                             longitude : v.lon,
                             url : v.url,
                             onClick : function(){
                                 onMarkerClicked(v);
                             }
                        });
                    });
                    angular.forEach(self.markers, function(mark){
                        mark.closeClick = function () {
                            mark.showWindow = false;
                            $scope.$apply();
                        };
                        mark.onClicked = function () {
                            onMarkerClicked(mark);
                        };
                    });
                },
                function(errResponse){
                    console.error('Error while fetching Currencies');
                }
            );
        };
        $log.info(self.markers);
        self.fetchAllCoupons();
    });



}]);