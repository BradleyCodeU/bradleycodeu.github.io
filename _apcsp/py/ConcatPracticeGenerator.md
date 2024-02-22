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

      <button onclick="shuffle()">Generate Concat Practice</button>
        <p>What will print when this code runs?</p>
        <p></p>
        <pre class="indent2" id="declare1">x = "1"</pre>
        <pre class="indent2" id="declare2">y = "2"</pre>
        <ul class="sortable-list">
      
          <li class="item" draggable="true">
            <div class="details">
              <pre>x = x + x</pre>
            </div>
            
          </li>
          <li class="item" draggable="true">
            <div class="details">
              <pre>y = y + y</pre>
            </div>
          
          </li>
          <li class="item" draggable="true">
            <div class="details">
              <pre>x = x + y</pre>
            </div>
           
          </li>
          <li class="item" draggable="true">
            <div class="details">
              <pre id="declare3">y = "3"</pre>
            </div>
          
          </li>
          <li class="item" draggable="true">
            <div class="details">
              <pre>x = x + "4"</pre>
            </div>
          
          </li>
          <li class="item" draggable="true">
            <div class="details">
              <pre>x = x + "5"</pre>
            </div>
            
          </li>
      
          <li class="item" draggable="true">
            <div class="details">
              <pre>y = x + y</pre>
            </div>
           
          </li>
          <li class="item" draggable="true">
            <div class="details">
              <pre>x = y</pre>
            </div>
          
          </li>
      
      
        </ul>
        <pre class="indent2" style="font-size: 1.5rem;">print(x)</pre>
        <table>
            <tr>
                <td><button onclick="revealAnswer()">Reveal Answer</button></td>
                <td><span id="answer" style="display:none;"></span></td>
            </tr>
        </table>
        


  <script>
  const sortableList = document.querySelector(".sortable-list");
const items = sortableList.querySelectorAll(".item");
items.forEach(item => {
  item.addEventListener("dragstart", () => {
    // Adding dragging class to item after a delay
    setTimeout(() => item.classList.add("dragging"), 0);
  });
  // Removing dragging class from item on dragend event
  item.addEventListener("dragend", () => item.classList.remove("dragging"));
});
const initSortableList = (e) => {
  e.preventDefault();
  const draggingItem = document.querySelector(".dragging");
  // Getting all items except currently dragging and making array of them
  let siblings = [...sortableList.querySelectorAll(".item:not(.dragging)")];
  // Finding the sibling after which the dragging item should be placed
  let nextSibling = siblings.find(sibling => {
    return e.clientY <= sibling.offsetTop + sibling.offsetHeight / 2;
  });
  // Inserting the dragging item before the found sibling
  sortableList.insertBefore(draggingItem, nextSibling);
}
sortableList.addEventListener("dragover", initSortableList);
sortableList.addEventListener("dragenter", e => e.preventDefault());



function shuffle() {
    document.getElementById("answer").style.display = "none";
  var container = document.getElementsByClassName("sortable-list")[0];
  let nums = shuffleArray([1,2,3,4,5,6,7,8,9]);
  document.getElementById("declare1").innerHTML = "x = \"" + nums[0] + "\"";
  document.getElementById("declare2").innerHTML = "y = \"" + nums[1]  + "\"";
  document.getElementById("declare3").innerHTML = "y = \"" + nums[2]  + "\"";
  

  var elementsArray = Array.prototype.slice.call(container.getElementsByClassName('item'));
  elementsArray.forEach(function(element) {
    container.removeChild(element);
  })
  shuffleArray(elementsArray);
  elementsArray.forEach(function(element) {
    element.classList.remove("hide");
    element.classList.remove("show");
    if(Math.random() > 0.5){
      element.classList.add("show");
    } else {
        element.classList.add("hide");
    }
    container.appendChild(element);
  })
}

function revealAnswer() {
      const showItems = document.getElementsByClassName('show');
      //let expression = 'let x="1",y="2";';
      let expression = "let "+document.getElementById("declare1").textContent.trim() + ";";
      expression += "let "+document.getElementById("declare2").textContent.trim() + ";";
      for (let item of showItems) {
    const preElement = item.querySelector('pre');
    if (preElement) {
      expression += preElement.textContent.trim() + ";";
    }
  }
      expression += "x;"
      //console.log(expression);
      const answer = eval(expression);
      //return result;
      document.getElementById("answer").innerText = "Answer: " + answer;
    document.getElementById("answer").style.display = "block";
}

function shuffleArray(array) {
  for (var i = array.length - 1; i > 0; i--) {
    var j = Math.floor(Math.random() * (i + 1));
    var temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  return array;
}

shuffle();
  </script>