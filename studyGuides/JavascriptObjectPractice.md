---
layout: project
category: objects
title: JS Object Practice
---

<p>Practice for JavaScript object literals, object constructors, accessing data, and modifying data.</p>

<label for="topicSelect"><strong>Topic:</strong></label>
<select id="topicSelect" onchange="generatePractice()">
    <option value="all">All Topics (Random Mix)</option>
    <option value="literal">Object Literals</option>
    <option value="constructor">Object Constructor</option>
    <option value="access">Accessing Data</option>
    <option value="modify">Modifying Data</option>
</select>
<button onclick="generatePractice()">Generate Object Practice</button>

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

const sampleObjects = [
    {
        varName: "car",
        className: "Car",
        strKey1: "make", strVals1: ["Toyota", "Honda", "Ford", "Subaru"],
        strKey2: "color", strVals2: ["red", "blue", "silver", "black"],
        numKey: "year", numVals: [2019, 2021, 2023, 2025],
        extraKey: "mileage", extraVal: 15000
    },
    {
        varName: "myBuilding",
        className: "Building",
        strKey1: "type", strVals1: ["House", "School", "Shop", "Restaurant"],
        strKey2: "color", strVals2: ["white", "gray", "tan", "brown"],
        numKey: "rooms", numVals: [8, 10, 12, 14],
        extraKey: "temperature", extraVal: 67
    },
    {
        varName: "student",
        className: "Student",
        strKey1: "name", strVals1: ["Maya", "Liam", "Sofia", "Noah"],
        strKey2: "club", strVals2: ["Robotics", "Drama", "Chess", "Debate"],
        numKey: "grade", numVals: [9, 10, 11, 12],
        extraKey: "gpa", extraVal: 3.8
    },
    {
        varName: "book",
        className: "Book",
        strKey1: "title", strVals1: ["Dune", "Hobbit", "1984", "Sapiens"],
        strKey2: "genre", strVals2: ["Sci-Fi", "Fantasy", "Dystopian", "History"],
        numKey: "pages", numVals: [250, 310, 412, 520],
        extraKey: "rating", extraVal: 5
    },
    {
        varName: "player",
        className: "Player",
        strKey1: "username", strVals1: ["PixelAce", "Nova99", "ShadowFox", "SkyWalker"],
        strKey2: "rank", strVals2: ["Bronze", "Silver", "Gold", "Platinum"],
        numKey: "score", numVals: [100, 250, 400, 550],
        extraKey: "lives", extraVal: 3
    },
    {
        varName: "pet",
        className: "Pet",
        strKey1: "name", strVals1: ["Buddy", "Luna", "Milo", "Bella"],
        strKey2: "species", strVals2: ["dog", "cat", "rabbit", "hamster"],
        numKey: "age", numVals: [2, 4, 6, 8],
        extraKey: "adopted", extraVal: true
    }
];

generatePractice();

