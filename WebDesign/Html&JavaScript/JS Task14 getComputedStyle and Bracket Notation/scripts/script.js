

console.log('script.js file loaded');



window.addEventListener("DOMContentLoaded", function (event) {
	console.log("DOM fully loaded and parsed");

	readSelAndProp();
	
	//getPropValues();

	// Unobstrusive events with addEventListener
	//document.getElementById("wrapper").addEventListener("click", logHello);

	// Unobstrusive events with addEventListener + passing parameters with anonymous function
	//document.getElementById("wrapper").addEventListener("dblclick", function(){logHello2("Stefan");});	


});

function readSelAndProp() {
	console.log("***Inside  readSelAndProp() function***");
	var htmlEl = document.getElementById("wrapper");
	console.log("wrapper :" + htmlEl);
	var htmlEls = [{ sel: "wrapper", prop: "width" }, { sel: "wrapper", prop: "height" }];
	console.log("array :" + htmlEls);
	var width = window.getComputedStyle(htmlEl, null).getPropertyValue("width");
	console.log("computed wrapper width= " + width);

	for (var i = 0; i < htmlEls.length; i++) {
		for (var cssProperty in htmlEls[i])
			console.log("Inside forLoop : " + htmlEls[i][cssProperty]);
	}


	// CSS computed vs CSS defined
	var cssProperty = "width";
	var cssValue = "900px";
	htmlEl.style[cssProperty] = cssValue;
	console.log("Intention is to set the " + cssProperty + " to " + cssValue);
	var propValue = window.getComputedStyle(htmlEl, null).getPropertyValue(cssProperty);
	console.log("computed wrapper " + cssProperty + " = " + propValue);
	var propValue = htmlEl.style[cssProperty];
	console.log("defined wrapper " + cssProperty + " = " + propValue);
	var propValue = window.getComputedStyle(htmlEl, null).getPropertyValue(cssProperty);
	console.log("computed wrapper " + cssProperty + " = " + propValue);


//appendchild
	var newElement = document.createElement("newDiv");
	newElement.id = "newDiv";
	newElement = createTable();

	//table
	function createTable() {
		console.log("inside createTable function");
    // Create table.
    var table = document.createElement('table');
    // Insert New Row for table at index '0'.
    var row1 = table.insertRow(0);
    // Insert New Column for Row1 at index '0'.
    var row1col1 = row1.insertCell(0);
    row1col1.innerHTML = 'Col1';
    // Insert New Column for Row1 at index '1'.
    var row1col2 = row1.insertCell(1);
    row1col2.innerHTML = 'Col2';
    // Insert New Column for Row1 at index '2'.
    var row1col3 = row1.insertCell(2);
    row1col3.innerHTML = 'Col3';
    // Append Table into div.
    var div = document.getElementById('table');
    div.appendChild(table);
}
	

}




function getPropValues() {
	console.log("***Inside  getPropValues() function***");
	var htmlEl = document.getElementById("wrapper");

	var width = window.getComputedStyle(htmlEl, null).getPropertyValue("width");
	console.log("computed wrapper width= " + width);
	var backgroundColor = window.getComputedStyle(htmlEl, null).getPropertyValue("background-color");
	console.log("computed wrapper backgroundColor= " + backgroundColor);

	var cssProperty = "color";
	var propValue = window.getComputedStyle(htmlEl, null).getPropertyValue(cssProperty);
	console.log("computed wrapper " + cssProperty + " = " + propValue);
	var cssProperty = "margin";
	var propValue = window.getComputedStyle(htmlEl, null).getPropertyValue(cssProperty);
	console.log("computed wrapper " + cssProperty + " = " + propValue);

	htmlEl.style.margin = "2px 12px 0px 10px";
	var propValue = htmlEl.style.margin;
	console.log("defined wrapper margin = " + propValue);

	htmlEl.style.padding = "8px";
	var cssProperty = "padding";
	var propValue = htmlEl.style[cssProperty];
	console.log("defined wrapper " + cssProperty + " = " + propValue);


	// CSS computed vs CSS defined
	var cssProperty = "width";
	var cssValue = "100px";
	htmlEl.style[cssProperty] = cssValue;
	console.log("Intention is to set the " + cssProperty + " to " + cssValue);
	var propValue = window.getComputedStyle(htmlEl, null).getPropertyValue(cssProperty);
	console.log("computed wrapper " + cssProperty + " = " + propValue);
	var propValue = htmlEl.style[cssProperty];
	console.log("defined wrapper " + cssProperty + " = " + propValue);
	var propValue = window.getComputedStyle(htmlEl, null).getPropertyValue(cssProperty);
	console.log("computed wrapper " + cssProperty + " = " + propValue);

}






















/*step9. create a function

document.addEventListener("DOMContentLoaded", function (event) {
      console.log("DOM fully loaded and parsed");
      var divTag = document.getElementById('secondDiv');
      // Unobstrusive events with addEventListener
      document.getElementById("h1").addEventListener("click", toggleDisplay);

      // function with if/else statement that toggles the 'secondDiv' ON and OFF when the h1 element is clicked
      function toggleDisplay() {
            console.log('inside toggleDiplay function');
            if (divTag.style.display == 'none') {
                  divTag.style.display = 'block';
            }
            else {
                  divTag.style.display = 'none';
            }
      }

});

*/