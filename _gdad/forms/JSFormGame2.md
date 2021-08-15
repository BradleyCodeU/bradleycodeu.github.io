---
layout: project
category: forms
title: JS Form Game 2
---
Continue your form game by creating the last two trivia questions (Q3 and Q4).

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
