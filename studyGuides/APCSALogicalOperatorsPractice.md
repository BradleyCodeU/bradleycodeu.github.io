---
layout: project
category: logic
title: APCSA Logical Operators Practice
---

<button onclick="generatePractice()">Generate Logic Practice</button>
<p id="question"></p>
<pre id="output" style="font-size: 1.5em; font-weight: bold; padding: 20px; border-radius: 5px;"></pre>
<table>
    <tr>
        <td><button onclick="revealAnswer()">Reveal Answer</button></td>
        <td><span id="answerSpan" style="display:none; font-weight: bold; margin-left: 10px;"></span></td>
    </tr>
</table>

<script>
let currentAnswer;

// Initialize on load
generatePractice();

function generatePractice() {
    const answerElement = document.getElementById("answerSpan");
    answerElement.style.display = "none";
    
    // Set the question text
    const actions = ["evaluate", "solve", "determine the result of", "find the value of"];
    const targets = ["this expression", "the following logic", "this boolean statement"];
    document.getElementById("question").innerText = `What does ${choice(actions)} ${choice(targets)}?`;

    // --- Logic Generation ---
    let expression = "(";

    // First part of parenthesis
    expression += (Math.random() >= 0.5 ? "true " : "false ");
    expression += (Math.random() >= 0.5 ? "&& " : "|| "); // Using JS syntax (&& / ||)
    if (Math.random() >= 0.5) expression += "!"; // Using JS syntax (!)
    expression += (Math.random() >= 0.5 ? "true" : "false");
    
    expression += ") ";

    // Middle operator
    expression += (Math.random() >= 0.5 ? "&& " : "|| ");

    // Outside part
    if (Math.random() >= 0.5) expression += "!";
    expression += (Math.random() >= 0.5 ? "true" : "false");

    // Display the expression (formatted for readability)
    // We replace JS operators with words for the user, but keep JS for eval()
    // let displayExpression = expression
    //     .replace(/&&/g, "AND")
    //     .replace(/\|\|/g, "OR")
    //     .replace(/!/g, "NOT")
    //     .toUpperCase();

    // document.getElementById("output").innerText = displayExpression;

    
    document.getElementById("output").innerText = expression;


    // Calculate Answer using JS eval
    // eval() works perfectly here because 'true' and 'false' are native JS booleans
    currentAnswer = eval(expression);
}

function revealAnswer() {
    const answerElement = document.getElementById("answerSpan");
    answerElement.innerText = "Answer: " + currentAnswer.toString();
    answerElement.style.display = "block";
}

function choice(arr) {
    return arr[Math.floor(Math.random() * arr.length)];
}
</script>