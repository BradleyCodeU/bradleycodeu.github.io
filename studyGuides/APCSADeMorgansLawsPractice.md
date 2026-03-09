---
layout: project
category: logic
title: De Morgan's Laws Generator
---

<button onclick="generatePractice()">Generate New Challenge</button>
<p id="question">Apply De Morgan's Laws to rewrite the condition (simplify all ! symbols):</p>
<pre id="output" style="font-size: 1.5em; padding: 20px; background: #282c34; color: #61afef; border-radius: 5px; font-weight: bold;"></pre>

<table>
    <tr>
        <td><button onclick="revealAnswer()">Reveal Simplified Expression</button></td>
        <td><span id="answerSpan" style="display:none; font-family: monospace; font-weight: bold; margin-left: 10px; color: #98c379;"></span></td>
    </tr>
</table>

<script>
let currentAnswer = "";

const comparisons = [
    { op: "==", opp: "!=" },
    { op: "!=", opp: "==" },
    { op: "<",  opp: ">=" },
    { op: ">",  opp: "<=" },
    { op: "<=", opp: ">"  },
    { op: ">=", opp: "<"  }
];

function generatePractice() {
    const varName = Math.random() > 0.5 ? "x" : "myNum";
    const type = Math.floor(Math.random() * 4); // 4 different complexity patterns
    
    let expression = "";
    let answer = "";

    // Helper to get random comparison
    const getComp = () => comparisons[Math.floor(Math.random() * comparisons.length)];
    const val1 = Math.floor(Math.random() * 10) + 1;
    const val2 = Math.floor(Math.random() * 10) + 1;
    const logOp = Math.random() > 0.5 ? "&&" : "||";
    const oppLogOp = logOp === "&&" ? "||" : "&&";

    if (type === 0) {
        // Pattern: !(A op B)
        let c = getComp();
        expression = `!(${varName} ${c.op} ${val1})`;
        answer = `${varName} ${c.opp} ${val1}`;
    } 
    else if (type === 1) {
        // Pattern: !(A op1 B && C op2 D)
        let c1 = getComp();
        let c2 = getComp();
        expression = `!(${varName} ${c1.op} ${val1} ${logOp} ${varName} ${c2.op} ${val2})`;
        answer = `${varName} ${c1.opp} ${val1} ${oppLogOp} ${varName} ${c2.opp} ${val2}`;
    }
    else if (type === 2) {
        // Pattern: !(A op1 B || !(C op2 D))
        let c1 = getComp();
        let c2 = getComp();
        expression = `!(${varName} ${c1.op} ${val1} ${logOp} !(${varName} ${c2.op} ${val2}))`;
        answer = `${varName} ${c1.opp} ${val1} ${oppLogOp} ${varName} ${c2.op} ${val2}`;
    }
    else {
        // Pattern: Double Negation: !!(A op B) or !(!(A op B) || C op D)
        let c1 = getComp();
        let c2 = getComp();
        expression = `!(!(${varName} ${c1.op} ${val1}) ${logOp} ${varName} ${c2.op} ${val2})`;
        answer = `${varName} ${c1.op} ${val1} ${oppLogOp} ${varName} ${c2.opp} ${val2}`;
    }

    document.getElementById("output").innerText = expression;
    currentAnswer = answer;
    document.getElementById("answerSpan").style.display = "none";
}

function revealAnswer() {
    const el = document.getElementById("answerSpan");
    el.innerText = "Simplified: " + currentAnswer;
    el.style.display = "block";
}

generatePractice();
</script>