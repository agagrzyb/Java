console.log("... JS11 script.js file has loaded ...");


function addEvents() {
	// Unobstrusive events with addEventListener
	document.getElementById("wrapper").addEventListener("click", logHello);

	// Unobstrusive events with addEventListener + passing parameters
	document.getElementById("wrapper").addEventListener("dblclick", function(){
    logHello2("Stefan");});	
}

function logHello() {
	console.log("Message");
}

function logHello2(name) {
	console.log("Hello " + name);
}