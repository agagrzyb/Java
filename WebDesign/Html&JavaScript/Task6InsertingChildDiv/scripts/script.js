
// document.write('Hello there');
console.log('Log created in console window');

var childDiv = "<div id='childDiv'> Child </div>";
document.getElementById("parentDiv").innerHTML += childDiv;

console.log(document.getElementById("parentDiv").innerHTML);
console.log(childDiv);


   
