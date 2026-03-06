---
layout: project
category: logic
title: Short Circuit Practice
---

<button onclick="generatePractice()">Generate New Challenge</button>
<p>NOTE: ++x will increment x by 1, THEN check if it equals 1 (or whatever number)</p>
<p id="question"></p>
<pre id="output" style="font-size: 1.2em; padding: 20px; background: #282c34; color: #abb2bf; border-radius: 5px; line-height: 1.5;"></pre>
<table>
    <tr>
        <td><button onclick="revealAnswer()">Reveal Answer</button></td>
        <td><span id="answerSpan" style="display:none; font-family: monospace; font-weight: bold; margin-left: 10px;"></span></td>
    </tr>
</table>

<script>
let solutionText = "";

generatePractice();

function generatePractice() {
    // 1. Randomize initial values (0-1)
    let x = Math.floor(Math.random() * 2);
    let y = Math.floor(Math.random() * 2);
    let z = Math.floor(Math.random() * 2);

    // 2. Randomize target comparison numbers (1-2)
    let targetX = Math.floor(Math.random() * 2 + 1);
    let targetY = Math.floor(Math.random() * 2 + 1);
    let targetZ = Math.floor(Math.random() * 2 + 1);

    // 3. Randomize Operators
    let op1 = Math.random() >= 0.5 ? "||" : "&&";
    let op2 = Math.random() >= 0.5 ? "||" : "&&";

    // Format the code display (using Java syntax style)
    let codeDisplay = `int x = ${x}, y = ${y}, z = ${z};\n`;
    codeDisplay += `System.out.print( ++x == ${targetX} ${op1} ++y == ${targetY} ${op2} ++z == ${targetZ} );\n`;
    codeDisplay += `System.out.println(" x is " + x + ", y is " + y + ", z is " + z);`;

    document.getElementById("output").innerText = codeDisplay;

    // --- 4. Logic Simulation (The "Brain") ---
    // Rule: Precedence of && is higher than ||, but they are evaluated Left-to-Right.
    // However, in short-circuiting, the left side always executes first.
    
    let xResult, yResult, zResult;
    let boolResult;

    // First Part: ++x
    x++;
    xResult = (x === targetX);

    if (op1 === "||") {
        if (xResult === true) {
            // Short circuit! Skip y and z
            boolResult = true;
        } else {
            // Must evaluate the right side of ||
            y++;
            yResult = (y === targetY);
            
            if (op2 === "||") {
                boolResult = yResult || (z++, z === targetZ);
            } else {
                boolResult = yResult && (z++, z === targetZ);
            }
        }
    } else { // op1 is "&&"
        if (xResult === false) {
            // Short circuit! Skip y and z
            boolResult = false;
        } else {
            // Must evaluate the right side of &&
            y++;
            yResult = (y === targetY);
            
            if (op2 === "||") {
                boolResult = yResult || (z++, z === targetZ);
            } else {
                boolResult = yResult && (z++, z === targetZ);
            }
        }
    }

    // Capture the final string for the answer
    solutionText = `${boolResult} x is ${x}, y is ${y}, z is ${z}`;
    
    // UI Reset
    document.getElementById("answerSpan").style.display = "none";
    document.getElementById("question").innerText = "What is the exact output of this Java code?";
}

function revealAnswer() {
    const el = document.getElementById("answerSpan");
    el.innerText = "Output: " + solutionText;
    el.style.display = "block";
}
</script>