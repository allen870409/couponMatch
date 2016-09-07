'use strict';

App.factory('CouponMatchService', ['$http', '$q', function($http, $q){

    return {
        fetchAllCoupons: function() {
            return $http.get('http://localhost:8080/coupon/')
                .then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while fetching coupons');
                    return $q.reject(errResponse);
                }
            );
        }
    };

}]);
