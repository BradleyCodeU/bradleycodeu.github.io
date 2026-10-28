---
layout: project
category: dom-events
title: JS Input Practice Generator
---

<button onclick="generatePractice()">Generate Input Practice</button>
<p id="question"></p>
<pre><span id="output" style="font-size: 14pt;"></span></pre>
<div id="optionsContainer"></div>
<br>
<table>
    <tr>
        <td><button onclick="revealAnswer()">Reveal Answer</button></td>
        <td><span id="answer" style="display:none; margin-left:10px;"></span></td>
    </tr>
</table>

<script>
const inputNames = ["userName", "userAge", "userColor", "volumeLevel", "userRating", "agreeTerms", "newsletter", "themeSelect", "sizeChoice", "speedSlider", "scoreInput", "userBio"];
const optionsList = ["Small", "Medium", "Large", "Dark Mode", "Light Mode", "Standard", "Express", "VIP"];
const buttonTexts = ["Submit", "Apply Settings", "Check Input", "Update Display", "Save", "Process"];
const initialPTexts = ["Result: None", "Waiting for input...", "Output: Default", "Status: Pending", "Empty"];

let currentCorrectAnswer = "";

generatePractice();

function generatePractice() {
    let inputTypeIndex = getRandomNumber(5); // 0: text, 1: radio, 2: checkbox, 3: select, 4: range
    let isBug = Math.random() < 0.35; // 35% chance of DOM input bug

    let inputId = choice(inputNames) + "Input";
    let pId = choice(inputNames) + "Text";
    while(pId === inputId) pId = choice(inputNames) + "Text";

    let btnId = choice(inputNames) + "Btn";
    let funcName = "process" + choice(["Data", "Input", "Form", "Selection"]);
    let btnText = choice(buttonTexts);
    let initialText = choice(initialPTexts);

    let questionText = "";
    let codeText = "";
    let correctAnswer = "";
    let distractors = [];

    // ----------------------------------------------------
    // TYPE 0: TEXT INPUT (<input type="text">)
    // ----------------------------------------------------
    if (inputTypeIndex === 0) {
        let defaultVal = choice(["Alex", "Pixel", "Coder", "Hello", "Guest"]);
        let userTyped = choice(["Jordan", "Cyber", "Admin", "World"]);

        questionText = `Assuming the user types "${userTyped}" into the text field and clicks the button, what happens?`;

        if (isBug) {
            let bugType = getRandomNumber(3);
            if (bugType === 0) {
                // Bug: .innerHTML on input instead of .value
                codeText = `<input type="text" id="${inputId}" value="${defaultVal}">\n` +
                           `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                           `<p id="${pId}">${initialText}</p>\n` +
                           `<script>\n` +
                           `function ${funcName}() {\n` +
                           `    let val = document.getElementById("${inputId}").innerHTML;\n` +
                           `    document.getElementById("${pId}").innerHTML = val;\n` +
                           `}\n` +
                           `<\/script>`;

                correctAnswer = `The paragraph displays empty/blank text because <input> tags use .value, not .innerHTML, to get user input.`;
                distractors = [
                    `The paragraph text changes to "${userTyped}".`,
                    `The paragraph text changes to "${defaultVal}".`,
                    `An error is thrown because .innerHTML cannot be assigned to a paragraph.`
                ];
            } else if (bugType === 1) {
                // Bug: .value() as a function call
                codeText = `<input type="text" id="${inputId}" value="${defaultVal}">\n` +
                           `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                           `<p id="${pId}">${initialText}</p>\n` +
                           `<script>\n` +
                           `function ${funcName}() {\n` +
                           `    let val = document.getElementById("${inputId}").value();\n` +
                           `    document.getElementById("${pId}").innerHTML = val;\n` +
                           `}\n` +
                           `<\/script>`;

                correctAnswer = `Nothing happens (a JavaScript error occurs) because .value is a property, not a function, so calling value() is invalid.`;
                distractors = [
                    `The paragraph text changes to "${userTyped}".`,
                    `The paragraph text changes to "${defaultVal}".`,
                    `The input text box is cleared.`
                ];
            } else {
                // Bug: Case sensitivity (.Value)
                codeText = `<input type="text" id="${inputId}" value="${defaultVal}">\n` +
                           `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                           `<p id="${pId}">${initialText}</p>\n` +
                           `<script>\n` +
                           `function ${funcName}() {\n` +
                           `    let val = document.getElementById("${inputId}").Value;\n` +
                           `    document.getElementById("${pId}").innerHTML = val;\n` +
                           `}\n` +
                           `<\/script>`;

                correctAnswer = `The paragraph text becomes "undefined" because JavaScript is case-sensitive (.value must be lowercase).`;
                distractors = [
                    `The paragraph text changes to "${userTyped}".`,
                    `The paragraph text changes to "${defaultVal}".`,
                    `Nothing happens because Value automatically capitalizes the user text.`
                ];
            }
        } else {
            // Valid code
            codeText = `<input type="text" id="${inputId}" value="${defaultVal}">\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    let val = document.getElementById("${inputId}").value;\n` +
                       `    document.getElementById("${pId}").innerHTML = "Hello " + val;\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph text changes from "${initialText}" to "Hello ${userTyped}".`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Hello ${defaultVal}".`,
                `The paragraph text changes to "${userTyped}" without "Hello ".`,
                `The text box clears and displays "Hello ${userTyped}".`
            ];
        }

    // ----------------------------------------------------
    // TYPE 1: RADIO BUTTON (<input type="radio">)
    // ----------------------------------------------------
    } else if (inputTypeIndex === 1) {
        let radVal = choice(["Yes", "No", "Standard", "Express"]);
        let isChecked = Math.random() < 0.5;

        questionText = `Assuming the radio button is currently ${isChecked ? "checked" : "UNCHECKED"} and the user clicks the button, what happens?`;

        if (isBug) {
            // Bug: Checking .value instead of .checked
            codeText = `<input type="radio" id="${inputId}" value="${radVal}"> Option\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    if (document.getElementById("${inputId}").value == true) {\n` +
                       `        document.getElementById("${pId}").innerHTML = "Selected!";\n` +
                       `    } else {\n` +
                       `        document.getElementById("${pId}").innerHTML = "Not Selected!";\n` +
                       `    }\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph displays "Not Selected!" regardless of state because .value returns string "${radVal}" (not true/false). It should use .checked.`;
            distractors = [
                isChecked ? `The paragraph text changes to "Selected!".` : `The paragraph text changes to "Not Selected!".`,
                `Nothing happens because radio buttons cannot have a value attribute.`,
                `The paragraph text changes to "${radVal}".`
            ];
        } else {
            // Valid code
            codeText = `<input type="radio" id="${inputId}" value="${radVal}"> Option\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    if (document.getElementById("${inputId}").checked) {\n` +
                       `        document.getElementById("${pId}").innerHTML = "Choice: " + document.getElementById("${inputId}").value;\n` +
                       `    } else {\n` +
                       `        document.getElementById("${pId}").innerHTML = "None selected";\n` +
                       `    }\n` +
                       `}\n` +
                       `<\/script>`;

            if (isChecked) {
                correctAnswer = `The paragraph text changes from "${initialText}" to "Choice: ${radVal}".`;
            } else {
                correctAnswer = `The paragraph text changes from "${initialText}" to "None selected".`;
            }

            distractors = [
                isChecked ? `The paragraph text changes to "None selected".` : `The paragraph text changes to "Choice: ${radVal}".`,
                `The paragraph text changes to "Choice: true".`,
                `Nothing happens because .checked is not a valid property.`
            ];
        }

    // ----------------------------------------------------
    // TYPE 2: CHECKBOX (<input type="checkbox">)
    // ----------------------------------------------------
    } else if (inputTypeIndex === 2) {
        let isChecked = Math.random() < 0.5;

        questionText = `Assuming the checkbox is currently ${isChecked ? "checked" : "UNCHECKED"} and the user clicks the button, what happens?`;

        if (isBug) {
            // Bug: Using .selected instead of .checked
            codeText = `<input type="checkbox" id="${inputId}"> Subscribe\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    if (document.getElementById("${inputId}").selected) {\n` +
                       `        document.getElementById("${pId}").innerHTML = "Subscribed";\n` +
                       `    } else {\n` +
                       `        document.getElementById("${pId}").innerHTML = "Not Subscribed";\n` +
                       `    }\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph displays "Not Subscribed" regardless of state because checkboxes use .checked (not .selected).`;
            distractors = [
                isChecked ? `The paragraph text changes to "Subscribed".` : `The paragraph text changes to "Not Subscribed".`,
                `The paragraph displays "undefined".`,
                `The checkbox automatically unchecks itself.`
            ];
        } else {
            // Valid code
            codeText = `<input type="checkbox" id="${inputId}"> Subscribe\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    let status = document.getElementById("${inputId}").checked;\n` +
                       `    document.getElementById("${pId}").innerHTML = "Checked: " + status;\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph text changes from "${initialText}" to "Checked: ${isChecked}".`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Checked: ${!isChecked}".`,
                `The paragraph text changes to "Checked: on".`,
                `The paragraph text changes to "Checked: ${inputId}".`
            ];
        }

    // ----------------------------------------------------
    // TYPE 3: SELECT & OPTION (<select><option>...</option></select>)
    // ----------------------------------------------------
    } else if (inputTypeIndex === 3) {
        let opt1 = choice(optionsList);
        let opt2 = choice(optionsList);
        while (opt2 === opt1) opt2 = choice(optionsList);

        let selectedOpt = Math.random() < 0.5 ? opt1 : opt2;

        questionText = `Assuming the user selects "${selectedOpt}" from the dropdown menu and clicks the button, what happens?`;

        if (isBug) {
            // Bug: Trying to get .innerHTML of <select> instead of .value
            codeText = `<select id="${inputId}">\n` +
                       `  <option value="${opt1}">${opt1}</option>\n` +
                       `  <option value="${opt2}">${opt2}</option>\n` +
                       `</select>\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    let choiceVal = document.getElementById("${inputId}").options;\n` +
                       `    document.getElementById("${pId}").innerHTML = choiceVal;\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph displays "[object HTMLOptionsCollection]" because .options returns an array-like object of options, not the selected value.`;