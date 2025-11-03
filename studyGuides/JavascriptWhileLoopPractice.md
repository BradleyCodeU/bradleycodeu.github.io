---
layout: project
category: arrays
title: JS While Loops Practice Generator
---

Practice working with while loops

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
let x, y, startVal, endVal, reverseStep, xOp, yOp;
let fish, shark, sharkLimit, sharkStep, fishFormula;

function randomVarNames(count) {
  const pool = [
  "ape",   // A
  "bee",   // B
  "cat",   // C
  "dog",   // D
  "eel",   // E
  "fox",   // F
  "gnu",   // G
  "hen",   // H
  "ibex",  // I
  "jay",   // J
  "koala", // K
  "lion",  // L
  "mouse", // M
  "newt",  // N
  "owl",   // O
  "pig",   // P
  "quail", // Q
  "ram",   // R
  "seal",  // S
  "toad",  // T
  "urchin",// U
  "vole",  // V
  "wolf",  // W
  "xray", 
  "yak",   // Y
  "zebra"  // Z
  ];
  let picks = [];
  while (picks.length < count) {
    let choice = pool[Math.floor(Math.random() * pool.length)];
    if (!picks.includes(choice)) picks.push(choice);
  }
  return picks;
}

function generateLoop() {
  let outputString = "foo";
  let roll = Math.random();

  //if (roll < 0.2) {
    outputString = makeWhileLoop();
  // } else if (roll < 0.4) {
  //   outputString = makeForLoop();
  // } else if (roll < 0.6) {
  //   outputString = makeForEachLoop();
  // } else if (roll < 0.8) {
  //   outputString = makeReverseForLoop();
  // } else {
  //   outputString = makeDoWhileLoop();
  // }

  document.getElementById("output").innerText = outputString;
  document.getElementById("loopAnswer").style.display = "none";
  document.getElementById("loopAnswer").innerText = "";
}

// WHILE LOOP GENERATOR
let whileState = {};
function makeWhileLoop(){
  loopType = "while";
  const [a, b] = randomVarNames(2);
  varNames = { a, b };

  const aVal = Math.floor(Math.random() * 5);
  const bVal = Math.floor(Math.random() * 3) + 1;
  const bStep = Math.floor(Math.random() * 4) + 2;
  const reps = Math.floor(Math.random() * 3) + 2;
  const bLimit = Math.pow(bStep, reps) - Math.floor(Math.random() * bStep);

  const formulas = [
    `${a} + ${b} - 1`,
    `${a} + ${b} + 1`,
    `${a} * 2 + ${b}`,
    `${a} + ${b} * 2`
  ];
  const aFormula = formulas[Math.floor(Math.random() * formulas.length)];

  whileState = { a, b, aVal, bVal, bStep, bLimit, aFormula };

  let code = `let ${a} = ${aVal};\nlet ${b} = ${bVal};\n\n`;
  code += `while (${b} < ${bLimit}) {\n`;
  code += `  ${a} = ${aFormula};\n`;
  code += `  ${b} = ${b} * ${bStep};\n`;
  code += `}\n`;
  code += `console.log("${a} is " + ${a});\nconsole.log("${b} is " + ${b});`;

  return code;
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


function makeReverseForLoop(){
  let outputString = "";
  loopType = "reverse-for";

  x = Math.floor(Math.random() * 10) + 5;
  y = Math.floor(Math.random() * 5) + 1;
  startVal = Math.floor(Math.random() * 5) + 5;
  endVal = Math.floor(Math.random() * 3);
  reverseStep = 1;

  let xOps = ["x - i", "x - y", "x - 2", "x - (i + y)"];
  let yOps = ["y + x", "y + i", "y + 2", "y + (x - i)"];
  xOp = xOps[Math.floor(Math.random() * xOps.length)];
  yOp = yOps[Math.floor(Math.random() * yOps.length)];

  outputString += `let x = ${x};\nlet y = ${y};\n\n`;
  outputString += `for (let i = ${startVal}; i >= ${endVal}; i--) {\n`;
  outputString += `  x = ${xOp};\n`;
  outputString += `  y = ${yOp};\n`;
  outputString += `}\n`;
  outputString += `console.log("x is " + x);\nconsole.log("y is " + y);`;
  return outputString;
}

function makeDoWhileLoop(){
  let outputString = "";
  loopType = "do-while";
  fish = Math.floor(Math.random() * 5);
  shark = Math.floor(Math.random() * 4) + 1;
  sharkStep = Math.floor(Math.random() * 3) + 2;
  sharkLimit = shark + sharkStep * Math.floor(Math.random() * 2 + 1) + sharkStep * Math.floor(Math.random() * 2 + 1) + Math.floor(Math.random() * 3 - 1);

  let fishOps = ["fish + shark", "fish + shark * 2", "fish * 2 + shark", "fish + shark + 1"];
  fishFormula = fishOps[Math.floor(Math.random() * fishOps.length)];

  outputString += `let fish = ${fish};\nlet shark = ${shark};\n\n`;
  outputString += `do {\n`;
  outputString += `  fish = ${fishFormula};\n`;
  outputString += `  shark = shark + ${sharkStep};\n`;
  outputString += `} while (shark < ${sharkLimit});\n`;
  outputString += `console.log("fish is " + fish);\nconsole.log("shark is " + shark);`;
  return outputString;
}


function revealAnswer() {
  if (loopType === "while") {
    let { a, b, aVal, bVal, bStep, bLimit, aFormula } = whileState;
    let aCopy = aVal;
    let bCopy = bVal;

    // Evaluate until the condition fails
    while (bCopy < bLimit) {
      aCopy = eval(aFormula.replace(new RegExp(a, "g"), aCopy).replace(new RegExp(b, "g"), bCopy));
      bCopy = bCopy * bStep;
    }
    document.getElementById("loopAnswer").innerText = `Answer: ${a} is ${aCopy}, ${b} is ${bCopy}`;
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

  } else if (loopType === "reverse-for") {
    let xCopy = x;
    let yCopy = y;
    for (let i = startVal; i >= endVal; i -= reverseStep) {
      xCopy = eval(xOp.replace(/x/g, xCopy).replace(/y/g, yCopy).replace(/i/g, i));
      yCopy = eval(yOp.replace(/x/g, xCopy).replace(/y/g, yCopy).replace(/i/g, i));
    }
    document.getElementById("loopAnswer").innerText = `Answer: x is ${xCopy}, y is ${yCopy}`;
  
  } else if (loopType === "do-while") {
    let f = fish;
    let s = shark;
    do {
      f = eval(fishFormula.replace(/fish/g, f).replace(/shark/g, s));
      s = s + sharkStep;
    } while (s < sharkLimit);
    document.getElementById("loopAnswer").innerText = `Answer: fish is ${f}, shark is ${s}`;
  }


  document.getElementById("loopAnswer").style.display = "inline";
}

// Generate one on load
generateLoop();
</script>
