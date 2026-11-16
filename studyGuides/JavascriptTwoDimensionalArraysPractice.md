---
layout: project
category: arrays
title: JS Two Dimensional Arrays Practice
---

<p>Practice constructing, accessing, modifying, iterating through, and debugging JavaScript two-dimensional arrays.</p>

<label for="topicSelect"><strong>Topic:</strong></label>
<select id="topicSelect" onchange="generatePractice()">
    <option value="all">All Topics (Random Mix)</option>
    <option value="constructor">2D Array Constructor</option>
    <option value="literal">2D Array Literal</option>
    <option value="access">Access Data</option>
    <option value="modify">Modify Data</option>
    <option value="smallest">Find the Smallest</option>
    <option value="largest">Find the Largest</option>
    <option value="sumRow">Sum of 1 Row</option>
    <option value="sumCol">Sum of 1 Column</option>
    <option value="bug">Find the Bug</option>
</select>
<button onclick="generatePractice()">Generate Array Practice</button>

<p id="question"></p>
<pre id="output"></pre>
<table>
    <tr>
        <td><button onclick="revealAnswer()">Reveal Answer</button></td>
        <td><span id="answer" style="display:none;"></span></td>
    </tr>
</table>

<script>
let currentAnswer = "";

generatePractice();

function generatePractice() {
    const selectedTopic = document.getElementById("topicSelect").value;
    const allTopics = [
        "constructor",
        "literal",
        "access",
        "modify",
        "smallest",
        "largest",
        "sumRow",
        "sumCol",
        "bug"
    ];
    const topic = selectedTopic === "all" ? choice(allTopics) : selectedTopic;

    let question = "";
    let code = "";

    if (topic === "constructor") {
        if (Math.random() < 0.5) {
            const rows = getRandomNumber(5, 2);
            const val1 = getRandomNumber(9, 1);
            const val2 = getRandomNumber(9, 1);
            question = "What will this code output?";
            code =
                `const rows = ${rows};\n` +
                `const cols = 2;\n` +
                `let arr = new Array(rows);\n` +
                `for (let i = 0; i < rows; i++) {\n` +
                `  arr[i] = [${val1}, ${val2}];\n` +
                `}\n` +
                `console.log(JSON.stringify(arr));`;

            const expected = [];
            for (let i = 0; i < rows; i++) {
                expected.push([val1, val2]);
            }
            currentAnswer = JSON.stringify(expected);
        } else {
            const m = getRandomNumber(6, 2);
            let n = getRandomNumber(6, 2);
            while (n === m) {
                n = getRandomNumber(6, 2);
            }
            question = "How many rows and columns will the 2D array `arr` have after this code runs?";
            code =
                `const m = ${m};\n` +
                `const n = ${n};\n` +
                `let arr = new Array(m);\n` +
                `for (let i = 0; i < m; i++) {\n` +
                `  arr[i] = new Array(n);\n` +
                `}`;
            currentAnswer = `${m} rows and ${n} columns (arr.length is ${m}, arr[0].length is ${n})`;
        }

    } else if (topic === "literal") {
        if (Math.random() < 0.5) {
            const rows = getRandomNumber(5, 2);
            let cols = getRandomNumber(5, 2);
            while (cols === rows) {
                cols = getRandomNumber(5, 2);
            }
            const arr = create2DArray(rows, cols, 10, 99);
            question = "How many rows and how many columns does this 2D array have?";
            code = format2DArray("myArray", arr);
            currentAnswer = `${rows} rows and ${cols} columns`;
        } else {
            const arr = create2DArray(2, 3, 1, 9);
            question = "Write a single JavaScript statement using an array literal to store this 2x3 grid in `const grid`:";
            code =
                `Row 0:  ${arr[0][0]}   ${arr[0][1]}   ${arr[0][2]}\n` +
                `Row 1:  ${arr[1][0]}   ${arr[1][1]}   ${arr[1][2]}`;
            currentAnswer = `const grid = ${JSON.stringify(arr)};`;
        }

    } else if (topic === "access") {
        const arr = createUnique2DArray(3, 3, 11, 98);
        const r = getRandomNumber(3);
        // ~15% chance of testing an out-of-bounds column index -> undefined
        const isUndefined = Math.random() < 0.15;
        const c = isUndefined ? 3 : getRandomNumber(3);

        question = "What will this code output?";
        code =
            format2DArray("myArray", arr) + "\n" +
            `let element = myArray[${r}][${c}];\n` +
            `console.log(element);`;

        currentAnswer = isUndefined ? "undefined" : arr[r][c];

    } else if (topic === "modify") {
        const base = getRandomNumber(4, 1) * 10;
        const arr = [];
        let val = base;
        for (let r = 0; r < 3; r++) {
            const row = [];
            for (let c = 0; c < 3; c++) {
                row.push(val);
                val += 10;
            }
            arr.push(row);
        }
        const r = getRandomNumber(3);
        const c = getRandomNumber(3);
        const newVal = choice([99, 100, 250, 500]);

        question = "What will this code output?";
        code =
            format2DArray("mat", arr) + "\n" +
            `mat[${r}][${c}] = ${newVal};\n` +
            `console.log(JSON.stringify(mat[${r}]));`;

        const updatedRow = [...arr[r]];
        updatedRow[c] = newVal;
        currentAnswer = JSON.stringify(updatedRow);

    } else if (topic === "smallest") {
        const arr = createUnique2DArray(3, 3, 11, 98);
        let smallest = arr[0][0];
        for (let r = 0; r < arr.length; r++) {
            for (let c = 0; c < arr[r].length; c++) {
                if (arr[r][c] < smallest) {
                    smallest = arr[r][c];
                }
            }
        }

        question = "What will this code output?";
        code =
            format2DArray("myArray", arr) + "\n" +
            `const numberOfColumns = 3;\n` +
            `let smallest = myArray[0][0];\n\n` +
            `for (let row = 0; row < myArray.length; row++) {\n` +
            `  for (let col = 0; col < numberOfColumns; col++) {\n` +
            `    if (myArray[row][col] < smallest) {\n` +
            `      smallest = myArray[row][col];\n` +
            `    }\n` +
            `  }\n` +
            `}\n` +
            `console.log(smallest);`;

        currentAnswer = smallest;

    } else if (topic === "largest") {
        const arr = createUnique2DArray(3, 3, 11, 98);
        let largest = arr[0][0];
        for (let r = 0; r < arr.length; r++) {
            for (let c = 0; c < arr[r].length; c++) {
                if (arr[r][c] > largest) {
                    largest = arr[r][c];
                }
            }
        }

        question = "What will this code output?";
        code =
            format2DArray("myArray", arr) + "\n" +
            `const numberOfColumns = 3;\n` +
            `let largest = myArray[0][0];\n\n` +
            `for (let row = 0; row < myArray.length; row++) {\n` +
            `  for (let col = 0; col < numberOfColumns; col++) {\n` +
            `    if (myArray[row][col] > largest) {\n` +
            `      largest = myArray[row][col];\n` +
            `    }\n` +
            `  }\n` +
            `}\n` +
            `console.log(largest);`;

        currentAnswer = largest;

    } else if (topic === "sumRow") {
        const arr = create2DArray(3, 3, 1, 10);
        const rowToSum = getRandomNumber(3);
        let total = 0;
        for (let col = 0; col < arr[rowToSum].length; col++) {
            total += arr[rowToSum][col];
        }

        question = "What will this code output?";
        code =
            format2DArray("myArray", arr) + "\n" +
            `const rowToSum = ${rowToSum};\n` +
            `let total = 0;\n\n` +
            `for (let col = 0; col < myArray[rowToSum].length; col++) {\n` +
            `  total += myArray[rowToSum][col];\n` +
            `}\n` +
            `console.log(total);`;

        currentAnswer = total;

    } else if (topic === "sumCol") {
        const arr = create2DArray(3, 3, 1, 10);
        const columnToSum = getRandomNumber(3);
        let total = 0;
        for (let row = 0; row < arr.length; row++) {
            total += arr[row][columnToSum];
        }

        question = "What will this code output?";
        code =
            format2DArray("myArray", arr) + "\n" +
            `const columnToSum = ${columnToSum};\n` +
            `let total = 0;\n\n` +
            `for (let row = 0; row < myArray.length; row++) {\n` +
            `  total += myArray[row][columnToSum];\n` +
            `}\n` +
            `console.log(total);`;

        currentAnswer = total;

    } else if (topic === "bug") {
        const bugScenarios = [
            {
                lines: [
                    "const myArray = [",
                    "  [21, 52, 83],",
                    "  [94, 35, 16],",
                    "  [67, 48, 79]",
                    "];",
                    "const columnToSum = 1;",
                    "let total = 0;",
                    "for (let row = 0; row < myArray.length; row++) {",
                    "  total = myArray[row][columnToSum];",
                    "}",
                    "console.log(total);"
                ],
                answer: "Line 9 — It uses '=' instead of '+=', so total gets overwritten on each iteration instead of adding up the column."
            },
            {
                lines: [
                    "const myArray = [",
                    "  [21, 52, 83],",
                    "  [94, 35, 16],",
                    "  [67, 48, 79]",
                    "];",
                    "const columnToSum = 3;",
                    "let total = 0;",
                    "for (let row = 0; row < myArray.length; row++) {",
                    "  total += myArray[row][columnToSum];",
                    "}",
                    "console.log(total);"
                ],
                answer: "Line 6 — columnToSum is 3, which is out of bounds (valid column indices for a 3-column array are 0, 1, and 2)."
            },
            {
                lines: [
                    "const myArray = [",
                    "  [14, 28, 35],",
                    "  [42, 19, 63],",
                    "  [51, 74, 22]",
                    "];",
                    "let largest = myArray[0][0];",
                    "for (let row = 0; row <= myArray.length; row++) {",
                    "  for (let col = 0; col < myArray[row].length; col++) {",
                    "    if (myArray[row][col] > largest) {",
                    "      largest = myArray[row][col];",
                    "    }",
                    "  }",
                    "}",
                    "console.log(largest);"
                ],
                answer: "Line 7 — 'row <= myArray.length' goes out of bounds on the final iteration; it should be 'row < myArray.length'."
            },
            {
                lines: [
                    "const myArray = [",
                    "  [14, 28, 35],",
                    "  [42, 19, 63],",
                    "  [51, 74, 22]",
                    "];",
                    "let largest = myArray[0][0];",
                    "for (let row = 0; row < myArray.length; row++) {",
                    "  for (let col = 0; col < myArray[row].length; col++) {",
                    "    if (myArray[row][col] < largest) {",
                    "      largest = myArray[row][col];",
                    "    }",
                    "  }",
                    "}",
                    "console.log(largest);"
                ],
                answer: "Line 9 — It uses '<' instead of '>', so it finds the smallest value instead of the largest."
            },
            {
                lines: [
                    "const myArray = [",
                    "  [5, 8, 2, 9],",
                    "  [4, 1, 7, 3]",
                    "];",
                    "const rowToSum = 1;",
                    "let total = 0;",
                    "for (let col = 0; col < myArray[rowToSum].length; col++) {",
                    "  total += myArray[col][rowToSum];",
                    "}",
                    "console.log(total);"
                ],
                answer: "Line 8 — The indices are swapped ([col][rowToSum] instead of [rowToSum][col]), causing an out-of-bounds error."
            },
            {
                lines: [
                    "const rows = 3;",
                    "const cols = 4;",
                    "let arr = new Array(rows);",
                    "arr[1][2] = 99;",
                    "console.log(arr[1][2]);"
                ],
                answer: "Line 4 — Each row in 'arr' must first be initialized as an array (e.g., arr[i] = new Array(cols)) before assigning arr[1][2]."
            }
        ];

        const chosen = choice(bugScenarios);
        question = "Find the line of code that contains a bug:";
        code = chosen.lines.map((line, idx) => `${idx + 1}: ${line}`).join("\n");
        currentAnswer = chosen.answer;
    }

    document.getElementById("question").innerText = question;
    document.getElementById("output").innerText = code;
    document.getElementById("answer").innerText = "";
    document.getElementById("answer").style.display = "none";
}

