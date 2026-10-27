---
layout: project
category: arrays
title: JS Nested Word Count Practice 
---

Practice working with nested for loops and word count tracing

<button onclick="generateLoop()">Generate Nested Loops</button>
<pre id="output"></pre>
<table>
  <tr>
    <td>
    <div>How many times will each word appear in the console?</div>
    <button onclick="revealAnswer()">Reveal Answer</button></td>
    <td><span id="loopAnswer" style="display:none;"></span></td>
  </tr>
</table>

<script>
// --- Global State Variables ---
let generatedCode = "";

// Word and Variable Themes matching example patterns
const wordSets = [
  { words: ["apple", "banana", "coconut"], vars: ["a", "b", "c"] },
  { words: ["dog", "eel", "frog"], vars: ["d", "e", "f"] },
  { words: ["gold", "silver", "bronze"], vars: ["g", "s", "b"] },
  { words: ["mario", "peach", "bowser"], vars: ["m", "p", "b"] },
  { words: ["cat", "dog", "fish"], vars: ["c", "d", "f"] },
  { words: ["ruby", "emerald", "diamond"], vars: ["r", "e", "d"] },
  { words: ["alpha", "bravo", "charlie"], vars: ["a", "b", "c"] }
];

const loopVarPairs = [
  { outer: "outer", inner: "inner" },
  { outer: "row", inner: "col" },
  { outer: "king", inner: "queen" },
  { outer: "i", inner: "j" },
  { outer: "i", inner: "i" }
];

function generateLoop() {
  generatedCode = makeJavascriptNestedWordCountGenerator();
  document.getElementById("output").innerText = generatedCode;
  document.getElementById("loopAnswer").style.display = "none";
  document.getElementById("loopAnswer").innerText = "";
}

function makeJavascriptNestedWordCountGenerator() {
  // 1. Pick a word/variable theme and loop variable naming scheme
  const theme = wordSets[Math.floor(Math.random() * wordSets.length)];
  const pair = loopVarPairs[Math.floor(Math.random() * loopVarPairs.length)];
  
  // 2. Set limits
  const outerLimit = Math.floor(Math.random() * 4) + 2; // 2 to 5
  const innerLimit = Math.floor(Math.random() * 4) + 2; // 2 to 5

  // Map words to variables
  const wordVarMap = {};
  theme.words.forEach((w, i) => wordVarMap[w] = theme.vars[i]);

  // 3. Determine console.log distributions (before inner loop, inside inner loop, after inner loop)
  const preCount = Math.floor(Math.random() * 3);      // 0, 1, or 2
  const inCount = Math.floor(Math.random() * 3) + 1;   // 1, 2, or 3
  const postCount = Math.floor(Math.random() * 2);     // 0 or 1

  const getRandomWord = () => theme.words[Math.floor(Math.random() * theme.words.length)];

  const preLogs = Array.from({ length: preCount }, getRandomWord);
  const inLogs = Array.from({ length: inCount }, getRandomWord);
  const postLogs = Array.from({ length: postCount }, getRandomWord);

  // 4. Construct code string
  let code = `let ${theme.vars[0]} = 1, ${theme.vars[1]} = 1, ${theme.vars[2]} = 1;\n`;
  code += `for(let ${pair.outer} = 0; ${pair.outer} < ${outerLimit}; ${pair.outer}++){\n`;
  
  preLogs.forEach(w => {
    code += `  console.log("${w} " + ${wordVarMap[w]}++);\n`;
  });
  
  code += `  for(let ${pair.inner} = 0; ${pair.inner} < ${innerLimit}; ${pair.inner}++){\n`;
  
  inLogs.forEach(w => {
    code += `    console.log("${w} " + ${wordVarMap[w]}++);\n`;
  });
  
  code += `  }\n`;
  
  postLogs.forEach(w => {
    code += `  console.log("${w} " + ${wordVarMap[w]}++);\n`;
  });
  
  code += `}`;
  
  return code;
}

// --- Answer Revealer ---
function revealAnswer() {
  if (!generatedCode) return;

  const logs = [];
  const customConsole = {
    log: (msg) => logs.push(msg)
  };

  try {
    const runCode = new Function("console", generatedCode);
    runCode(customConsole);
    
    document.getElementById("loopAnswer").innerText = 
      "Output:\n" + logs.join("\n");
  } catch (err) {
    document.getElementById("loopAnswer").innerText = "Error running output: " + err.message;
  }

  document.getElementById("loopAnswer").style.display = "inline";
}

// Generate one on load
generateLoop();
</script>