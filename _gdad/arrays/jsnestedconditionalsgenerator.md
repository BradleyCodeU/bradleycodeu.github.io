---
layout: project
category: arrays
title: JS Nested Conditionals Generator
---


<pre id="output"></pre>
<table>
 <tr>
 <td><button onclick="revealAnswer()">Reveal Answer</button></td><td><span id="answer" style="display:none;"></span></td>
 </tr>
</table>
<button onclick="generateConditionals()">Generate Nested Conditionals</button>

<script>

let myvar = 0;
let value = eval(myvar);
let logicOp1;
let value1;
let logicOp2;
let value2;
let logicOp3;
let value3;
let wordArray;
generateConditionals();

function logicalOperator() {
    let b = Math.random();
    if (b < 1/6) {
        return "> ";
    } else if (b < 2/6) {
        return "< ";
    } else if (b < 3/6) {
        return "<= ";
    } else if (b < 4/6) {
        return ">= ";
    } else if (b < 5/6) {
        return "!= ";
    } else {
        return "== ";
    }
}

function generateConditionals() {
    let outputString = "";
    let variableString = "var value = ";
    const words2DArray = [
        ["apple", "banana", "coconut", "dragonfruit"],
        ["Atlanta", "Baltimore", "Columbus", "Detroit"],
        ["ant", "bear", "cat", "dog"],
        ["alpaca", "buffalo", "cheetah", "dolphin"],
        ["antelope", "bison", "crocodile", "duck"],
        ["apricot", "blueberry", "cherry", "dill pickle"],
        ["armadillo", "beaver", "cougar", "donkey"],
        ["asparagus", "broccoli", "cauliflower", "dumplings"],
        ["almond", "bread","cashew", "donuts"],
        ["animal crackers", "barley", "corn", "deep dish pizza"],
        ["avocado", "blackberry", "cranberry", "double cheeseburger"],
        ["alphabet soup", "butternut", "chestnut", "dim sum"],
        ["American cheese", "basil", "cinnamon", "dark chocolate"],
        ["artichoke", "beet", "cabbage", "deviled eggs"],
        ["avocado", "bell pepper", "carrot", "Doritos"]
    ];
    wordArray = words2DArray[ Math.floor(Math.random() * words2DArray.length)];
    myvar = Math.floor(Math.random() * 21);
    variableString += myvar;
    variableString += ";\n";
    outputString += variableString;

    outputString += "if (value ";
    logicOp1 = logicalOperator();
    outputString += logicOp1;
    value1 = Math.floor(Math.random() * 11) + 5;
    outputString += value1 + ") {\n";

    outputString += "  if (value ";
    logicOp2 = logicalOperator();
    outputString += logicOp2;
    value2 = Math.floor(Math.random() * 11) + 5;
    outputString += value2 + ") {\n";
    outputString += "    alert('"+wordArray[0]+"');\n";
    outputString += "  } else {\n";
    outputString += "    alert('"+wordArray[1]+"');\n";
    outputString += "  }\n";
    outputString += "} else {\n";

    outputString += "  if (value ";
    logicOp3 = logicalOperator();
    outputString += logicOp3;
    value3 = Math.floor(Math.random() * 11) + 5;
    outputString += value3 + ") {\n";
    outputString += "    alert('"+wordArray[2]+"');\n";
    outputString += "  } else {\n";
    outputString += "    alert('"+wordArray[3]+"');\n";
    outputString += "  }\n";
    outputString += "}\n";

    document.getElementById("output").innerHTML = outputString;
    document.getElementById("answer").innerHTML = "";
    document.getElementById("answer").style.display = "none";
}

function revealAnswer() {
    //myvar = document.querySelector("var").innerText;
    value = eval(myvar);
    // logicOp1 = document.querySelector("if").innerText;
    // value1 = document.querySelector("if").nextElementSibling.innerText;
    // logicOp2 = document.querySelector("if").querySelector("if").innerText;
    // value2 = document.querySelector("if").querySelector("if").nextElementSibling.innerText;
    // logicOp3 = document.querySelector("if").nextElementSibling.innerText;
    // value3 = document.querySelector("if").nextElementSibling.nextElementSibling.innerText;
    let result;

    if (eval(value + logicOp1 + value1)) {
        if (eval(value + logicOp2 + value2)) {
            result = wordArray[0];
        } else {
            result = wordArray[1];
        }
    } else {
        if (eval(value + logicOp3 + value3)) {
            result = wordArray[2];
        } else {
            result = wordArray[3];
        }
    }

    document.getElementById("answer").innerHTML = "Answer: " + result;
    document.getElementById("answer").style.display = "block";
}
</script>

<br>
<hr>
<br>

[https://replit.com/@JustinRiley1/JS-Nested-Conditionals-Practice-Generator](https://replit.com/@JustinRiley1/JS-Nested-Conditionals-Practice-Generator)

<br>

[https://trinket.io/embed/python3/e8b6033319?outputOnly=true&runOption=run&start=result](https://trinket.io/embed/python3/e8b6033319?outputOnly=true&runOption=run&start=result)
