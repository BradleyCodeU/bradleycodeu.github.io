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
    <option value="bug">Find the Bug</option>
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
        varName: "momsCar",
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
        varName: "studentOne",
        className: "Student",
        strKey1: "name", strVals1: ["Maya", "Liam", "Sofia", "Noah"],
        strKey2: "club", strVals2: ["Robotics", "Drama", "Chess", "Debate"],
        numKey: "grade", numVals: [9, 10, 11, 12],
        extraKey: "gpa", extraVal: 3.8
    },
    {
        varName: "bookA",
        className: "Book",
        strKey1: "title", strVals1: ["Dune", "Hobbit", "1984", "Sapiens"],
        strKey2: "genre", strVals2: ["Sci-Fi", "Fantasy", "Dystopian", "History"],
        numKey: "pages", numVals: [250, 310, 412, 520],
        extraKey: "rating", extraVal: 5
    },
    {
        varName: "playerOne",
        className: "Player",
        strKey1: "username", strVals1: ["PixelAce", "Nova99", "ShadowFox", "SkyWalker"],
        strKey2: "rank", strVals2: ["Bronze", "Silver", "Gold", "Platinum"],
        numKey: "score", numVals: [100, 250, 400, 550],
        extraKey: "lives", extraVal: 3
    },
    {
        varName: "myPet",
        className: "Pet",
        strKey1: "name", strVals1: ["Buddy", "Luna", "Milo", "Bella"],
        strKey2: "species", strVals2: ["dog", "cat", "rabbit", "hamster"],
        numKey: "age", numVals: [2, 4, 6, 8],
        extraKey: "adopted", extraVal: true
    }
];

