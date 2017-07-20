var canvas = document.querySelector('canvas');
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;
var c = canvas.getContext('2d');



var x = Math.random() * innerWidth;
var y = Math.random() * innerHeight;
var radius = Math.random() * 200;
var randomColor = function(){Math.random() * 256;}


document.addEventListener("DOMContentLoaded", function(event) {
    console.log("DOM fully loaded and parsed");

	// Unobstrusive events with addEventListener
	document.getElementById("canvas").addEventListener("click", move);

   
});


//infinity loop to move circle... move()will call requestAnimationFrame() and reverse...
function move(){
    requestAnimationFrame(move);
    //clearing the canvas
    c.clearRect(0,0,innerWidth,innerHeight);
 
    //circle
    c.beginPath();
    c.arc(x,y,radius,0,Math.PI*2,false);
    //c.fillStyle = "rgb(51,51,"+ randomColor+")";
    c.fillStyle = "rgb("+ randomColor() +","+ randomColor() + "," + randomColor() +")";
    console.log(randomColor);
    c.fill();
    c.stroke();

}
move();


