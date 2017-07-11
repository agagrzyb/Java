
     // document.write('Hello there');
      console.log('Log created in console window');
/*
var a = 1;

for(var b = 0 ; b< 10; b++){
      for(var z = 0; z < a; z++){
       document.write('X');
     }
      document.write("<br>");
      a+=2;
}
*/
function createXTriangle(lines, character){

      var divContainer = document.getElementById("div");
      divContainer.innerHTML = character + "<br>";
      for(var i=0;i<lines;i++){
            for(var j = 0; j < (i*2+1);j++){
                  divContainer.innerHTML = divContainer.innerHTML + character;
            }
      divContainer.innerHTML = divContainer.innerHTML + "<br>";
      }
}
   
