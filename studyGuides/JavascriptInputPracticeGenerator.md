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
const radioPairs = [["Yes", "No"], ["Standard", "Express"], ["Dark Mode", "Light Mode"], ["Option A", "Option B"]];
const buttonTexts = ["Submit", "Apply Settings", "Check Input", "Update Display", "Save", "Process"];
const initialPTexts = ["Result: None", "Waiting for input...", "Output: Default", "Status: Pending", "Empty"];

let currentCorrectAnswer = "";

// Generate the first problem on page load
generatePractice();

function main() {
    // 1. Generate shared variables used by all question types
    let isBug = Math.random() < 0.35; // 35% chance of DOM input bug
    
    let inputId = choice(inputNames) + "Input";
    let pId = choice(inputNames) + "Text";
    while(pId === inputId) pId = choice(inputNames) + "Text";

    let btnId = choice(inputNames) + "Btn";
    let funcName = "process" + choice(["Data", "Input", "Form", "Selection"]);
    let btnText = choice(buttonTexts);
    let initialText = choice(initialPTexts);

    // Package them into an object to pass to the subroutines
    const baseConfig = { isBug, inputId, pId, btnId, funcName, btnText, initialText };

    // 2. Define and select a random subroutine
    const questionGenerators = [
        getTextTypeQuestion,
        getRadioTypeQuestion,
        getCheckboxTypeQuestion,
        getSelectTypeQuestion,
        getRangeTypeQuestion
    ];

    const generateQuestion = choice(questionGenerators);
    
    // 3. Get the question data from the selected subroutine
    const questionData = generateQuestion(baseConfig);
    let { questionText, codeText, correctAnswer, distractors } = questionData;

    // 4. Enforce the requirement that at least one choice starts with "Nothing happens because"
    const allChoices = [correctAnswer, ...distractors];
    const hasNothingHappens = allChoices.some(opt => opt.startsWith("Nothing happens because"));

    if (!hasNothingHappens) {
        distractors[0] = "Nothing happens because form input values cannot be accessed directly inside JavaScript functions.";
    }

    // 5. Update the DOM with the Prompt & Code Block
    document.getElementById("question").innerText = questionText;
    document.getElementById("output").innerText = codeText;

    // 6. Shuffle and display multiple-choice options
    currentCorrectAnswer = correctAnswer;
    const choices = [correctAnswer, ...distractors].sort(() => Math.random() - 0.5);

    let optionsHtml = "<ol type='A'>";
    for (const opt of choices) {
        optionsHtml += `<li>${opt}</li>`;
    }
    optionsHtml += "</ol>";

    document.getElementById("optionsContainer").innerHTML = optionsHtml;

    // 7. Reset Answer Reveal State
    const answerElement = document.getElementById("answer");
    answerElement.innerText = "";
    answerElement.style.display = "none";
}

// Alias for HTML button onclick handler
function generatePractice() {
    main();
}

function revealAnswer() {
    const answerElement = document.getElementById("answer");
    answerElement.innerText = "Answer: " + currentCorrectAnswer;
    answerElement.style.display = "inline";
}

// --- UTILITY FUNCTIONS ---

function getRandomNumber(max, min = 0) {
    return Math.floor(Math.random() * (max - min)) + min;
}

function choice(arr) {
    return arr[getRandomNumber(arr.length)];
}

function getTextTypeQuestion({ isBug, inputId, pId, btnId, funcName, btnText, initialText }) {
    let defaultVal = choice(["Alex", "Pixel", "Coder", "Hello", "Guest"]);
    let userTyped = choice(["Jordan", "Cyber", "Admin", "World"]);

    let questionText = `Assuming the user types "${userTyped}" into the text field and clicks the button, what happens?`;
    let codeText = "";
    let correctAnswer = "";
    let distractors = [];

    if (isBug) {
        let bugType = getRandomNumber(3);
        if (bugType === 0) {
            // Bug: .innerHTML on input
            codeText = `<input type="text" id="${inputId}" value="${defaultVal}">\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    let val = document.getElementById("${inputId}").innerHTML;\n` +
                       `    document.getElementById("${pId}").innerHTML = val;\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph displays empty/blank text because &lt;input&gt; tags use .value, not .innerHTML, to get user input.`;
            distractors = [
                `Nothing happens because .innerHTML is an invalid property for form inputs.`,
                `The paragraph text changes to "${userTyped}".`,
                `The paragraph text changes to "${defaultVal}".`
            ];
        } else if (bugType === 1) {
            // Bug: .value() function call
            codeText = `<input type="text" id="${inputId}" value="${defaultVal}">\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    let val = document.getElementById("${inputId}").value();\n` +
                       `    document.getElementById("${pId}").innerHTML = val;\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens because .value is a property, not a function, so calling value() causes a runtime error.`;
            distractors = [
                `The paragraph text changes to "${userTyped}".`,
                `The paragraph text changes to "${defaultVal}".`,
                `The input text box is cleared.`
            ];
        } else {
            // Bug: Capital .Value
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
                `Nothing happens because .Value is not recognized by JavaScript.`,
                `The paragraph text changes to "${userTyped}".`,
                `The paragraph text changes to "${defaultVal}".`
            ];
        }
    } else {
        // Valid Text Input
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
            `Nothing happens because .value cannot read user-entered text without an oninput event.`,
            `The paragraph text changes from "${initialText}" to "Hello ${defaultVal}".`,
            `The text box clears and displays "Hello ${userTyped}".`
        ];
    }

    return { questionText, codeText, correctAnswer, distractors };
}

