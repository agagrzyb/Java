console.log("... mcr_sp_0.1.js file has loaded ...");
/*  This is the MCR Something Pretty Rev 0.1 File  */

// Create an empty object with {}
// This object will be a reserved 'keyword', reserved by me, and
// ensure that our variables will not create a conflict with
// any other JavaScript variables
var mcr_sp = {};

// Create a property 'myName' for object 'mcr_sp'
mcr_sp.myName = "Stefan";
//console.log(myName);

// Create a property 'sayHello', a function, for object 'mcr_sp'
mcr_sp.welcome = function () {
	console.log("Welcome " + mcr_sp.myName);
}

// This is the first function for our mcr_sp file: zoomText 
mcr_sp.zoomText = function (id, txtContent, speed, delay, minSize, maxSize, direction) {
	var txtContentLine = 0;
	console.log("maxSize: " + maxSize);
	var htmlElement = document.getElementById(id);
	console.log(htmlElement);
	var currentSize = window.getComputedStyle(htmlElement, null).getPropertyValue("font-size");
	console.log("currentSize: " + currentSize);
	currentSize = parseFloat(currentSize);
	console.log("currentSize after parseFloat: " + currentSize);
	for (var i = 0; i < txtContent.length; i++) {
		console.log("txtContent[" + i +"]: " + txtContent[i]);
	}
	function fade() {
		if (direction == "fadeIn") {
			console.log("direction == 'fadeIn'");
			if (currentSize < maxSize) {
				currentSize++;
				console.log("direction == 'fadeIn', currentSize: " + currentSize);
				direction = "fadeIn";
				setTimeout(fade, speed);
			}
			else {
				direction = "fadeOut";
				setTimeout(fade, delay);
			}
		}
		else {
			if (currentSize > minSize) {
				currentSize--;
				direction = "fadeOut";
				setTimeout(fade, speed);
			}
			else {
				direction = "fadeIn";
				txtContentLine++;
				if (txtContentLine >= txtContent.length) {txtContentLine = 0;}
				setTimeout(fade, speed);
			}
		}
		console.log("txtContent[" + txtContentLine +"]: " + txtContent[txtContentLine]);
		htmlElement.innerHTML = txtContent[txtContentLine];
		console.log("currentSize: " + currentSize);
		htmlElement.style.fontSize = currentSize + 'px';
	}
	fade();
}