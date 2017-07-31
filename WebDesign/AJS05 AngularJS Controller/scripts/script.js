console.log("... loaded AJS05 scripts.js file ...");

$(function() {
	console.log("... JQ DOM ready ...");

});

var ngAppObject = angular.module("myFirstApp", []);
	ngAppObject.controller("myController", function($scope) {
	$scope.ngData1 = "Thanks AngularJS for being nice to us.";
	$scope.showData1 = function(data) {
		console.log(data);
	};
	});