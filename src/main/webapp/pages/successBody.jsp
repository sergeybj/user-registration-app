<body ng-app="myApp" ng-controller="myCtrl">
	SUCCESS user = ${savedId}


	<!-- <div ng-repeat="n in [42, 42, 43, 43] track by $index">{{n}}</div> -->

		<div ng-repeat="item in contacts">{{item}}</div>

		<div ng-model="json">{{json}}</div>
</body>
