---
layout: project
category: py
title: Concat Practice
---
<style>
  .hide {
      display:none !important;
  }
  .show {
      display:block !important;
  }
  pre{
      font-size: 1.5rem;
  }
  ul{
      padding:0px;
  }
</style>

        
<button onclick="generate()">Generate Concat Practice</button>
<p>What will print when this code runs?</p>
<p></p>
<pre id="output"></pre>
<table>
    <tr>
        <td><button onclick="revealAnswer()">Reveal Answer</button></td>
        <td><span id="answer" style="display:none;"></span></td>
    </tr>
</table>
        


<script>

  let displayedCodeLines = [];


function generate() {
  document.getElementById("output").innerHTML = "";
    document.getElementById("answer").style.display = "none";
  
  let nums = shuffleArray([1,2,3,4,5,6,7,8,9]);
  let declarations = ["x = \""+nums.pop()+"\"","y = \""+nums.pop()+"\""]
  let fullListOfCodeLines = ["y = \""+nums.pop()+"\"","x = x + \""+nums.pop()+"\"","x = x + \""+nums.pop()+"\"",,"x = y","y = x + y","x = x + y","y = y + y","x = x + x"]
  shuffleArray(fullListOfCodeLines);
  displayedCodeLines = declarations;
  fullListOfCodeLines.forEach(function(element) {
    
    if(Math.random() > 0.5){
      displayedCodeLines.push(element);
    } 
    
  });
  for(let each of displayedCodeLines){
    document.getElementById("output").innerHTML += each + "<br>"
  }
  document.getElementById("output").innerHTML += "print(x)"
  return displayedCodeLines;

}

function revealAnswer() {
     displayedCodeLines[0] = "let " +  displayedCodeLines[0];
     displayedCodeLines[1] = "let " +  displayedCodeLines[1];
     let expression = "";
     for(let each of displayedCodeLines){
       expression += each + ";"
     }

      expression += "x;"
      //console.log(expression);
      const answer = eval(expression);
      //return result;
      document.getElementById("answer").innerText = "Answer: \"" + answer + "\"";
    document.getElementById("answer").style.display = "block";
}

function shuffleArray(array) {
  for (var i = array.length - 1; i > 0; i--) {
    var j = Math.floor(Math.random() * (i + 1));
    if(array[i]===undefined || array[j]===undefined){
      continue;
    }
    var temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  return array;
}

generate();
  </script>