---
layout: project
category: arrays
title: JS Loop Practice Generator
---

<button onclick="generateWhileLoop()">Generate While Loop</button>
<pre id="output"></pre>
<table>
  <tr>
    <td><button onclick="revealWhileAnswer()">Reveal Answer</button></td>
    <td><span id="whileAnswer" style="display:none;"></span></td>
  </tr>
</table>

<script>
let cat, dog, dogLimit, dogStep, catFormula;

function generateWhileLoop() {
  // Randomize initial values
  cat = Math.floor(Math.random() * 5);
  dog = Math.floor(Math.random() * 3) + 1;
  dogLimit = Math.floor(Math.random() * 50) + 30; // upper limit
  dogStep = Math.floor(Math.random() * 4) + 2;     // multiplier
  let catOps = ["cat + dog - 1", "cat + 2 * dog", "cat + dog * 2", "cat + dog + 1"];
  catFormula = catOps[Math.floor(Math.random() * catOps.length)];

  // Create output string
  let code = `let cat = ${cat};\nlet dog = ${dog};\n\nwhile (dog < ${dogLimit}) {\n  cat = ${catFormula};\n  dog = dog * ${dogStep};\n}\nconsole.log("cat is " + cat);\nconsole.log("dog is " + dog);`;

  document.getElementById("output").innerText = code;
  document.getElementById("whileAnswer").style.display = "none";
  document.getElementById("whileAnswer").innerText = "";
}

function revealWhileAnswer() {
  let catCopy = cat;
  let dogCopy = dog;

  while (dogCopy < dogLimit) {
    catCopy = eval(catFormula.replace(/cat/g, catCopy).replace(/dog/g, dogCopy));
    dogCopy = dogCopy * dogStep;
  }

  document.getElementById("whileAnswer").innerText = `Answer: cat is ${catCopy}, dog is ${dogCopy}`;
  document.getElementById("whileAnswer").style.display = "inline";
}

// Generate one on load
generateWhileLoop();
</script>
