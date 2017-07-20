
// document.write('Hello there');
console.log('Log created in console window');

//Arrays
var myArray =  new Array();
myArray[0] = "Gabi";
myArray[1] = "Agnes";
myArray[2] = "Stephen";
myArray[3] = "Emanuel";
myArray[4] = "Sean";
myArray[5] = "Pat";
myArray[6] = "2017";
myArray[7] = function(name){
    console.log("Hi " + name);
};
//course, centre... accessing data using literal
myArray[8] = {course : "Software development", centre : "Finglas"}

console.log(myArray);
console.log(myArray[5]);
console.log(myArray[7](myArray[0]));
console.log(myArray[8].course);
console.log(myArray[8].centre);

for(var i = 0; i < myArray.length; i++){
    console.log("In the ForLoop " + myArray[i]);

}


//shorthand array creation
var arrayIndex = ["Luca ", "Vitalie ","Darius "];
console.log(arrayIndex[2]);

var arrayLiteral = [{name :"Luca ",gender:"male"}, {name :"Vitalie "},{name : "Darius "},{name: "Ewelina",gender:"female"}];
console.log(arrayLiteral[0].name);
console.log(arrayLiteral[3].gender);

//populating an array with ForLoop

var randomCol = new Array();
for (var i= 0 ; i< 100; i++){
    randomCol[i] = Math.floor(Math.random() * 256);
}
console.log("randomCol Array" + randomCol);

//rgb
for (var i= 0 ; i< 100; i++){
    randomCol[i] = 
    "rgb(" + Math.floor(Math.random() * 256) + "," +
    Math.floor(Math.random() * 256) + ","+
    Math.floor(Math.random() * 256) + ")";
}
 console.log("rgb Array : " + randomCol);