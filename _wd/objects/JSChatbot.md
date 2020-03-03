---
layout: project
category: objects
title: JS Chatbot
---

Create a chatbot character that MUST HAVE 12 or more key/value pairs. For this project, the keys are all "keywords" and the values are the "response."

```
let dan = {
  name: 'Cowboy Dan',
  want: 'I wanna find the Golden Key',
  hello: 'Howdy there',
  bye: 'See ya later',
  weather: 'Hot enough for ya?',
};
```

Create a variable named userinput and set it to "hello"

Next, create a while loop that creates the game loop. Inside the while loop:
  - Convert userinput to lowercase
  - Create a [for-each-in loop](https://www.w3schools.com/jsref/jsref_forin.asp) that loops through each keyword
    - if userinput contains a keyword
      - let reply = dan[keyword]
      - create an alert that prints the reply
  - [Prompt](https://www.w3schools.com/jsref/met_win_prompt.asp) the user to ask a question and save their input in userinput
  - if userinput equals "q" or "quit"
    - break out of the loop


### If you have already completed 1 or more Computer Science classes...
Create a counter to track the number of keywords that userinput contains. If the count is zero, then display a default message such as "Sorry, I don't understand." Reset the counter each time the loop repeats.
