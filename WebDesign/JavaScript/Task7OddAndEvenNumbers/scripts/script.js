
// document.write('Hello there');
console.log('Log created in console window');

// declare var and assign it to starting number
var number = 100;
//function displaying odd an even numbers in proper divs
function myIncrementFunction() {
   
// checking if number is even
    if (number % 2 == 0) {
        document.getElementById("evenNums").innerHTML += number + " ";
        // else the number is odd
    } else {
        document.getElementById("oddNums").innerHTML += number + " ";
    }
    //increment the number
    number++;
   
}


/*
for(var i = 0; i < 20; i++){
    if(number % 2 == 0){
        document.getElementById("evenNums").innerHTML += number;
    }else{
        document.getElementById("oddNums").innerHTML += number;
    }
    number++;
    console.log(i);
   // window.alert(number);
    }
}   
 /*function isEven(n) {
   return n % 2 == 0;
}

function isOdd(n) {
   return Math.abs(n % 2) == 1;
}*/