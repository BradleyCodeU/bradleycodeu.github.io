---
layout: project
category: arrays
title: JS Array Methods Generator
---

<button onclick="generatePractice()">Generate Array Methods Practice</button>
<p id="question"></p>
<pre id="output"></pre>
<table>
    <tr>
        <td><button onclick="revealAnswer()">Reveal Answer</button></td>
        <td><span id="answerSpan" style="display:none;"></span></td>
    </tr>
</table>


<script>
let exerciseNumber;
let indexOne;
let indexTwo;
let indexThree;
let indexFour;
//let indexOneValue, indexTwoValue;
let ml = [];
//let nums = ml;
// let myList = ml;
// let myArr = ml;
// let myNums = ml;
// let nmbrs = ml;
// let numLst = ml;
// let numbList = ml;
// let NmbrLst = ml;
// let ListA = ml;
let answer;

generatePractice();

function generatePractice() {
    exerciseNumber = 1;
    const answerElement = document.getElementById("answerSpan");
    answerElement.style.display = "none";
    let question = "What ";
    const actions = ["will", "does", "would", "might", "number will", "number does"];
    const targets = ["this code", "the following", "the following code", "the following program", "this", "this program", "this algorithm"];
    const verbs = ["print", "display", "output", "produce", "end up showing"];
    question += choice(actions) + " ";
    question += choice(targets) + " ";
    question += choice(verbs) + "?\n\n";
    let result = "";
    const varA = chooseVariableName();
    const varBOptions = ["index", "item", "idNum", "position", "val", "location", "loc", "pos", "counter", "address", "foo"];
    const varB = varBOptions[Math.floor(Math.random() * varBOptions.length)];

    // =-=-=-=-=-=-=- exercise type 0, push method
    if(exerciseNumber == 0){
        ml = [getRandomNumber(4)];
        ml.push(getRandomNumber(4));
        //ml.sort(() => Math.random() - 0.5); // shuffle array
        // nums = ml;
        // myList = ml;
        // myArr = ml;
        // myNums = ml;
        // nmbrs = ml;
        // numLst = ml;
        // numbList = ml;
        // NmbrLst = ml;
        // ListA = ml;
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
        ml.push(getRandomNumber(7));
        ml.push(getRandomNumber(4));
        result += "" + varA + ".push(" + JSON.stringify(ml[2]) + ");\n";
        result += "" + varA + ".push(" + JSON.stringify(ml[3]) + ");\n";
        
        
        indexOne = getRandomNumber(ml.length);
        indexTwo = getRandomNumber(ml.length,2);
        
        if (getRandomNumber(2)) {
            
               
                    indexOne = getRandomNumber(ml.length);
                    indexTwo = getRandomNumber(ml.length);
                
                result += "let " + varB + " = " + varA + "[" + indexOne + "] + " + varA + "[" + indexTwo + "];\n";
                indexFour = ml[indexOne] + ml[indexTwo];
            } else {
                while (indexOne === indexTwo) {
                    indexOne = getRandomNumber(ml.length);
                    indexTwo = getRandomNumber(ml.length);
                }
                 if(ml[indexOne] > ml[indexTwo]){
                    result += "let " + varB + " = " + varA + "[" + indexOne + "] - " + varA + "[" + indexTwo + "];\n";
                    indexFour = ml[indexOne] - ml[indexTwo];
                }else{
                    result += "let " + varB + " = " + varA + "[" + indexTwo + "] - " + varA + "[" + indexOne + "];\n";
                    indexFour = ml[indexTwo] - ml[indexOne];
                }
            
        } 
        ml.push(getRandomNumber(7));
        ml.push(getRandomNumber(4));
        
        
        
    }
    // =-=-=-=-=-=-=- exercise type 1, splice method to delete
    if(exerciseNumber == 1){
        ml = [getRandomNumber(7),getRandomNumber(4),getRandomNumber(7),getRandomNumber(4),getRandomNumber(7),getRandomNumber(4)];
        
        //ml.sort(() => Math.random() - 0.5); // shuffle array
        // nums = ml;
        // myList = ml;
        // myArr = ml;
        // myNums = ml;
        // nmbrs = ml;
        // numLst = ml;
        // numbList = ml;
        // NmbrLst = ml;
        // ListA = ml;
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
        let tempValue = getRandomNumber(2);
        let tempAmount = getRandomNumber(3,1);
        result += "" + varA + ".splice(" + tempValue + ", "+tempAmount+");\n";
        ml.splice(tempValue, tempAmount);

        
        
        indexOne = getRandomNumber(ml.length);
        indexTwo = getRandomNumber(ml.length,2);
        
        if (getRandomNumber(2)) {
            
               
                indexOne = getRandomNumber(ml.length);
                indexTwo = getRandomNumber(ml.length,2);
                
                result += "let " + varB + " = " + varA + "[" + indexOne + "] + " + varA + "[" + indexTwo + "];\n";
                indexFour = ml[indexOne] + ml[indexTwo];
            } else {
                while (indexOne === indexTwo) {
                    indexOne = getRandomNumber(ml.length);
                    indexTwo = getRandomNumber(ml.length);
                }
                 if(ml[indexOne] > ml[indexTwo]){
                    result += "let " + varB + " = " + varA + "[" + indexOne + "] - " + varA + "[" + indexTwo + "];\n";
                    indexFour = ml[indexOne] - ml[indexTwo];
                }else{
                    result += "let " + varB + " = " + varA + "[" + indexTwo + "] - " + varA + "[" + indexOne + "];\n";
                    indexFour = ml[indexTwo] - ml[indexOne];
                }
            
        } 
        tempValue = getRandomNumber(2);
        tempAmount = getRandomNumber(3,1);
        result += "" + varA + ".splice(" + tempValue + ", "+tempAmount+");\n";
        ml.splice(tempValue, tempAmount);
        ml.push(getRandomNumber(7));
        ml.push(getRandomNumber(4));
        
        
        
    }
    result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 2]) + ");\n";
    result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 1]) + ");\n";
    indexThree = getRandomNumber(ml.length, 4);
    result += "" + varB + " += " + varA + "[" + indexThree + "];\n";
    indexFour = indexFour + ml[indexThree];
    answer = ml[indexFour];
    if(answer === undefined){
      generatePractice()
    } else {
      result += "alert(" + varA + "[" + varB + "]);";
      document.getElementById("question").innerText = question;
      document.getElementById("output").innerText = result;
      document.getElementById("answerSpan").innerText = "";
      document.getElementById("answerSpan").style.display = "none";
    }
    
    
}
function revealAnswer() {
            const answerElement = document.getElementById("answerSpan");
            answerElement.innerText = "Answer: " + answer;
            answerElement.style.display = "block";
}





function getRandomNumber(max, min = 0) {
    return Math.floor(Math.random() * (max - min)) + min;
}

function choice(arr) {
    return arr[getRandomNumber(arr.length)];
}

function chooseVariableName() {
    const prefixes = ["nums", "myList", "myArr", "myNums", "nmbrs", "numLst", "numbList", "NmbrLst", "ListA"];
    return prefixes[getRandomNumber(prefixes.length)];
}
</script>
<br>
<hr>
<br>

