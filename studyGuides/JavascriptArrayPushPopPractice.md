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

    const method = choice(["sort", "indexOf", "push", "pop"]);
    const isUndefined = Math.random() < 0.20;

    // Generate base list of 4 to 6 numbers
    let ml = [];
    const len = getRandomNumber(7, 4);
    for (let i = 0; i < len; i++) {
        ml.push(getRandomNumber(9));
    }

    if (method === "indexOf") {
        let offset = Math.random() < 0.5 ? 2 : -2;
        let target;

        if (isUndefined) {
            if (offset === 1) {
                // Set target at last index so targetIndex + 1 is out of bounds
                let uniqueVal = getRandomNumber(20, 10);
                ml[ml.length - 1] = uniqueVal;
                target = uniqueVal;
            } else {
                // Either target is missing (-1 - 1 = -2) or target is at index 0 (0 - 1 = -1)
                if (Math.random() < 0.5) {
                    let missing = [];
                    for (let i = 0; i < 20; i++) {
                        if (!ml.includes(i)) missing.push(i);
                    }
                    target = missing.length > 0 ? choice(missing) : 99;
                } else {
                    target = ml[0];
                }
            }
        } else {
            // Find targets where targetIndex + offset lands on a valid array element
            let validTargets = [];
            for (let i = 0; i < ml.length; i++) {
                let firstIdx = ml.indexOf(ml[i]);
                let checkIdx = firstIdx + offset;
                if (checkIdx >= 0 && checkIdx < ml.length) {
                    if (!validTargets.includes(ml[i])) {
                        validTargets.push(ml[i]);
                    }
                }
            }
            if (validTargets.length > 0) {
                target = choice(validTargets);
            } else {
                let uniqueVal = getRandomNumber(20, 10);
                ml[0] = uniqueVal;
                target = uniqueVal;
                offset = 1;
            }
        }

        let actualIdx = ml.indexOf(target) + offset;
        if (actualIdx >= 0 && actualIdx < ml.length) {
            currentAnswer = ml[actualIdx];
        } else {
            currentAnswer = "undefined";
        }

        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
        result += "let " + varB + " = " + varA + ".indexOf(" + target + ");\n";
        result += varB + " = " + varB + (offset === 1 ? " + 1;\n" : " - 1;\n");
        result += "alert(" + varA + "[" + varB + "]);";

    } else if (method === "sort") {
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
        result += varA + ".sort();\n";
        let sortedMl = [...ml].sort((a, b) => a - b);

        let pos;
        if (isUndefined) {
            pos = ml.length + getRandomNumber(3);
            currentAnswer = "undefined";
        } else {
            pos = getRandomNumber(sortedMl.length);
            currentAnswer = sortedMl[pos];
        }

        result += "let " + varB + " = " + pos + ";\n";
        result += "alert(" + varA + "[" + varB + "]);";

    } else if (method === "push") {
        let valToPush = getRandomNumber(9);
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";

        if (isUndefined) {
            // push() returns the new length; arr[length] is undefined
            result += "let " + varB + " = " + varA + ".push(" + valToPush + ");\n";
            result += "alert(" + varA + "[" + varB + "]);";
            currentAnswer = "undefined";
        } else {
            result += varA + ".push(" + valToPush + ");\n";
            let newMl = [...ml, valToPush];
            let pos = getRandomNumber(newMl.length);
            result += "let " + varB + " = " + pos + ";\n";
            result += "alert(" + varA + "[" + varB + "]);";
            currentAnswer = newMl[pos];
        }

    } else if (method === "pop") {
        if (isUndefined) {
            let poppedVal = getRandomNumber(15, ml.length);
            ml[ml.length - 1] = poppedVal;
            currentAnswer = "undefined";
        } else {
            let poppedVal = getRandomNumber(ml.length - 1);
            ml[ml.length - 1] = poppedVal;
            let remaining = ml.slice(0, ml.length - 1);
            currentAnswer = remaining[poppedVal];
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
    answerElement.style.display = "inline";
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