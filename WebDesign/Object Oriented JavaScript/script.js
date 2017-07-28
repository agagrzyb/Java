console.log("***script file loaded ***");

//private vars

function SecretCode() {
    //private, proteced var inside JS Object
    var secretNum = 78;
    console.log("Value of secretNum : " + secretNum);

    this.guessNum = function (num) {
        if (num > secretNum) {
            return "Lower";
        } else if (num < secretNum) {
            return "Higher";
        } else {
            return "You guessed it";
        }
    }
}
var secret = new SecretCode();
//cant accesss secretNum --- undefined
console.log("Value of secretNum : " + secret.secretNum);
console.log("calling a guessNum() function inside an object to guess the secret number : " + secret.guessNum(70));
console.log("calling a guessNum() function inside an object to guess the secret number : " + secret.guessNum(78));
//cant access secretNum by Listing Properties/ by using new function() , its still protected
SecretCode.prototype.getSecret = function () {
    return this.secretNum;
}
console.log("Accessing secretNum using .protoptye : " + secret.getSecret());
//Setters and Getters to protect data

var address = {
    street: "No Street",
    city: "No City",
    state: "No State",

    get getAddress(){
        return this.street + ", " + this.city + ", " + this.state;
    },

    set setAddress(theAddress){
        var parts = theAddress.toString().split(", ");
        this.street = parts[0] || "";
        this.city = parts[1] || "";
        this.state = parts[2] || ""; 

    }
}
//20:36