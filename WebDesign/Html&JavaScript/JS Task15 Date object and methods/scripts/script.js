
var d = new Date();
var nConsole = d.getMilliseconds();
console.log('***script.js file loaded*** at :'+ Date() + ' Milliseconds : ' + nConsole);



window.addEventListener("DOMContentLoaded", function (event) {
	var d = new Date();
	var nDom = d.getMilliseconds();
	console.log("DOM fully loaded and parsed at:" + Date() + ' Milliseconds : ' + nDom);

	getTime();

	// Unobstrusive events with addEventListener
	document.getElementById("body").addEventListener("click", getTime);

	// Unobstrusive events with addEventListener + passing parameters with anonymous function
	//document.getElementById("wrapper").addEventListener("dblclick", function(){logHello2("Stefan");});	

	var timeDiff = nDom - nConsole;
	console.log("Time difference : 00" + timeDiff +" Milliseconds");


});

function getTime() {
	console.log("***inside function getTime()***");
	document.getElementById("body").innerHTML += Date();
	var d = new Date();
	var n = d.getMilliseconds();
	document.getElementById("body").innerHTML +=' Milliseconds : ' + n;
	console.log('Date : ' + d);
	console.log('Milliseconds : ' + n);
}
