---
layout: project
category: arrays
title: JS Array Practice Generator
---

<button onclick="generatePractice()">Generate Array Practice</button>
<p id="question"></p>
<pre id="output"></pre>
<table>
    <tr>
        <td><button onclick="revealAnswer()">Reveal Answer</button></td>
        <td><span id="answer" style="display:none;"></span></td>
    </tr>
</table>


<script>
let indexOne;
let indexTwo;
let indexThree;
let ml = [];
let nums = ml;
let myList = ml;
let myArr = ml;
let myNums = ml;
let nmbrs = ml;
let numLst = ml;
let numbList = ml;
let NmbrLst = ml;
let ListA = ml;

generatePractice();

function generatePractice() {
    let question = "What ";
    const actions = ["will", "does", "would", "might", "number will", "number does"];
    const targets = ["this code", "the following", "the following code", "the following program", "this", "this program", "this algorithm"];
    const verbs = ["print", "display", "output", "produce", "end up showing"];
    question += choice(actions) + " ";
    question += choice(targets) + " ";
    question += choice(verbs) + "?\n\n";
    let result = "";
    const varA = chooseVariableName();
    const varBOptions = ["index", "item", "idNum", "position", "val", "location", "loc", "pos", "counter", "address", "foo"];
    const varB = varBOptions[Math.floor(Math.random() * varBOptions.length)];
    
    ml = [getRandomNumber(3)];
    for (let i = 0; i < getRandomNumber(4, 7); i++) {
        ml.push(getRandomNumber(ml.length + 2));
    }
    ml.sort(() => Math.random() - 0.5); // shuffle array
    nums = ml;
    myList = ml;
    myArr = ml;
    myNums = ml;
    nmbrs = ml;
    numLst = ml;
    numbList = ml;
    NmbrLst = ml;
    ListA = ml;
    result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
    
    indexOne = getRandomNumber(ml.length);
    indexTwo = getRandomNumber(ml.length);
    
    if (getRandomNumber(3)) {
        if (getRandomNumber(2)) {
            while (ml[indexOne] + ml[indexTwo] > ml.length) {
                indexOne = getRandomNumber(ml.length);
                indexTwo = getRandomNumber(ml.length);
            }
            result += "let " + varB + " = " + varA + "[" + indexOne + "] + " + varA + "[" + indexTwo + "];";
            indexThree = ml[indexOne] + ml[indexTwo];
        } else {
            while (indexOne === indexTwo) {
                indexOne = getRandomNumber(ml.length);
                indexTwo = getRandomNumber(ml.length);
            }
            result += "let " + varB + " = " + varA + "[" + indexOne + "] - " + varA + "[" + indexTwo + "];";
            indexThree = ml[indexOne] - ml[indexTwo];
        }
    } else {
        result += "let " + varB + " = " + varA + ".length - " + varA + "[" + indexTwo + "];";
        indexThree = ml.length - ml[indexTwo];
    }
    
    result += "\nalert(" + varA + "[" + varB + "]);";
    document.getElementById("question").innerText = question;
    document.getElementById("output").innerText = result;
    document.getElementById("answer").innerText = "";
    document.getElementById("answer").style.display = "none";
}
function revealAnswer() {
    const outputText = document.getElementById("output").innerText;
    
    // Replace "let " with "var " in the output text
    const updatedOutputText = outputText.replace(/let /g, "var ");
    
    // Check if the updatedOutputText contains the expected format
    if (!updatedOutputText.includes("var ")) {
        console.error("Output format is incorrect.");
        return;
    }
    
    // Extract variable name and corresponding array from updatedOutputText
    const varDeclaration = updatedOutputText.split("var ")[1].split(" = ")[0];
    const varName = varDeclaration.trim();
    const ml = eval(varName); // Evaluate variable name to get the array
    
    // Check if ml is an array
    if (!Array.isArray(ml)) {
        console.error("Variable is not an array.");
        return;
    }
    
    // Calculate the answer based on previously generated indices
    let answer;
    if (indexThree >= 0 && indexThree < ml.length) {
        answer = ml[indexThree];
    } else {
        answer = "undefined";
    }
    
    // Display the answer
    const answerElement = document.getElementById("answer");
    answerElement.innerText = "Answer: " + answer;
    answerElement.style.display = "block";
}



function getRandomNumber(max, min = 0) {
    return Math.floor(Math.random() * (max - min)) + min;
}

function choice(arr) {
    return arr[getRandomNumber(arr.length)];
}

function chooseVariableName() {
    const prefixes = ["nums", "myList", "myArr", "myNums", "nmbrs", "numLst", "numbList", "NmbrLst", "ListA"];
    return prefixes[getRandomNumber(prefixes.length)];
}
</script>
<br>
<hr>
<br>

[https://replit.com/@JustinRiley1/JS-Array-Practice-Generator](https://replit.com/@JustinRiley1/JS-Array-Practice-Generator)

<br>

[https://trinket.io/embed/python3/bd04f0b6a2?outputOnly=true&runOption=run&start=result](https://trinket.io/embed/python3/bd04f0b6a2?outputOnly=true&runOption=run&start=result)
