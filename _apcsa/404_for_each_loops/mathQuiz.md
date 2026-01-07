---
layout: project
category: 404_for_each_loops
title: Math Quiz
---
Create a simple THREE question math quiz.

Create an array of boolean value that will

Question 1 must be any simple math problem that is answered with an integer...
  - What is 3 + 4?
  - What is 6 / 2?

You must validate that the user typed a number. While userInput has next int is false, print userInput is not a number and then ask the question again.

If the user enters an int,
  - compare it with the correct answer
  - store either True or False in index 0 of boolean array

Question 2 MUST be a text question...
  - SOHCAHTOA is a way of remembering sine, cosine, and _______:
  - The most common triangle that is used in trigonometry is the _______ triangle:

Compare the user string (converted to lowercase) with the correct answer (converted to lowercase) and store either True or False in index 0 of boolean array

Question 3 MUST be a text question...
  - The etymology of trigonometry comes from the Greek words for _______ and measure:
  - 5 / 0 = 0. Type "true" or "false":

Compare the user string (converted to lowercase) with the correct answer (converted to lowercase) and store either True or False in index 0 of boolean array

Use a for each loop to loop through the boolean array.
  - Say whether each question was "correct" or "incorrect" (For example, "Question 1 was correct")
Tell the user their final score.
