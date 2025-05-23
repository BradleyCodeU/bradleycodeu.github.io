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
let numberList, secret, mystery;

function generateLoop() {
  let outputString = "";
  let roll = Math.random();

  if (roll < 1/3) {
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

  } else if (roll < 2/3) {
    // --- FOR LOOP ---
    loopType = "for";
    apples = Math.floor(Math.random() * 6) + 5;
    bananas = Math.floor(Math.random() * 6) + 5;
    loopCount = Math.floor(Math.random() * 3) + 2;
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

  } else {
    // --- FOR-EACH LOOP ---
    loopType = "foreach";
    numberList = [];
    for (let i = 0; i < 5; i++) {
      numberList.push(Math.floor(Math.random() * 10) + 1);
    }
    secret = Math.floor(Math.random() * 6) + 5; // Starting threshold
    mystery = Math.floor(Math.random() * 4) + 1;

    outputString += `let numberList = [${numberList.join(",")}];\n`;
    outputString += `let secret = ${secret};\nlet mystery = ${mystery};\n\n`;
    outputString += `for (let each of numberList) {\n`;
    outputString += `  if (each < secret) {\n`;
    outputString += `    secret = each;\n`;
    outputString += `  }\n`;
    outputString += `  mystery = mystery + each;\n`;
    outputString += `}\n`;
    outputString += `console.log("secret is " + secret);\nconsole.log("mystery is " + mystery);`;
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

  } else if (loopType === "for") {
    let a = apples;
    let b = bananas;
    for (let i = 0; i < loopCount; i++) {
      a = eval(appleOp.replace(/apples/g, a).replace(/i/g, i));
      b = eval(bananaOp.replace(/bananas/g, b).replace(/apples/g, a).replace(/i/g, i));
    }
    document.getElementById("loopAnswer").innerText = `Answer: apples is ${a}, bananas is ${b}`;

  } else if (loopType === "foreach") {
    let s = secret;
    let m = mystery;
    for (let each of numberList) {
      if (each < s) {
        s = each;
      }
      m = m + each;
    }
    document.getElementById("loopAnswer").innerText = `Answer: secret is ${s}, mystery is ${m}`;
  }

  document.getElementById("loopAnswer").style.display = "inline";
}

// Generate one on load
generateLoop();
</script>