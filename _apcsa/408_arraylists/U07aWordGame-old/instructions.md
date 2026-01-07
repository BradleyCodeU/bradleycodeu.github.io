---
layout: project
category: 408_arraylists
title: Word Game
---

Concepts: ArrayList, Array, Strings, iteration


Word guessing game with for loop, while loop, Strings, Array, ArrayList, and For Each loop.

Create a static method named checkLetter that returns a one-emoji String.
Requires 3 arguments: String secretWord, String letter, int indexLocation.

Create a static method named checkGuess that returns a 5-emoji hint String.
Requires 2 arguments: String secretWord, String userGuess.

Create a static method named randomSecret that returns a String.
Requires 1 argument: String[ ] listOfWords.

Create a static method named getUserInput that returns a String. Requires 1 argument: Scanner input.

Create a static method named getWordList that returns a String array.

|Test|Expected Output|
|--|--|
|checkLetter("coder", "c", 0) | "✅"|
|checkLetter("coder", "r",2) |"🔀"|
|checkLetter("coder", "x", 4) | "🔳"|
|checkGuess("coder", "clown") |"✅🔳🔀🔳🔳"|
| checkGuess("coder", "raced") | "🔀🔳🔀✅🔀"|
| checkGuess("coder", "cedar") | "✅🔀✅🔳✅"|
|String[] arr1 = {"codeR","Coder","cOdEr"};<br>randomSecret( arr1 ); | "coder"|
|String[] arr2 = new String[0];<br>randomSecret( arr2 ); | "error"|
|String[] arr3 = {"java","byte","code"};<br>randomSecret( arr3 ); | "sorry"|

## Sample Run
```
Please enter a 5-letter word: audio
🔳🔳🔳🔀🔳
Please enter a 5-letter word: their
🔳🔳🔀🔀🔳
Please enter a 5-letter word: flies
🔳🔳🔀✅✅
Please enter a 5-letter word: mines
✅✅✅✅✅
YOU GOT IT!!! The secret word was mines
🔳🔳🔳🔀🔳
🔳🔳🔀🔀🔳
🔳🔳🔀✅✅
✅✅✅✅✅
```



