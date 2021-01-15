---
layout: project
category: arrays
title: Guess One Letter
---
In HTML...
- Create an H1 and give it the ID guessedLettersDisplay
  - Puts underscores in the H1, like this: _ _ _
- Create a text input
- Create a submit button

In Javascript...

Create an array named secretWordLetters to hold the letters of the secret word (for example, 'F', 'O', 'X')

Create an array named guessedLetters to hold the current guessed letters. It will start as ' _ ', ' _ ', ' _ ' and end up looking like 'F', 'O', 'X' at the end of the game.

Write a function called guessLetter that requires one argument: checkLetter
- Loop through the secret word letters and see if checkLetter is in there.
- If the guessed checkLetter a secret word letter, changed the guessed letters array to reflect that.
- Update the guessed letter display (for example, 'F _ _')
- Congratulate the user if they found a new letter.
- Figure out if there are any more letters that need to be guessed, and if not, congratulate the user for winning the game.
