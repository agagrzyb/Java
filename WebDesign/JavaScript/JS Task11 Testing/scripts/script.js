

console.log('script.js file loaded');

// step9. create a function
var divTag = document.getElementById('secondDiv');

document.addEventListener("DOMContentLoaded", function (event) {
      console.log("DOM fully loaded and parsed");

      // Unobstrusive events with addEventListener
      document.getElementById("h1").addEventListener("click", toggleDisplay);
});

function toggleDisplay() {
      console.log('inside toggleDiplay function');
      if (divTag.style.display == '') {
            divTag.style.display = 'none';
      }
      else {
            divTag.style.display = '';
      }
}






