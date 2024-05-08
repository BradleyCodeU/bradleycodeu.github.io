---
layout: project
category: arrays
title: Python Tracing Loop Practice
---

<button onclick="generatePractice()">Generate Loop Tracing Practice</button>
<p id="question"></p>
<pre id="output"></pre>
<table>
    <tr>
        <td><button onclick="revealAnswer()">Reveal Answer</button></td>
        <td><span id="answer" style="display:none;"></span></td>
    </tr>
</table>


<script>
let answer;

generatePractice();

function generatePractice() {
   console.log("JavaScript Tracing Loop Practice Generator");


    let question = "\nWhat ";
    question += randomChoice([
        "will", "does", "would", "might", "number will", "number does"
    ]) + " ";
    question += randomChoice([
        "this code", "the following", "the following code",
        "the following program", "this", "this program", "this algorithm"
    ]) + " ";
    question += randomChoice([
        "print", "display", "output", "produce", "end up showing"
    ]);
    question += "?";
    let result = "";
    let varUpStr = randomChoice([
        'ant', 'bat', 'cat', 'dog', 'act', 'bed', 'cab', 'dad', 'add', 'bad',
        'bag', 'cap', 'car', 'cut', 'day', 'aid', 'bid', 'big', 'cad', 'cod',
        'dab', 'boo'
    ]);
    let varDownStr = randomChoice([
        'fan', 'gap', 'hot', 'jam', 'fit', 'goo', 'hat', 'jaw', 'fig', 'hog',
        'jog', 'fun', 'gym', 'hay', 'job', 'foo', 'mom', 'nom'
    ]);

    //print line 01 assignment
    let varUpValue = getRandomInt(-2, 5);
    result += varUpStr + " = " + varUpValue + "\n";
    //print line 02 assignment
    let varDownValue = getRandomInt(5, 13);
    result += varDownStr + " = " + varDownValue + "\n";

    //pick the mid-loop modifiers
    let varUpModifier = getRandomInt(1, 3);
    let varDownModifier = getRandomInt(1, 3);

    //pick a loop type
    let loopType = getRandomInt(1, 5);
    if (loopType === 1) {
        for (let i = 0; i < 5; i++) {
            varUpValue += varUpModifier;
            varDownValue -= varDownModifier;
        }
        result += "for i in range(5):\n";
    } else if (loopType === 2) {
        while (varUpValue < 5) {
            varUpValue += varUpModifier;
            varDownValue -= varDownModifier;
        }
        result += "while " + varUpStr + " < 5:\n";
    } else if (loopType === 3) {
        while (varDownValue > 5) {
            varUpValue += varUpModifier;
            varDownValue -= varDownModifier;
        }
        result += "while " + varDownStr + " > 5:\n";
    } else if (loopType === 4) {
        varUpModifier = varDownStr;
        for (let i = 0; i < 5; i++) {
            varUpValue += varDownValue;
            varDownValue -= varDownModifier;
        }
        result += "for i in range(5):\n";
    } else if (loopType === 5) {
        varUpModifier = varDownStr;
        while (varDownValue > 5) {
            varUpValue += varDownValue;
            varDownValue -= varDownModifier;
        }
        result += "while " + varDownStr + " > 5:\n";
    }
    result += "    " + varUpStr + " += " + varUpModifier + "\n";
    result += "    " + varDownStr + " -= " + varDownModifier + "\n";

    //pick the final result modifier
    let resultModifier = getRandomInt(1, 4);
    let resultValue;

    //do the result modifier
    if (resultModifier === 1) {
        resultValue = String(varUpValue) + String(varDownValue);
        result += "result = str(" + varUpStr + ") + str(" + varDownStr + ")\n";
    } else if (resultModifier === 2) {
        resultValue = varUpValue + varDownValue * 2;
        result += "result = " + varUpStr + " + " + varDownStr + " * 2\n";
    } else if (resultModifier === 3) {
        resultValue = varDownValue + varUpValue * 2;
        result += "result = " + varDownStr + " + " + varUpStr + " * 2\n";
    } else if (resultModifier === 4) {
        resultValue = 2 + varUpValue * varDownValue;
        result += "result = 2 + " + varUpStr + " * " + varDownStr + "\n";
    }

    //print the print statement
    result += "print(result)";
    answer = resultValue;




    document.getElementById("question").innerText = question;
    document.getElementById("output").innerText = result;
    document.getElementById("answer").innerText = "";
    document.getElementById("answer").style.display = "none";

}

// Helper functions
function randomChoice(choices) {
    return choices[Math.floor(Math.random() * choices.length)];
}

function getRandomInt(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

function revealAnswer() {
    
    
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
