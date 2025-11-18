---
layout: project
category: arrays
title: JS Nested For Practice 
---

Practice working with nested for loops

<button onclick="generateLoop()">Generate Nested Loops</button>
<pre id="output"></pre>
<table>
  <tr>
    <td><button onclick="revealAnswer()">Reveal Answer</button></td>
    <td><span id="loopAnswer" style="display:none;"></span></td>
  </tr>
</table>

<script>
// --- Global State Variables ---
let loopType = "";

// While Loop Globals
let cat, dog, dogLimit, dogStep, catFormula;

// For Loop Globals
let variableName1, variableName2;
let loopCount, appleOp, bananaOp;

// For Each Loop Globals
let numberList, secret, mystery, forEachLessThan;

// Reverse For Loop Globals
let x, y, startVal, endVal, reverseStep, xOp, yOp;

// Do While Globals
let fish, shark, sharkLimit, sharkStep, fishFormula;

// Nested For Loop Globals (New)
let nestTotal, outerLimit, innerLimit, nestFormula;
let outerVar, innerVar;

const natoPhonetic = [
"alpha", "bravo", "charlie", "delta", "echo", "foxtrot",
"golf", "hotel", "india", "juliett", "kilo", "lima", "mike",
"november", "oscar", "papa", "quebec", "romeo", "sierra",
"tango", "uniform", "victor", "werewolf", "xray", "yankee", "zulu"
];


function generateLoop() {
  let outputString = "";
  let roll = Math.random();

  // Adjusted probabilities to include the new Nested Loop (6 types total)
//   if (roll < 0.16) {
//     outputString = makeWhileLoop();
//   } else if (roll < 0.32) {
//     outputString = makeForLoop();
//   } else if (roll < 0.48) {
//     outputString = makeForEachLoop();
//   } else if (roll < 0.64) {
//     outputString = makeReverseForLoop();
//   } else if (roll < 0.80) {
//     outputString = makeDoWhileLoop();
//   } else {
    outputString = makeNestedForLoop();
  //}

  document.getElementById("output").innerText = outputString;
  document.getElementById("loopAnswer").style.display = "none";
  document.getElementById("loopAnswer").innerText = "";
}

