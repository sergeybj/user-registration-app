<html ng-app="helloApp">
<body ng-controller="HelloCtrl">
SUCCESS

user = ${savedId}



	<div class="container">
		<div class="page-header" style="margin: 0">
			<h1>Hello World</h1>
		</div>
		<div style="padding-top: 15px">This example demonstrate the code
			sample for Hello World program. Type your name in the text field
			below</div>
		<div style="padding-top: 30px">
			<div style="padding: 0px 0px 20px 30px">
				<h4>Hello Calvin Hobbessdwewe! How are you doing today</h4></div>
			<form class="form-horizontal" role="form" method="post" action="#">
				<div class="form-group">
					<label class="col-md-1 control-label">Name</label>
					<div class="col-md-3">
						<input type="text" class="form-control" name="firstname" ng-model="name">
					</div>
				</div>
			</form>
		</div>

	</div>


</body>
</html>