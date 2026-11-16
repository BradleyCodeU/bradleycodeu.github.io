---
layout: project
category: u02stringMethods
title: Simple Checkbook
---


Simple Checkbook

Complete the code to create an app that remembers an amount of money and can update that amount.

Tutorials:

localStorage https://www.w3schools.com/jsref/prop_win_localstorage.asp

document.getElementById https://www.w3schools.com/js/tryit.asp?filename=tryjs_output_dom

prompt https://www.w3schools.com/jsref/met_win_prompt.asp

parseInt https://www.w3schools.com/jsref/jsref_parseint.asp

Starter code:
```
<!DOCTYPE html>
<html>
  <head>
    <title>Simple Checkbook</title>
    <link href="styles.css" rel="stylesheet" />
  </head>
  <body>
    <h1>Simple Checkbook</h1>
    Current Balance: <div id="moneyDisplay"></div>
    History: <div id="historyDisplay"></div>
    <button>DEPOSIT MONEY</button>
    <button>SPEND MONEY</button>
    <script>
      let money = 0;
      let history = [];
      // try to load from localStorage

      // function DISPLAY the current amount and the history

      // function DEPOSIT, save to localStorage, call display function

      // function SPEND, save to localStorage, call display function
      
    </script>
  </body>
</html>
```