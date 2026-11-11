---
layout: project
category: arrays
title: JS Array Push Pop Practice
---
<p>Practice for array sort(), indexOf(), push(), and pop()</p>
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
let currentAnswer = "";

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
    const varB = choice(varBOptions);

    const methods = ["sort", "indexOf", "push", "pop"];
    const method = choice(methods);
    const isUndefined = Math.random() < 0.20;

    // Base array of 4 to 6 single-digit non-negative integers
    const arrayLen = getRandomNumber(7, 4);
    let ml = [];
    for (let i = 0; i < arrayLen; i++) {
        ml.push(getRandomNumber(9, 0));
    }

    if (method === "indexOf") {
        let target;
        if (isUndefined) {
            // Target is not in the array so indexOf returns -1 -> arr[-1] is undefined
            let missing = [];
            for (let i = 0; i < 10; i++) {
                if (!ml.includes(i)) missing.push(i);
            }
            target = missing.length > 0 ? choice(missing) : 99;
            currentAnswer = "undefined";
        } else {
            // Target exists in the array
            target = choice(ml);
            currentAnswer = target;
        }
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
        result += "let " + varB + " = " + varA + ".indexOf(" + target + ");\n";
        result += "alert(" + varA + "[" + varB + "]);";

    } else if (method === "sort") {
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
        result += varA + ".sort();\n";
        let sortedMl = [...ml].sort((a, b) => a - b);
        let pos;
        if (isUndefined) {
            // Out of bounds index
            pos = ml.length + getRandomNumber(3, 0);
            currentAnswer = "undefined";
        } else {
            // Valid index
            pos = getRandomNumber(ml.length, 0);
            currentAnswer = sortedMl[pos];
        }
        result += "let " + varB + " = " + pos + ";\n";
        result += "alert(" + varA + "[" + varB + "]);";

    } else if (method === "push") {
        let valToPush = getRandomNumber(9, 0);
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
        if (isUndefined) {
            // push() returns the new length, accessing arr[length] evaluates to undefined
            result += "let " + varB + " = " + varA + ".push(" + valToPush + ");\n";
            result += "alert(" + varA + "[" + varB + "]);";
            currentAnswer = "undefined";
        } else {
            result += varA + ".push(" + valToPush + ");\n";
            let newMl = [...ml, valToPush];
            let pos = getRandomNumber(newMl.length, 0);
            result += "let " + varB + " = " + pos + ";\n";
            result += "alert(" + varA + "[" + varB + "]);";
            currentAnswer = newMl[pos];
        }

    } else if (method === "pop") {
        let remainingLen = ml.length - 1;
        if (isUndefined) {
            // Set the popped value out of bounds for the remaining array index range
            let invalidIndex = remainingLen + getRandomNumber(3, 0);
            ml[ml.length - 1] = invalidIndex;
            currentAnswer = "undefined";
        } else {
            // Set popped value to a valid index in the remaining array
            let validIndex = getRandomNumber(remainingLen, 0);
            ml[ml.length - 1] = validIndex;
            let popped = ml[ml.length - 1];
            let remaining = ml.slice(0, -1);
            currentAnswer = remaining[popped];
        }
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
        result += "let " + varB + " = " + varA + ".pop();\n";
        result += "alert(" + varA + "[" + varB + "]);";
    }

    document.getElementById("question").innerText = question;
    document.getElementById("output").innerText = result;
    document.getElementById("answer").innerText = "";
    document.getElementById("answer").style.display = "none";
}

function revealAnswer() {
    const answerElement = document.getElementById("answer");
    answerElement.innerText = "Answer: " + currentAnswer;
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