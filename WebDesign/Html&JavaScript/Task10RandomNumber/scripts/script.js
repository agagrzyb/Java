
// document.write('Hello there');
console.log('Log created in console window');

function randomNum() {
    var randomNumber = Math.floor(Math.random() * 11);
    return randomNumber;
}
//Build in function in JS, an object
setInterval(function () {
    document.getElementById("randomNumber").innerHTML = randomNum();
}, 2000);