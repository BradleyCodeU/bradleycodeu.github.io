---
layout: project
category: forms
title: JS Form Game 1
---
Create two trivia questions.

Q1 uses [radio buttons](https://www.w3schools.com/tags/att_input_type_radio.asp){:target="_blank"}. Each radio input MUST have the same name (the same name attribute) to be treated as a group. You can simply add the onclick= attribute to the one radio button that is the correct answer.
```
onclick="alert('Correct')"
```

Q2 uses a [select drop-down list](https://www.w3schools.com/tags/tag_select.asp){:target="_blank"}. Give select the [onchange=](https://www.w3schools.com/jsref/event_onchange.asp){:target="_blank"} attribute.
```
<select id="myDropDown" onchange="checkAnswer2()">
```
Create a checkAnswer2 functions. Inside of it, use getElementById to get the currently selected value from the select drop-down:
```
var selectedAnswer = document.getElementById("myDropDown").value;
```
And then if selectedAnswer == "Banana" (or the correct [option value](https://www.w3schools.com/tags/att_option_value.asp), create a popup with [alert()](https://www.w3schools.com/jsref/met_win_alert.asp){:target="_blank"} to tell the user if they are correct.
