
// document.write('Hello there');
console.log('Log created in console window');
var divIdNum = 0;
var divDim = 10;
function createNewDiv(){
    var newElement = document.createElement('div');
    newElement.id = "newDiv" + divIdNum;newElement.innerText = "Div" + divIdNum;
    divIdNum++;
    newElement.className = "divStyle";
    newElement.style.width = divDim + "px";
    newElement.style.height = divDim + "px";
    newElement.style.fontSize = (divDim/2) + "px";
    //newElement.innerHTML ="TEXT";
    divDim = divDim + 10;
    document.getElementById("wrapper").appendChild(newElement);

}