const bugScenarios = [
    {
        lines: [
            "const student = {",
            "  name = \"Maya\",",
            "  grade: 11,",
            "  gpa: 3.8",
            "};",
            "console.log(student.name);"
        ],
        answer: "Line 2: Uses '=' instead of ':' to assign a property inside an object literal (should be name: \"Maya\")."
    },
    {
        lines: [
            "const student = {",
            "  'name': \"Maya\",",
            "  'grade': 11",
            "  'gpa': 3.8",
            "};",
            "console.log(student.name);"
        ],
        answer: "Line 3: Missing comma after grade: 11"
    },
    {
        lines: [
            "const student = {",
            "  name: \"Maya\",",
            "  grade: 11,",
            "  gpa: 3.8",
            ";",
            "console.log(student.name);"
        ],
        answer: "Line 4: Missing closing curly bracket"
    },
    {
        lines: [
            "const student = {",
            "  'name': \"Maya\";",
            "  'grade': 11,",
            "  'gpa': 3.8",
            "};",
            "console.log(student.name);"
        ],
        answer: "Line 2: Line ends with semicolon, but should end with comma"
    },
    {
        lines: [
            "const car = {",
            "  make: \"Honda\"",
            "  model: \"Civic\",",
            "  owner: \"Beth\",",
            "  age_in_years: 5",
            "};",
            "car.owner = \"Carol\";",
            "car.age_in_years++;",
            "console.log(car.model);"
        ],
        answer: "Line 2: Missing a comma after \"Honda\" to separate the object properties."
    },
    {
        lines: [
            "const car = {",
            "  make: \"Honda\",",
            "  model: \"Civic\",",
            "  owner: \"Beth\",",
            "  age in years: 5",
            "};",
            "car.owner = \"Carol\";",
            "car.age_in_years++;",
            "console.log(car.model);"
        ],
        answer: "Line 4: Keys cannot contain spaces without quotation marks. Should use either \"age in years\" or ageInYears or age_in_years as the key."
    },
        {
        lines: [
            "const car = {",
            "  make: \"Honda\",",
            "  model: \"Civic\",",
            "  owner: \"Beth\",",
            "  age-in-years: 5",
            "};",
            "car.owner = \"Carol\";",
            "car.age_in_years++;",
            "console.log(car.model);"
        ],
        answer: "Line 4: Keys cannot contain minus without quotation marks. Should use either \"age-in-years\" or ageInYears or age_in_years as the key."
    },
            {
        lines: [
            "const car = {",
            "  make: \"Honda\",",
            "  model: \"Civic\",",
            "  owner: \"Beth\",",
            "  age_in_years: 5",
            "};",
            "car.owner++;",
            "car.age_in_years++;",
            "console.log(car.model);"
        ],
        answer: "Line 7: car.owner is a String. Using ++ will set the value to be NaN (not a number)"
    },
                {
        lines: [
            "const car = {",
            "  make: \"Honda\",",
            "  model: \"Civic\",",
            "  owner: \"Beth\",",
            "  age_in_years: \"5\"",
            "};",
            "car.owner = 'Carol';",
            "car.age_in_years++;",
            "console.log(car.model);"
        ],
        answer: "Line 5 and Line 8: age_in_years is a String. Using ++ will set the value to be NaN (not a number)"
    },
    {
        lines: [
            "const book = {",
            "  title: \"Dune\",",
            "  author: \"Frank Herbert\",",
            "  pages: 412",
            "};",
            "let key = \"author\";",
            "console.log(book.key);"
        ],
        answer: "Line 7: Dot notation looks for a literal property named 'key' (returning undefined). To use the variable, write book[key]."
    },
        {
        lines: [
            "const book = {",
            "  title: \"Dune\",",
            "  author: \"Frank Herbert\",",
            "  pages: 412",
            "};",
            "let key = \"page\";",
            "console.log(book[key]);"
        ],
        answer: "Line 6: The key 'page' does not exist. Should be 'pages'"
    },
            {
        lines: [
            "const book = {",
            "  title: \"Dune\",",
            "  author: \"Frank Herbert\",",
            "  pages: 412",
            "};",
            "book.pages = 413;",
            "console.log(book[pages]);"
        ],
        answer: "Line 7: When using bracket notation, there must be quotes around the property name. Should be book[\"pages\"]"
    },
                {
        lines: [
            "const book = {",
            "  title: \"Dune\",",
            "  author: \"Frank Herbert\",",
            "  pages: 412",
            "};",
            "pages += 1;",
            "console.log(book[\"pages\"]);"
        ],
        answer: "Line 6: The user is trying to update the number of pages in the book. Should be book.pages += 1; or book[\"pages\"] += 1;"
    },
    {
        lines: [
            "const game = {",
            "  title: \"Chess\",",
            "  players: 2,",
            "  rating: 4.9",
            "};",
            "console.log(game[players]);"
        ],
        answer: "Line 6: Bracket notation requires quotes around the property name (game[\"players\"]), otherwise JavaScript looks for an undefined variable named players."
    },
        {
        lines: [
            "const game: {",
            "  title: \"Chess\",",
            "  players: 2,",
            "  rating: 4.9",
            "};",
            "console.log(game[\"players\"]);"
        ],
        answer: "Line 1: Must use the assignment operator = to store an object in a variable. Should be const game = {"
    },
    {
        lines: [
            "const game = [",
            "  title: \"Chess\",",
            "  players: 2,",
            "  rating: 4.9",
            "];",
            "console.log(game[players]);"
        ],
        answer: "Line 1 and Line 5: Object literals must be created within curly brackets."
    },
    {
        lines: [
            "const myFriend = {",
            "  name: 'Steve',",
            "  age: 15",
            "};",
            "const myPet = Object();",
            "myPet.name = 'Buddy';",
            "console.log(myPet.name);"
        ],
        answer: "Line 5: Missing the 'new' keyword when calling the constructor function. Should be const myPet = new Object();"
    },
    {
        lines: [
            "const myFriend = {",
            "  name: 'Steve'",
            "  age: 15",
            "};",
            "const myPet = new Object();",
            "myPet.name = 'Buddy';",
            "console.log(myPet.name);"
        ],
        answer: "Line 2: Missing comma after name: 'Steve'"
    },
     {
        lines: [
            "const myFriend = {",
            "  name: 'Steve',",
            "  age: 15",
            ";",
            "const myPet = new Object();",
            "myPet.name = 'Buddy';",
            "console.log(myPet.name);"
        ],
        answer: "Line 4: Missing closing curly bracket"
    },
         {
        lines: [
            "const myFriend = {",
            "  name: 'Steve',",
            "  age: 15",
            "};",
            "const myPet = new Object();",
            "myPet.name: 'Buddy';",
            "console.log(myPet.name);"
        ],
        answer: "Line 6: When adding an additional property and value to an object that was already constructed, use the assignment operator =. Should be myPet.name = 'Buddy';"
    },
             {
        lines: [
            "const myPet = new Object();",
            "myPet.name = 'Buddy';",
            "const myFriend = {",
            "  name = 'Steve',",
            "  age = 15",
            "};",
            "console.log(myPet.name);"
        ],
        answer: "Line 4 and Line 5: Properties and values inside an object literal must be separated by colons. Should be name: 'Steve'"
    },
    {
        lines: [
            "const player = {",
            "  username: \"Coder99\",",
            "  score: 50",
            "};",
            "player = { username: \"Coder99\", score: 100 };",
            "console.log(player.score);"
        ],
        answer: "Line 5: Attempts to reassign a 'const' object variable (TypeError). Modify the property directly instead: player.score = 100;"
    },
    {
        lines: [
            "const player = {",
            "  username, \"Coder99\",",
            "  score, 50",
            "};",
            "player.username = \"ImSoSkibidi67\";",
            "console.log(player.score);"
        ],
        answer: "Line 2 and Line 3: Properties and values inside an object literal must be separated by colons. Should be username: \"Coder99\""
    },
    {
        lines: [
            "const movie = {",
            "  title: \"Inception\",",
            "  releaseYear: 2010,",
            "  director: \"Christopher Nolan\"",
            "};",
            "console.log(movie.releaseyear);"
        ],
        answer: "Line 6: Property names are case-sensitive; 'releaseyear' should be 'releaseYear' (returns undefined)."
    },
    {
        lines: [
            "const laptop = {",
            "  brand: \"Dell\";",
            "  ram: \"16GB\";",
            "  ssd: \"512GB\"",
            "};",
            "console.log(laptop.ram);"
        ],
        answer: "Line 2 and Line 3: Properties inside an object literal must be separated by commas (,), not semicolons (;)."
    },
    {
        lines: [
            "const person1 = {};",
            "person1[\"firstName\"] = \"Mario\";",
            "person1[\"lastName\"] = \"Rossi\";",
            "console.log(person1.firstName);",
            "// Expected output: \"Mario\"",
            "const person2: {",
            "  firstName: \"John\",",
            "  lastName: \"Doe\"",
            "};",
            "console.log(person2[\"lastName\"]);",
            "// Expected output: \"Doe\""
        ],
        answer: "Line 6: The assignment operator = must be used to store an object literal in a variable"
    },
    {
        lines: [
            "const person1 = ();",
            "person1[\"firstName\"] = \"Mario\";",
            "person1[\"lastName\"] = \"Rossi\";",
            "console.log(person1.firstName);",
            "// Expected output: \"Mario\"",
            "const person2 = {",
            "  firstName: \"John\",",
            "  lastName: \"Doe\"",
            "};",
            "console.log(person2[\"lastName\"]);",
            "// Expected output: \"Doe\""
        ],
        answer: "Line 1: Curly braces '{}' must be used to create an empty object literal (const person1 = {};), not parentheses '()'."
    },
    {
        lines: [
            "const person1 = {};",
            "person1[\"firstName\"] : \"Mario\";",
            "person1[\"lastName\"] = \"Rossi\";",
            "console.log(person1.firstName);",
            "// Expected output: \"Mario\"",
            "const person2 = {",
            "  firstName: \"John\",",
            "  lastName: \"Doe\"",
            "};",
            "console.log(person2[\"lastName\"]);",
            "// Expected output: \"Doe\""
        ],
        answer: "Line 2: The assignment operator '=' must be used instead of ':' when assigning a value to a property outside of an object literal."
    },
    {
        lines: [
            "const person1 = {};",
            "person1[firstName] = \"Mario\";",
            "person1[\"lastName\"] = \"Rossi\";",
            "console.log(person1.firstName);",
            "// Expected output: \"Mario\"",
            "const person2 = {",
            "  firstName: \"John\",",
            "  lastName: \"Doe\"",
            "};",
            "console.log(person2[\"lastName\"]);",
            "// Expected output: \"Doe\""
        ],
        answer: "Line 2: Bracket notation requires quotes around the property name (person1[\"firstName\"]), otherwise JavaScript treats firstName as an undeclared variable."
    },
    {
        lines: [
            "const person1 = {};",
            "person1[\"firstName\"] = \"Mario\";",
            "person1[\"lastName\"] = \"Rossi\";",
            "console.log(person1.firstname);",
            "// Expected output: \"Mario\"",
            "const person2 = {",
            "  firstName: \"John\",",
            "  lastName: \"Doe\"",
            "};",
            "console.log(person2[\"lastName\"]);",
            "// Expected output: \"Doe\""
        ],
        answer: "Line 4: Property names are case-sensitive; 'firstname' should be 'firstName' (otherwise it outputs undefined instead of \"Mario\")."
    },
    {
        lines: [
            "const person1 = {};",
            "person1[\"firstName\"] = \"Mario\";",
            "person1[\"lastName\"] = \"Rossi\";",
            "console.log(person1.firstName);",
            "// Expected output: \"Mario\"",
            "const person2 = {",
            "  firstName: \"John\",",
            "  lastName: \"Doe\"",
            "};",
            "console.log(person2[lastName]);",
            "// Expected output: \"Doe\""
        ],
        answer: "Line 10: Bracket notation requires quotes around the key name (person2[\"lastName\"]), otherwise JavaScript looks for an undeclared variable named lastName."
    },
        {
        lines: [
            "const person1 = {};",
            "person1[\"firstName\"] = \"Mario\";",
            "person2[\"lastName\"] = \"Rossi\";",
            "console.log(person1.firstName);",
            "// Expected output: \"Mario\"",
            "const person2 = {",
            "  firstName: \"John\",",
            "  lastName: \"Doe\"",
            "};",
            "console.log(person2[lastName]);",
            "// Expected output: \"Doe\""
        ],
        answer: "Line 3: ReferenceError: person2 is not defined. The variable person2 doesn't exist before line 6."
    },
    {
        lines: [
            "const profile = new Object();",
            "profile.username = \"alex_dev\";",
            "profile.[level] = 5;",
            "console.log(profile);"
        ],
        answer: "Line 3: Invalid syntax combining dot and bracket notation; use profile.level = 5; or profile[\"level\"] = 5;"
    }
];

