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
const radioPairsList = [["Yes", "No"], ["Standard", "Express"], ["Dark Mode", "Light Mode"], ["Option A", "Option B"]];
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
    // TYPE 1: RADIO BUTTONS (2 Radio Buttons)
    // ----------------------------------------------------
    } else if (inputTypeIndex === 1) {
        let pair = choice(radioPairsList);
        let val1 = pair[0];
        let val2 = pair[1];
        let groupName = choice(["optionGroup", "userChoice", "modeGroup", "statusSelection"]);
        
        let radId1 = choice(inputNames) + "Opt1";
        let radId2 = choice(inputNames) + "Opt2";
        while (radId2 === radId1) radId2 = choice(inputNames) + "Opt2";

        let selectedNum = Math.random() < 0.5 ? 1 : 2;
        let selectedVal = selectedNum === 1 ? val1 : val2;
        let otherVal = selectedNum === 1 ? val2 : val1;

        questionText = `Assuming the user selects "${selectedVal}" (${selectedNum === 1 ? "the first" : "the second"} radio button) and clicks the button, what happens?`;

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
                    `The paragraph text changes to "Selected: ${selectedVal}".`,
                    `The paragraph text changes to "Selected: ${otherVal}".`,
                    `Nothing happens because radio buttons cannot share the same group name.`
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
                    `The paragraph text changes to "Selected: ${selectedVal}".`,
                    `The paragraph text changes to "Selected: ${otherVal}".`,
                    `The page throws an error because .selected can only be used on checkboxes.`
                ];
            }
        } else {
            // Valid code with 2 radio buttons
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
                `The paragraph text changes from "${initialText}" to "Selected: ${otherVal}".`,
                `The paragraph text changes to "Selected: true".`,
                `The paragraph text changes to "None selected".`
            ];
        }

    // ----------------------------------------------------
    // TYPE 2: CHECKBOX (<input type="checkbox">)
    // ----------------------------------------------------
    } else if (inputTypeIndex === 2) {
        let isChecked = Math.random() < 0.5;

        questionText = `Assuming the checkbox is currently ${isChecked ? "checked" : "UNCHECKED"} and the user clicks the button, what happens?`;

        if (isBug) {
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
            let bugType = getRandomNumber(3);
            if (bugType === 0) {
                // Bug 1: Using .innerHTML on <select> instead of .value
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

                correctAnswer = `The paragraph displays the raw HTML text of the <option> tags because <select> uses .value, not .innerHTML, to get the selected choice.`;
                distractors = [
                    `The paragraph text changes to "${selectedOpt}".`,
                    `The paragraph text changes to "${opt1}".`,
                    `Nothing happens because .innerHTML cannot be used inside functions.`
                ];
            } else if (bugType === 1) {
                // Bug 2: Using .innerText on <select> instead of .value
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

                correctAnswer = `The paragraph displays all option texts combined ("${opt1} ${opt2}") because .innerText gets all text inside <select>, not just the selected choice.`;
                distractors = [
                    `The paragraph text changes to "${selectedOpt}".`,
                    `The paragraph text changes to "${opt1}".`,
                    `The paragraph text remains "${initialText}".`
                ];
            } else {
                // Bug 3: Targeting an ID placed on an <option> directly instead of reading the <select> element
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

                correctAnswer = `The paragraph always displays "Selected: ${opt1}" regardless of user selection because the code targets the first <option> tag directly instead of reading the <select> element.`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "Selected: ${selectedOpt}".`,
                    `The paragraph text changes from "${initialText}" to "Selected: ${selectedOpt === opt1 ? opt2 : opt1}".`,
                    `Nothing happens because <option> tags cannot have id attributes.`
                ];
            }
        } else {
            // Valid code
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
                `The paragraph text changes from "${initialText}" to "Selected: ${selectedOpt === opt1 ? opt2 : opt1}".`,
                `The paragraph text changes to "Selected: option".`,
                `The dropdown menu resets to the first option.`
            ];
        }

    // ----------------------------------------------------
    // TYPE 4: RANGE SLIDER (<input type="range">)
    // ----------------------------------------------------
    } else if (inputTypeIndex === 4) {
        let sliderVal = choice(["10", "25", "50", "75", "100"]);

        questionText = `Assuming the slider is set to ${sliderVal} and the user clicks the button, what happens?`;

        if (isBug) {
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
                `The paragraph text changes to "Level: ${sliderVal}".`,
                `The paragraph text changes to "Level: 50".`,
                `The slider resets to zero.`
            ];
        } else {
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
                `The paragraph text changes from "${initialText}" to "Level: 50" (ignores user sliding).`,
                `The paragraph text changes to "Level: range".`,
                `Nothing happens because range sliders require an oninput event.`
            ];
        }
    }

    // Set Question Prompt & Code Block Output
    document.getElementById("question").innerText = questionText;
    document.getElementById("output").innerText = codeText;

    // Shuffle and display choices
    currentCorrectAnswer = correctAnswer;
    let choices = [correctAnswer, ...distractors];
    choices.sort(() => Math.random() - 0.5);

    let optionsHtml = "<ol type='A'>";
    for (let opt of choices) {
        optionsHtml += `<li>${opt}</li>`;
    }
    optionsHtml += "</ol>";

    document.getElementById("optionsContainer").innerHTML = optionsHtml;

    // Reset Answer Reveal
    document.getElementById("answer").innerText = "";
    document.getElementById("answer").style.display = "none";
}

function revealAnswer() {
    const answerElement = document.getElementById("answer");
    answerElement.innerText = "Answer: " + currentCorrectAnswer;
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