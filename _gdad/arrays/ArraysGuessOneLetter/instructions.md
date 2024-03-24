# Guess One Letter
---
## In HTML...

- Create an H1 and give it the ID guessedLettersDisplay
  - Put underscores in the H1, like this: _ _ _
- Create a text input
- Create a submit button

## In Javascript...

Create an array named secretWordLetters to hold the letters of the secret word (for example, 'F', 'O', 'X')

Create an array named guessedLetters to hold the current CORRECTLY guessed letters. Do NOT save the incorrect guesses. It will start as ' _ ', ' _ ', ' _ ' and end up looking like 'F', 'O', 'X' at the end of the game.

Write a function called guessLetter that requires one argument: checkLetter
- Loop through the secret word letters and see if checkLetter is in there.
- If the guessed checkLetter is NOT a secret word letter
  - tell the user to try again
  - clear the text input
- If the guessed checkLetter IS a secret word letter
  - change the guessed letters array
  - update the guessed letter display (for example, 'F _ _')
  - clear the text input
  - congratulate the user
  - figure out if there are any more letters that need to be guessed, and if not, congratulate the user for winning the game.

## CHALLENGE:

Make a list of random secret words. When the game begins, randomly select a secret word and add each letter to the secretWordLetters array. Make sure that guessedLetters is the same length as the random secret word.