---
layout: project
category: arrays
title: JS Nested Conditionals Generator
---


<button onclick="generateConditionals()">Generate Nested Conditionals</button>

<p id="output"></p>
<button onclick="revealAnswer()">Reveal Answer</button>
<p id="answer" style="display:none;"></p>

<script>
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
    let myvar = Math.floor(Math.random() * 21);
    variableString += myvar;
    variableString += ";\n";
    outputString += variableString;

    outputString += "if (value ";
    let logicOp1 = logicalOperator();
    outputString += logicOp1;
    let value1 = Math.floor(Math.random() * 11) + 5;
    outputString += value1 + ") {\n";

    outputString += "  if (value ";
    let logicOp2 = logicalOperator();
    outputString += logicOp2;
    let value2 = Math.floor(Math.random() * 11) + 5;
    outputString += value2 + ") {\n";
    outputString += "    alert('apple');\n";
    outputString += "  } else {\n";
    outputString += "    alert('banana');\n";
    outputString += "  }\n";
    outputString += "} else {\n";

    outputString += "  if (value ";
    let logicOp3 = logicalOperator();
    outputString += logicOp3;
    let value3 = Math.floor(Math.random() * 11) + 5;
    outputString += value3 + ") {\n";
    outputString += "    alert('coconut');\n";
    outputString += "  } else {\n";
    outputString += "    alert('dragonfruit');\n";
    outputString += "  }\n";
    outputString += "}\n";

    document.getElementById("output").innerHTML = outputString;
    document.getElementById("answer").innerHTML = "";
    document.getElementById("answer").style.display = "none";
}

function revealAnswer() {
    let myvar = document.querySelector("var").innerText;
    let value = eval(myvar);
    let logicOp1 = document.querySelector("if").innerText;
    let value1 = document.querySelector("if").nextElementSibling.innerText;
    let logicOp2 = document.querySelector("if").querySelector("if").innerText;
    let value2 = document.querySelector("if").querySelector("if").nextElementSibling.innerText;
    let logicOp3 = document.querySelector("if").nextElementSibling.innerText;
    let value3 = document.querySelector("if").nextElementSibling.nextElementSibling.innerText;
    let result;

    if (eval(value + logicOp1 + value1)) {
        if (eval(value + logicOp2 + value2)) {
            result = 'apple';
        } else {
            result = 'banana';
        }
    } else {
        if (eval(value + logicOp3 + value3)) {
            result = 'coconut';
        } else {
            result = 'dragonfruit';
        }
    }

    document.getElementById("answer").innerHTML = "Answer: " + result;
    document.getElementById("answer").style.display = "block";
}
</script>

<br>

[https://replit.com/@JustinRiley1/JS-Nested-Conditionals-Practice-Generator](https://replit.com/@JustinRiley1/JS-Nested-Conditionals-Practice-Generator)

<iframe frameborder="0" width="100%" height="600px" src="https://replit.com/@JustinRiley1/JS-Nested-Conditionals-Practice-Generator?embed=true" ></iframe>

<iframe src="https://trinket.io/embed/python3/e8b6033319?outputOnly=true&runOption=run&start=result" width="100%" height="600" frameborder="0" marginwidth="0" marginheight="0" allowfullscreen></iframe>
