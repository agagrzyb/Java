
document.getElementById("demo").innerHTML = "Hello Word.";

var fruits, text, fLen, i;

fruits = ["Banana", "Orange", "Apple", "Mango"];
fLen = fruits.length;
text = "<ul>";
for (i = 0; i < fLen; i++) {
    text += "<li>" + fruits[i] + "</li>";
}
text += "</ul>";
document.getElementById("demo1").innerHTML = text;


function toCelsius(fahrenheit) {
    return (5/9) * (fahrenheit-32);
}
document.getElementById("demo2").innerHTML ="To Celsius functon : " + toCelsius(77);

window.alert("Beware of Gabi's Creepy Eye!!!");

