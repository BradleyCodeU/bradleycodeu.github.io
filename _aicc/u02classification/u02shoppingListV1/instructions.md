---
layout: project
category: u02_classification
title: localStorage Shopping List v1
---
In this project, you will create an app that allows you to store a list of items for a long time. It's currently a Shopping List App, but I want you to change that and design it for your own purpose. For example...
  - Video Game Collection App
  - Favorite Pizza Places App
  - Homework "To Do" List App
  - Movies You Want To Watch App
  - Favorite TV Shows App
  - Chores List App
  - Holiday Wishlist App

Complete the JavaScript and some custom CSS to style your app. [https://www.w3schools.com/css/css_intro.asp](https://www.w3schools.com/css/css_intro.asp)

IN A NEW FILE, create a JavaScript class [https://www.w3schools.com/js/js_classes.asp](https://www.w3schools.com/js/js_classes.asp) that will serve as a blueprint for a shopping list item. Create properties (instance variables) for the attributes that you need to store for each shopping list item.

In version 2 we will improve the app.

Show Mr Riley when finished

Copy/paste the starter template below.
```
<!DOCTYPE html>
<html>
<head>
<style>
/* your custom css code goes here in the style section */

</style>
</head>
<body onload="loadFromLocalStorage()">
  <h1>localStorage Shopping List app</h1>
  <ul id="listDisplayBox">
    List items go here:
  </ul>
  <button onclick="addListItem(prompt())">
    +ADD
  </button>
  <script>
    let myArray = [];

    function displayFullList(){
      document.getElementById("listDisplayBox").innerHTML = "";
      // TODO
      // create a for-loop and loop through myArray
      // TODO
          // call displaySingleListItem() function & pass each array item as an argument
          // TODO
    }

    function addListItem(someText){
      // if the length of the text is too small then just return
      // TODO
          return
      // push someText into myArray
      // TODO
      // save myArray in localStorage.savedList
      // TODO
      // call displaySingleListItem() function & pass someText as an argument
      // TODO
    }

    function loadFromLocalStorage(){  
      // if localStorage.savedList is undefined then return
      // TODO
          return
      // if localStorage.savedList is not undefined then do these 3 lines of code...
      // TODO
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
      document.getElementById("listDisplayBox").appendChild(node);
    }

    function removeListItem(someText){
      // use indexOf to find the index location of someText in the array
      // TODO
      myArray.splice(indexToRemove, 1);
      localStorage.savedList = myArray;
      displayFullList();
    }
  </script>
</body>
</html>
```
