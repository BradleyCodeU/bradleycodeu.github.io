---
layout: project
category: py
title: Valid Number
---

In this project, you will create a Tk app that will ask for a number and validate that the user entered a number that makes sense. For example...
- "What year were you born?" will only accept numbers 1900-2019
- "What is your ZIP code?" will only accept numbers [00501](https://www.google.com/search?q=lowest+zip+code+number)-[99950](https://www.google.com/search?q=highest+zip+code+number)
- "How many weeks until summer break?" will only accept numbers 0-52
- "What year was your fav movie released?" will only accept numbers [1894](https://www.google.com/search?q=first+edison+film+released)-2019
- "How many days until summer break?" will only accept numbers 0-366
- "What is your graduation year?" will only accept numbers 1900-2023
- "How many pets do you have?" will only accept numbers 0-100
- "What month were you born?" will only accept numbers 1-12
- "What is your resting heart rate?" will only accept numbers 35-200
- "How many Infinity Stones do you have?" will only accept numbers 0-6


Create a function called validNumber that requires one argument: myNumber. For this example, I will only accept numbers 1900-2019. It *returns* True if myNumber is a number between 1900 and 2019, inclusive \[1900, 2019\]. Otherwise, it *returns* False.


Create a function called buttonPress that
- gets the text from numberEntry, like this: ```numberEntry.get()``` and save it in a userInput variable
- convert the userInput variable to a number
- if validNumber(userInput), then
  - create a popup that says "Thank you"
  - return
- else
  - create a popup that says "Not a valid number"
  - return


Create a Python Tkinter app with:
- a Label that says "What year were you born?" (or whatever question you choose)
- a variable named numberEntry that is assigned an Entry for user input
- a Button with the text "Submit" that runs a function called buttonPress
