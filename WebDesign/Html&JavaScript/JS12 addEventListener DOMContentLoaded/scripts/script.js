console.log("... JS11 script.js file has loaded ...");



document.addEventListener("DOMContentLoaded", function(event) {
    console.log("DOM fully loaded and parsed");

	// Unobstrusive events with addEventListener
	document.getElementById("wrapper").addEventListener("click", logHello);

	// Unobstrusive events with addEventListener + passing parameters with anonymous function
	document.getElementById("wrapper").addEventListener("dblclick", function(){
    logHello2("Stefan");});	
});

function logHello() {
	console.log("Message");
}

function logHello2(name) {
	console.log("Hello " + name);
}