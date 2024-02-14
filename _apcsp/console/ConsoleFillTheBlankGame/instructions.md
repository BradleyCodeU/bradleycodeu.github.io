#  Console Fill in the Blank Quiz Game
---
In this project you will use a while loop, not, input, print, lists/arrays, append, and a few other things.

There are to main types of loop:

- Pre-conditional
- Post-conditional

Pre-conditional loops include while loop, for loop, and for each loop. The most common post-conditional loop is the "do while" loop. *THERE IS NO "DO WHILE" LOOP IN PYTHON*, but we can simulate one.
```
Let's look at some pseudocode for using a "do while" loop for a number guessing game:

1. Declare variables for the number to guess and the user’s guess
2. Generate a random number between 1 and 10
3. Start loop
   - Print message asking user to enter their guess
   - Input guess
   - Check the guess and print the appropriate messages
   - Continue to loop if the guess is wrong, else break # Condition at bottom of loop

A key difference between a while loop and "do while" loop: the body of the "do while" loop is executed before the condition is ever tested. In the while loop version of the program, it was necessary to read in the user’s first guess before the loop so there would be a value for comparison in the condition. In the "do while" loop, the body will ALWAYS run one or more times.
```

For THIS project we will *simulate* a post-conditional loop by creating a while True loop that has a break condition at the end. There is no "do while" loop in Python.

## Project Details

Create a new game that asks 6 or more questions. If working with a partner, ask 10 or more questions. Choose a topic for your quiz and make all of your questions based on this topic. For example... computer science, vocabulary words from a foreign language, or vocabulary from any class you are taking this semester.

Requirements:

Create an empty array called correctAnswers and an empty array called wrongAnswers

Define a function called askQuestion. It requires two arguments: questionText, answerText. Inside this function will be:
- a while True loop
  - ask the questionText
  - collect user input
  - *convert the user input to lowercase letters*
  - if user input does NOT equal the answerText (NOTICE: THIS PLACES THE CONDITION AT THE END OF THE LOOP)
    - say incorrect try again
  - else:
    - say correct
    - break the loop



Display instructions for the player like in the Sample Output below.

Create at least 6 "Fill in the Blank" style questions. If working with a partner, ask 10 or more questions.

The game will *only* move on to another question when you get the question right.

Print ```"Your wrong answers were: "``` and print the array of user's wrongAnswers.

Finally, print ```"Your correct answers were: "``` and print the array of user's correctAnswers.

Sample Output (user input is in ** asterisk ** and should not be coded into your program)
```
Console Fill In The Blank Quiz Game
Answer the following six questions

1) ___ ____ is a term for datasets so large/complex that traditional data processing is inadequate: **Big Data**
correct
2) a variable that can only be true or false is: **integer**
incorrect, try again
2) a variable that can only be true or false is: **string**
incorrect, try again
2) a variable that can only be true or false is: **Boolean**
correct
3) U.S. military department that created the Internet for scientific and military communications is: **ARPA**
correct
4) a variable that can only store whole number is: **integer**
correct
5) what 3-letter acronym means the intranet: **LAN**
correct
6) a variable that stores text is: **string**
correct

Your wrong answers were: integer,string
Your correct answers were: big data,boolean,arpa,integer,lan,string
```




  