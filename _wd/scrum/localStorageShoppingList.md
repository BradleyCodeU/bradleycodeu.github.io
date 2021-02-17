---
layout: project
category: scrum
title: localStorage Shopping List
---
Copy/paste the starter template below.
```
<body onload="loadFromLocalStorage()">
  <h1>localStorage Shopping List app</h1>
  <ul id="myList">
    List items go here:
  </ul>
  <button onclick="addListItem(prompt())">
    +ADD
  </button>
  <script>
    let myArray = [];

    function displayFullList(){
      // get the element with the myList id & set the inner html to ""
      // create a for-loop and loop through myArray
        // call displaySingleListItem() function & pass each array item as an argument
    }

    function addListItem(someText){
      // push someText into myArray
      // save myArray in localStorage.savedList
      // call displaySingleListItem() function & pass someText as an argument
    }

    function loadFromLocalStorage(){  
      // if localStorage.savedList is undefined then return
        return
      // if localStorage.savedList is not undefined then do these 3 lines of code...
        let tempString = localStorage.savedList;
        myArray = tempString.split(",");
        displayFullList();
    }

    function displaySingleListItem(someText){
      var node = document.createElement("li");
      node.innerHTML = someText;
      var button = document.createElement("button");
      button.innerHTML = 'X';
      button.onclick = function(){
        removeListItem(someText);
      }
      node.appendChild(button);
      document.getElementById("myList").appendChild(node);
    }

    function removeListItem(someText){
      myArray.splice(myArray.indexOf(someText),1);
      localStorage.savedList = myArray;
      displayFullList();
    }
  </script>
</body>
```
