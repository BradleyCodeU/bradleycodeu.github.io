---
layout: project
category: binary
title: Hex Worksheet
---

Take a screenshot and complete in Notability OR copy/paste the output into a text editor like Google Docs, Microsoft Word, or the iOS Notes app. Set the font to COURIER NEW and complete the worksheet.

Raise your hand when finished



<pre id="displayArea"></pre>

<script>
function getRandomInt(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function generateHexWorksheet() {
  const b10 = "\u208d\u2081\u2080\u208e";
  const b16 = "\u208d\u2081\u2086\u208e";
  const mylist = ["00FC", 252, 225, "00E1", 0, 1, 16, 256, 4096];
  let output = "";

  output += `Take a screenshot and complete in Notability OR copy/paste
the output into a text editor like Google Docs, Microsoft
Word, or the iOS Notes app. Set the font to COURIER NEW
and complete the worksheet_           _                 _ 
  /\\  /\\_____  ____ _  __| | ___  ___(_)_ __ ___   __ _| |
 / /_/ / _ \\ \\/ / _\` |/ _\` |/ _ \\/ __| | '_ \` _ \\ / _\` | |
/ __  /  __/>  < (_| | (_| |  __/ (__| | | | | | | (_| | |
\\/ /_/ \\___/_/\\_\\__,_|\\__,_|\\___|\\___|_|_| |_| |_|\\__,_|_|
Hexadecimal Worksheet                   Name: ______________________________
Hex is a base-16 system that uses 0123456789ABCDEF
A=10 B=11 C=12 D=13 E=14 F=15
Columns are: 4096s 256s 16s 1s\n\n`;

  output += "Part A: Convert the base-16 number to decimal\n";
  output += `  For example, 00FC${b16} = 252${b10}\n`;

  for (let i = 0; i < 6; i++) {
    let temp =
      getRandomInt(i * i * 10, i * i * 10 + 10) +
      getRandomInt(i * i * 10, i * i * 10 + 10) +
      17;

    while (mylist.includes(temp)) {
      temp =
        getRandomInt(i * i * 10, i * i * 10 + 10) +
        getRandomInt(i * i * 10, i * i * 10 + 10) +
        17;
    }
    mylist.push(temp);

    const indexLabel = String(i + 1).padStart(6, " ");
    const hexVal = temp.toString(16).padStart(4, "0").toUpperCase();
    const rightSide = (hexVal + b16 + " = ______" + b10).padStart(22, " ");
    output += `${indexLabel}.) ${rightSide}\n`;
  }

  output += "\nPart B: Convert the decimal number to base-16\n";
  output += `  For example, 225${b10} = 00E1${b16}`;

  for (let i = 2; i < 8; i++) {
    let temp =
      getRandomInt(i * i * 3, i * i * 3 + 10) +
      getRandomInt(i * i * 3, i * i * 3 + 10) +
      18;

    while (mylist.includes(temp)) {
      temp =
        getRandomInt(i * i * 3, i * i * 3 + 10) +
        getRandomInt(i * i * 3, i * i * 3 + 10) +
        18;
    }
    mylist.push(temp);

    const indexLabel = String(i + 5).padStart(6, " ");
    const rightSide = (temp + b10 + " = __________" + b16).padStart(25, " ");
    output += `\n${indexLabel}.) ${rightSide}`;
  }

  output += "\n\nRaise your hand when finished.\n";

  document.getElementById("displayArea").textContent = output;
}

// Run script to populate the pre tag
generateHexWorksheet();
</script>