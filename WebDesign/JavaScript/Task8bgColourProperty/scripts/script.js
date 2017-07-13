
// document.write('Hello there');
console.log('Log created in console window');

// declare var and assign it to starting number
var red = 10;
var color = "rgb("+red+", 0, 0)";

//function displaying 
function myBgColourFunction() {
  
    if(red < 255) {
        color = "rgb("+red+", 0, 0)";
        document.getElementById("colourDiv").style.backgroundColor = color;
    }
   
red = red + 10;
}

 // document.getElementById("colourDiv").style.backgroundColor = "red";