function revealAnswer() {
    const answerElement = document.getElementById("answer");
    answerElement.innerText = "Answer: " + currentAnswer;
    answerElement.style.display = "inline";
}

function create2DArray(rows, cols, min, max) {
    const arr = [];
    for (let r = 0; r < rows; r++) {
        const row = [];
        for (let c = 0; c < cols; c++) {
            row.push(getRandomNumber(max + 1, min));
        }
        arr.push(row);
    }
    return arr;
}

function createUnique2DArray(rows, cols, min, max) {
    const used = new Set();
    const arr = [];
    for (let r = 0; r < rows; r++) {
        const row = [];
        for (let c = 0; c < cols; c++) {
            let val = getRandomNumber(max + 1, min);
            while (used.has(val)) {
                val = getRandomNumber(max + 1, min);
            }
            used.add(val);
            row.push(val);
        }
        arr.push(row);
    }
    return arr;
}

function format2DArray(varName, arr) {
    const formattedRows = arr.map(row => "  [" + row.join(", ") + "]").join(",\n");
    return `const ${varName} = [\n${formattedRows}\n];`;
}

function getRandomNumber(max, min = 0) {
    return Math.floor(Math.random() * (max - min)) + min;
}

function choice(arr) {
    return arr[getRandomNumber(arr.length)];
}
</script>
<br>
<hr>
<br>