
<!-- TWO STEPS TO INSTALL BINARY CLOCK:

  1.  Copy the coding into a new file, save as binaryclock.js
  2.  Add the last code into the BODY of your HTML document  -->

<!-- STEP ONE: Save this code as a new file:  binaryclock.js  -->



<!-- Original:  Mark Lockwood (sy161e.net@namezero.com) -->
<!-- Web Site:  http://www.sy161e.net -->

<!-- This script and many more are available free online at -->
<!-- The JavaScript Source!! http://www.javascriptsource.com -->

function syeClock() {
if (!document.layers && !document.all)
return;
timePortion = new Array;
maxLength = new Array;
var runTime = new Date();
timePortion[0] = runTime.getHours();
timePortion[1] = runTime.getMinutes();
timePortion[2] = runTime.getSeconds();
maxLength[0] = 5;
maxLength[1] = 6;
maxLength[2] = 6;
var decValue = 0;
var decMod = 0;
var temp = "";
var hoursBackground = "#7B7BB5";
var minutesBackground = "#4D5487";
var secondsBackground = "#424A63";
var colonBackground = "#000000";
var textColor = "#FFFFFF";
for (var curPor = 0; curPor <= 2; curPor++) {
decValue = timePortion[curPor];
timePortion[curPor] = "";
while (decValue != 0) {
decMod = decValue % 2;
decValue = Math.floor(decValue / 2);
timePortion[curPor] = decMod + timePortion[curPor];
}
if (timePortion[curPor].length < maxLength[curPor]) {
for (var i = 1; i <= maxLength[curPor] - timePortion[curPor].length; i++) {
temp += "0";
   }
}
timePortion[curPor] = temp + timePortion[curPor];
temp = "";
}
movingtime = '<table border="0" cellpadding="0" cellspacing="0"><tr><td bgcolor='+ hoursBackground  +'><font color='+ textColor +'>' + timePortion[0] + '</font></td><td bgcolor='+ colonBackground +'>:</td><td bgcolor='+ minutesBackground +'><font color='+ textColor +'>' + timePortion[1] + '</font></td><td bgcolor='+ colonBackground +'>:</td><td bgcolor='+ secondsBackground +'><font color='+ textColor +'>' + timePortion[2] + '</font></td></tr></table>';
if (document.layers) {
document.layers.clock.document.write(movingtime);
document.layers.clock.document.close();
}
else if (document.all) {
clock.innerHTML = movingtime;
}
setTimeout("syeClock()", 1000)
}
window.onload = syeClock;




<!-- STEP TWO: Copy this code into the BODY of your HTML document  -->

<BODY>

<script language="JavaScript" src="binaryclock.js"></script>

<p align="center">
Binary Time<br>
<span id="clock" style="position:relative;"></span>
</p>

<p><center>
<font face="arial, helvetica" SIZE="-2">Free JavaScripts provided<br>
by <a href="http://javascriptsource.com">The JavaScript Source</a></font>
</center><p>

<!-- Script Size:  2.43 KB -->