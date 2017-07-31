console.log("... loaded AJS01 scripts.js file ...");

//JavaScript Way

window.addEventListener("DOMContentLoaded", function(event) {
	console.log("DOM fully loaded and parsed");
	document.getElementById("textInputJS").addEventListener("keyup", updateJSText);
});

function updateJSText() {
	var textJS = document.getElementById("textInputJS").value;
	document.getElementById("dataJS").innerHTML = textJS;
}


//jQuery Way

$(function() {
	console.log("... JQ DOM ready ...");
	
	$("#textInputJQ").keyup(function() {
		console.log($("#textInputJQ").val());
		$("#dataJQ").text($("#textInputJQ").val());
	});
	
});


//AngularJS Way

/* .. nothing required in script file !!! .. */

