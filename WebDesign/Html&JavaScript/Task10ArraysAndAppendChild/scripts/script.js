console.log("script.js file loaded");

var companies = [{ name: "Microsoft", symbol: "MSFT", founded: "1975" }, { name: "Oracle EMEA", customers: 42000, phone: "1850 672 253" }, { name: "Apple", symbol: "AAPL", founder: "Steve Jobs" }];


function  arrayValuesInnerHtml() {
	var li = "";
	var MyList = document.getElementById('list1');
	MyList.innerHTML = li;
	for (var i = 0; i < companies.length; i++) {
		for (var property in companies[i]) {
			console.log("Index: " + i + ": " + property + ": " + companies[i][property]);
		}
		li = companies[i].name;
		document.getElementById('list1').innerHTML += '<li>' + li + '</li>';
	}
}
 arrayValuesInnerHtml();

function arrayValuesAppendChild() {
	for (var i = 0; i < companies.length; i++) {
		console.log(companies[i]);

		var node = document.createElement("LI");
		var textnode = document.createTextNode(companies[i].name);
		node.appendChild(textnode);
		document.getElementById("list2").appendChild(node);
	}
}
 arrayValuesAppendChild();