// --- 1. While Loop ---
function makeWhileLoop(){
  let outputString = "";
  loopType = "while";
  cat = Math.floor(Math.random() * 5);
  dog = Math.floor(Math.random() * 3) + 1;
  dogStep = Math.floor(Math.random() * 4) + 2;

  let reps = Math.floor(Math.random() * 3) + 2;
  dogLimit = Math.pow(dogStep, reps) - Math.floor(Math.random() * dogStep);
  
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

// --- 2. Standard For Loop ---
function makeForLoop() {
  let outputString = "";
  loopType = "for";



  const shuffled = natoPhonetic.sort(() => Math.random() - 0.5);
  variableName1 = shuffled[0];
  variableName2 = shuffled[1];

  let val1 = Math.floor(Math.random() * 6) + 5;
  let val2 = Math.floor(Math.random() * 6) + 5;
  loopCount = Math.floor(Math.random() * 3) + 2;

  const var1Ops = [`${variableName1} + 2`, `${variableName1} + 3`, `${variableName1} + 1`];
  const var2Ops = [`${variableName1} + ${variableName2}`, `${variableName2} + ${variableName1} + 1`, `${variableName2} + ${variableName1} - 1`];

  appleOp = var1Ops[Math.floor(Math.random() * var1Ops.length)];
  bananaOp = var2Ops[Math.floor(Math.random() * var2Ops.length)];

  outputString += `let ${variableName1} = ${val1};\nlet ${variableName2} = ${val2};\n\n`;
  outputString += `for (let i = 0; i < ${loopCount}; i++) {\n`;
  outputString += `  ${variableName1} = ${appleOp};\n`;
  outputString += `  ${variableName2} = ${bananaOp};\n`;
  outputString += `}\n`;
  outputString += `console.log("${variableName1} is " + ${variableName1});\n`;
  outputString += `console.log("${variableName2} is " + ${variableName2});`;

  window[variableName1] = val1;
  window[variableName2] = val2;

  return outputString;
}

// --- 3. For Each Loop ---
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
  secret = Math.floor(total / listSize);
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

// --- 4. Reverse For Loop ---
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

// --- 5. Do While Loop ---
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

// --- 6. Nested For Loop (NEW) ---
function makeNestedForLoop() {
  let outputString = "";
  loopType = "nested-for";

  // 1. Select Loop Variables
  const varPairs = [
    { o: "row", i: "col" },
    { o: "i", i: "j" },
    { o: "outer", i: "inner" }
  ];
  const choice = varPairs[Math.floor(Math.random() * varPairs.length)];
  outerVar = choice.o;
  innerVar = choice.i;

  // 2. Set Limits and Initial Value
  outerLimit = Math.floor(Math.random() * 2) + 2; // 2 to 3
  innerLimit = Math.floor(Math.random() * 2) + 2; // 2 to 3
  if(outerLimit == 3){
    innerLimit = 2;
  }

  const shuffled = natoPhonetic.sort(() => Math.random() - 0.5);
  variableName1 = shuffled[0];
  variableName2 = shuffled[1];

  let val1 = Math.floor(Math.random() * 6) + 5;
  let val2 = Math.floor(Math.random() * 6) + 5;

  const var1Ops = [`${variableName1} + 2`, `${variableName1} + 3`, `${variableName1} + 1`];
  const var2Ops = [`${variableName1} + ${variableName2}`, `${variableName2} + ${variableName1} + 1`, `${variableName2} + ${variableName1} - 1`];

  appleOp = var1Ops[Math.floor(Math.random() * var1Ops.length)];
  bananaOp = var2Ops[Math.floor(Math.random() * var2Ops.length)];

  // 4. Build String
   outputString += `let ${variableName1} = ${val1};\nlet ${variableName2} = ${val2};\n\n`;
  outputString += `for (let ${outerVar} = 0; ${outerVar} < ${outerLimit}; ${outerVar}++) {\n`;
  outputString += `  ${variableName1} = ${appleOp};\n`;
  outputString += `  for (let ${innerVar} = 0; ${innerVar} < ${innerLimit}; ${innerVar}++) {\n`;
  outputString += `    ${variableName2} = ${bananaOp};\n`;
  outputString += `  }\n`;
  outputString += `}\n`;
    outputString += `console.log("${variableName1} is " + ${variableName1});\n`;
  outputString += `console.log("${variableName2} is " + ${variableName2});`;

    window[variableName1] = val1;
  window[variableName2] = val2;

  return outputString;
}


// --- Answer Revealer ---
function revealAnswer() {
  if (loopType === "while") {
    let catCopy = cat;
    let dogCopy = dog;
    while (dogCopy < dogLimit) {
      catCopy = eval(catFormula.replace(/cat/g, catCopy).replace(/dog/g, dogCopy));
      dogCopy = dogCopy * dogStep;
    }
    document.getElementById("loopAnswer").innerText =
      `Answer: cat is ${catCopy}, dog is ${dogCopy}`;

  } else if (loopType === "for") {
    const var1 = variableName1;
    const var2 = variableName2;
    let a = window[var1];
    let b = window[var2];

    for (let i = 0; i < loopCount; i++) {
      a = eval(appleOp.replace(new RegExp(var1, "g"), a).replace(/i/g, i));
      b = eval(bananaOp
        .replace(new RegExp(var1, "g"), a)
        .replace(new RegExp(var2, "g"), b)
        .replace(/i/g, i)
      );
    }
    document.getElementById("loopAnswer").innerText =
      `Answer: ${var1} is ${a}, ${var2} is ${b}`;

  } else if (loopType === "foreach") {
    let s = secret;
    let m = mystery;
    for (let each of numberList) {
      if (forEachLessThan === true && each < s) {
        s = each;
      } else if (forEachLessThan === false && each > s) {
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
    document.getElementById("loopAnswer").innerText =
      `Answer: x is ${xCopy}, y is ${yCopy}`;

  } else if (loopType === "do-while") {
    let f = fish;
    let s = shark;
    do {
      f = eval(fishFormula.replace(/fish/g, f).replace(/shark/g, s));
      s = s + sharkStep;
    } while (s < sharkLimit);
    document.getElementById("loopAnswer").innerText =
      `Answer: fish is ${f}, shark is ${s}`;

  } else if (loopType === "nested-for") {
    // --- FIX STARTS HERE ---
    const var1 = variableName1;
    const var2 = variableName2;
    
    // Get current values
    let v1 = window[var1];
    let v2 = window[var2];

    // Simulate the loop structure exactly as generated
    for (let i = 0; i < outerLimit; i++) {
      
      // 1. Execute the first operation (Outer Scope)
      v1 = eval(appleOp
        .replace(new RegExp(var1, "g"), v1)
        .replace(new RegExp(var2, "g"), v2)
      );

      for (let j = 0; j < innerLimit; j++) {
        // 2. Execute the second operation (Inner Scope)
        v2 = eval(bananaOp
            .replace(new RegExp(var1, "g"), v1)
            .replace(new RegExp(var2, "g"), v2)
        );
      }
    }
    
    document.getElementById("loopAnswer").innerText = 
      `Answer: ${var1} is ${v1}, ${var2} is ${v2}`;
    // --- FIX ENDS HERE ---
  }

  document.getElementById("loopAnswer").style.display = "inline";
}

// Generate one on load
generateLoop();
</script>