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
*/

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