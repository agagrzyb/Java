
     // document.write('Hello there');
      console.log('Log created in console window');

function calculateAverage(){
   var num1 = parseFloat(document.getElementById('num1').value);
   var num2 = parseFloat(document.getElementById('num2').value);
   var num3 = parseFloat(document.getElementById('num3').value);
   var num4 = parseFloat(document.getElementById('num4').value);
   var num5 = parseFloat(document.getElementById('num5').value);
   var num6 = parseFloat(document.getElementById('num6').value);
   var num7 = parseFloat(document.getElementById('num7').value);
   var num8 = parseFloat(document.getElementById('num8').value);
   var num9 = parseFloat(document.getElementById('num9').value);
   var num10 = parseFloat(document.getElementById('num10').value);

var total = 0;
var count = 0;
var numID = "";
    for(var i = 1; i < 11 ; i++){
        numID = "num"+i;
        if (document.getElementById(numID).value == "0" ||
            document.getElementById(numID).value != ""  &&  
            parseFloat(document.getElementById(numID).value)){

            total+= parseFloat(document.getElementById(numID).value);
            count++;

        }
        console.log("total : " + total);
        console.log("count : " + count);
        document.getElementById('result').value = total/count ;
    }
   }    
 //result = (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10; 
 //display result in id="result" by .value NOT .innerHTML cos this <input> tag has no innerHtml body
 //document.getElementById('result').value = total ;
    


   
