
     // document.write('Hello there');
      console.log('Log created in console window');

      //data type: undefined
      var a;
      console.log('var a; ---> ' + a);

      if(a==undefined){
            console.log('a is undefined');
      }else{
            console.log('a is defined');
      }
      var b = 5;
      console.log('b ' + b);

      if(b==undefined){
            console.log('b is undefined');
      }else{
            console.log('b is defined');
      }
      //Data Type:  String
      var c = 'Good';
      c +=' Morning';
      console.log('c : ' + c + ' !');

      //Maths operations(number type)
      var d = 5, e = 6, x;
      console.log('d : ' + d);
      console.log('e : ' + e);
      console.log('d + e : '+ (d + e));
      console.log('d - e : '+ (d - e));
      console.log('d * e : '+ (d * e));
      console.log('d / e : '+ (d / e));
      //x is undefined ...result : NaN ... NOT A NUMBER
      console.log('x + e : '+ (x + e)); 
      //Equality
      var f = 4, g = 4; 
      console.log('f : ' + f) ;
      console.log('g : ' + g) ;
      if(f==g){
            console.log('f equals g');
      }else{
            console.log('f is not equal g');
      }
      var h = 4, i = '4'; 
      console.log('h : ' + h) ;
      console.log('i : ' + i + ' is a string type') ;
      if(h==i){
            console.log('h equals i (comparison with ==)');
      }else{
            console.log('h is not equal i (comparison with ==)');
      }
      if(h===i){
            console.log('h equals i (comparison with ===)');
      }else{
            console.log('h is not equal i (comparison with ===)');
      }
      //Boolean True and False & testing for true and false
      var j = false;
      console.log('j : ' + j);
      if(j){
            console.log('j == true');
      }else{
            console.log('j == false');
      }
      // 6 different types considered as False
      if(false || null || NaN || 0 || '' || undefined){
            console.log('tested for false and found to be true');
      }else{
            console.log('tested for false and found to be false');
      }

      if(true && !null && !NaN && !0 && 'not empty' && !undefined){
            console.log('tested for true and found to be true');
      }else{
            console.log('tested for true and found to be false');
      }
      // {} and line breaks
      function k()
      {
            return
            {
                   x: 'Curly brace on next line'
            };
      }
      function l(){
            return{
                   x: 'Curly brace on the same line'
            };
      }
      console.log('function k()' + k());
      console.log('function l()' + l());
      //loops
      for(var n = 0; n < 10; n++){
            console.log('For loop value of  n : ' + n);
      }



    


