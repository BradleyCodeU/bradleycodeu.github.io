---
layout: project
category: 404_for_each
title: Trivia Game
---

Create a trivia game with FIVE question.

Check the APCSA Quick Reference if you need help: [https://apcentral.collegeboard.org/media/pdf/ap-computer-science-a-java-quick-reference.pdf](https://apcentral.collegeboard.org/media/pdf/ap-computer-science-a-java-quick-reference.pdf)


## Load From Text File

You MUST store the questions and answers in a text file. Use File and Scanner to load the questions and answers.


## Store In An Array

Either:
    - create a simple TriviaCard class and store your question/answer pairs in an array of type TriviaCard[]
    - OR use parallel arrays. one array with questions and one array with answers


## The Question Format

Question 1 MUST be numeric problem that is answered with a number...
  - What year was the first website created?
  - How many U.S. States are there?
  - What is 3 + 4? 
  - What is 6 / 2?


Question 2 MUST be a vocab/text question...
  - What is the last name of the president that resigned due to the Watergate Scandal?
  - SOHCAHTOA is a way of remembering sine, cosine, and _______. Fill in the blank.
  - The most common triangle that is used in trigonometry is the _______ triangle. Fill in the blank.
  - The etymology of trigonometry comes from the Greek words for _______ and measure. Fill in the blank.
  - 5 / 0 = 0. Type either "true" or "false".

The rest of the questions are your choice and can be either numeric or vocab style.

## For Each Loop

Use a for each loop to traverse the questions

Inside the for each
  - Ask each question
  - Collect the user's answer
  - Compare it with the correct answer (convert the user's answer toLowerCase() and the correct answer toLowerCase() when you compare them)
  - Say whether each question was "correct" or "incorrect" 

## Final Score

Tell the user their final score as a percent.