---
layout: project
category: arrays
title: JS Loop Practice Generator
---

<button onclick="generateLoop()">Generate Loop</button>
<pre id="output"></pre>
<table>
  <tr>
    <td><button onclick="revealAnswer()">Reveal Answer</button></td>
    <td><span id="loopAnswer" style="display:none;"></span></td>
  </tr>
</table>

<script>
let loopType = "";
let cat, dog, dogLimit, dogStep, catFormula;
let apples, bananas, loopCount, appleOp, bananaOp;

function generateLoop() {
  let outputString = "";

  if (Math.random() < 0.5) {
    // --- WHILE LOOP ---
    loopType = "while";
    cat = Math.floor(Math.random() * 5);
    dog = Math.floor(Math.random() * 3) + 1;
    dogLimit = Math.floor(Math.random() * 50) + 30;
    dogStep = Math.floor(Math.random() * 4) + 2;
    let catOps = ["cat + dog - 1", "cat + 2 * dog", "cat + dog * 2", "cat + dog + 1"];
    catFormula = catOps[Math.floor(Math.random() * catOps.length)];

    outputString += `let cat = ${cat};\nlet dog = ${dog};\n\n`;
    outputString += `while (dog < ${dogLimit}) {\n`;
    outputString += `  cat = ${catFormula};\n`;
    outputString += `  dog = dog * ${dogStep};\n`;
    outputString += `}\n`;
    outputString += `console.log("cat is " + cat);\nconsole.log("dog is " + dog);`;

  } else {
    // --- FOR LOOP ---
    loopType = "for";
    apples = Math.floor(Math.random() * 6) + 5; // 5-10
    bananas = Math.floor(Math.random() * 6) + 5;
    loopCount = Math.floor(Math.random() * 3) + 2; // 2–4 loops
    let appleOps = ["apples + 2", "apples + i", "apples + 1"];
    let bananaOps = ["apples + bananas", "bananas + i", "bananas + apples - i"];
    appleOp = appleOps[Math.floor(Math.random() * appleOps.length)];
    bananaOp = bananaOps[Math.floor(Math.random() * bananaOps.length)];

    outputString += `let apples = ${apples};\nlet bananas = ${bananas};\n\n`;
    outputString += `for (let i = 0; i < ${loopCount}; i++) {\n`;
    outputString += `  apples = ${appleOp};\n`;
    outputString += `  bananas = ${bananaOp};\n`;
    outputString += `}\n`;
    outputString += `console.log("apples is " + apples);\nconsole.log("bananas is " + bananas);`;
  }

  document.getElementById("output").innerText = outputString;
  document.getElementById("loopAnswer").style.display = "none";
  document.getElementById("loopAnswer").innerText = "";
}

function revealAnswer() {
  if (loopType === "while") {
    let catCopy = cat;
    let dogCopy = dog;
    while (dogCopy < dogLimit) {
      catCopy = eval(catFormula.replace(/cat/g, catCopy).replace(/dog/g, dogCopy));
      dogCopy = dogCopy * dogStep;
    }
    document.getElementById("loopAnswer").innerText = `Answer: cat is ${catCopy}, dog is ${dogCopy}`;
  } else {
    let a = apples;
    let b = bananas;
    for (let i = 0; i < loopCount; i++) {
      a = eval(appleOp.replace(/apples/g, a).replace(/i/g, i));
      b = eval(bananaOp.replace(/bananas/g, b).replace(/apples/g, a).replace(/i/g, i));
    }
    document.getElementById("loopAnswer").innerText = `Answer: apples is ${a}, bananas is ${b}`;
  }

  document.getElementById("loopAnswer").style.display = "inline";
}

// Generate one on load
generateLoop();
</script>
