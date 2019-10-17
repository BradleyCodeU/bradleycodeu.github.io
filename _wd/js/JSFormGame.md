---
layout: project
category: js
title: JS Form Game
---
Create four trivia questions.

Q1 uses a <select> drop-down list.
 [https://www.w3schools.com/tags/tag_select.asp](https://www.w3schools.com/tags/tag_select.asp) Give select the onchange= attribute:
```
onchange="checkAnswer1()"
```
This Javascript code will allow you to get the currently selected value from the select drop-down:
```
var selectedAnswer = document.getElementById("myDropDown").value
```
Q2 uses radio buttons
[https://www.w3schools.com/tags/att_input_type_radio.asp](https://www.w3schools.com/tags/att_input_type_radio.asp) You should use onchange= on each of the radio buttons. [https://www.w3schools.com/jsref/event_onchange.asp](https://www.w3schools.com/jsref/event_onchange.asp)
```
onchange="checkAnswer2()"
```
This Javascript code will allow you to get the status of a single radio button:
```
var correctButton = document.getElementById("radiobuttonA").checked
```
And then if correctButton == true, create a popup with alert() to tell the user if they are correct. [https://www.w3schools.com/jsref/met_win_alert.asp](https://www.w3schools.com/jsref/met_win_alert.asp)

Q3 uses a text input box and a button.
[https://www.w3schools.com/tags/att_input_type_text.asp](https://www.w3schools.com/tags/att_input_type_text.asp) You will add the onclick= attribute to the button. This Javascript code will allow you to get the text within a text input box:
```
var textinputA = document.getElementById("textinputA").value
```
Let's assume that the correct answer is Shrek. You will check if textinputA == "Shrek", create a popup with alert() to tell the user if they are correct.

Q4 uses checkboxes and a button.
[https://www.w3schools.com/tags/att_input_type_checkbox.asp](https://www.w3schools.com/tags/att_input_type_checkbox.asp) You will add the onclick= attribute to the button. You will need to determine which checkboxes are checked and which checkboxes are NOT checked. This Javascript code will allow you to get the status of a single checkbox:
```
var checkboxA = document.getElementById("checkboxA").checked
```
You will need an if-statement, if checkboxA == true && checkboxB == false && checkboxC == true, then create a popup with alert() to tell the user if they are correct.

Create popups with alert() to tell the user if they are correct or if they are incorrect.