function generatePractice() {
    const selectedTopic = document.getElementById("topicSelect").value;
    const topics = ["literal", "constructor", "access", "modify"];
    const topic = selectedTopic === "all" ? choice(topics) : selectedTopic;

    const actions = ["will", "does", "would", "might"];
    const targets = ["this code", "the following", "the following code", "the following program", "this"];
    const verbs = ["print", "display", "output", "produce", "end up showing"];
    const promptPrefix = "What " + choice(actions) + " " + choice(targets) + " " + choice(verbs) + "?";

    const template = choice(sampleObjects);
    const val1 = choice(template.strVals1);
    const val2 = choice(template.strVals2);
    const numVal = choice(template.numVals);

    let question = "";
    let code = "";

    if (topic === "literal") {
        const mode = getRandomNumber(3);
        if (mode === 0) {
            // Write an object literal
            question = `Write a JavaScript statement using an object literal to create an object named '${template.varName}' with '${template.strKey1}' set to "${val1}" and '${template.numKey}' set to ${numVal}.`;
            code = `// Create ${template.varName} using { } object literal syntax`;
            currentAnswer = `const ${template.varName} = { ${template.strKey1}: "${val1}", ${template.numKey}: ${numVal} };`;
        } else if (mode === 1) {
            // Trace output of an object literal property
            question = promptPrefix;
            code = `const ${template.varName} = {\n` +
                   `  ${template.strKey1}: "${val1}",\n` +
                   `  ${template.strKey2}: "${val2}",\n` +
                   `  ${template.numKey}: ${numVal}\n` +
                   `};\n` +
                   `console.log(${template.varName}.${template.strKey2});`;
            currentAnswer = val2;
        } else {
            // Count properties in an object literal
            question = promptPrefix;
            code = `const ${template.varName} = {\n` +
                   `  ${template.strKey1}: "${val1}",\n` +
                   `  ${template.strKey2}: "${val2}",\n` +
                   `  ${template.numKey}: ${numVal}\n` +
                   `};\n` +
                   `console.log(Object.keys(${template.varName}).length);`;
            currentAnswer = 3;
        }

    } else if (topic === "constructor") {
        const mode = getRandomNumber(4);
        if (mode === 0) {
            // Using new Object()
            question = promptPrefix;
            code = `const ${template.varName} = new Object();\n` +
                   `${template.varName}.${template.strKey1} = "${val1}";\n` +
                   `${template.varName}.${template.numKey} = ${numVal};\n` +
                   `console.log(${template.varName}.${template.strKey1});`;
            currentAnswer = val1;
        } else if (mode === 1) {
            // Custom constructor function output
            question = promptPrefix;
            code = `function ${template.className}(${template.strKey1}, ${template.numKey}) {\n` +
                   `  this.${template.strKey1} = ${template.strKey1};\n` +
                   `  this.${template.numKey} = ${template.numKey};\n` +
                   `}\n\n` +
                   `const my${template.className} = new ${template.className}("${val1}", ${numVal});\n` +
                   `console.log(my${template.className}.${template.numKey});`;
            currentAnswer = numVal;
        } else if (mode === 2) {
            // Write statement calling a constructor function
            question = `Given the constructor function below, write a statement to create a new ${template.className} object named 'item' with "${val1}" and ${numVal}.`;
            code = `function ${template.className}(${template.strKey1}, ${template.numKey}) {\n` +
                   `  this.${template.strKey1} = ${template.strKey1};\n` +
                   `  this.${template.numKey} = ${template.numKey};\n` +
                   `}`;
            currentAnswer = `const item = new ${template.className}("${val1}", ${numVal});`;
        } else {
            // Unassigned property on new Object() -> undefined
            question = promptPrefix;
            code = `const ${template.varName} = new Object();\n` +
                   `${template.varName}.${template.strKey1} = "${val1}";\n` +
                   `console.log(${template.varName}.${template.strKey2});`;
            currentAnswer = "undefined";
        }

    } else if (topic === "access") {
        question = promptPrefix;
        const baseObj = `const ${template.varName} = {\n` +
                        `  ${template.strKey1}: "${val1}",\n` +
                        `  ${template.strKey2}: "${val2}",\n` +
                        `  ${template.numKey}: ${numVal}\n` +
                        `};\n`;
        const mode = getRandomNumber(4);

        if (mode === 0) {
            // Dot notation
            code = baseObj + `console.log(${template.varName}.${template.numKey});`;
            currentAnswer = numVal;
        } else if (mode === 1) {
            // Bracket notation with string literal
            code = baseObj + `console.log(${template.varName}["${template.strKey1}"]);`;
            currentAnswer = val1;
        } else if (mode === 2) {
            // Bracket notation using a variable
            code = baseObj +
                   `let prop = "${template.strKey2}";\n` +
                   `console.log(${template.varName}[prop]);`;
            currentAnswer = val2;
        } else {
            // Dot notation trap with a variable name -> undefined
            code = baseObj +
                   `let prop = "${template.strKey1}";\n` +
                   `console.log(${template.varName}.prop);`;
            currentAnswer = "undefined";
        }

    } else if (topic === "modify") {
        question = promptPrefix;
        const baseObj = `const ${template.varName} = {\n` +
                        `  ${template.strKey1}: "${val1}",\n` +
                        `  ${template.strKey2}: "${val2}",\n` +
                        `  ${template.numKey}: ${numVal}\n` +
                        `};\n`;
        const mode = getRandomNumber(4);

        if (mode === 0) {
            // Update existing string property via dot notation
            const newVal = template.strVals2.find(v => v !== val2) || "green";
            code = baseObj +
                   `${template.varName}.${template.strKey2} = "${newVal}";\n` +
                   `console.log(${template.varName}.${template.strKey2});`;
            currentAnswer = newVal;
        } else if (mode === 1) {
            // Update numeric property via += and bracket notation
            const addAmt = getRandomNumber(6, 1);
            code = baseObj +
                   `${template.varName}["${template.numKey}"] += ${addAmt};\n` +
                   `console.log(${template.varName}.${template.numKey});`;
            currentAnswer = numVal + addAmt;
        } else if (mode === 2) {
            // Add a brand new property dynamically
            const formattedExtra = typeof template.extraVal === "string" ? `"${template.extraVal}"` : template.extraVal;
            code = baseObj +
                   `${template.varName}.${template.extraKey} = ${formattedExtra};\n` +
                   `console.log(${template.varName}.${template.extraKey});`;
            currentAnswer = template.extraVal;
        } else {
            // Delete a property
            code = baseObj +
                   `delete ${template.varName}.${template.strKey1};\n` +
                   `console.log(${template.varName}.${template.strKey1});`;
            currentAnswer = "undefined";
        }
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