//console.log("Hello there...");
var canvas = document.querySelector('canvas');

canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

//
var c = canvas.getContext('2d');
//arc //circle
c.beginPath();
c.arc(300,300,30,0, Math.PI*2,false);
c.strokeStyle = 'blue';
c.stroke();



//JavaScript OBJECT !!!
//capital letter to indicate this is an object
function Circle(x,y,dx,dy,radius){
    //independent x&y values
    this.x = x;
    this.y = y;
    this.dx = dx;
    this.dy = dy;
    this.radius = radius;

//creating a method within an object to create a circle every time this function is called anonymous function
    this.draw = function() {
        //console.log('hello there');
        //arc //circle
        c.beginPath();
        c.arc(this.x, this.y, this.radius, 0, Math.PI*2,             false);
        c.strokeStyle = 'pink';
        c.stroke();
}

this.update = function() {
 //moving circle by 1px --> x += 1;

    if(this.x + this.radius > innerWidth ||
         this.x - this.radius < 0){
        this. dx = -this.dx;
    }
    if(this.y + this.radius > innerHeight ||
         this.y - this.radius < 0){
        this.dy = -this.dy;
    }
    this.x += this.dx; 
    this.y += this.dy;

    this.draw();
    }
}
/*
var circleArray = [];

for(var i = 0; i < 100; i++){
    var circle = new Circle(200, 200, 3, 3, 30);
}
*/

//storing all objects into an array
var circleArray = [];

for(var i = 0; i < 100; i++){
    //instantiate an OBJECT
    var x = Math.random()*innerWidth;
    var y = Math.random()*innerHeight;
    //can be negative or positive, and*8 to speed it up
    var dx = (Math.random() - 0.5);
    var dy = (Math.random() - 0.5);
    var radius = 30;
    circleArray.push(new Circle(x, y, dx, dy, radius));
}
//console.log(circleArray);


//method to create animation
//1.create a function

function animate(){
    //2.use requestAnimationFrame() function that takes animate function as an argument, and that will create a loop
    requestAnimationFrame(animate);
    //to clear canvas every time the new circle is drawn-->when the function is being called
    c.clearRect(0, 0, innerWidth, innerHeight);
    //executing draw function inside an object
    //circle.update();

    //call the update() on every[i]
    for(var i = 0; i < circleArray.length; i++){
        circleArray[i].update();
    }
}
//has to be called for this loop to work
animate();