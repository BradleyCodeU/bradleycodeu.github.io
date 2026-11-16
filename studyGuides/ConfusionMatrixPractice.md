---
layout: project
category: ai-machine-learning
title: Confusion Matrix Practice Generator
---

<button onclick="generatePractice()">Generate Confusion Matrix Practice</button>
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
const domains = [
    {
        job: "A computer vision model for self-driving cars",
        totalUnit: "road sign images",
        task: "attempts to detect stop signs",
        target: "stop sign detection",
        posText: (n) => `${n} actual stop signs were correctly detected (True Positives)`,
        fnText: (n) => `${n} actual stop signs were missed (False Negatives)`,
        fpText: (n) => `${n} yield signs were mistakenly flagged as stop signs (False Positives)`,
        tnText: (n) => `${n} yield signs were correctly identified as non-stop signs (True Negatives)`
    },
    {
        job: "A medical screening AI",
        totalUnit: "patients for a disease",
        task: "tries to detect illness",
        target: "the AI model",
        posText: (n) => `${n} sick patients correctly diagnosed as sick (True Positives)`,
        fnText: (n) => `${n} sick patients wrongly diagnosed as not sick (False Negatives)`,
        fpText: (n) => `${n} healthy patients misdiagnosed as sick (False Positives)`,
        tnText: (n) => `${n} healthy patients correctly marked not sick (True Negatives)`
    },
    {
        job: "An email spam filter AI",
        totalUnit: "incoming emails",
        task: "tries to flag unwanted spam",
        target: "spam detection",
        posText: (n) => `${n} spam emails correctly flagged as spam (True Positives)`,
        fnText: (n) => `${n} spam emails missed and sent to inbox (False Negatives)`,
        fpText: (n) => `${n} good emails wrongfully flagged as spam (False Positives)`,
        tnText: (n) => `${n} good emails correctly delivered to inbox (True Negatives)`
    },
    {
        job: "A dog identification app",
        totalUnit: "photos",
        task: "attempts to find dogs in the images",
        target: "the dog identification system",
        posText: (n) => `${n} dog photos correctly identified as dogs (True Positives)`,
        fnText: (n) => `${n} dog photos incorrectly labeled as non-dogs (False Negatives)`,
        fpText: (n) => `${n} cat photos mistakenly labeled as dogs (False Positives)`,
        tnText: (n) => `${n} cat photos correctly identified as non-dogs (True Negatives)`
    },
    {
        job: "An automated plagiarism detector",
        totalUnit: "student essays",
        task: "tries to find plagiarized text",
        target: "the plagiarism detector",
        posText: (n) => `${n} plagiarized essays correctly flagged (True Positives)`,
        fnText: (n) => `${n} plagiarized essays missed by the system (False Negatives)`,
        fpText: (n) => `${n} original essays wrongfully flagged as plagiarized (False Positives)`,
        tnText: (n) => `${n} original essays correctly marked as original (True Negatives)`
    },
    {
        job: "A facial recognition security system",
        totalUnit: "people entering a building",
        task: "authorizes registered staff",
        target: "the facial recognition system",
        posText: (n) => `${n} authorized employees correctly identified (True Positives)`,
        fnText: (n) => `${n} authorized employees wrongfully denied entry (False Negatives)`,
        fpText: (n) => `${n} unauthorized visitors incorrectly granted access (False Positives)`,
        tnText: (n) => `${n} unauthorized visitors correctly blocked (True Negatives)`
    },
    {
        job: "A birdsong identification system",
        totalUnit: "audio recordings of animal sounds",
        task: "tries to identify that a bird is singing",
        target: "the birdsong recognition system",
        posText: (n) => `${n} birdsongs correctly identified (True Positives)`,
        fnText: (n) => `${n} birdsongs not marked as "birdsong" (False Negatives)`,
        fpText: (n) => `${n} squirrel sounds incorrectly marked as a bird (False Positives)`,
        tnText: (n) => `${n} squirrel sounds correctly not marked as "birdsong" (True Negatives)`
    },
];

const metrics = ["Precision", "Recall", "Specificity", "Accuracy"];

let currentCorrectAnswer = "";

// Generate the first problem on page load
generatePractice();

function main() {
    // 1. Select a random domain and metric
    const domain = choice(domains);
    const metric = choice(metrics);

    // 2. Generate unique TP, TN, FP, FN values
    let tp, tn, fp, fn;
    do {
        tp = getRandomNumber(20, 80);
        tn = getRandomNumber(20, 80);
        fp = getRandomNumber(2, 25);
        fn = getRandomNumber(2, 25);
    } while (new Set([tp, tn, fp, fn]).size !== 4); // Guarantees all 4 values are strictly unique

    const total = tp + tn + fp + fn;

    // 3. Build data lines and shuffle their display order
    const dataBullets = [
        domain.posText(tp),
        domain.fnText(fn),
        domain.fpText(fp),
        domain.tnText(tn)
    ];
    shuffle(dataBullets);

    // 4. Construct Question Prompt and Output Text
    let questionText = `${domain.job} evaluates ${total} ${domain.totalUnit}${domain.task ? " and " + domain.task : ""}:`;
    
    let codeText = dataBullets.join("\n");

    let questionCall = metric === "Accuracy" 
        ? `How do you calculate the ${metric} for ${domain.target}?` 
        : `What is the ${metric} of ${domain.target}?`;

    // 5. Calculate Correct Answer and Distractors based on metric formula
    let correctAnswer = "";
    let distractors = [];

    if (metric === "Precision") {
        correctAnswer = `${tp} / (${tp} + ${fp})`;
        distractors = [
            `${tp} / (${tp} + ${fn})`,
            `${tn} / (${tn} + ${fp})`,
            `(${tp} + ${tn}) / ${total}`
        ];
    } else if (metric === "Recall") {
        correctAnswer = `${tp} / (${tp} + ${fn})`;
        distractors = [
            `${tp} / (${tp} + ${fp})`,
            `${tn} / (${tn} + ${fp})`,
            `${tp} / ${total}`
        ];
    } else if (metric === "Specificity") {
        correctAnswer = `${tn} / (${tn} + ${fp})`;
        distractors = [
            `${tn} / (${tn} + ${fn})`,
            `${tp} / (${tp} + ${fp})`,
            `${tp} / (${tp} + ${fn})`
        ];
    } else { // Accuracy
        correctAnswer = `(${tp} + ${tn}) / ${total}`;
        distractors = [
            `${tp} / ${total}`,
            `${tp} / (${tp} + ${fp})`,
            `${tn} / (${tn} + ${fp})`
        ];
    }

    // 6. Update the DOM with Question, Scenario Text, and Options
    document.getElementById("question").innerText = questionText;
    document.getElementById("output").innerText = codeText + "\n\n" + questionCall;

    currentCorrectAnswer = correctAnswer;
    const choices = [correctAnswer, ...distractors];
    shuffle(choices);

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

function getRandomNumber(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

function choice(arr) {
    return arr[Math.floor(Math.random() * arr.length)];
}

function shuffle(arr) {
    for (let i = arr.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [arr[i], arr[j]] = [arr[j], arr[i]];
    }
    return arr;
}
</script>