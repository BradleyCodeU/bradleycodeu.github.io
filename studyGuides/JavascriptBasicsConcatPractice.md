---
layout: project
category: strings
title: Javascript Basics Concat Practice
---

<p>Practice Generator for string concatenation, variable reassignment, string literals, and alert outputs.</p>

<button onclick="generatePractice()">Generate JS Concat Practice</button>
<p id="question"></p>
<pre id="output"></pre>
<table>
    <tr>
        <td><button onclick="revealAnswer()">Reveal Answer</button></td>
        <td><span id="answerSpan" style="display:none;"></span></td>
    </tr>
</table>

<script>
let answer;

generatePractice();

function generatePractice() {
    const answerElement = document.getElementById("answerSpan");
    answerElement.style.display = "none";

    let question = "What ";
    const actions = ["will", "does", "would", "might", "alert will", "alert does"];
    const targets = ["this code", "the following", "the following code", "the following program", "this", "this program", "this algorithm"];
    const verbs = ["print", "display", "output", "produce", "end up showing"];
    question += choice(actions) + " ";
    question += choice(targets) + " ";
    question += choice(verbs) + "?\n\n";

    let result = "";

    const threeLetterWords = [
        "all", "bug", "can", "cat", "dad", "dog", "egg", "for", "get",
        "hat", "hen", "jar", "kid", "law", "map", "mom", "not", "one",
        "pet", "rat", "ski", "the", "van", "wax", "yak", "you", "zip", "zoo"
    ];

    const varNames = [
        "index", "item", "idNum", "position", "xSpeed", 
        "location", "total", "ySpeed", "counter", "address", 
        "foo", "foobar", "temp", "indexA", "indexB", 
        "indexC", "selected", "pick", "score", "health",
        "lives", "amount", "value", "count", "number", 
        "rate", "age", "width", "height", "size", 
        "mass", "weight", "grade", "level", "stage", "mode", "flag", "status",
        "option", "state", "point", "round", "timer"
    ];

    const varA = varNames.splice(Math.floor(Math.random() * varNames.length), 1)[0];
    const varB = varNames.splice(Math.floor(Math.random() * varNames.length), 1)[0];

    let word1 = threeLetterWords.splice(Math.floor(Math.random() * threeLetterWords.length), 1)[0];
    let word2 = threeLetterWords.splice(Math.floor(Math.random() * threeLetterWords.length), 1)[0];
    let word3 = threeLetterWords.splice(Math.floor(Math.random() * threeLetterWords.length), 1)[0];
    let word4 = threeLetterWords.splice(Math.floor(Math.random() * threeLetterWords.length), 1)[0];
    let word5 = threeLetterWords.splice(Math.floor(Math.random() * threeLetterWords.length), 1)[0];
    let word6 = threeLetterWords.splice(Math.floor(Math.random() * threeLetterWords.length), 1)[0];

    let valA = word1;
    let valB = word2;

    result += "let " + varA + " = " + JSON.stringify(valA) + ";\n";
    result += "let " + varB + " = " + JSON.stringify(valB) + ";\n";

    // Reassign variable A
    const typeA = getRandomNumber(4);
    if (typeA === 0) {
        // varA = varA + "word"
        result += varA + " = " + varA + " + " + JSON.stringify(word3) + ";\n";
        valA = valA + word3;
    } else if (typeA === 1) {
        // varA = "word" + varA
        result += varA + " = " + JSON.stringify(word3) + " + " + varA + ";\n";
        valA = word3 + valA;
    } else if (typeA === 2) {
        // varA = varA + varA
        result += varA + " = " + varA + " + " + varA + ";\n";
        valA = valA + valA;
    } else {
        // varA = "word3" + "word4"
        result += varA + " = " + JSON.stringify(word3) + " + " + JSON.stringify(word4) + ";\n";
        valA = word3 + word4;
    }

    // Reassign variable B
    const typeB = getRandomNumber(4);
    if (typeB === 0) {
        // varB = varB + "word"
        result += varB + " = " + varB + " + " + JSON.stringify(word5) + ";\n";
        valB = valB + word5;
    } else if (typeB === 1) {
        // varB = "word" + varB
        result += varB + " = " + JSON.stringify(word5) + " + " + varB + ";\n";
        valB = word5 + valB;
    } else if (typeB === 2) {
        // varB = varB + varB
        result += varB + " = " + varB + " + " + varB + ";\n";
        valB = valB + valB;
    } else {
        // varB = "word5" + "word6"
        result += varB + " = " + JSON.stringify(word5) + " + " + JSON.stringify(word6) + ";\n";
        valB = word5 + word6;
    }

    // Combine strings in random order
    if (getRandomNumber(2) === 0) {
        result += "let answer = " + varA + " + " + varB + ";\n";
        answer = valA + valB;
    } else {
        result += "let answer = " + varB + " + " + varA + ";\n";
        answer = valB + valA;
    }

    result += "alert(answer);";

    document.getElementById("question").innerText = question;
    document.getElementById("output").innerText = result;
    document.getElementById("answerSpan").innerText = "";
    document.getElementById("answerSpan").style.display = "none";
}

function revealAnswer() {
    const answerElement = document.getElementById("answerSpan");
    answerElement.innerText = 'Answer: ' + answer;
    answerElement.style.display = "block";
}

function getRandomNumber(max, min = 0) {
    return Math.floor(Math.random() * (max - min)) + min;
}

function choice(arr) {
    return arr[getRandomNumber(arr.length)];
}
</script>