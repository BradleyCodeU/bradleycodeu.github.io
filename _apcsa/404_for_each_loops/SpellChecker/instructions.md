---
layout: project
category: 404_for_each
title: SpellChecker
---

In this project, you will use an array of English words from a text file to see if a given word is spelled correctly.

This project includes a text file of 10,000 English words (google-10000-english-no-swears.txt SOURCE: [https://github.com/first20hours/google-10000-english](https://github.com/first20hours/google-10000-english) ) which is read into the String array for you.



In the SpellChecker class...

1. Write a getFirstTen method that returns a new array with only the first 10 words of the String array. Use a standard for loop (for int i = 0). Do not print!


2. Write a hasWord method that takes a word as a parameter and returns true if it is in the String array. It should return false if it is not found (When can you tell that you have not found a word in the String array?). Test your code by changing the word sent to the hasWord() method in SpellCheckerApp. This algorithm is called a *linear search* where we step through the array one element at a time (the 10000 word String array) looking for a certain element. Use a for-each loop.


3. Write a method getCountStartingWith that returns an int. Take a parameter for the firstLetters as a String. Count how many items in the array begin with those firstLetters. Use a for-each loop. Use the String indexOf method.


4. Write a method getWordsStartingWith that returns an array of Strings that start with a String of letters in the String array. Your method should take a parameter for the firstLetters as a String. Use getCountStartingWith to determine how long the result array must be. Use a for-each loop. Use the String indexOf method.