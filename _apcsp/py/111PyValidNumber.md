---
layout: project
category: py
title: Valid Number
---
Copy/paste this starter code: [https://repl.it/@JustinRiley1/Valid-Number-starter-code](https://repl.it/@JustinRiley1/Valid-Number-starter-code)


## In this project, you will simply create a function that requires one argument (a number) and returns True or False if the number is valid.

Pick ONE of these:
- "What year were you born?" will only accept numbers 1900-2019
- "What is your ZIP code?" will only accept numbers [00501](https://www.google.com/search?q=lowest+zip+code+number)-[99950](https://www.google.com/search?q=highest+zip+code+number)
- "On a scale of 1-10, how much swag do you have?" will only accept numbers 1-10
- "How many weeks until summer break?" will only accept numbers 0-52
- "What year was your fav movie released?" will only accept numbers [1894](https://www.google.com/search?q=first+edison+film+released)-2019
- "How many days until summer break?" will only accept numbers 0-366
- "What is your graduation year?" will only accept numbers 1900-2023
- "How many pets do you have?" will only accept numbers 0-100
- "What month were you born?" will only accept numbers 1-12
- "On a scale of 1-5, how would you rate your day so far?" will only accept numbers 1-5
- "What is your resting heart rate?" will only accept numbers 35-200
- "How many Infinity Stones do you have?" will only accept numbers 0-6

<pre>
You MUST create a function called validNumber that requires one argument: myNumber. For this example, I will only accept numbers 1900-2019.
  - Convert myNumber to an int
  - return True if myNumber is a number between 1900 and 2019, inclusive [1900, 2019].
  - Otherwise, return False.
</pre>

That is all you need to create. The starter code will work with your validNumber function to create a Tkinter app that will ask for a number and validate that the user entered a number that makes sense.

The starter code's sayHello function will:
  - get the text from the numberEntry textbox, like this: ```numberEntry.get()``` and save it in the answer variable
  - if validNumber(answer), then
    - create a popup that says "Thank you"
  - else
    - create a popup that says "Not a valid number"

## Finally, change the Label on the Python Tkinter app so that it says "What year were you born?" OR whatever question you choose earlier.
