---
layout: project
category: binary
title: Counting Coins Worksheet
---

Take a screenshot and complete in Notability OR copy/paste the output into a text editor like Google Docs, Microsoft Word, or the iOS Notes app. Set the font to COURIER NEW and complete the worksheet.

Turn in a PDF when finished

<pre id="displayArea"></pre>

<script>
function getRandomInt(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function generateRandomCents(i) {
  return (
    getRandomInt(1, 4 + i * 18) +
    getRandomInt(i * 5, 4 + i * 18) +
    getRandomInt(i * 5, 4 + i * 18)
  );
}

function generateWorksheet() {
  const mylist = [199];
  const hr = "+-------+--------+---------+--------+--------+--------+";
  let output = "";

  output += `Take a screenshot and complete in Notability OR copy/paste the
output into a text editor like Google Docs or Microsoft Word.
Set the font to COURIER NEW and then complete the worksheet.\n\n`;

  output += ` ██████╗ ██████╗ ██╗███╗   ██╗███████╗
██╔════╝██╔═══██╗██║████╗  ██║██╔════╝
██║     ██║   ██║██║██╔██╗ ██║███████╗
██║     ██║   ██║██║██║╚██╗██║╚════██║
╚██████╗╚██████╔╝██║██║ ╚████║███████║
 ╚═════╝ ╚═════╝ ╚═╝╚═╝  ╚═══╝╚══════╝\n`;

  output += `Counting Coins Worksheet\n`;
  output += `                                 Name: _______________\n`;

  output += `Convert each amount of cents to coins.
Notice that each column has a maximum number.
In the example, you CANNOT say 199 pennies.
You MUST make 199 cents using 1 silver dollar,
3 quarters, 2 dimes, 0 nickels, and 4 pennies.\n`;

  output += `
+=======+========+=========+========+========+========+
|Random |Dollars |Quarters |Dimes   |Nickels |Pennies |
|Number |(max 4) |(max 3)  |(max 2) |(max 1) |(max 4) |
+=======+========+=========+========+========+========+\n`;

  const exampleVal = ("199" + "\u00A2").padStart(6, " ");
  output += `|${exampleVal} | 1      | 3       | 2      | 0      | 4      |\n`;
  output += hr + "\n";

  for (let i = 0; i < 10; i++) {
    let temp = generateRandomCents(i);
    if (temp % 2 === 0) temp -= 1;
    if (temp % 5 === 0) temp -= 2;

    while (mylist.includes(temp)) {
      temp = generateRandomCents(i);
      if (temp % 2 === 0) temp -= 1;
      if (temp % 5 === 0) temp -= 2;
    }

    mylist.push(temp);

    const formattedVal = (temp + "\u00A2").padStart(6, " ");
    output += `|${formattedVal} |        |         |        |        |        |\n`;
    output += hr + "\n";
  }

  document.getElementById("displayArea").textContent = output;
}

// Run the script to populate the display area
generateWorksheet();
</script>
