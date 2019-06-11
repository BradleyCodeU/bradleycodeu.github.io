Let's continue our discussion of loops. Pre-conditional loops include while loop, for loop, and for each loop. The most common post-conditional loop is the do...while loop. **THERE IS NO DO...WHILE LOOP IN PYTHON**, but we can simulate one. Let's look at some pseudocode for using a do...while loop for a number guessing game

1. Declare variables for the number to guess and the user’s guess
1. Generate a random number between 1 and 10
1. Start do loop that will continue as long as the guess is wrong
   1. Print message asking user to enter their guess
   1. Scan in guess
   1. Check the guess and print the appropriate messages

A key difference between a while loop and do...while loop: the body of the do ... while loop is executed before the condition is ever tested. In the while loop version of the program, it was necessary to read in the user’s first guess before the loop so there would be a value for comparison in the condition. In the do...while loop, the the body will always run one or more times.

For THIS project we will *simulate* a post-conditional loop by creating a while True loop that has a break condition at the end. There is no do...while loop in Python.

## Project Details

Create a new game that asks a minimum of 5 questions. Choose a topic for your quiz and make all of your questions based on this topic. For example... computer science, vocabulary words from a foreign language, or vocabulary from any class you are taking this semester.

Requirements:

Define a function called checkAnswer. It requires two parameters: question and answer. It does not return a value. Inside this function will be:
- a while True loop
  - ask the question
  - collect user input
  - convert the user input to lowercase letters
  - if the user input equals the answer (NOTICE: THIS PLACES THE CONDITION AT THE END OF THE LOOP)
    - add a large amount to the score
    - say correct, your score is ___ 
    - break the loop
  - else:
    - subtract a small amount from the score
    - say incorrect, your score is ___ 

Display instructions for the player.
Create at least 5 "Fill in the Blank" style questions.
The game will **only** move on to another question when you get the question right.


Sample Output
```
Console Fill In The Blank Quiz Game
Answer the following five questions.
___ ____ is a term for datasets so large/complex that traditional data processing is inadequate: big boss
incorrect, your score is -3
___ ____ is a term for datasets so large/complex that traditional data processing is inadequate: big data
correct, your score is 2
a variable that can only be true or false is: integer
incorrect, your score is -1
a variable that can only be true or false is: boolean
correct, your score is 4
U.S. military department that created the Internet for scientific and military communications is: the meme army
incorrect, your score is 1
```

-=-=-=-=-=-=-=-=-=-

GOLD MEDAL CHALLENGE: Add a global variable called lives. The player starts with 3 lives and loses 1 life with each incorrect answer. After an incorrect answer tell the player how many lives they have remaining. If they ever have 0 lives remaining, then exit the program.
