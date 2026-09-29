---
layout: project
category: dom-events
title: JS Function Practice Generator
---

<button onclick="generatePractice()">Generate Event Practice</button>
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
const words = ["apple", "banana", "cherry", "lemon", "widget", "gadget", "box", "foo", "foobar", "baz", "queen", "bear", "cat", "dog", "eagle", "fox", "koala", "lion", "moose", "otter", "panda", "shark", "tiger", "vulture", "wolf", "yak", "zebra", "coconut", "dragonfruit",  "elderberry", "fig", "grape", "honeydew", "kiwi", "mango", "nectarine", "orange", "papaya", "raspberry", "strawberry", "tangerine", "watermelon", "zucchini"];
const colors = ["purple", "blue", "red", "green", "orange", "pink", "yellow", "violet", "brown"];
const buttonTexts = ["Click Here!", "Submit", "Start Game", "Tap Me", "Run Code", "Claim Prize", "Go", "Begin", "Start", "Wow", "Launch", "Blast Off", "Eject", "Lift Off", "Purchase", "Update", "Quit", "Stop", "Forward"];
const initialPTexts = ["50", "Waiting...", "Status: Off", "100 HP", "Hello World", "Ready", "All Set", "Prepared", "Systems Ready", "In Position", "0 Points", "Loading", "Charged", "Charging", "Hello There", "67"];

let currentCorrectAnswer = "";

generatePractice();

