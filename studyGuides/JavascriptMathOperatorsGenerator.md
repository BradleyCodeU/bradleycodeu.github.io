---
layout: project
category: arrays
title: JS Math Operators Practice
---

<p>Practice Generator for addition, subtraction, multiplication, PEMDAS, concatenation, +=, -=, ++, and --</p>

<button onclick="generatePractice()">Generate JS Math Operators Practice</button>
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

let ml = [];

let answer;

generatePractice();

function generatePractice() {
    //exerciseNumber = Math.max(getRandomNumber(5),getRandomNumber(5));
    exerciseNumber = getRandomNumber(2);
    //exerciseNumber = 0;
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
    const threeLetterWords = [
  "all", "bug",
  "can", "cat", "dad","dog","egg", "for", "get",
   "hat","hen","jar", "kid","law","map", "mom", "not", "one",
  "pet", "rat", "ski", "the","van", "wax","yak", "you","zip", "zoo"
];
    const varNames = [
      "index", "item", "idNum", "position", "xSpeed", 
    "location", "total", "ySpeed", "counter", "address", 
    "foo", "foobar", "temp", "indexA", "indexB", 
    "indexC", "selected", "pick", "score", "health",
    "lives", "amount", "value", "count", "number", 
    "rate", "age", "width", "height", "size", 
    "mass", "weight", "grade",   "level", "stage", "mode", "flag", "status",
  "option", "state", "point", "round", "timer"
    ];
    const varA = varNames.splice(Math.floor(Math.random() * varNames.length),1)[0];
    const varB = varNames.splice(Math.floor(Math.random() * varNames.length),1)[0];

    // =-=-=-=-=-=-=- exercise type 0, add sub, mult
    if(exerciseNumber == 0){
        ml = [getRandomNumber(5) + getRandomNumber(5) + 1, getRandomNumber(5) + getRandomNumber(5) + 1, getRandomNumber(4) + 1, getRandomNumber(4) + 1];
 
        result += "let " + varA + " = " + JSON.stringify(ml[0]) + ";\n";
        result += "let " + varB + " = " + JSON.stringify(ml[1]) + ";\n";
        
        if(getRandomNumber(6)==0){
          // a += b
          result += "" + varA + " += "  + varB + ";\n";
          ml[0] += ml[1];
        }else if(getRandomNumber(5)==0){
          // add
          result += "" + varA + " = "  + varA + " + "  + JSON.stringify(ml[2]) + ";\n";
          ml[0] += ml[2];
        } else if(getRandomNumber(4)==0){
          // sub
          result += "" + varA + " = "  + varA + " - "  + JSON.stringify(ml[2]) + ";\n";
          ml[0] -= ml[2];
        } else if(getRandomNumber(3)==0){
          // +=
          result += "" + varA + " += " + JSON.stringify(ml[2]) + ";\n";
          ml[0] += ml[2];
        } else if(getRandomNumber(2)==0){
          // ++
          result += "" + varA + "++;\n";
          ml[0]++;
        } else {
          // add
          result += "" + varA + " = "  + varB + " - "  + JSON.stringify(ml[2]) + ";\n";
          ml[0] = ml[1] + ml[2];
        }
        
        
        if(getRandomNumber(6)==0){
          // b += a
          result += "" + varB + " += "  + varA + ";\n";
          ml[1] += ml[0];
        }else if(getRandomNumber(5)==0){
          // add
          result += "" + varB + " = "  + varB + " + "  + JSON.stringify(ml[3]) + ";\n";
          ml[1] += ml[3];
        } else if(getRandomNumber(4)==0){
          // sub
          result += "" + varB + " = "  + varB + " - "  + JSON.stringify(ml[3]) + ";\n";
          ml[1] -= ml[3];
        } else if(getRandomNumber(3)==0){
          // -=
          result += "" + varB + " -= " + JSON.stringify(ml[3]) + ";\n";
          ml[1] -= ml[3];
        } else if(getRandomNumber(2)==0){
          // --
          result += "" + varB + "--;\n";
          ml[1]--;
        } else {
          // add
          result += "" + varB + " = "  + varA + " + "  + JSON.stringify(ml[3]) + ";\n";
          ml[1] = ml[0] + ml[3];
        }

        if(getRandomNumber(2)==0){
          // mult
          result += "let answer = "  + varA + " * "  + varB + " + 2;\n";
          answer = ml[0] * ml[1] + 2;
        } else {
          // add
          result += "let answer = "  + varA + " + "  + varB + " * 2;\n";
          answer = ml[0] + ml[1] * 2;
        }
        
    }
    
    // =-=-=-=-=-=-=- exercise type 1, string concat
    if(exerciseNumber == 1){
        ml = [
           threeLetterWords.splice(Math.floor(Math.random() * threeLetterWords.length),1)[0],
           threeLetterWords.splice(Math.floor(Math.random() * threeLetterWords.length),1)[0],
           threeLetterWords.splice(Math.floor(Math.random() * threeLetterWords.length),1)[0],
           threeLetterWords.splice(Math.floor(Math.random() * threeLetterWords.length),1)[0],
          ];
 
        result += "let " + varA + " = " + JSON.stringify(ml[0]) + ";\n";
        result += "let " + varB + " = " + JSON.stringify(ml[1]) + ";\n";
        
        if(getRandomNumber(4)==0){
          // a + new
          result += "" + varA + " = "  + varA + " + "  + JSON.stringify(ml[2]) + ";\n";
          ml[0] += ml[2];
        } else if(getRandomNumber(3)==0){
          // new + a
          result += "" + varA + " = "  + JSON.stringify(ml[2]) + " + "  + varA + ";\n";
          ml[0] = ml[2] + ml[0];
        } else if(getRandomNumber(2)==0){
          // a + a
          result += "" + varA + " = "  + varA + " + "  + varA + ";\n";
          ml[0] += ml[0];
        } else {
          // new + new
          result += "" + varA + " = "  + JSON.stringify(ml[2]) + " + "  + JSON.stringify(ml[3]) + ";\n";
          ml[0] = ml[2] + ml[3];
        }
        
        if(getRandomNumber(4)==0){
          // b + new
          result += "" + varB + " = "  + varB + " + "  + JSON.stringify(ml[3]) + ";\n";
          ml[1] += ml[3];
        } else if(getRandomNumber(3)==0){
          // new + b
          result += "" + varB + " = "  + JSON.stringify(ml[3]) + " + "  + varB + ";\n";
          ml[1] = ml[3] + ml[1];
        } else if(getRandomNumber(2)==0){
          // b + b
          result += "" + varB + " = "  + varB + " + "  + varB + ";\n";
          ml[1] += ml[1];
        } else {
          // new + new
          result += "" + varB + " = "  + JSON.stringify(ml[3]) + " + "  + JSON.stringify(ml[2]) + ";\n";
          ml[1] = ml[3] + ml[2];
        }

        if(getRandomNumber(2)==0){
          // a + b
          result += "let answer = "  + varA + " + "  + varB + ";\n";
          answer = ml[0] + ml[1];
        } else {
          // b + a
          result += "let answer = "  + varB + " + "  + varA + ";\n";
          answer = ml[1] + ml[0];
        }
        
    }
    
    

    
    if(answer === undefined){
      //generatePractice()
    } else {
      result += "alert(answer);";
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

