<html>
<head>
    <title>CouponMatch</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"/>
    <link href="static/css/app.css" rel="stylesheet"/>
    <script src='//maps.googleapis.com/maps/api/js'></script>
</head>
<body ng-app="myApp">
<div class="generic-container" ng-controller="CouponMatchController as ctrl">
    <ui-gmap-google-map center="map.center" zoom="map.zoom" options="map.options">
        <ui-gmap-markers models="ctrl.markers" coords="'self'" icon="'icon'" click="onClick">
        </ui-gmap-markers>
    </ui-gmap-google-map>
    <div class="panel panel-default coupon-list">
        <div class="tablecontainer ">
            <table class="table table-hover ">
                <thead>
                <tr>
                    <th>Title</th>
                    <th>Price</th>
                    <th>Discount</th>
                    <th>ExtraFee</th>
                </tr>
                </thead>
                <tbody>
                <tr ng-repeat="c in ctrl.coupons" id="c.id">
                    <td><span ng-bind="c.title"></span></td>
                    <td><span ng-bind="c.price"></span></td>
                    <td><span ng-bind="c.discount"></span></td>
                    <td><span ng-bind="c.extraFee"></span></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js?key=AIzaSyDleQKI4x7GatJWFtBNaQ1lwoJqrdXjAUw"></script>
<script src='static/js/lib/lodash.js'></script>
<script src='static/js/lib/angular-simple-logger.js'></script>
<script src='static/js/lib/angular-google-maps.js'></script>
<script src="static/js/app.js"></script>
<script src="static/js/service/coupon_match_service.js"></script>
<script src="static/js/controller/coupon_match_controller.js"></script>

</body>
</html>