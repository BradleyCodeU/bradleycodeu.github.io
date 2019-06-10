In this project you will use while loop, not, input, print, and a few other things.

Let's discuss loops. Pre-conditional loops include while loop, for loop, and for each loop. The most common post-conditional loop is the do...while loop. Let's look at some pseudocode for using a while loop for a number guessing game
1. Declare variables for the number to guess and the user's guess
1. Generate a random number between 1 and 10
1. Print message asking user to enter their guess
1. Scan in guess
1. Start while loop that will continue as long as the guess is wrong
   1. Print message saying guess is wrong
   1. Get another guess from the user
1. Print message saying the guess is right

Notice that in the while loop version of the program, it is necessary to read in the user's first guess before the loop so there would be a value for comparison in the loop condition. The body of the while loop will NOT happen if this condition is false.

For THIS project you will use a **pre-conditional loop**. In an upcoming project you will use a *post-conditional loop*.

## Project Details:

Create a function called askQuestion. It requires two parameters: questionText and questionAnswer. It does not return a value.

Introduce the game by explaining, "This is a Multiple Choice Quiz Game with 3 Questions. You will answer each question by typing the correct letter: 1, 2, or 3."

Ask the first question. For example... "Who painted the Mona Lisa? 1) Pablo Picasso 2) Leonardo DaVinci 3) Vincent Van Gogh"

While the user input does not equal the correct answer, say "Try Again" and ask the first question again. It will repeat saying "Try Again" and asking the question FOREVER, unless the player answers correctly. When the answer is correct, the code will automatically leave the while loop.

Say "Correct"

You should know what to do for the remaining 2 questions. Rather than starting over and re-typing the code for each question... you might want to copy and paste the code for question 1 and just change some details.

Here is a Sample Run
```
This is a Multiple Choice Quiz Game with 3 Questions.
You will answer each question by typing the correct letter: a, b, or c.
What language is this coded in? a = Python b = Scratch c = Roblox script b
Try again.
What language is this coded in? a = Python b = Scratch c = Roblox script a
Correct!
Which of these isn't an online game? a = Roblox b = Minecraft c = Lego a
Try again.
Which of these isn't an online game? a = Roblox b = Minecraft c = Lego c
Correct!
Is this the last question? a = yes b = no c = Roblox a
Correct!
>>> 
```
-=-=-=-=-=-=-=-=-=-

GOLD MEDAL CHALLENGE: Your entire project uses only 7 lines of code.

![goldmedal](/threeQuestions.jpg)
