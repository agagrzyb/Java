
     // document.write('Hello there');
      console.log('Log created in console window');
      //alert
     // window.alert("Alert !!!");
      //to display content in js
      document.getElementById('pageHeading').innerHTML = "Agi's JS page";
     
     //variables
     var a = "Hello world";

     var a = 10;
     console.log("a: " + a);
     a = "Hi there";
    console.log("a: " + a);
    //you can assign a funtion to a variable
    // a = function(){}
    //function compare is called from index.html
    function compare(a,b){
        if(a > b){
        console.log("a is a higer number");
        return a;
    }else{
         console.log("b is a higher number");
        return b;
    }
}

function aa(){
    console.log("String in function aa: " + string);
    return;
}
function bb(){
    var string = "String in function bb";
    console.log("String in function bb: " + string);
}
function cc(){
     console.log("String in function aa: " + string);
     bb();
     console.log("String in function aa: " + string);
}