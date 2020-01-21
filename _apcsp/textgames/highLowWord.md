---
layout: project
category: textgames
title: High Low Word
---
Read this article about the [random choice method](https://www.w3schools.com/python/ref_random_choice.asp)

Read this article about the [Python string lower method](https://www.w3schools.com/python/ref_string_lower.asp)

High Low (aka Hi-Lo Guessing Game) is a computer game in which the computer randomly selects an integer from 1-100. You keep guessing numbers until you find the computer's number, and the computer tells you each time if your guess was too high or too low.

You will NOT be creating the High Low game with numbers, but with words. The computer randomly selects one of 30 possible words. You keep guessing words (for example, "mom") and the computer tells you either "The secret word is before mom" or "The secret word is after mom"

Define a function named randomSecretWord that requires no arguments. Create three arrays with 10 words in each array. You might create an array of 10 fruits, another array of 10 colors, and an array of 10 cities. Concatenate the arrays just like you would concatenate strings: combinedList = list1 + list2 + list3. Use the [random choice function](https://www.w3schools.com/python/ref_random_choice.asp) to randomly select one word from the combined list. Return the one randomly selected word.

Here is the pseudocode for the main function:
```
def main():
  # call randomSecretWord function and save what it returns in a variable
  # convert the random word variable to lowercase
  # output I'm thinking of a secret word. Take a guess and I'll tell you if the secret word is before your word or after your word.
  # start a forever loop
    # output Guess a word
    # save the userInput
    # convert the userInput to lowercase
    # if the userInput is less than the secret word
      # output The secret word is after then concatenate the userInput
    # if the userInput is greater than the secret word
      # output The secret word is before then concatenate the userInput
    # if the userInput is the secret word
      # output You got it!!!!!
      # ask Do you want to play again? y or n?
      # if userInput is y
        # call the main function
        # break out the forever loop
      # otherwise
        # break out the forever loop

```
