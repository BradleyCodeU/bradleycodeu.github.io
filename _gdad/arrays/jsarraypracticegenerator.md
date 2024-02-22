---
layout: project
category: arrays
title: JS Array Practice Generator
---
<button onclick="generatePractice()">Generate Array Practice</button>
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

generatePractice();

function generatePractice() {
    let result = "\nWhat ";
    const actions = ["will", "does", "would", "might", "number will", "number does"];
    const targets = ["this code", "the following", "the following code", "the following program", "this", "this program", "this algorithm"];
    const verbs = ["print", "display", "output", "produce", "end up showing"];
    result += choice(actions) + " ";
    result += choice(targets) + " ";
    result += choice(verbs) + "?\n\n";
    
    const varA = chooseVariableName();
    const varBOptions = ["index", "item", "idNum", "position", "val", "location", "loc", "pos", "counter", "address", "foo"];
    const varB = varBOptions[Math.floor(Math.random() * varBOptions.length)];
    
    const ml = [getRandomNumber(3)];
    for (let i = 0; i < getRandomNumber(4, 7); i++) {
        ml.push(getRandomNumber(ml.length + 2));
    }
    ml.sort(() => Math.random() - 0.5); // shuffle array
    
    result += "var " + varA + " = " + JSON.stringify(ml) + ";\n";
    
    indexOne = getRandomNumber(ml.length);
    indexTwo = getRandomNumber(ml.length);
    
    if (getRandomNumber(3)) {
        if (getRandomNumber(2)) {
            while (ml[indexOne] + ml[indexTwo] > ml.length) {
                indexOne = getRandomNumber(ml.length);
                indexTwo = getRandomNumber(ml.length);
            }
            result += varB + " = " + varA + "[" + indexOne + "] + " + varA + "[" + indexTwo + "];";
            indexThree = ml[indexOne] + ml[indexTwo];
        } else {
            while (indexOne === indexTwo) {
                indexOne = getRandomNumber(ml.length);
                indexTwo = getRandomNumber(ml.length);
            }
            result += varB + " = " + varA + "[" + indexOne + "] - " + varA + "[" + indexTwo + "];";
            indexThree = ml[indexOne] - ml[indexTwo];
        }
    } else {
        result += varB + " = " + varA + ".length - " + varA + "[" + indexTwo + "];";
        indexThree = ml.length - ml[indexTwo];
    }
    
    result += "\nalert(" + varA + "[" + varB + "]);";
    
    document.getElementById("output").innerText = result;
    document.getElementById("answer").innerText = "";
    document.getElementById("answer").style.display = "none";
}

function revealAnswer() {
    const ml = JSON.parse(document.getElementById("output").innerText.split("var ")[1].split(" = ")[1].split(";")[0]);
    let answer;
    
    if (indexThree >= 0 && indexThree < ml.length) {
        answer = ml[indexThree];
    } else {
        answer = "undefined";
    }
    
    document.getElementById("answer").innerText = "Answer: " + answer;
    document.getElementById("answer").style.display = "block";
}

function getRandomNumber(max, min = 0) {
    return Math.floor(Math.random() * (max - min)) + min;
}

function choice(arr) {
    return arr[getRandomNumber(arr.length)];
}

function chooseVariableName() {
    const prefixes = ["nums", "myList", "myArr", "myNums", "nmbrs", "numLst", "numbList", "NmbrLst", "ListA"];
    return prefixes[getRandomNumber(prefixes.length)] + getRandomNumber(1, 10);
}
</script>
<br>
<hr>
<br>

[https://replit.com/@JustinRiley1/JS-Array-Practice-Generator](https://replit.com/@JustinRiley1/JS-Array-Practice-Generator)

<br>

[https://trinket.io/embed/python3/bd04f0b6a2?outputOnly=true&runOption=run&start=result](https://trinket.io/embed/python3/bd04f0b6a2?outputOnly=true&runOption=run&start=result)
