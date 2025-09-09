---
layout: project
category: u02_classification
title: localStorage Shopping List v2
---

Continue working on your previous project.

## ADD COMPUTER VISION

NOTE: you should also keep the old "ADD" button so that items can still be added the old way.

Train a model using Teachable Machine to recognize at least 7 different items AND to recognize "nothing".

Add p5js and ml5 to your project.

When an item is shown to the webcam and the model recognizes it with 90% confidence or higher, ask the user some questions...
- Use the JavaScript confirm() method [https://www.w3schools.com/jsref/met_win_confirm.asp](https://www.w3schools.com/jsref/met_win_confirm.asp) to ask the user if they want to add this item. The confirm() method returns true if the user clicked "OK", otherwise false.
- IF THE USER CLICKED "OK"
    - Use the JavaScript prompt() method [https://www.w3schools.com/jsref/met_win_prompt.asp](https://www.w3schools.com/jsref/met_win_prompt.asp) to allow the user to set the name for the item. YOU MUST include the defaultText with what the model saw.
    - Add additional prompts for other details.
    - Add the item to the shopping list

## ADD CATEGORIES

Automatically classify items into the correct categories. For example, frozen foods, fruits, veggies, cereal, etc. Create a dictionary (a JavaScript object [https://www.w3schools.com/js/js_object_definition.asp](https://www.w3schools.com/js/js_object_definition.asp)) that lists the correct category for each item. When an item is added, retrieve the correct category from the dictionary. Categories should be displayed seperately on the webpage.

Show Mr. Riley when finished