function getCheckboxTypeQuestion({ isBug, inputId, pId, btnId, funcName, btnText, initialText }) {
    let isChecked = Math.random() < 0.5;

    let questionText = `Assuming the checkbox is currently ${isChecked ? "checked" : "UNCHECKED"} and the user clicks the button, what happens?`;
    let codeText = "";
    let correctAnswer = "";
    let distractors = [];

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
            `Nothing happens because .selected is an invalid property for &lt;input type="checkbox"&gt; elements.`,
            isChecked ? `The paragraph text changes to "Subscribed".` : `The paragraph text changes to "Not Subscribed".`,
            `The checkbox automatically unchecks itself.`
        ];
    } else {
        // Valid Checkbox
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
            `Nothing happens because .checked must be written as a function call .checked().`,
            `The paragraph text changes from "${initialText}" to "Checked: ${!isChecked}".`,
            `The paragraph text changes to "Checked: on".`
        ];
    }

    return { questionText, codeText, correctAnswer, distractors };
}

function getRadioTypeQuestion({ isBug, pId, btnId, funcName, btnText, initialText }) {
    let pair = choice(radioPairs);
    let val1 = pair[0];
    let val2 = pair[1];
    let groupName = choice(["optionGroup", "userChoice", "modeGroup", "statusSelection"]);
    
    let radId1 = choice(inputNames) + "Opt1";
    let radId2 = choice(inputNames) + "Opt2";
    while (radId2 === radId1) radId2 = choice(inputNames) + "Opt2";

    let selectedNum = Math.random() < 0.5 ? 1 : 2;
    let selectedVal = selectedNum === 1 ? val1 : val2;
    let otherVal = selectedNum === 1 ? val2 : val1;

    let questionText = `Assuming the user selects "${selectedVal}" (${selectedNum === 1 ? "the first" : "the second"} radio button) and clicks the button, what happens?`;
    let codeText = "";
    let correctAnswer = "";
    let distractors = [];

    if (isBug) {
        let bugType = getRandomNumber(2);
        if (bugType === 0) {
            // Bug: Testing .value == true instead of .checked
            codeText = `<input type="radio" name="${groupName}" id="${radId1}" value="${val1}"> ${val1}\n` +
                       `<input type="radio" name="${groupName}" id="${radId2}" value="${val2}"> ${val2}\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    if (document.getElementById("${radId1}").value == true) {\n` +
                       `        document.getElementById("${pId}").innerHTML = "Selected: ${val1}";\n` +
                       `    } else if (document.getElementById("${radId2}").value == true) {\n` +
                       `        document.getElementById("${pId}").innerHTML = "Selected: ${val2}";\n` +
                       `    } else {\n` +
                       `        document.getElementById("${pId}").innerHTML = "None selected";\n` +
                       `    }\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph displays "None selected" because .value returns a string, not a boolean true/false. It should use .checked.`;
            distractors = [
                `Nothing happens because radio buttons with the same name attribute cannot be read individually by ID.`,
                `The paragraph text changes to "Selected: ${selectedVal}".`,
                `The paragraph text changes to "Selected: ${otherVal}".`
            ];
        } else {
            // Bug: Using .selected instead of .checked
            codeText = `<input type="radio" name="${groupName}" id="${radId1}" value="${val1}"> ${val1}\n` +
                       `<input type="radio" name="${groupName}" id="${radId2}" value="${val2}"> ${val2}\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    if (document.getElementById("${radId1}").selected) {\n` +
                       `        document.getElementById("${pId}").innerHTML = "Selected: ${val1}";\n` +
                       `    } else if (document.getElementById("${radId2}").selected) {\n` +
                       `        document.getElementById("${pId}").innerHTML = "Selected: ${val2}";\n` +
                       `    } else {\n` +
                       `        document.getElementById("${pId}").innerHTML = "None selected";\n` +
                       `    }\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph displays "None selected" because radio buttons use .checked, not .selected.`;
            distractors = [
                `Nothing happens because .selected throws a runtime error on &lt;input type="radio"&gt; elements.`,
                `The paragraph text changes to "Selected: ${selectedVal}".`,
                `The paragraph text changes to "Selected: ${otherVal}".`
            ];
        }
    } else {
        // Valid 2 Radio Buttons
        codeText = `<input type="radio" name="${groupName}" id="${radId1}" value="${val1}"> ${val1}\n` +
                   `<input type="radio" name="${groupName}" id="${radId2}" value="${val2}"> ${val2}\n` +
                   `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                   `<p id="${pId}">${initialText}</p>\n` +
                   `<script>\n` +
                   `function ${funcName}() {\n` +
                   `    if (document.getElementById("${radId1}").checked) {\n` +
                   `        document.getElementById("${pId}").innerHTML = "Selected: " + document.getElementById("${radId1}").value;\n` +
                   `    } else if (document.getElementById("${radId2}").checked) {\n` +
                   `        document.getElementById("${pId}").innerHTML = "Selected: " + document.getElementById("${radId2}").value;\n` +
                   `    } else {\n` +
                   `        document.getElementById("${pId}").innerHTML = "None selected";\n` +
                   `    }\n` +
                   `}\n` +
                   `<\/script>`;

        correctAnswer = `The paragraph text changes from "${initialText}" to "Selected: ${selectedVal}".`;
        distractors = [
            `Nothing happens because &lt;input type="radio"&gt; elements require an onchange attribute instead of an onclick attribute on the button.`,
            `The paragraph text changes from "${initialText}" to "Selected: ${otherVal}".`,
            `The paragraph text changes to "None selected".`
        ];
    }

    return { questionText, codeText, correctAnswer, distractors };
}

function getSelectTypeQuestion({ isBug, inputId, pId, btnId, funcName, btnText, initialText }) {
    let opt1 = choice(optionsList);
    let opt2 = choice(optionsList);
    while (opt2 === opt1) opt2 = choice(optionsList);

    let selectedOpt = Math.random() < 0.5 ? opt1 : opt2;

    let questionText = `Assuming the user selects "${selectedOpt}" from the dropdown menu and clicks the button, what happens?`;
    let codeText = "";
    let correctAnswer = "";
    let distractors = [];

    if (isBug) {
        let bugType = getRandomNumber(3);
        if (bugType === 0) {
            // Bug 1: .innerHTML on <select>
            codeText = `<select id="${inputId}">\n` +
                       `  <option value="${opt1}">${opt1}</option>\n` +
                       `  <option value="${opt2}">${opt2}</option>\n` +
                       `</select>\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    let choiceVal = document.getElementById("${inputId}").innerHTML;\n` +
                       `    document.getElementById("${pId}").innerHTML = choiceVal;\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph displays the raw HTML text of the &lt;option&gt; tags because &lt;select&gt; uses .value, not .innerHTML, to get the selected choice.`;
            distractors = [
                `Nothing happens because dropdown menus do not support the .innerHTML property.`,
                `The paragraph text changes to "${selectedOpt}".`,
                `The paragraph text changes to "${opt1}".`
            ];
        } else if (bugType === 1) {
            // Bug 2: .innerText on <select>
            codeText = `<select id="${inputId}">\n` +
                       `  <option value="${opt1}">${opt1}</option>\n` +
                       `  <option value="${opt2}">${opt2}</option>\n` +
                       `</select>\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    let choiceVal = document.getElementById("${inputId}").innerText;\n` +
                       `    document.getElementById("${pId}").innerHTML = choiceVal;\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph displays all option texts combined ("${opt1} ${opt2}") because .innerText gets all text inside &lt;select&gt;, not just the selected choice.`;
            distractors = [
                `Nothing happens because .innerText is not supported on &lt;select&gt; elements.`,
                `The paragraph text changes to "${selectedOpt}".`,
                `The paragraph text changes to "${opt1}".`
            ];
        } else {
            // Bug 3: Target ID directly on option tag
            let opt1Id = choice(inputNames) + "Opt1";
            codeText = `<select id="${inputId}">\n` +
                       `  <option id="${opt1Id}" value="${opt1}">${opt1}</option>\n` +
                       `  <option value="${opt2}">${opt2}</option>\n` +
                       `</select>\n` +
                       `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${funcName}() {\n` +
                       `    let choiceVal = document.getElementById("${opt1Id}").value;\n` +
                       `    document.getElementById("${pId}").innerHTML = "Selected: " + choiceVal;\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `The paragraph always displays "Selected: ${opt1}" regardless of user selection because the code targets the first &lt;option&gt; tag directly instead of reading the &lt;select&gt; element.`;
            distractors = [
                `Nothing happens because &lt;option&gt; elements cannot be selected with getElementById.`,
                `The paragraph text changes from "${initialText}" to "Selected: ${selectedOpt}".`,
                `The paragraph text changes from "${initialText}" to "Selected: ${selectedOpt === opt1 ? opt2 : opt1}".`
            ];
        }
    } else {
        // Valid Select
        codeText = `<select id="${inputId}">\n` +
                   `  <option value="${opt1}">${opt1}</option>\n` +
                   `  <option value="${opt2}">${opt2}</option>\n` +
                   `</select>\n` +
                   `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                   `<p id="${pId}">${initialText}</p>\n` +
                   `<script>\n` +
                   `function ${funcName}() {\n` +
                   `    let choiceVal = document.getElementById("${inputId}").value;\n` +
                   `    document.getElementById("${pId}").innerHTML = "Selected: " + choiceVal;\n` +
                   `}\n` +
                   `<\/script>`;

        correctAnswer = `The paragraph text changes from "${initialText}" to "Selected: ${selectedOpt}".`;
        distractors = [
            `Nothing happens because &lt;select&gt; elements require an onchange listener instead of an onclick button.`,
            `The paragraph text changes from "${initialText}" to "Selected: ${selectedOpt === opt1 ? opt2 : opt1}".`,
            `The dropdown menu resets to the first option.`
        ];
    }

    return { questionText, codeText, correctAnswer, distractors };
}

function getRangeTypeQuestion({ isBug, inputId, pId, btnId, funcName, btnText, initialText }) {
    let sliderVal = choice(["10", "25", "50", "75", "100"]);

    let questionText = `Assuming the slider is set to ${sliderVal} and the user clicks the button, what happens?`;
    let codeText = "";
    let correctAnswer = "";
    let distractors = [];

    if (isBug) {
        // Bug: .innerHTML on range input instead of .value
        codeText = `<input type="range" id="${inputId}" min="0" max="100" value="50">\n` +
                   `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                   `<p id="${pId}">${initialText}</p>\n` +
                   `<script>\n` +
                   `function ${funcName}() {\n` +
                   `    let val = document.getElementById("${inputId}").innerHTML;\n` +
                   `    document.getElementById("${pId}").innerHTML = "Level: " + val;\n` +
                   `}\n` +
                   `<\/script>`;

        correctAnswer = `The paragraph displays "Level: " (with nothing after it) because range inputs use .value, not .innerHTML.`;
        distractors = [
            `Nothing happens because &lt;input type="range"&gt; elements do not support JavaScript properties.`,
            `The paragraph text changes to "Level: ${sliderVal}".`,
            `The paragraph text changes to "Level: 50".`
        ];
    } else {
        // Valid Range Input
        codeText = `<input type="range" id="${inputId}" min="0" max="100" value="50">\n` +
                   `<button id="${btnId}" onclick="${funcName}()">${btnText}</button>\n` +
                   `<p id="${pId}">${initialText}</p>\n` +
                   `<script>\n` +
                   `function ${funcName}() {\n` +
                   `    let val = document.getElementById("${inputId}").value;\n` +
                   `    document.getElementById("${pId}").innerHTML = "Level: " + val;\n` +
                   `}\n` +
                   `<\/script>`;

        correctAnswer = `The paragraph text changes from "${initialText}" to "Level: ${sliderVal}".`;
        distractors = [
            `Nothing happens because &lt;input type="range"&gt; sliders only respond to oninput events, not button clicks.`,
            `The paragraph text changes from "${initialText}" to "Level: 50" (ignores user sliding).`,
            `The slider value resets to 0.`
        ];
    }

    return { questionText, codeText, correctAnswer, distractors };
}

</script>