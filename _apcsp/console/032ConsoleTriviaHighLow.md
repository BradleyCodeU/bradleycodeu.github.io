---
layout: project
category: console
title: Console Trivia High Low
---
Create a variable called score and set it to some large number (for example, 10 or 100).

Create three trivia questions in which the answers are numbers. For example, how many times have the Cubs won the world series?

You ```MUST validate the input using Try/Except``` or the program will crash.

You can learn how to validate user input [here](https://www.101computing.net/number-only/) and [here](https://www.w3schools.com/python/python_try_except.asp)

While the user's answer is wrong, tell them if their answer is "Too high" or "Too low", subtract 2 or 3 points from their score, tell them what their score is, and ask the question again. Repeat the question until they get it right.

When they answer correctly, say "Correct!", add 4 or 5 points to their score, tell them what their score is, and move on to the next question.

Sample Output (user input is in ** asterisk ** and should not be coded into your program)
```
How many times has OSU football won a National Championship? **lkjsdf**
Not a valid number
How many times has OSU football won a National Championship? **7**
Too low
Your score is now 97
How many times has OSU football won a National Championship? **8**
Correct
Your score is 102
What year did Urban Meyer retire (the first time)? **2011**
Too high
Your score is now 99
What year did Urban Meyer retire (the first time)? **2010**
Correct
Your score is 104
How many points did OSU beat Michigan by in 2018? **62**
Correct
Your score is 109
Congratulations! You have completed the trivia game.
```


-------

Gold Medal Challenge: Define a function in order to avoid repeating yourself three times. Use the fewest lines of code possible.