generatePractice();

function generatePractice() {
    const selectedTopic = document.getElementById("topicSelect").value;
    const topics = ["literal", "constructor", "access", "modify", "bug"];
    const topic = selectedTopic === "all" ? choice(topics) : selectedTopic;

    const actions = ["will", "does", "would", "might"];
    const targets = ["this code", "the following code", "the following program", "this snippet"];
    const verbs = ["print", "display", "output", "produce"];
    const promptPrefix = `What ${choice(actions)} ${choice(targets)} ${choice(verbs)}?`;

    const template = choice(sampleObjects);
    const val1 = choice(template.strVals1);
    const val2 = choice(template.strVals2);
    const numVal = choice(template.numVals);

    let question = "";
    let code = "";

    if (topic === "literal") {
        if (Math.random() < 1/4) {
            // Trace output of an object literal property
            question = promptPrefix;
            code = `const ${template.varName} = {\n` +
                   `  ${template.strKey1}: "${val1}",\n` +
                   `  ${template.strKey2}: "${val2}",\n` +
                   `  ${template.numKey}: ${numVal}\n` +
                   `};\n` +
                   `console.log(${template.varName}["${template.strKey2}"]);`;
            currentAnswer = val2;
        } else if (Math.random() < 1/3) {
            // Write an object literal
            question = `Write a JavaScript statement using an object literal to create an object named 'const ${template.varName}' with '${template.strKey1}' set to "${val1}" and '${template.numKey}' set to ${numVal}.`;
            code = `// Create ${template.varName} using { } object literal syntax`;
            currentAnswer = `const ${template.varName} = { ${template.strKey1}: "${val1}", ${template.numKey}: ${numVal} };`;
        } else if (Math.random() < 1/2) {
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
        
        if (Math.random() < 1/4) {
            // Using new Object() with dot notation
            question = promptPrefix;
            code = `const ${template.varName} = new Object();\n` +
                   `${template.varName}.${template.strKey1} = "${val1}";\n` +
                   `${template.varName}.${template.numKey} = ${numVal};\n` +
                   `console.log(${template.varName}.${template.strKey1});`;
            currentAnswer = val1;
        } else if (Math.random() < 1/3) {
            // Using new Object() with bracket notation
            question = promptPrefix;
            code = `const ${template.varName} = new Object();\n` +
                   `${template.varName}["${template.strKey1}"] = "${val1}";\n` +
                   `${template.varName}["${template.numKey}"] = ${numVal};\n` +
                   `console.log(${template.varName}.${template.numKey});`;
            currentAnswer = numVal;
        } else if (Math.random() < 1/2) {
            // Fill in 1 of the 3 lines using new Object()
            const lines = [
                `const ${template.varName} = new Object();`,
                `${template.varName}.${template.strKey1} = "${val1}";`,
                `${template.varName}.${template.numKey} = ${numVal};`
            ];
            const missingIdx = getRandomNumber(3);

            question = `Fill in the missing line of code (Line ${missingIdx + 1}) so that '${template.varName}' is created using the Object constructor (new Object()) with '${template.strKey1}' set to "${val1}" and '${template.numKey}' set to ${numVal}.`;

            const displayLines = [...lines];
            displayLines[missingIdx] = `// Line ${missingIdx + 1}: Write the missing statement here`;

            code = displayLines.join("\n");
            currentAnswer = lines[missingIdx];
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
        
        if (Math.random() < 1/5) {
            // Access a number from an array inside an object
            const arrKey = choice(["nums", "points", "values", "stats"]);
            const arrLen = getRandomNumber(5, 3); // 3 or 4 numbers
            const numArr = [];
            for (let i = 0; i < arrLen; i++) {
                numArr.push(getRandomNumber(50, 10));
            }
            const idx = getRandomNumber(arrLen);

            const objWithArray = `const ${template.varName} = {\n` +
                                 `  ${template.strKey1}: "${val1}",\n` +
                                 `  ${template.numKey}: ${numVal},\n` +
                                 `  ${arrKey}: ${JSON.stringify(numArr)}\n` +
                                 `};\n`;

            const accessExpr = Math.random() < 0.5
                ? `${template.varName}.${arrKey}[${idx}]`
                : `${template.varName}["${arrKey}"][${idx}]`;

            code = objWithArray + `console.log(${accessExpr});`;
            currentAnswer = numArr[idx];
        } else if (Math.random() < 1/4) {
            // Dot notation
            code = baseObj + `console.log(${template.varName}.${template.numKey});`;
            currentAnswer = numVal;
        } else if (Math.random() < 1/3) {
            // Bracket notation with string literal
            code = baseObj + `console.log(${template.varName}["${template.strKey1}"]);`;
            currentAnswer = val1;
        } else if (Math.random() < 1/2) {
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
        if (Math.random() < 1/7) {
            // Push a new element into an array inside an object
            const arrKey = choice(["nums", "points", "values", "stats"]);
            const arrLen = getRandomNumber(5, 3); // 3 or 4 numbers
            const numArr = [];
            for (let i = 0; i < arrLen; i++) {
                numArr.push(getRandomNumber(10, 1));
            }
            const newVal = getRandomNumber(10, 1);

            const objWithArray = `const ${template.varName} = {\n` +
                                 `  ${template.strKey1}: "${val1}",\n` +
                                 `  ${template.numKey}: ${numVal},\n` +
                                 `  ${arrKey}: ${JSON.stringify(numArr)}\n` +
                                 `};\n`;

            const pushStmt = Math.random() < 0.5
                ? `${template.varName}.${arrKey}.push(${newVal});\n`
                : `${template.varName}["${arrKey}"].push(${newVal});\n`;

            if (Math.random() < 0.5) {
                // 50% of the time: log the updated length of the array property
                const logStmt = Math.random() < 0.5
                    ? `console.log(${template.varName}.${arrKey}.length);`
                    : `console.log(${template.varName}["${arrKey}"].length);`;
                code = objWithArray + pushStmt + logStmt;
                currentAnswer = arrLen + 1;
            } else {
                // 50% of the time: log the object's key count (unchanged at 3)
                code = objWithArray + pushStmt + `console.log(Object.keys(${template.varName}).length);`;
                currentAnswer = 3;
            }
        } else if (Math.random() < 1/6) {
            // Access a number from an array inside an object
            const arrKey = choice(["nums", "points", "values", "stats"]);
            const arrLen = getRandomNumber(5, 3); // 3 or 4 numbers
            const numArr = [];
            for (let i = 0; i < arrLen; i++) {
                numArr.push(getRandomNumber(10, 1));
            }
            const idx = getRandomNumber(arrLen);

            const objWithArray = `const ${template.varName} = {\n` +
                                 `  ${template.strKey1}: "${val1}",\n` +
                                 `  ${template.numKey}: ${numVal},\n` +
                                 `  ${arrKey}: ${JSON.stringify(numArr)}\n` +
                                 `};\n`;

            const accessExpr = Math.random() < 0.5
                ? `${template.varName}.${template.numKey} += ${template.varName}.${arrKey}[${idx}];\nconsole.log(${template.varName}.${template.numKey});`
                : `${template.varName}["${template.numKey}"] += ${template.varName}["${arrKey}"][${idx}];\nconsole.log(${template.varName}["${template.numKey}"]);`;

            code = objWithArray + accessExpr;
            currentAnswer = numVal + numArr[idx];
        } else if (Math.random() < 1/5) {
            // Access a number from an array inside an object
            const arrKey = choice(["nums", "points", "values", "stats"]);
            const arrLen = getRandomNumber(6, 3); // 3-5 numbers
            const numArr = [];
            for (let i = 0; i < arrLen; i++) {
                numArr.push(getRandomNumber(50, 10));
            }
            const idx = getRandomNumber(arrLen);

            const objWithArray = `const ${template.varName} = {\n` +
                                 `  ${template.strKey1}: "${val1}",\n` +
                                 `  ${template.numKey}: ${numVal},\n` +
                                 `  ${arrKey}: ${JSON.stringify(numArr)}\n` +
                                 `};\n`;

            const accessExpr = Math.random() < 0.5
                ? `${template.varName}.${arrKey}.push(${idx})`
                : `${template.varName}["${arrKey}"].push(${idx})`;

            code = objWithArray + `console.log(${accessExpr});`;
            currentAnswer = numArr.length;
        } else if (Math.random() < 1/4) {
            // Update existing string property via dot notation
            const newVal = template.strVals2.find(v => v !== val2) || "green";
            code = baseObj +
                   `${template.varName}.${template.strKey2} = "${newVal}";\n` +
                   `console.log(${template.varName}.${template.strKey2});`;
            currentAnswer = newVal;
        } else if (Math.random() < 1/3) {
            // Update numeric property via += and bracket notation
            const addAmt = getRandomNumber(6, 1);
            code = baseObj +
                   `${template.varName}["${template.numKey}"] += ${addAmt};\n` +
                   `console.log(${template.varName}.${template.numKey});`;
            currentAnswer = numVal + addAmt;
        } else if (Math.random() < 1/2) {
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
    }else if (topic === "bug") {
        question = "Which line of code contains a bug (or causes an error/unexpected behavior), and why?";
        const bug = choice(bugScenarios);
        code = bug.lines.map((line, idx) => `${idx + 1}: ${line}`).join("\n");
        currentAnswer = bug.answer;
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