function generatePractice() {
    let isFunctionOrderFlipped = Math.random() < 0.5;
    let btnId = choice(words) + "Btn";
    let pId = choice(words) + "Text";
    while(pId === btnId) pId = choice(words) + "Text";

    let func1 = choice(words) + "Fun";
    let func2 = choice(words) + "Fun";
    while(func2 === func1) func2 = choice(words) + "Fun";

    let btnText = choice(buttonTexts);
    let initialText = choice(initialPTexts);

    let questionText = "What happens when the user clicks on this button?";
    
    // 25% chance of a "Nothing happens" bug
    let isBug = Math.random() < 0.25; 

    let codeText = "";
    let correctAnswer = "";
    let distractors = [];

    if (isBug) {
        let bugType = getRandomNumber(11);
        if (bugType === 0) {
            // Bug: Mismatched function name
            let wrongFunc = choice(words) + "Action";
            codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${wrongFunc}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Updated!";\n` +
                       `}\n` +
                       `function ${func2}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Changed!";\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens because the onclick attribute calls ${func1}(), but that function is not defined.`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Updated!".`,
                `The paragraph text changes from "${initialText}" to "Changed!".`,
                `The button text changes to "${func1}()".`
            ];
        } else if (bugType === 1) {
            // Bug: Case sensitivity mismatch
            let badId = pId.toLowerCase();
            if (badId === pId) badId = pId.toUpperCase();
            
            codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${func1}() {\n` +
                       `    document.getElementById("${badId}").innerHTML = "Updated!";\n` +
                       `}\n` +
                       `function ${func2}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Changed!";\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens because JavaScript is case-sensitive, so '${badId}' does not match the element ID '${pId}'.`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Updated!".`,
                `The paragraph text changes from "${initialText}" to "Changed!".`,
                `The button text changes from "${btnText}" to "Updated!".`
            ];
        } else if (bugType === 2) {
            // Bug: Non-existent ID target
            let fakeId = choice(words) + "Missing";
            codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${func1}() {\n` +
                       `    document.getElementById("${fakeId}").innerHTML = "Updated!";\n` +
                       `}\n` +
                       `function ${func2}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Changed!";\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens because there is no element on the page with the ID '${fakeId}'.`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Updated!".`,
                `The paragraph text changes from "${initialText}" to "Changed!".`,
                `A new paragraph with ID '${fakeId}' is automatically created.`
            ];
        } else if (bugType === 4) {
            // Bug: Invalid HTML event attribute
            let invalidAttr = choice(["onpressing", "onmouseclickit", "onpressit", "press", "pressit", "pressing", "clicking", "onmouseclicking", "clicked", "pressed", "tapped", "clickit"]);
            codeText = `<button id="${btnId}" ${invalidAttr}="${func1}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${func1}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Updated!";\n` +
                       `}\n` +
                       `function ${func2}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Changed!";\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens because '${invalidAttr}' is not a valid HTML click event attribute. It should be 'onclick'`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Updated!".`,
                `The paragraph text changes from "${initialText}" to "Changed!".`,
                `The button text changes to "Updated!".`
            ];
        } else if (bugType === 5) {
            // Bug: Invalid style attribute
            let invalidAttr = choice(["font-size", "font_size", "textSize"]);
            codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${func1}() {\n` +
                       `    document.getElementById("${pId}").style.${invalidAttr} = "30 px";\n` +
                       `}\n` +
                       `function ${func2}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Changed!";\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens because '${invalidAttr}' is not a valid style attribute. It should be 'fontSize'`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Updated!".`,
                `The paragraph text changes from "${initialText}" to "Changed!".`,
                `The button text changes to "Updated!".`
            ];
        } else if (bugType === 6) {
            // Bug: Incorrect DOM property casing (innerhtml instead of innerHTML)
            codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${func1}() {\n` +
                       `    document.getElementById("${pId}").innerhtml = "Updated!";\n` +
                       `}\n` +
                       `function ${func2}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Changed!";\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens because 'innerhtml' should be 'innerHTML'`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Updated!".`,
                `The paragraph text changes from "${initialText}" to "Changed!".`,
                `The button text changes to "Updated!".`
            ];
        } else if (bugType === 7) {
            // Bug: Missing 'document.' prefix before getElementById
            codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${func1}() {\n` +
                       `    getElementById("${pId}").innerHTML = "Updated!";\n` +
                       `}\n` +
                       `function ${func2}() {\n` +
                       `    getElementById("${pId}").innerHTML = "Changed!";\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens because 'getElementById' must be called on the 'document' object.`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Updated!".`,
                `The paragraph text changes from "${initialText}" to "Changed!".`,
                `An alert box appears displaying "${initialText}".`
            ];
        } else if (bugType === 8) {
            // Bug: Unquoted string value (treats string as undefined variable)
            let color = choice(colors);
            codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${func1}() {\n` +
                       `    document.getElementById("${btnId}").style.backgroundColor = ${color};\n` +
                       `}\n` +
                       `function ${func2}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Changed!";\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens because '${color}' is not in quotes, causing JavaScript to treat it as an undefined variable.`;
            distractors = [
                `The button's background color changes to ${color}.`,
                `The paragraph text changes from "${initialText}" to "Changed!".`,
                `The button text changes to "${color}".`
            ];
        } else if (bugType === 9) {
            // Bug: Missing function parentheses in HTML onclick attribute
            codeText = `<button id="${btnId}" onclick="${func1}">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${func1}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Updated!";\n` +
                       `}\n` +
                       `function ${func2}() {\n` +
                       `    document.getElementById("${pId}").innerHTML = "Changed!";\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens because the onclick attribute is missing parentheses '()' needed to call the function.`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Updated!".`,
                `The paragraph text changes from "${initialText}" to "Changed!".`,
                `The button text changes to "${func1}".`
            ];
        } else if (bugType === 10) {
            // Bug: Setting .onclick on a paragraph element instead of .innerHTML
            codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                       `<p id="${pId}">${initialText}</p>\n` +
                       `<script>\n` +
                       `function ${func1}() {\n` +
                       `    document.getElementById("${pId}").text = "Updated!";\n` +
                       `}\n` +
                       `function ${func2}() {\n` +
                       `    document.getElementById("${pId}").text = "Changed!";\n` +
                       `}\n` +
                       `<\/script>`;

            correctAnswer = `Nothing happens visually because paragraph tags do not display a 'text' property. It should be 'innerHTML'`;
            distractors = [
                `The paragraph text changes from "${initialText}" to "Updated!".`,
                `The paragraph text changes from "${initialText}" to "Changed!".`,
                `The paragraph is replaced with an input text box.`
            ];
        }
    } else {
        // 75% chance: Something happens
        let actionType = getRandomNumber(6);
        if(isFunctionOrderFlipped){
            
            if (actionType === 0) {
                // Action 1: Change paragraph innerHTML
                let newVal = choice(["100", "50", "Completed!", "Success!", "999"]);
                let decoyVal = choice(["0", "Error!", "Failed", "10"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${newVal}";\n` +
                        `}\n` +
                        
                        `<\/script>`;

                correctAnswer = `The paragraph text changes from "${initialText}" to "${newVal}".`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "${decoyVal}".`,
                    `Nothing happens because ${func1}() is defined after ${func2}().`,
                    `The button text changes to "${newVal}".`
                ];
            }
            else if (actionType === 1) {
                // Action 2: Change button innerHTML
                let color = choice(colors);
                let decoyVal = choice(["0", "Updated", "Done"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${btnId}").innerHTML = "${color}";\n` +
                        `}\n` +
                        
                        `<\/script>`;

                correctAnswer = `The button's text changes to say "${color}"`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "${decoyVal}".`,
                    `The button background changes to ${color} AND paragraph text changes to "${decoyVal}".`,
                    `Nothing happens because ${func2}() was not called by the button.`
                ];
            } else if (actionType === 2) {
                // Action 2: Change button background color
                let color = choice(colors);
                let decoyVal = choice(["0", "Updated", "Done"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${btnId}").style.backgroundColor = "${color}";\n` +
                        `}\n` +
                        
                        `<\/script>`;

                correctAnswer = `The button's background color changes to ${color}.`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "${decoyVal}".`,
                    `The button background changes to ${color} AND paragraph text changes to "${decoyVal}".`,
                    `Nothing happens because ${func2}() was not called by the button.`
                ];
            } else if (actionType === 3) {
                // Action 2: Change para background color
                let color = choice(colors);
                let decoyVal = choice(["0", "Updated", "Done"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${btnId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${pId}").style.backgroundColor = "${color}";\n` +
                        `}\n` +
                        
                        `<\/script>`;

                correctAnswer = `The paragraph's background color changes to ${color}.`;
                distractors = [
                    `The button text changes from "${btnText}" to "${decoyVal}".`,
                    `The button background changes to ${color} AND paragraph text changes to "${decoyVal}".`,
                    `Nothing happens because ${func2}() was not called by the button.`
                ];
            } else if (actionType === 4) {
                // Action 3: Hide paragraph element
                let decoyVal = choice(["Hidden", "Disabled", "0"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${pId}").style.visibility = "hidden";\n` +
                        `}\n` +
                        
                        `<\/script>`;

                correctAnswer = `The paragraph element becomes hidden on the page.`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "${decoyVal}".`,
                    `The button becomes hidden on the page.`,
                    `Nothing happens because visibility is not a valid CSS property.`
                ];
            } else if (actionType === 5) {
                // Action 3: Hide button element
                let decoyVal = choice(["Hidden", "Disabled", "hide"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${btnId}").style.display = "none";\n` +
                        `}\n` +
                        
                        `<\/script>`;

                correctAnswer = `The button element is hidden.`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "${decoyVal}".`,
                    `The paragraph element becomes hidden on the page.`,
                    `Nothing happens because visibility is not a valid CSS property.`
                ];
            }
        }
        else {
            // function order is NOT flipped
            if (actionType === 0) {
                // Action 1: Change paragraph innerHTML
                let newVal = choice(["100", "50", "Completed!", "Success!", "999"]);
                let decoyVal = choice(["0", "Error!", "Failed", "10"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${newVal}";\n` +
                        `}\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        
                        
                        `<\/script>`;

                correctAnswer = `The paragraph text changes from "${initialText}" to "${newVal}".`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "${decoyVal}".`,
                    `Nothing happens because ${func1}() is defined after ${func2}().`,
                    `The button text changes to "${newVal}".`
                ];
            }
            else if (actionType === 1) {
                // Action 2: Change button innerHTML
                let color = choice(colors);
                let decoyVal = choice(["0", "Updated", "Done"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${btnId}").innerHTML = "${color}";\n` +
                        `}\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        
                        
                        `<\/script>`;

                correctAnswer = `The button's text changes to say "${color}"`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "${decoyVal}".`,
                    `The button background changes to ${color} AND paragraph text changes to "${decoyVal}".`,
                    `Nothing happens because ${func2}() was not called by the button.`
                ];
            } else if (actionType === 2) {
                // Action 2: Change button background color
                let color = choice(colors);
                let decoyVal = choice(["0", "Updated", "Done"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${btnId}").style.backgroundColor = "${color}";\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        
                        `}\n` +
                        
                        `<\/script>`;

                correctAnswer = `The button's background color changes to ${color}.`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "${decoyVal}".`,
                    `The button background changes to ${color} AND paragraph text changes to "${decoyVal}".`,
                    `Nothing happens because ${func2}() was not called by the button.`
                ];
            } else if (actionType === 3) {
                // Action 2: Change para background color
                let color = choice(colors);
                let decoyVal = choice(["0", "Updated", "Done"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${pId}").style.backgroundColor = "${color}";\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${btnId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        
                        `}\n` +
                        
                        `<\/script>`;

                correctAnswer = `The paragraph's background color changes to ${color}.`;
                distractors = [
                    `The button text changes from "${btnText}" to "${decoyVal}".`,
                    `The button background changes to ${color} AND paragraph text changes to "${decoyVal}".`,
                    `Nothing happens because ${func2}() was not called by the button.`
                ];
            } else if (actionType === 4) {
                // Action 3: Hide paragraph element
                let decoyVal = choice(["Hidden", "Disabled", "0"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${pId}").style.visibility = "hidden";\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        
                        `}\n` +
                        
                        `<\/script>`;

                correctAnswer = `The paragraph element becomes hidden on the page.`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "${decoyVal}".`,
                    `The button becomes hidden on the page.`,
                    `Nothing happens because visibility is not a valid CSS property.`
                ];
            } else if (actionType === 5) {
                // Action 3: Hide button element
                let decoyVal = choice(["Hidden", "Disabled", "hide"]);
                codeText = `<button id="${btnId}" onclick="${func1}()">${btnText}</button>\n` +
                        `<p id="${pId}">${initialText}</p>\n` +
                        `<script>\n` +
                        `function ${func1}() {\n` +
                        `    document.getElementById("${btnId}").style.display = "none";\n` +
                        `}\n` +
                        `function ${func2}() {\n` +
                        `    document.getElementById("${pId}").innerHTML = "${decoyVal}";\n` +
                        `}\n` +
                        
                        
                        `<\/script>`;

                correctAnswer = `The button element is hidden.`;
                distractors = [
                    `The paragraph text changes from "${initialText}" to "${decoyVal}".`,
                    `The paragraph element becomes hidden on the page.`,
                    `Nothing happens because visibility is not a valid CSS property.`
                ];
            }
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