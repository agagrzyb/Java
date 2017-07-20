console.log('mcr_sp Log created in console window');
/*This is the MCR Something Pretty Rev 0.1 File*/

var mcr_sp;
var myName = "Agi";
//console.log(myName);

mcr_sp.welcome = function () {
     console.log("Welcome " + mcr_sp.myName);
}

mcr_sp.zoomText = function (id, txtContent, speed, delay, minSize, maxSize, currentSize, direction) {
    var txtContentLine = 0;
    console.log("maxSize: "+maxSize);
    var htmlElement = document.getElementById(id);
    console.log(htmlElement);
    var currentSize = window.getComputedStyle(htmlElement, null).getPropertyValue("font-size");
    console.log("currentSize: " + currentSize);
    currentSize = parseFloat(currentSize);
    console.log("currentSize after parseFloat :" + currentSize);
    for(var i = 0; i < txtContent.length; i++){
        console.log("txtContent["+i+"] :" + txtContent[i]);
    }
    functionfade(){
    if (direction == "fadeIn") {
        console.log("direction == 'fadeIn'");
        if (currentSize < maxSize) {
            currentSize++;
            console.log("direction =='fadeIn', currentSize: " + currentSize);
            direction = "fadeIn";
            setTimeout(fade, speed);
        }
        else {
            direction = "fadeOut";
            setTimeout(fade, delay);
        }
    }
    else{
        if(currentSize>minSize)
    }
};