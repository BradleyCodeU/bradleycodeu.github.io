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
    exerciseNumber = Math.max(getRandomNumber(5),getRandomNumber(5));
    //exerciseNumber = 1;
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
    const varBOptions = ["index", "item", "idNum", "position", "val", "location", "loc", "pos", "counter", "address", "foo", "foobar", "temp", "indexA", "indexB", "indexC", "selected", "pick"];
    const varB = varBOptions[Math.floor(Math.random() * varBOptions.length)];

    // =-=-=-=-=-=-=- exercise type 0, push method
    if(exerciseNumber == 0){
        ml = [getRandomNumber(4)];
        for(let i=0; i< getRandomNumber(3,1); i++){
          ml.push(getRandomNumber(4));
        }
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
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
        
        ml.push(getRandomNumber(7));
        ml.push(getRandomNumber(4));
        result += "" + varA + ".push(" + JSON.stringify(ml[2]) + ");\n";
        result += "" + varA + ".push(" + JSON.stringify(ml[3]) + ");\n";
        
        indexOne = getRandomNumber(ml.length);
        indexTwo = getRandomNumber(ml.length,2);
        
        if (getRandomNumber(2)) {
            
               
                    // indexOne = getRandomNumber(ml.length);
                    // indexTwo = getRandomNumber(ml.length);
                
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
        result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 2]) + ");\n";
        result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 1]) + ");\n";
        
        
    }
    // =-=-=-=-=-=-=- exercise type 1, splice method to delete
    if(exerciseNumber == 1){
        ml = [getRandomNumber(7),getRandomNumber(4),getRandomNumber(7),getRandomNumber(4),getRandomNumber(7)];
        for(let i=0; i< getRandomNumber(3,1); i++){
          ml.push(getRandomNumber(4));
        }
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
        ml.push(getRandomNumber(4));
        result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 1]) + ");\n";

        
        
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
        ml.push(getRandomNumber(4));
        result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 1]) + ");\n";
        tempValue = getRandomNumber(2);
        tempAmount = getRandomNumber(3,1);
        result += "" + varA + ".splice(" + tempValue + ", "+tempAmount+");\n";
        ml.splice(tempValue, tempAmount);
        ml.push(getRandomNumber(4));
        result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 1]) + ");\n";
        // ml.push(getRandomNumber(7));
        // ml.push(getRandomNumber(4));
        // result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 2]) + ");\n";
        // result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 1]) + ");\n";
        
        
    }
    // =-=-=-=-=-=-=- exercise type 2, splice method to insert
    if(exerciseNumber == 2){
        ml = [];
        for(let i=0; i< getRandomNumber(5,3); i++){
          ml.push(getRandomNumber(4));
        }
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
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
        
        let insertionIndex = Math.min(getRandomNumber(ml.length),getRandomNumber(ml.length));
        ml.splice(insertionIndex,0,getRandomNumber(7));
        result += "" + varA + ".splice(" + insertionIndex + ", 0, " + JSON.stringify(ml[insertionIndex]) + ");\n";
        
        insertionIndex = Math.min(getRandomNumber(ml.length),getRandomNumber(ml.length))
        ml.splice(insertionIndex,0,getRandomNumber(7));
        result += "" + varA + ".splice(" + insertionIndex + ", 0, " + JSON.stringify(ml[insertionIndex]) + ");\n";
        
        
        indexOne = getRandomNumber(ml.length);
        indexTwo = getRandomNumber(ml.length,2);
        
        if (getRandomNumber(2)) {
            
               
                    // indexOne = getRandomNumber(ml.length);
                    // indexTwo = getRandomNumber(ml.length);
                
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
        insertionIndex = Math.min(getRandomNumber(ml.length),getRandomNumber(ml.length))
        ml.splice(insertionIndex,0,getRandomNumber(7));
        result += "" + varA + ".splice(" + insertionIndex + ", 0, " + JSON.stringify(ml[insertionIndex]) + ");\n";
        insertionIndex = Math.min(getRandomNumber(ml.length),getRandomNumber(ml.length))
        ml.splice(insertionIndex,0,getRandomNumber(7));
        result += "" + varA + ".splice(" + insertionIndex + ", 0, " + JSON.stringify(ml[insertionIndex]) + ");\n";
        
        
    }
    // =-=-=-=-=-=-=- exercise type 3, reassignment
    if(exerciseNumber == 3){
        let indexList = [];
        ml = [];
        for(let i=0; i< getRandomNumber(7,5); i++){
          ml.push(getRandomNumber(10));
          indexList.push(i);
        }
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
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
        
        let reassignIndex = indexList.splice(getRandomNumber(indexList.length), 1)[0];
        ml[reassignIndex] = getRandomNumber(7);
        result += "" + varA + "[" + reassignIndex + "] = " + JSON.stringify(ml[reassignIndex]) + ";\n";
        
        reassignIndex = indexList.splice(getRandomNumber(indexList.length), 1)[0];
        ml[reassignIndex] = getRandomNumber(7);
        result += "" + varA + "[" + reassignIndex + "] = " + JSON.stringify(ml[reassignIndex]) + ";\n";
        
        
        indexOne = getRandomNumber(ml.length);
        indexTwo = getRandomNumber(ml.length,2);
        
        if (getRandomNumber(2)) {
            
               
                    // indexOne = getRandomNumber(ml.length);
                    // indexTwo = getRandomNumber(ml.length);
                
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
        reassignIndex = indexList.splice(getRandomNumber(indexList.length), 1)[0];
        ml[reassignIndex] = getRandomNumber(7);
        result += "" + varA + "[" + reassignIndex + "] = " + JSON.stringify(ml[reassignIndex]) + ";\n";
        reassignIndex = indexList.splice(getRandomNumber(indexList.length), 1)[0];
        ml[reassignIndex] = getRandomNumber(7);
        result += "" + varA + "[" + reassignIndex + "] = " + JSON.stringify(ml[reassignIndex]) + ";\n";
        
        
    }
    // =-=-=-=-=-=-=- exercise type 4, combo: reassignment, splice, splice, push
    if(exerciseNumber == 4){
        let indexList = [];
        ml = [];
        for(let i=0; i< getRandomNumber(7,5); i++){
          ml.push(getRandomNumber(10));
          indexList.push(i);
        }
        result += "let " + varA + " = " + JSON.stringify(ml) + ";\n";
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
        
        let reassignIndex, insertionIndex;
        
        if(getRandomNumber(4) == 0){
          reassignIndex = indexList.splice(getRandomNumber(indexList.length), 1)[0];
          ml[reassignIndex] = getRandomNumber(7);
          result += "" + varA + "[" + reassignIndex + "] = " + JSON.stringify(ml[reassignIndex]) + ";\n";
        } else if(getRandomNumber(3) == 0){
          insertionIndex = Math.min(getRandomNumber(ml.length),getRandomNumber(ml.length))
          ml.splice(insertionIndex,0,getRandomNumber(7));
          result += "" + varA + ".splice(" + insertionIndex + ", 0, " + JSON.stringify(ml[insertionIndex]) + ");\n";
        } else if(getRandomNumber(2) == 0){
          tempValue = getRandomNumber(2);
          tempAmount = getRandomNumber(3,1);
          result += "" + varA + ".splice(" + tempValue + ", "+tempAmount+");\n";
          ml.splice(tempValue, tempAmount);
          indexList.pop();
        } else {
          ml.push(getRandomNumber(4));
          result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 1]) + ");\n";
        }
        
        
        if(getRandomNumber(4) == 0){
          reassignIndex = indexList.splice(getRandomNumber(indexList.length), 1)[0];
          ml[reassignIndex] = getRandomNumber(7);
          result += "" + varA + "[" + reassignIndex + "] = " + JSON.stringify(ml[reassignIndex]) + ";\n";
        } else if(getRandomNumber(3) == 0){
          insertionIndex = Math.min(getRandomNumber(ml.length),getRandomNumber(ml.length))
          ml.splice(insertionIndex,0,getRandomNumber(7));
          result += "" + varA + ".splice(" + insertionIndex + ", 0, " + JSON.stringify(ml[insertionIndex]) + ");\n";
        } else if(getRandomNumber(2) == 0){
          tempValue = getRandomNumber(2);
          tempAmount = getRandomNumber(3,1);
          result += "" + varA + ".splice(" + tempValue + ", "+tempAmount+");\n";
          ml.splice(tempValue, tempAmount);
          indexList.pop();
        } else {
          ml.push(getRandomNumber(4));
          result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 1]) + ");\n";
        }
        
        
        indexOne = getRandomNumber(ml.length);
        indexTwo = getRandomNumber(ml.length,2);
        
        if (getRandomNumber(2)) {
            
               
                    // indexOne = getRandomNumber(ml.length);
                    // indexTwo = getRandomNumber(ml.length);
                
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
        
        if(getRandomNumber(4) == 0){
          reassignIndex = indexList.splice(getRandomNumber(indexList.length), 1)[0];
          ml[reassignIndex] = getRandomNumber(7);
          result += "" + varA + "[" + reassignIndex + "] = " + JSON.stringify(ml[reassignIndex]) + ";\n";
        } else if(getRandomNumber(3) == 0){
          insertionIndex = Math.min(getRandomNumber(ml.length),getRandomNumber(ml.length))
          ml.splice(insertionIndex,0,getRandomNumber(7));
          result += "" + varA + ".splice(" + insertionIndex + ", 0, " + JSON.stringify(ml[insertionIndex]) + ");\n";
        } else if(getRandomNumber(2) == 0){
          tempValue = getRandomNumber(2);
          tempAmount = getRandomNumber(3,1);
          result += "" + varA + ".splice(" + tempValue + ", "+tempAmount+");\n";
          ml.splice(tempValue, tempAmount);
          indexList.pop();
        } else {
          ml.push(getRandomNumber(4));
          result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 1]) + ");\n";
        }
        
        if(getRandomNumber(4) == 0){
          reassignIndex = indexList.splice(getRandomNumber(indexList.length), 1)[0];
          ml[reassignIndex] = getRandomNumber(7);
          result += "" + varA + "[" + reassignIndex + "] = " + JSON.stringify(ml[reassignIndex]) + ";\n";
        } else if(getRandomNumber(3) == 0){
          insertionIndex = Math.min(getRandomNumber(ml.length),getRandomNumber(ml.length))
          ml.splice(insertionIndex,0,getRandomNumber(7));
          result += "" + varA + ".splice(" + insertionIndex + ", 0, " + JSON.stringify(ml[insertionIndex]) + ");\n";
        } else if(getRandomNumber(2) == 0){
          tempValue = getRandomNumber(2);
          tempAmount = getRandomNumber(3,1);
          result += "" + varA + ".splice(" + tempValue + ", "+tempAmount+");\n";
          ml.splice(tempValue, tempAmount);
          indexList.pop();
        } else {
          ml.push(getRandomNumber(4));
          result += "" + varA + ".push(" + JSON.stringify(ml[ml.length - 1]) + ");\n";
        }
        
        
    }
    
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
    const prefixes = ["nums", "myList", "myNums", "nmbrs", "numLst", "numbList", "NmbrLst", "ListB", "list2",
                      "scores", "myArray", "arrayNums", "numbers", "numbArr", "NmbrArr", "arrayB", "array2",
                      "values", "myValues", "myScores", "valueArray", "scoreArray", "valueList", "scoreList"];
    return prefixes[getRandomNumber(prefixes.length)];
}
</script>
<br>
<hr>
<br>

