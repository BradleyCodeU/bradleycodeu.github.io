---
layout: project
category: u06a_arrays
title: Poker Dice
---
You will be writing a Java program that plays the game Poker Dice. In
this game five dice are rolled and scored as if they were a hand of
playing cards (Pair, Two pair, three of a kind, full house, etc.). You
will be using arrays to implement the ability for a user to roll dice,
decide which dice to re­roll and to compute the score for someone
playing a solitaire game of Poker Dice.

### Project Description
For this lab you will write a Java program
that plays the game Poker Dice. In this game, five dice are rolled and
scored as if they were a hand of playing cards. The game goes through
two separate phases. In the first phase, a "hand" of dice is presented
to the player. The player then selects which dice he wants to keep and
which he wants to re­-roll. Once that decision is finished, all of the
dice that the player has marked to re­-roll are re­rolled and the final
"hand" of dice is displayed. The hand should then be scored according to
the rules of Poker Dice (given below) and the result displayed on the
screen.

### Scoring Poker Dice
The following table shows the values of
different Poker Dice hands in order (i.e. Five of a Kind beats Four of a
Kind, Four of a Kind beats Full House, etc.):


| Hand  | Description  | Example(s)  |
|---|---|---|
| Five of a kind  | All five dice show the same value  | [1, 1, 1, 1, 1] and [5, 5, 5, 5, 5]  |
| Four of a kind  | Four of the five dice show the same value   | [1, 2, 1, 1, 1] and [4, 4, 4, 3, 4]  |
| Full house  | Three of the five dice show the same value, the other two show a different matched value  | [1, 2, 2, 1, 1] and [3, 3, 3, 5, 5]  |
| Straight  | All five dice together show a sequence of values 1­-5 or 2­-6  | [2, 3, 1, 5, 4] and [6, 3, 2, 4, 5]  |
| Three of a kind  | Three of the five dice show the same value, the other two show different values  | [1, 2, 3, 1, 1] and [3, 3, 3, 2, 5]  |
| Two pair  | Two of the five dice show the same value, and two other dice show a different shared value  | [1, 2, 2, 1, 3] and [3, 5, 6, 3, 6]  |
| One pair  | Two of the five dice show the same value, the other dice show different values  | [1, 2, 2, 3, 4] and [3, 5, 6, 3, 1]  |
| Highest Card X  | If none of the above hands exist, then the score for the hand is "Highest Card X" where X is the highest value in the list  | [2, 6, 3, 1, 4] Highest Card 6 and [1, 2, 6, 4, 5] Highest Card 6  |


Note that for scoring, only the highest score is reported. So a hand
like [5, 5, 5, 5, 5] should only be reported as "Five of a Kind" even
though it also fits the definition of "Four of a Kind" and "Two Pair"
etc. The idea behind scoring is that the hand is scored with only the
best possible result, and scores are showed in descending order in the
table above.

In this assignment you are required to implement a scoring function that
scores all of the above hands EXCEPT for the Straight. Your code must
correctly score 5 of a kind, 4 of a kind, full house, three of kind, two
pair, one pair, and highest card X "hands" of dice.

For an EXTRA CHALLENGE, add the ability to score Straights to your scoring function.

### Starter Template
**For this assignment you must start with the following template of Java
code.** [PokerDice.java Starter Code](/apcsa\u06a_arrays\PokerDice.java)

For this assignment you WILL want to add extra methods beyond the
methods defined in the template. Feel free to add any methods you find
useful, but make sure that you add comments indicating what they do
following the form of the rest of the comments in the code.

NOTE: To generate a random number between 1 and 6, use the Math.random()
function. 

