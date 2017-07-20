var canvas = document.querySelector('canvas');
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;
var c = canvas.getContext('2d');



var x = 200;
var y = 200;

//infinity loop to move circle... move()will call requestAnimationFrame() and reverse...
function move(){
    requestAnimationFrame(move);
    //clearing the canvas
    c.clearRect(0,0,innerWidth,innerHeight);

    //circle
    c.beginPath();
    c.arc(x,y,30,0,Math.PI*2,false);
    c.fillStyle = 'yellow';
    c.fill();
    c.stroke();

}
move();
