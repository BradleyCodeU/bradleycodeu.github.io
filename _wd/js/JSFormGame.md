---
layout: project
category: js
title: JS Form Game
---
Create four trivia questions.

Q1 uses [radio buttons](https://www.w3schools.com/tags/att_input_type_radio.asp). You can simply add the onclick= attribute to the one radio button that is the correct answer.
```
onclick="alert('Correct')"
```

Q2 uses a [select drop-down list](https://www.w3schools.com/tags/tag_select.asp). Give select the [onchange=](https://www.w3schools.com/jsref/event_onchange.asp) attribute.
```
<select id="myDropDown" onchange="checkAnswer2()">
```
Use getElementById to get the currently selected value from the select drop-down:
```
var selectedAnswer = document.getElementById("myDropDown").value;
```
And then if selectedAnswer == "Banana" (or the correct [option value](https://www.w3schools.com/tags/att_option_value.asp), create a popup with [alert()](https://www.w3schools.com/jsref/met_win_alert.asp) to tell the user if they are correct.


Q3 uses a [text input box](https://www.w3schools.com/tags/att_input_type_text.asp) and one [button](https://www.w3schools.com/tags/tag_button.asp). You will add the onclick= attribute to the button. This Javascript code will allow you to get the text within a text input box:
```
var userText3 = document.getElementById("textinput3").value;
```
Let's assume that the correct answer is Shrek. When the user clicks on the button, you will check if userText3 == "Shrek", then create a popup with alert() to tell the user if they are correct.


Q4 uses three or more [checkboxes](https://www.w3schools.com/tags/att_input_type_checkbox.asp) and one [button](https://www.w3schools.com/tags/tag_button.asp). You will add the onclick= attribute to the button. You will need to determine which checkboxes are checked and which checkboxes are NOT checked. This Javascript code will allow you to get the status of a single checkbox:
```
var isBoxAChecked = document.getElementById("checkboxA").checked;
```
Do the same to create variables for isBoxBChecked, isBoxCChecked, etc.

You will need an if-else statement:
```
if (isBoxAChecked == true && isBoxBChecked == false && isBoxCChecked == true) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
```
If isBoxAChecked == true && isBoxBChecked == false && isBoxCChecked == true, then create a popup with alert() to tell the user if they are correct. Finally add an else. The else will happen if the user has any incorrect answer, then create a popup with alert() to tell the user that they are incorrect.