### Sample Output:
This is a sample transcript of what your program
should do. Some items are user input and should not included in your program.
```
    Your current dice: 4 2 1 4 6
    Select a die to re-roll (-1 to keep remaining dice): 1
    Your current dice: 4 0 1 4 6
    Select a die to re-roll (-1 to keep remaining dice): 2
    Your current dice: 4 0 0 4 6
    Select a die to re-roll (-1 to keep remaining dice): 4
    Your current dice: 4 0 0 4 0
    Select a die to re-roll (-1 to keep remaining dice): -1
    Keeping remaining dice...
    Rerolling...
    Your final dice: 4 2 3 4 6
    One pair!
    Would you like to play again [Y/N]?: y
    Your current dice: 5 6 6 3 2
    Select a die to re-roll (-1 to keep remaining dice): 0
    Your current dice: 0 6 6 3 2
    Select a die to re-roll (-1 to keep remaining dice): 3
    Your current dice: 0 6 6 0 2
    Select a die to re-roll (-1 to keep remaining dice): 4
    Your current dice: 0 6 6 0 0
    Select a die to re-roll (-1 to keep remaining dice): -1
    Keeping remaining dice...
    Rerolling...
    Your final dice: 6 6 6 5 4
    Three of a kind!
    Would you like to play again [Y/N]?: y
    Your current dice: 1 2 6 2 2
    Select a die to re-roll (-1 to keep remaining dice): 0
    Your current dice: 0 2 6 2 2
    Select a die to re-roll (-1 to keep remaining dice): 2
    Your current dice: 0 2 0 2 2
    Select a die to re-roll (-1 to keep remaining dice): -1
    Keeping remaining dice...
    Rerolling...
    Your final dice: 1 2 6 2 2
    Three of a kind!
    Would you like to play again [Y/N]?: y
    Your current dice: 3 4 5 3 1
    Select a die to re-roll (-1 to keep remaining dice): 0
    Your current dice: 0 4 5 3 1
    Select a die to re-roll (-1 to keep remaining dice): -1
    Keeping remaining dice...
    Rerolling...
    Your final dice: 1 4 5 3 1
    One pair!
    Would you like to play again [Y/N]?: n
    Goodbye!
```
Note that your output depends on the choices made by the user. Remember
to check that the user inputs a valid index for a die to re­roll
(between 0 and 4, or 1 to quit) and that the user inputs either a Y or
an N when asked to play again. The play again response should accept
either capital or lower­case letters


A second sample run might look like this (note that this
transcript implements the extra challenge that allows you to score a
Straight on this assignment) :
```
    Your current dice: 3 1 5 4 2
    Select a die to re-roll (-1 to keep remaining dice): 6
    Error: Index must be between 0 and 4 (-1 to quit)!
    Select a die to re-roll (-1 to keep remaining dice): -2
    Error: Index must be between 0 and 4 (-1 to quit)!
    Select a die to re-roll (-1 to keep remaining dice): -1
    Keeping remaining dice...
    Rerolling...
    Your final dice: 3 1 5 4 2
    Straight!
    Would you like to play again [Y/N]?: Q
    ERROR! Only 'Y' or 'N' allowed as input!
    Would you like to play again [Y/N]?: q
    ERROR! Only 'Y' or 'N' allowed as input!
    Would you like to play again [Y/N]?: n
    Goodbye!
```
HINT: Notice that the code template includes a method named getCounts()
that provides an array of counts for each value in your dice set. A
number that shows up 5 times will have a count of 5. A number that shows
up 4 times will have a count of 4. Think about how these counts apply to
all of the different possible combinations detailed above.

EXTRA CHALLENGE HINT: It is easiest to figure out whether your dice are
a Straight or not if you first put them into sorted order. For this you
should look up the library method Arrays.sort() in the Java
documentation.

### Objectives:

-   Practice with programming fundamentals
    -   Variables -­ Declaration and Assignment
    -   Primitive types
    -   Simple keyboard input and text display output
    -   Branching: if­-else, if-­else syntax, nested if­-else syntax
    -   Nested while loops
    -   Methods -­ simple functions and procedures
    -   Arrays ­- collections of variables
-   Works towards the following Course Goals:
    -   Competency with using basic coding features of a high­-level
        imperative programming language
    -   Competency with writing computer programs to implement given
        simple algorithms
    -   Familiarity with designing simple text­-oriented user interfaces
