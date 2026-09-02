---
layout: project
category: binary
title: Octal Worksheet
---

Take a screenshot and complete in Notability OR copy/paste the output into a text editor like Google Docs, Microsoft Word, or the iOS Notes app. Set the font to COURIER NEW and complete the worksheet.

Raise your hand when finished


<pre id="displayArea"></pre>

<script>
function getRandomInt(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function generateOctalString(i) {
  return (
    Math.floor(i / 6).toString() +
    Math.floor(i / 3).toString() +
    (i + 1).toString() +
    getRandomInt(i, 7).toString()
  );
}

function generateOctalWorksheet() {
  const b8 = "\u208d\u2088\u208e";
  const b10 = "\u208d\u2081\u2080\u208e";
  const mylist = [0, 1, 8, 64, 209, 221, 512];
  let output = "";

  output += `Take a screenshot and complete in Notability OR copy/paste
the output into a text editor like Google Docs, Microsoft
Word, or the iOS Notes app. Set the font to COURIER NEW
and complete the worksheet.\n`;

  output += `  __    ___  ____   __    __   
 /  \\  / __)(_  _) /  \\  (  )  
(  O )( (__   )(  /  O \\ / (_/\\
 \\__/  \\___) (__) \\_/\\_/ \\____/\n`;

  output += `Octal Worksheet             Name: _______________\n`;
  output += `Hint: 512s 64s 8s 1s\n\n`;

  output += `Part A: Convert the octal number to decimal\n`;
  output += `For example, 0321${b8} = 209${b10}\n`;

  for (let i = 1; i < 7; i++) {
    let temp = generateOctalString(i);

    while (mylist.includes(parseInt(temp, 10))) {
      temp = generateOctalString(i);
    }
    mylist.push(parseInt(temp, 10));

    const indexLabel = String(i).padStart(6, " ");
    const rightSide = (temp + b8 + " = ______" + b10).padStart(21, " ");
    output += `${indexLabel}.) ${rightSide}\n`;
  }

  output += `\nPart B: Convert the decimal number to octal\n`;
  output += `For example, 221${b10} = 0335${b8}`;

  for (let i = 0; i < 6; i++) {
    let temp =
      getRandomInt(i * i * 10 + 9, i * i * 10 + 19) +
      getRandomInt(i * i * 10 + 9, i * i * 10 + 19);

    while (mylist.includes(temp)) {
      temp =
        getRandomInt(i * i * 10 + 9, i * i * 10 + 19) +
        getRandomInt(i * i * 10 + 9, i * i * 10 + 19);
    }
    mylist.push(temp);

    const indexLabel = String(i + 7).padStart(6, " ");
    const rightSide = (temp + b10 + " = _______________" + b8).padStart(29, " ");
    output += `\n${indexLabel}.) ${rightSide}`;
  }

  output += "\n\nRaise your hand when finished.\n";

  document.getElementById("displayArea").textContent = output;
}

// Run script to populate the pre tag
generateOctalWorksheet();
</script>
