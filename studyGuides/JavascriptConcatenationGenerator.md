---
layout: project
category: arrays
title: JS Concatenation Practice Generator
---

<p>Practice Generator for concatenation, parseInt(), toString(), +=, -=, ++, and --</p>

<button onclick="generateConcat()">Generate Concatenation Example</button>
<pre id="concatOutput"></pre>
<table>
  <tr>
    <td><button onclick="revealConcatAnswer()">Reveal Answer</button></td>
    <td><span id="concatAnswer" style="display:none;"></span></td>
  </tr>
</table>

<script>
let concatType = "";
let valA, valB, operator, extra;

function generateConcat() {
  let roll = Math.random() * 5;
  operator = pickRandomOperator();

  if (roll < 1) {
    // --- Two String variables, parseInt, added ---
    concatType = "parseInt";
    valA = (Math.floor(Math.random() * 90) + 10).toString();
    valB = (Math.floor(Math.random() * 90) + 10).toString();
    extra = Math.floor(Math.random() * 10) + 1;

    let code = `let a = "${valA}";\nlet b = "${valB}";\n` +
               `let result = parseInt(a) + parseInt(b);\n`;

    if (operator === "++" || operator === "--") {
      code += `result${operator};\n`;
    } else {
      code += `result ${operator} ${extra};\n`;
    }
    code += `console.log(result);`;

    document.getElementById("concatOutput").innerText = code;
    
  } else if (roll < 2) {
    // --- Two strings, concatenated, then parseInt ---
    concatType = "concatParseInt";
    valA = (Math.floor(Math.random() * 90) + 10).toString();
    valB = (Math.floor(Math.random() * 90) + 10).toString();
    extra = Math.floor(Math.random() * 10) + 1;

    let code = `let a = "${valA}";\nlet b = "${valB}";\n` +
               `let result = parseInt(a + b);\n`;

    if (operator === "++" || operator === "--") {
      code += `result${operator};\n`;
    } else {
      code += `result ${operator} ${extra};\n`;
    }

    code += `console.log(result);`;
    
    document.getElementById("concatOutput").innerText = code;

  } else if (roll < 3) {
    // --- Two numbers, toString, concatenated ---
    concatType = "toString";
    valA = Math.floor(Math.random() * 50) + 1;
    valB = Math.floor(Math.random() * 50) + 1;
    extra = Math.floor(Math.random() * 10) + 1;
    let code = `let a = ${valA};\nlet b = ${valB};\n`;
    if (operator === "++" || operator === "--") {
      code += `a${operator};\n`;
    } else {
      code += `b ${operator} "${extra}";\n`; // concatenates string
    }

    code += `let result = a.toString() + b.toString();\n`;

    
    code += `console.log(result);`;

    document.getElementById("concatOutput").innerText = code;

  } else if (roll < 4) {
    // --- Two numbers, added, then toString ---
    concatType = "numbersToString";
    valA = Math.floor(Math.random() * 50) + 1;
    valB = Math.floor(Math.random() * 50) + 1;
    extra = Math.floor(Math.random() * 10) + 1;

    let code = `let a = ${valA};\nlet b = ${valB};\n` +
               `let result = a + b;\n`;

    if (operator === "++" || operator === "--") {
      code += `result${operator};\n`;
    } else {
      code += `result ${operator} ${extra};\n`;
    }

    code += `result = result.toString();\n`;
    code += `console.log(result);`;

    document.getElementById("concatOutput").innerText = code;
}
  else {
    // --- String and number concatenated ---
    concatType = "mixed";
    let words = ["cat", "dog", "sun", "car", "hat"];
    valA = words[Math.floor(Math.random() * words.length)];
    valB = Math.floor(Math.random() * 50) + 1;
    extra = Math.floor(Math.random() * 10) + 1;

    let code = `let a = "${valA}";\nlet b = ${valB};\n` 
    if (operator === "++" || operator === "--") {
      code += `b${operator};\n`;
    } else if (operator === "+=" ) {
      code += `b ${operator} "${extra}";\n`;
    }else {
      code += `b ${operator} ${extra};\n`;
    }
    code +=  `let result = a + b;\n`;

    
    code += `console.log(result);`;

    document.getElementById("concatOutput").innerText = code;
  }

  document.getElementById("concatAnswer").style.display = "none";
  document.getElementById("concatAnswer").innerText = "";
}

function revealConcatAnswer() {
  let result;
  let a, b;

  if (concatType === "parseInt") {
    a = parseInt(valA);
    b = parseInt(valB);
    result = a + b;

    if (operator === "++") {
      result++;
    } else if (operator === "--") {
      result--;
    } else if (operator === "+=") {
      result += extra;
    } else if (operator === "-=") {
      result -= extra;
    }

  } else if (concatType === "toString") {
    a = valA;
    b = valB;

    if (operator === "++") {
      a++;
    } else if (operator === "--") {
      a--;
    } else if (operator === "+=") {
      b += extra.toString();
    } else if (operator === "-=") {
      b -= extra; // coercion if b is string
    }

    result = a.toString() + b.toString();

  } else if (concatType === "mixed") {
    a = valA;
    b = valB;

    if (operator === "++") {
      b++;
    } else if (operator === "--") {
      b--;
    } else if (operator === "+=") {
      b += extra.toString();
    } else if (operator === "-=") {
      b -= extra;
    }

    result = a + b;
  }   else if (concatType === "concatParseInt") {
    a = valA;
    b = valB;
    result = parseInt(a + b);

    if (operator === "++") {
      result++;
    } else if (operator === "--") {
      result--;
    } else if (operator === "+=") {
      result += extra;
    } else if (operator === "-=") {
      result -= extra;
    }
  }


  document.getElementById("concatAnswer").innerText = "Answer: " + result;
  document.getElementById("concatAnswer").style.display = "inline";
}


// --- Helpers ---
function pickRandomOperator() {
  let ops = ["+=", "-=", "++", "--"];
  return ops[Math.floor(Math.random() * ops.length)];
}

function evalOperator(val, op, extra) {
  if (op === "++") return ++val;
  if (op === "--") return --val;
  if (op === "+=") return val += (typeof val === "string" ? extra.toString() : extra);
  if (op === "-=") return val -= (typeof val === "string" ? parseInt(extra) : extra);
}

// Generate one on load
generateConcat();
</script>
