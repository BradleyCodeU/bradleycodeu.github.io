---
layout: project
category: binary
title: Binary Worksheet
---

Take a screenshot and complete in Notability OR copy/paste the output into a text editor like Google Docs, Microsoft Word, or the iOS Notes app. Set the font to COURIER NEW and complete the worksheet.


Raise your hand when finished



<pre id="displayArea"></pre>

<script>
function getRandomInt(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function isPowerOfTwo(n) {
  return n !== 0 && (n & (n - 1)) === 0;
}

function generateBinaryWorksheet() {
  const b2 = "\u208d\u2082\u208e";
  const b10 = "\u208d\u2081\u2080\u208e";
  const mylist = [15, 170, 223];
  let output = "";

  output += `Take a screenshot and complete in Notability OR copy/paste
the output into a text editor like Google Docs, Microsoft
Word, or the iOS Notes app. Set the font to COURIER NEW
and complete the worksheet.\n`;

  output += ` ______  _                         
(____  \\(_)                        
 ____)  )_ ____  _____  ____ _   _ 
|  __  (| |  _ \\(____ |/ ___) | | |
| |__)  ) | | | / ___ | |   | |_| |
|______/|_|_| |_\\_____|_|    \\__  |
Binary Worksheet            (____/    Name: _______________\n\n`;

  output += `Part A: Convert the 4-bit binary number to decimal\n`;
  output += `  Hint: 8s 4s 2s 1s\n`;
  output += `  For example, 1111${b2} = 15${b10}\n`;

  for (let i = 0; i < 4; i++) {
    let temp = getRandomInt(i, 7) + getRandomInt(i, 7);

    while (mylist.includes(temp) || isPowerOfTwo(temp)) {
      temp = getRandomInt(i, 7) + getRandomInt(i, 7);
    }
    mylist.push(temp);
  }

  // Sort numerically as done in the Python script
  mylist.sort((a, b) => a - b);

  for (let i = 0; i < 4; i++) {
    const indexLabel = String(i + 1).padStart(6, " ");
    const binVal = mylist[i].toString(2).padStart(4, "0");
    const rightSide = (binVal + b2 + " = ______" + b10).padStart(21, " ");
    output += `${indexLabel}.) ${rightSide}\n`;
  }

  output += `\nPart B: Convert the 8-bit binary number to decimal\n`;
  output += `  Hint: 128s 64s 32s 16s 8s 4s 2s 1s\n`;
  output += `  For example, 10101010${b2} = 170${b10}\n`;

  for (let i = 5; i < 9; i++) {
    let temp =
      getRandomInt(i * i, i * i + 5) + getRandomInt(i * i, i * i + 5);

    while (mylist.includes(temp) || isPowerOfTwo(temp)) {
      temp =
        getRandomInt(i * i, i * i + 5) + getRandomInt(i * i, i * i + 5);
    }

    mylist.push(temp);
    mylist.push(temp + 1);
    mylist.push(temp - 1);

    const indexLabel = String(i).padStart(6, " ");
    const binVal = temp.toString(2).padStart(8, "0");
    const rightSide = (binVal + b2 + " = ______" + b10).padStart(26, " ");
    output += `${indexLabel}.) ${rightSide}\n`;
  }

  output += `\nPart C: Convert the decimal number to binary\n`;
  output += `  For example, 223${b10} = 11011111${b2}`;

  for (let i = 5; i < 11; i++) {
    let temp =
      getRandomInt(i * i, i * i + 10) + getRandomInt(i * i, i * i + 10);

    while (mylist.includes(temp) || isPowerOfTwo(temp)) {
      temp =
        getRandomInt(i * i, i * i + 10) + getRandomInt(i * i, i * i + 10);
    }
    mylist.push(temp);

    const indexLabel = String(i + 4).padStart(6, " ");
    const rightSide = (temp + b10 + " = ____________________" + b2).padStart(34, " ");
    output += `\n${indexLabel}.) ${rightSide}`;
  }

  output += "\n\nRaise your hand when finished.\n";

  document.getElementById("displayArea").textContent = output;
}

// Run script to populate display area
generateBinaryWorksheet();
</script>