
// document.write('Hello there');
console.log('Log created in console window');

var centerRed = 255;
var centerGreen = 255;
var centerBlue = 255;

var topLeftRed = 0;
var topLeftGreen = 0;
var topLeftBlue = 0;

var topRightRed = 0;
var topRightGreen = 0;
var topRightBlue = 0;

var bottomLeftRed = 0;
var bottomLeftGreen = 0;
var bottomLeftBlue = 0;

var bottomRightRed = 0;
var bottomRightGreen = 0;
var bottomRightBlue = 0;

function changeColourValues(){
centerRed = randomNum();
centerGreen = randomNum();
centerBlue = randomNum();
console.log("Center : " + centerRed + centerGreen + centerBlue);
topLeftRed = randomNum();
topLeftGreen = randomNum();
topLeftBlue = randomNum();
console.log("Top Left : " + topLeftRed + topLeftGreen + topLeftBlue);
topRightRed = randomNum();
topRightGreen = randomNum();
topRightBlue = randomNum();

bottomLeftRed = randomNum();
bottomLeftGreen = randomNum();
bottomLeftBlue = randomNum();

bottomRightRed = randomNum();
bottomRightGreen = randomNum();
bottomRightBlue = randomNum();
}

//
function randomNum() {
    var randomNumber = Math.floor(Math.random() * 256);
    return randomNumber;
}

function changeColour(){
    //document.getElementById("topLeft").style.backgroundColor = "rgb(" + topLeftRed + "," + topLeftGreen + "," + topLeftBlue + ")";

    //background: linear-gradient(-90deg, red, yellow);

   document.getElementById("topLeft").style.background = "linear-gradient(-45deg, " + "rgb(" + centerRed + ", " + centerGreen + ", " + centerBlue + ")" + ", " + "rgb(" + topLeftRed + "," + topLeftGreen + ", " + topLeftBlue + ")" + ");"
}
setInterval(function () {
   // console.log("Interval");
    changeColourValues();
    changeColour();
}, 3000);




/*
function randomNum() {
    var randomNumber = Math.floor(Math.random() * 11);
    return randomNumber;
}
//Build in function in JS, an object
setInterval(function () {
    document.getElementById("randomNumber").innerHTML = randomNum();
}, 2000);
*/