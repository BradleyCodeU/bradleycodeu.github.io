---
layout: project
category: console
title: Console Fill in the Blank Quiz Game
---
In this project you will use a global variable, while loop, not, input, print, lists/arrays, append, and a few other things.

Let's continue our discussion of loops. Pre-conditional loops include while loop, for loop, and for each loop. The most common post-conditional loop is the "do while" loop. *THERE IS NO "DO WHILE" LOOP IN PYTHON*, but we can simulate one.
```
Let's look at some pseudocode for using a "do while" loop for a number guessing game:

1. Declare variables for the number to guess and the user’s guess
2. Generate a random number between 1 and 10
3. Start loop
   - Print message asking user to enter their guess
   - Scan in guess
   - Check the guess and print the appropriate messages
   - Continue to loop if the guess is wrong // Condition at bottom of loop

A key difference between a while loop and "do while" loop: the body of the "do while" loop is executed before the condition is ever tested. In the while loop version of the program, it was necessary to read in the user’s first guess before the loop so there would be a value for comparison in the condition. In the "do while" loop, the body will ALWAYS run one or more times.
```

For THIS project we will *simulate* a post-conditional loop by creating a while True loop that has a break condition at the end. There is no "do while" loop in Python.

## Project Details

Create a new game that asks a minimum of 6 questions. Choose a topic for your quiz and make all of your questions based on this topic. For example... computer science, vocabulary words from a foreign language, or vocabulary from any class you are taking this semester.

Requirements:

Create an empty array called correctAnswers and an empty array called wrongAnswers

Define a function called askQuestion. It requires two arguments: question and answer. It does not return a value. Inside this function will be:
- a while True loop
  - ask the question
  - collect user input
  - *convert the user input to lowercase letters*
  - if the user input equals the answer (NOTICE: THIS PLACES THE CONDITION AT THE END OF THE LOOP)
    - add a large amount to the score
    - say correct, your score is ___
    - break the loop
  - else:
    - subtract a small amount from the score
    - say incorrect, your score is ___

Display instructions for the player like in the Sample Output below.

Create at least 6 "Fill in the Blank" style questions.

The game will *only* move on to another question when you get the question right.

Print ```"Your wrong answers were: "``` and print the array of user's wrongAnswers.

Finally, print ```"Your correct answers were: "``` and print the array of user's correctAnswers.

Sample Output (user input is in ** asterisk ** and should not be coded into your program)
```
Console Fill In The Blank Quiz Game
Answer the following six questions

1) ___ ____ is a term for datasets so large/complex that traditional data processing is inadequate: **Big Data**
correct, your score is 5
2) a variable that can only be true or false is: **integer**
incorrect, your score is 2
2) a variable that can only be true or false is: **string**
incorrect, your score is -1
2) a variable that can only be true or false is: **Boolean**
correct, your score is 3
3) U.S. military department that created the Internet for scientific and military communications is: **ARPA**
correct, your score is 8
4) a variable that can only store whole number is: **integer**
correct, your score is 13
5) what 3-letter acronym means the intranet: **LAN**
correct, your score is 18
6) a variable that stores text is: **string**
correct, your score is 23

Your wrong answers were: integer,string
Your correct answers were: big data,boolean,arpa,integer,lan,string
```

-=-=-=-=-=-=-=-=-=-

GOLD MEDAL CHALLENGE: Add a global variable called lives. The player starts with 3 lives and loses 1 life with each incorrect answer. After an incorrect answer tell the player how many lives they have remaining. If they ever have 0 lives remaining, then exit the program.
