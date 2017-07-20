
     // document.write('Hello there');
      console.log('Log created in console window');

function calculateNums(){
    console.log(document.getElementById('num1').value);
    console.log(document.getElementById('num2').value);
    console.log(document.getElementById('mathOperation').value);
    document.getElementById('result').value;
}
function myCalculateNums(){
   var  num1, num2, mathOper, result;
    num1 = parseFloat(document.getElementById('num1').value);
    num2 = parseFloat(document.getElementById('num2').value);
    mathOper = document.getElementById('mathOperation').value;

    if(mathOper == 'add') {
        result = num1 + num2;
    }
    if (mathOper == 'sub'){
        result = num1 - num2;
    }
    if (mathOper == 'mul'){
        result = num1 * num2;
    }
    if (mathOper == 'div'){
        result = num1 / num2;   
    }
     //display result in id="result" by .value NOT .innerHTML cos this <input> tag has no innerHtml body
    document.getElementById('result').value = result ;
    console.log(result);
}

