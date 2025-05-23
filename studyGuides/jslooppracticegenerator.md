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
let numberList, secret, mystery, forEachLessThan;

function generateLoop() {
  let outputString = "foo";
  let roll = Math.random();

  if (roll < 1/3) {
    // --- WHILE LOOP ---
    outputString = makeWhileLoop();

  } else if (roll < 2/3) {
    // --- FOR LOOP ---
    outputString = makeForLoop();

  } else {
    // --- FOR-EACH LOOP ---
    outputString = makeForEachLoop();
  }

  document.getElementById("output").innerText = outputString;
  document.getElementById("loopAnswer").style.display = "none";
  document.getElementById("loopAnswer").innerText = "";
}

function makeWhileLoop(){
  let outputString = "";
  loopType = "while";
    cat = Math.floor(Math.random() * 5);
    dog = Math.floor(Math.random() * 3) + 1;
    dogStep = Math.floor(Math.random() * 4) + 2;
    dogLimit = Math.floor(Math.random() * dogStep * 3) + dogStep * 2;
    let catOps = ["cat + dog - 1", "cat + dog + 1", "cat * 2 + dog", "cat + dog * 2"];
    catFormula = catOps[Math.floor(Math.random() * catOps.length)];

    outputString += `let cat = ${cat};\nlet dog = ${dog};\n\n`;
    outputString += `while (dog < ${dogLimit}) {\n`;
    outputString += `  cat = ${catFormula};\n`;
    outputString += `  dog = dog * ${dogStep};\n`;
    outputString += `}\n`;
    outputString += `console.log("cat is " + cat);\nconsole.log("dog is " + dog);`;
    return outputString;
}

function makeForLoop(){
  let outputString = "";
  loopType = "for";
    apples = Math.floor(Math.random() * 6) + 5;
    bananas = Math.floor(Math.random() * 6) + 5;
    loopCount = Math.floor(Math.random() * 3) + 2;
    let appleOps = ["apples + 2", "apples + 3", "apples + 1"];
    let bananaOps = ["apples + bananas", "bananas + apples + 1", "bananas + apples - 1"];
    appleOp = appleOps[Math.floor(Math.random() * appleOps.length)];
    bananaOp = bananaOps[Math.floor(Math.random() * bananaOps.length)];

    outputString += `let apples = ${apples};\nlet bananas = ${bananas};\n\n`;
    outputString += `for (let i = 0; i < ${loopCount}; i++) {\n`;
    outputString += `  apples = ${appleOp};\n`;
    outputString += `  bananas = ${bananaOp};\n`;
    outputString += `}\n`;
    outputString += `console.log("apples is " + apples);\nconsole.log("bananas is " + bananas);`;
    return outputString;
}

function makeForEachLoop(){
  let outputString = "";
  forEachLessThan = Math.random() < 0.5;
  loopType = "foreach";
  let total = 0;
  let listSize = Math.floor(Math.random() * 2) + 4;
    numberList = [];
    for (let i = 0; i < listSize; i++) {
      numberList.push(Math.floor(Math.random() * 10) + 1);
      total += numberList[i];
    }
    secret = Math.floor(total / listSize); // Starting threshold
    mystery = Math.floor(Math.random() * 4) + 1;

    outputString += `let numberList = [${numberList.join(",")}];\n`;
    outputString += `let secret = ${secret};\nlet mystery = ${mystery};\n\n`;
    outputString += `for (let each of numberList) {\n`;
    if(forEachLessThan){
      outputString += `  if (each < secret) {\n`;
    } else {
      outputString += `  if (each > secret) {\n`;
    }
    
    outputString += `    secret = each;\n`;
    outputString += `  }\n`;
    outputString += `  mystery = mystery + each;\n`;
    outputString += `}\n`;
    outputString += `console.log("secret is " + secret);\nconsole.log("mystery is " + mystery);`;
    return outputString;
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
      if (forEachLessThan === true && each < s) {
        s = each;
      }
      else if (forEachLessThan === false && each > s) {
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