

console.log('script.js file loaded');

// step9. create a function

document.addEventListener("DOMContentLoaded", function (event) {
      console.log("DOM fully loaded and parsed");
      var divTag = document.getElementById('secondDiv');
      // Unobstrusive events with addEventListener
      document.getElementById("h1").addEventListener("click", toggleDisplay);

      // function with if/else statement that toggles the 'secondDiv' ON and OFF when the h1 element is clicked
      function toggleDisplay() {
            console.log('inside toggleDiplay function');
            if (divTag.style.display == 'none') {
                  divTag.style.display = 'block';
            }
            else {
                  divTag.style.display = 'none';
            }
      }

});

