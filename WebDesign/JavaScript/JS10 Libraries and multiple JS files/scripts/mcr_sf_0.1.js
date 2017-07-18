console.log("... mcr_sf_0.1.js file has loaded ...");
/*  This is the MCR Standard Function Rev 0.1 File  */


// Create an empty object with {}
// This object will be a reserved 'keyword', reserved by me, and
// ensure that our variables will not create a conflict with
// any other JavaScript variables
var mcr_sf = {};

// Create a property 'myName' for object 'mcr_sf'
mcr_sf.myName = "Klaus";
//console.log("mcr_sf.myName" + mcr_sf.myName);

// Create a property 'sayHello', a function, for object 'mcr_sf'
mcr_sf.sayHello = function () {
	console.log("Hello " + mcr_sf.myName);
}
