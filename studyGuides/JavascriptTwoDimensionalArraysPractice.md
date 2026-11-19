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
        if (Math.random() < 1/6){
            const rows = getRandomNumber(3, 1);
            const val1 = getRandomNumber(9, 1);
            const val2 = getRandomNumber(9, 1);
            const val3 = getRandomNumber(9, 1);
            question = "What will this code output?";
            code =
                `const k = ${val2 - 1};\n` +
                `const j = ${rows};\n` +
                `let arr = new Array(j);\n` +
                `for (let i = 0; i < j; i++) {\n` +
                `  arr[i] = [${val1}, ${val2}, ${val3}];\n` +
                `}\n` +
                `console.log(JSON.stringify(arr));`;

            const expected = [];
            for (let i = 0; i < rows; i++) {
                expected.push([val1, val2, val3]);
            }
            currentAnswer = JSON.stringify(expected);
        }
        else if (Math.random() < 1/5){
            const m = getRandomNumber(9, 2);
            let n = getRandomNumber(9, 2);
            while (n === m) {
                n = getRandomNumber(9, 2);
            }
            question = "How many rows and columns will the 2D array `arr` have after this code runs?";
            code =
                `const a = ${n};\n` +
                `const b = ${m + 1};\n` +
                `const c = ${m};\n` +
                `let arr = new Array(c);\n` +
                `for (let i = 0; i < c; i++) {\n` +
                `  arr[i] = new Array(a);\n` +
                `}`;
            currentAnswer = `${m} rows and ${n} columns (arr.length is ${m}, arr[0].length is ${n})`;
        }
        else if (Math.random() < 1/4){
            const m = getRandomNumber(9, 2);
            let n = getRandomNumber(9, 2);
            while (n === m) {
                n = getRandomNumber(9, 2);
            }
            question = "How many rows and columns will the 2D array `arr` have after this code runs?";
            code =
                `const a = ${m + 1};\n` +
                `const b = ${m};\n` +
                `const c = ${n};\n` +
                `let arr = new Array(b);\n` +
                `for (let i = 0; i < b; i++) {\n` +
                `  arr[i] = new Array(c);\n` +
                `}`;
            currentAnswer = `${m} rows and ${n} columns (arr.length is ${m}, arr[0].length is ${n})`;
        }
        else if (Math.random() < 1/3) {
            const rows = getRandomNumber(4, 2);
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
        } else if (Math.random() < 1/2) {
            const rows = getRandomNumber(3, 1);
            const val1 = getRandomNumber(9, 1);
            const val2 = getRandomNumber(9, 1);
            const val3 = getRandomNumber(9, 1);
            question = "What will this code output?";
            code =
                `const k = ${rows};\n` +
                `const j = ${val2 - 1};\n` +
                `let arr = new Array(k);\n` +
                `for (let i = 0; i < k; i++) {\n` +
                `  arr[i] = [${val1}, ${val2}, ${val3}];\n` +
                `}\n` +
                `console.log(JSON.stringify(arr));`;

            const expected = [];
            for (let i = 0; i < rows; i++) {
                expected.push([val1, val2, val3]);
            }
            currentAnswer = JSON.stringify(expected);
        } else {
            const m = getRandomNumber(9, 2);
            let n = getRandomNumber(9, 2);
            while (n === m) {
                n = getRandomNumber(9, 2);
            }
            question = "How many rows and columns will the 2D array `arr` have after this code runs?";
            code =
                `const a = ${n};\n` +
                `const b = ${m};\n` +
                `const c = ${n + 1};\n` +
                `let arr = new Array(b);\n` +
                `for (let i = 0; i < b; i++) {\n` +
                `  arr[i] = new Array(a);\n` +
                `}`;
            currentAnswer = `${m} rows and ${n} columns (arr.length is ${m}, arr[0].length is ${n})`;
        }

    } else if (topic === "literal") {
        if (Math.random() < 1/3) {
            const rows = getRandomNumber(7, 2);
            let cols = getRandomNumber(7, 2);
            while (cols === rows) {
                cols = getRandomNumber(7, 2);
            }
            const arr = create2DArray(rows, cols, 10, 99);
            question = "How many rows and how many columns does this 2D array have?";
            code = JSON.stringify(arr);
            currentAnswer = `${rows} rows and ${cols} columns`;
        } else if (Math.random() < 1/2) {
            const rows = getRandomNumber(7, 2);
            let cols = getRandomNumber(7, 2);
            while (cols === rows) {
                cols = getRandomNumber(7, 2);
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
        const arr = createUnique2DArray(getRandomNumber(7, 2), getRandomNumber(7, 2), 11, 98);
        const r = getRandomNumber(arr.length);
        // ~15% chance of testing an out-of-bounds column index -> undefined
        const isUndefined = Math.random() < 0.15;
        const c = isUndefined ? 3 : getRandomNumber(3);

        question = "What will this code output?";
        if (Math.random() < 1/2) {
        code =
            "const myArray = " + JSON.stringify(arr) + ";\n" +
            `let element = myArray[${r}][${c}];\n` +
            `console.log(element);`;
        } else {
            code =
            format2DArray("myArray", arr) + "\n" +
            `let element = myArray[${r}][${c}];\n` +
            `console.log(element);`;
        }

        currentAnswer = isUndefined ? "undefined" : arr[r][c];

    } else if (topic === "modify") {
        const rows = getRandomNumber(7, 2);
        const cols = getRandomNumber(7, 2);
        const base = getRandomNumber(4, 1) * 10;
        const arr = [];
        let val = base;
        for (let r = 0; r < rows; r++) {
            const row = [];
            for (let c = 0; c < cols; c++) {
                row.push(val);
                val += 10;
            }
            arr.push(row);
        }
        const r = getRandomNumber(rows);
        const c = getRandomNumber(cols);
        const newVal = choice([67, 123, 234, 456]);

        question = "What will this code output?";
        if (Math.random() < 1/2) {
            code =
                "const mat = " + JSON.stringify(arr) + ";\n" +
                `mat[${r}][${c}] = ${newVal};\n` +
                `console.log(JSON.stringify(mat[${r}]));`;
        } else {
            code =
                format2DArray("mat", arr) + "\n" +
                `mat[${r}][${c}] = ${newVal};\n` +
                `console.log(JSON.stringify(mat[${r}]));`;
        }

        const updatedRow = [...arr[r]];
        updatedRow[c] = newVal;
        currentAnswer = JSON.stringify(updatedRow);

    } else if (topic === "smallest") {
        if (Math.random() < 1/5) {
            const arr = createUnique2DArray(3, 3, 11, 98);
            let foo = getRandomNumber(109,101);
            for (let r = 0; r < arr.length; r++) {
                for (let c = 0; c < arr[r].length; c++) {
                    if (arr[r][c] < foo) {
                        foo = arr[r][c];
                    }
                }
            }

            question = "What will this code output?";
            code =
                format2DArray("myArray", arr) + "\n" +
                `const num = 3;\n` +
                `let foo = ${foo}$;\n\n` +
                `for (let row = 0; row < myArray.length; row++) {\n` +
                `  for (let col = 0; col < num; col++) {\n` +
                `    if (myArray[row][col] < foo) {\n` +
                `      foo = myArray[row][col];\n` +
                `    }\n` +
                `  }\n` +
                `}\n` +
                `console.log(foo);`;

            currentAnswer = foo;
        } else if (Math.random() < 1/4) {
            const arr = createUnique2DArray(3, 3, 11, 98);
            let foo = getRandomNumber(9,1);
            for (let r = 0; r < arr.length; r++) {
                for (let c = 0; c < arr[r].length; c++) {
                    if (arr[r][c] < foo) {
                        foo = arr[r][c];
                    }
                }
            }

            question = "What will this code output?";
            code =
                format2DArray("myArray", arr) + "\n" +
                `const num = 3;\n` +
                `let foo = ${foo}$;\n\n` +
                `for (let row = 0; row < myArray.length; row++) {\n` +
                `  for (let col = 0; col < num; col++) {\n` +
                `    if (myArray[row][col] < foo) {\n` +
                `      foo = myArray[row][col];\n` +
                `    }\n` +
                `  }\n` +
                `}\n` +
                `console.log(foo);`;

            currentAnswer = foo;
        } else if (Math.random() < 1/3) {
            const arr = createUnique2DArray(3, 3, 11, 98);
            let foo = arr[0][0];
            for (let r = 0; r < arr.length; r++) {
                for (let c = 0; c < arr[r].length; c++) {
                    if (arr[r][c] < foo) {
                        foo = arr[r][c];
                    }
                }
            }

            question = "What will this code output?";
            code =
                format2DArray("myArray", arr) + "\n" +
                `const num = 3;\n` +
                `let foo = myArray[0][0];\n\n` +
                `for (let row = 0; row < myArray.length; row++) {\n` +
                `  for (let col = 0; col < num; col++) {\n` +
                `    if (myArray[row][col] < foo) {\n` +
                `      foo = myArray[row][col];\n` +
                `    }\n` +
                `  }\n` +
                `}\n` +
                `console.log(foo);`;

            currentAnswer = foo;
        } else if (Math.random() < 1/2) {
            // smallest in a single row
            const rows = getRandomNumber(7, 3);
            const cols = getRandomNumber(5, 3);
            const num = getRandomNumber(rows);
            const arr = createUnique2DArray(rows, cols, 11, 98);
            let foo = arr[num][0];
            
                for (let c = 0; c < arr[num].length; c++) {
                    if (arr[num][c] < foo) {
                        foo = arr[num][c];
                    }
                }
            
            question = "What will this code output?";
            code =
                format2DArray("myArray", arr) + "\n" +
                `const num = ${num};\n` +
                `let foo = myArray[num][0];\n\n` +
                `for (let col = 0; col < myArray[num].length; col++) {\n` +
                `  if (myArray[num][col] < foo) {\n` +
                `    foo = myArray[num][col];\n` +
                `  }\n` +
                `}\n` +
                `console.log(foo);`;

            currentAnswer = foo;
        } else {
             // smallest in a single col
            const rows = getRandomNumber(7, 3);
            const cols = getRandomNumber(5, 3);
            const num = getRandomNumber(cols);
            const arr = createUnique2DArray(rows, cols, 11, 98);
            let foo = arr[0][num];
            
                for (let r = 0; r < arr.length; r++) {
                    if (arr[r][num] < foo) {
                        foo = arr[r][num];
                    }
                }
            
            question = "What will this code output?";
            code =
                format2DArray("myArray", arr) + "\n" +
                `const num = ${num};\n` +
                `let foo = myArray[0][num];\n\n` +
                `for (let row = 0; row < myArray.length; row++) {\n` +
                `  if (myArray[row][num] < foo) {\n` +
                `    foo = myArray[row][num];\n` +
                `  }\n` +
                `}\n` +
                `console.log(foo);`;

            currentAnswer = foo;
        }

    } else if (topic === "largest") {
        if (Math.random() < 1/5) {
            const arr = createUnique2DArray(3, 3, 11, 98);
            let foo = getRandomNumber(109,101);
            for (let r = 0; r < arr.length; r++) {
                for (let c = 0; c < arr[r].length; c++) {
                    if (arr[r][c] < foo) {
                        foo = arr[r][c];
                    }
                }
            }

            question = "What will this code output?";
            code =
                format2DArray("myArray", arr) + "\n" +
                `const num = 3;\n` +
                `let foo = ${foo}$;\n\n` +
                `for (let row = 0; row < myArray.length; row++) {\n` +
                `  for (let col = 0; col < num; col++) {\n` +
                `    if (myArray[row][col] < foo) {\n` +
                `      foo = myArray[row][col];\n` +
                `    }\n` +
                `  }\n` +
                `}\n` +
                `console.log(foo);`;

            currentAnswer = foo;
        } else if (Math.random() < 1/4) {
            const arr = createUnique2DArray(3, 3, 11, 98);
            let foo = getRandomNumber(9,1);
            for (let r = 0; r < arr.length; r++) {
                for (let c = 0; c < arr[r].length; c++) {
                    if (arr[r][c] < foo) {
                        foo = arr[r][c];
                    }
                }
            }

            question = "What will this code output?";
            code =
                format2DArray("myArray", arr) + "\n" +
                `const num = 3;\n` +
                `let foo = ${foo}$;\n\n` +
                `for (let row = 0; row < myArray.length; row++) {\n` +
                `  for (let col = 0; col < num; col++) {\n` +
                `    if (myArray[row][col] < foo) {\n` +
                `      foo = myArray[row][col];\n` +
                `    }\n` +
                `  }\n` +
                `}\n` +
                `console.log(foo);`;

            currentAnswer = foo;
        } else if (Math.random() < 1/3) {
            const arr = createUnique2DArray(3, 3, 11, 98);
            let foo = arr[0][0];
            for (let r = 0; r < arr.length; r++) {
                for (let c = 0; c < arr[r].length; c++) {
                    if (arr[r][c] > foo) {
                        foo = arr[r][c];
                    }
                }
            }

            question = "What will this code output?";
            code =
                format2DArray("myArray", arr) + "\n" +
                `const num = 3;\n` +
                `let foo = myArray[0][0];\n\n` +
                `for (let row = 0; row < myArray.length; row++) {\n` +
                `  for (let col = 0; col < num; col++) {\n` +
                `    if (myArray[row][col] > foo) {\n` +
                `      foo = myArray[row][col];\n` +
                `    }\n` +
                `  }\n` +
                `}\n` +
                `console.log(foo);`;

            currentAnswer = foo;
        } else if (Math.random() < 1/2) {
            // largest in a single row
            const rows = getRandomNumber(7, 3);
            const cols = getRandomNumber(5, 3);
            const num = getRandomNumber(rows);
            const arr = createUnique2DArray(rows, cols, 11, 98);
            let foo = arr[num][0];
            
                for (let c = 0; c < arr[num].length; c++) {
                    if (arr[num][c] > foo) {
                        foo = arr[num][c];
                    }
                }
            
            question = "What will this code output?";
            code =
                format2DArray("myArray", arr) + "\n" +
                `const num = ${num};\n` +
                `let foo = myArray[num][0];\n\n` +
                `for (let col = 0; col < myArray[num].length; col++) {\n` +
                `  if (myArray[num][col] > foo) {\n` +
                `    foo = myArray[num][col];\n` +
                `  }\n` +
                `}\n` +
                `console.log(foo);`;

            currentAnswer = foo;
        } else {
             // largest in a single col
            const rows = getRandomNumber(7, 3);
            const cols = getRandomNumber(5, 3);
            const num = getRandomNumber(cols);
            const arr = createUnique2DArray(rows, cols, 11, 98);
            let foo = arr[0][num];
            
                for (let r = 0; r < arr.length; r++) {
                    if (arr[r][num] > foo) {
                        foo = arr[r][num];
                    }
                }
            
            question = "What will this code output?";
            code =
                format2DArray("myArray", arr) + "\n" +
                `const num = ${num};\n` +
                `let foo = myArray[0][num];\n\n` +
                `for (let row = 0; row < myArray.length; row++) {\n` +
                `  if (myArray[row][num] > foo) {\n` +
                `    foo = myArray[row][num];\n` +
                `  }\n` +
                `}\n` +
                `console.log(foo);`;

            currentAnswer = foo;
        }

    } else if (topic === "sumRow") {
        const rows = getRandomNumber(7, 3);
            const cols = getRandomNumber(5, 3);
            const num = getRandomNumber(cols);
            const arr = createUnique2DArray(rows, cols, 11, 98);
        let foo = 0;
        for (let col = 0; col < arr[num].length; col++) {
            foo += arr[num][col];
        }

        question = "What will this code output?";
        code =
            format2DArray("myArray", arr) + "\n" +
            `const num = ${num};\n` +
            `let foo = 0;\n\n` +
            `for (let col = 0; col < myArray[num].length; col++) {\n` +
            `  foo += myArray[num][col];\n` +
            `}\n` +
            `console.log(foo);`;

        currentAnswer = foo;

    } else if (topic === "sumCol") {
        const rows = getRandomNumber(7, 3);
            const cols = getRandomNumber(5, 3);
            const num = getRandomNumber(cols);
            const arr = createUnique2DArray(rows, cols, 11, 98);
        let foo = 0;
        for (let row = 0; row < arr.length; row++) {
            foo += arr[row][num];
        }

        question = "What will this code output?";
        code =
            format2DArray("myArray", arr) + "\n" +
            `const num = ${num};\n` +
            `let foo = 0;\n\n` +
            `for (let row = 0; row < myArray.length; row++) {\n` +
            `  foo += myArray[row][num];\n` +
            `}\n` +
            `console.log(foo);`;

        currentAnswer = foo;

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
                answer: "Line 9, It uses '=' instead of '+=', so foo gets overwritten on each iteration instead of adding up the column."
            },
                        {
                lines: [
                    "const myArray = [",
                    "  [12, 25, 38],",
                    "  [94, 35, 16],",
                    "  [67, 48, 79]",
                    "];",
                    "const columnToSum = 1;",
                    "const total = 0;",
                    "for (let row = 0; row < myArray.length; row++) {",
                    "  total += myArray[row][columnToSum];",
                    "}",
                    "console.log(total);"
                ],
                answer: "The error will occur on Line 8 Uncaught TypeError: Assignment to constant variable. Line 6 should be let total = 0;"
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
                answer: "Line 6, columnToSum is 3, which is out of bounds (valid column indices for a 3-column array are 0, 1, and 2)."
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
                answer: "Line 7, 'row <= myArray.length' goes out of bounds on the final iteration; it should be 'row < myArray.length'."
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
                answer: "Line 9, It uses '<' instead of '>', so it finds the smallest value instead of the largest."
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
                answer: "Line 8, The indices are swapped ([col][rowToSum] instead of [rowToSum][col]), causing an out-of-bounds error."
            },
            {
                lines: [
                    "const rows = 3;",
                    "const cols = 4;",
                    "let arr = new Array(rows);",
                    "arr[1][2] = 99;",
                    "console.log(arr[1][2]);"
                ],
                answer: "Line 4, Each row in 'arr' must first be initialized as an array (e.g., arr[i] = new Array(cols)) before assigning arr[1][2]."
            },
            {
        lines: [
            "const myArray = [",
            "  [15, 42, 27],",
            "  [38, 12, 64],",
            "  [51, 29, 19]",
            "];",
            "let smallest = 0;",
            "for (let row = 0; row < myArray.length; row++) {",
            "  for (let col = 0; col < myArray[row].length; col++) {",
            "    if (myArray[row][col] < smallest) {",
            "      smallest = myArray[row][col];",
            "    }",
            "  }",
            "}",
            "console.log(smallest);"
        ],
        answer: "Line 6, 'smallest' is initialized to 0 instead of myArray[0][0], so since all values in the array are positive, it never updates."
    },
    {
        lines: [
            "const myArray = [",
            "  [10, 20, 30],",
            "  [40, 50, 60]",
            "];",
            "let total = 0;",
            "for (let row = 0; row < myArray.length; row++) {",
            "  for (let col = 0; col <= myArray[row].length; col++) {",
            "    total += myArray[row][col];",
            "  }",
            "}",
            "console.log(total);"
        ],
        answer: "Line 7, 'col <= myArray[row].length' goes out of bounds on the final column and adds undefined (resulting in NaN); it should be 'col < myArray[row].length'."
    },
    {
        lines: [
            "const myArray = [",
            "  [4, 7, 2, 9],",
            "  [1, 8, 5, 3]",
            "];",
            "let total = 0;",
            "for (let row = 0; row < myArray.length; row++) {",
            "  for (let col = 0; col < myArray.length; col++) {",
            "    total += myArray[row][col];",
            "  }",
            "}",
            "console.log(total);"
        ],
        answer: "Line 7, The inner loop checks 'col < myArray.length' (the number of rows, 2) instead of 'col < myArray[row].length' (4), skipping the last two columns."
    },
    {
        lines: [
            "const myArray = [",
            "  [12, 15, 18],",
            "  [21, 24, 27],",
            "  [30, 33, 36]",
            "];",
            "let total = 0;",
            "for (let row = 0; row < myArray.length; row++) {",
            "  total = 0;",
            "  for (let col = 0; col < myArray[row].length; col++) {",
            "    total += myArray[row][col];",
            "  }",
            "}",
            "console.log(total);"
        ],
        answer: "Line 8, 'foo = 0;' resets the sum at the start of every row, so only the sum of the final row is kept."
    },
    {
        lines: [
            "const myArray = [",
            "  [11, 22, 33]",
            "  [44, 55, 66],",
            "  [77, 88, 99]",
            "];",
            "console.log(myArray[1][0]);"
        ],
        answer: "Line 2, There is a missing comma after '[11, 22, 33]' to separate the first and second inner arrays."
    },
    {
        lines: [
            "const myArray = [",
            "  [10, 20, 30],",
            "  [40, 50, 60],",
            "  [70, 80, 90]",
            "];",
            "myArray[1, 2] = 100;",
            "console.log(myArray[1][2]);"
        ],
        answer: "Line 6, It uses a comma inside single brackets (myArray[1, 2]) instead of two sets of square brackets (myArray[1][2])."
    },
    {
        lines: [
            "const rows = 3;",
            "const cols = 4;",
            "let arr = new Array(rows, cols);",
            "arr[2][1] = 50;",
            "console.log(arr[2][1]);"
        ],
        answer: "Line 3, 'new Array(rows, cols)' creates a 1D array [3, 4] instead of a 2D array; you must create the outer array first and use a loop to initialize each row."
    },
    {
        lines: [
            "const myArray = [",
            "  [12, 34, 56],",
            "  [78, 90, 21]",
            "];",
            "let total = 0;",
            "for (let row = 0; row < myArray.length; row++) {",
            "  for (let col = 0; col < myArray[row].length; row++) {",
            "    total += myArray[row][col];",
            "  }",
            "}",
            "console.log(total);"
        ],
        answer: "Line 7, The inner loop increments 'row++' instead of 'col++', causing an out-of-bounds error when 'row' reaches 2."
    },
    {
        lines: [
            "const myArray = [",
            "  [-15, -42, -27],",
            "  [-38, -12, -64],",
            "  [-51, -29, -19]",
            "];",
            "let largest = 0;",
            "for (let row = 0; row < myArray.length; row++) {",
            "  for (let col = 0; col < myArray[row].length; col++) {",
            "    if (myArray[row][col] > largest) {",
            "      largest = myArray[row][col];",
            "    }",
            "  }",
            "}",
            "console.log(largest);"
        ],
        answer: "Line 6, 'largest' is initialized to 0 instead of myArray[0][0], so since all values in the array are negative, it never updates."
    },
    {
        lines: [
            "const myArray = [",
            "  [10, 25, 40],",
            "  [15, 30, 45],",
            "  [20, 35, 50]",
            "];",
            "const columnToSum = 2;",
            "let total = 0;",
            "for (let row = 1; row < myArray.length; row++) {",
            "  total += myArray[row][columnToSum];",
            "}",
            "console.log(total);"
        ],
        answer: "Line 8, The loop starts at 'row = 1' instead of 'row = 0', skipping the first element (40) in the column."
    },
    {
        lines: [
            "const myArray = [",
            "  [10, 20, 30],",
            "  [40, 50, 60],",
            "  [70, 80, 90]",
            "];",
            "// Change the 3rd row, 2nd column to 99",
            "myArray[3][2] = 99;",
            "console.log(myArray);"
        ],
        answer: "Line 7, Arrays are 0-indexed, so the 3rd row and 2nd column should be accessed with 'myArray[2][1]' instead of 'myArray[3][2]'."
    }
        ];

        const chosen = choice(bugScenarios);
        question = "Find the line of code that contains a bug:";
        code = chosen.lines.map((line, idx) => `Line ${idx + 1}: ${line}`).join("\n");
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