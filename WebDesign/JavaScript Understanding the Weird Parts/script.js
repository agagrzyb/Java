/*var a = "hello!";

function b() {
    console.log("called function b");
}
b();
console.log(b);

function d(){
    console.log("Inside function d");
    var e;
    console.log("e " + e);
}
function c(){
    d();
    console.log("Inside function c");
    var f;
    console.log("f inside the function " + f);
}
c();
var f;
console.log("f outside " + f);

//long running function
function waitThreeSeconds(){
    var ms = 3000 + new Date().getTime();
    while(new Date() < ms){}
    console.log('finished function');
}
function clickHandler(){
    console.log('click event!');
}
//listen for the click event
document.addEventListener('click', clickHandler);

waitThreeSeconds();
console.log('finished execution');

//COERCION
var a = "1" + 2; // 2 is coerced by JS into a String 
console.log(a) // 12

//default values
function greet(name){
    console.log(name); //undefined
    name = name || `<Your name here>`; //default value
    console.log('Hello ' + name);
}
greet(); // Hello undefined
greet('Aga');

//objects and functions
//objects are name/value pairs that sit in the memory
//have properties and methods
var person = new Object();
//Operator type [] - the Computed Member Access operator
person['firstname'] = 'Aga'; // the firstname property
person['lastname'] = 'Grzyb';

var firstNameProperty = 'firstname';

console.log(person);
console.log('person[firstNameProperty] : ' + person[firstNameProperty]);
//the DOT operator/function, memeber access operator type
console.log('person.firstname : ' + person.firstname);
//OBJECT SITTING INSIDE AN OBJECT
person.address = new Object();
// memeber access operator type runs from left-to-right, so person object is called first then address property/method  that has that name and setting the value of street property

person.address.street = "1 Main Str";
person.address.city = "New York";
person.address.state = "NY";
console.log(person.address);
//Operator type [] - the Computed Member Access operator runs from left-to-right
//NOT A PREFFERED OPTION, use Dot '.'
console.log(person['address']['state']);
*/

//Object Literals
var person0 = {};
console.log(person0);// an empty object
//initialize the object, set up the properties and methods
//firstname : 'aga' --- a name : value pair 
//lastname: 'grzyb' --- a name : value pair 

var person1 = {
    firstname: 'aga',
    lastname: 'grzyb',
    address: {
        street: '1 Main Str',
        city: 'New York',
        state: 'NY'
    }
};

console.log(person1);

function greet(person){
    console.log('Hi ' + person.firstname);
}
greet(person1);
//invoking greet function and creating object on the fly
greet({ 
    firstname: 'Agi', 
    lastname: 'Gryzb'
});

person1.address2 = {
    street: '2 Second Str.'
}
