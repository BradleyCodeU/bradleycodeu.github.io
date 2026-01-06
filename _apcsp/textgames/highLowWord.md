---
layout: project
category: textgames
title: High Low Word
---
Read this article about the [random choice method](https://www.w3schools.com/python/ref_random_choice.asp){:target="_blank"}

Read this article about the [Python string lower method](https://www.w3schools.com/python/ref_string_lower.asp){:target="_blank"}

High Low (aka Hi-Lo Guessing Game) is a computer game in which the computer randomly selects an integer from 1-100. You keep guessing numbers until you find the computer's number, and the computer tells you each time if your guess was too high or too low.

You will NOT be creating the High Low game with numbers, but with words. The computer randomly selects one of 30 possible words. You keep guessing words (for example, "mom") and the computer tells you either "The secret word is before mom" or "The secret word is after mom"


Define a function named randomSecret that requires 3 arguments (list1, list2, list3) and returns 1 string. Concatenate the arrays just like you would concatenate strings: combinedList = list1 + list2 + list3. If the length of the combined list is 0, then always return the word "oops". Otherwise, use the random choice function to randomly select one word from the combined list. Convert the word to lowercase. Return the word.
```
randomSecret( ["Cat", "Cat"], ["CAT", "CAT"], ["cAt", "cAt"]) → "cat"
randomSecret( ["RAT"], [ ], [ ]) → "rat"
randomSecret( [ ], [ ], [ ]) → "oops"
```

Define a function named checkGuess that requires 2 arguments (password, userGuess) and returns 1 string. Convert the userGuess to lowercase. Compare password and userGuess with greater than, less than, and equal to operators.  If the userGuess is less than the password, then return "The secret word is after " then concatenate the userGuess.
If the userGuess is greater than the password, then return "The secret word is before " then concatenate the userGuess. Otherwise, return "You got it!"
```
checkGuess("cat","dog") → "The secret word is before dog"
checkGuess("cat","ant") → "The secret word is after ant"
checkGuess("cat","cat") → "You got it!"
```


Here is the pseudocode for the main function. NOTICE that the number of hashtags show you how far each line should be indented.
```
def main():
  # create 3 arrays with 10 words in each array. You might create an array of 10 fruits, another array of 10 colors, and an array of 10 cities. 
  # call randomSecret function with 3 arrays as arguments then save what it returns in a variable
  # output "I am thinking of a secret word. Take a guess and I'll tell you if the secret word is before your word or after your word."
  # start a forever loop
  # # output Guess a word
  # # save the userInput in a variable
  # # call checkGuess function with secretWord and userInput then print what it returns
  # # if the userInput is the secret word
  # # # ask Do you want to play again? y or n?
  # # # if userInput is y
  # # # # call the main function
  # # # # break out the forever loop
  # # # otherwise
  # # # # break out the forever loop
```
