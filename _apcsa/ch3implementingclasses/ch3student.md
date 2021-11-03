---
layout: project
category: ch3implementingclasses
title: Ch3 Student
---
Implement a class Student. For the purpose of this exercise, a student has...

  - a name
  - an ID number (a random number from 1000-3000)
  - an email (lowercase first two letters of name plus their ID number plus "@example.com")
  - a total quiz score
  - a counter that tracks the number of quizzes

Supply an appropriate constructor (in which the name can be supplied as a argument) and methods...

  - getName()
  - getIdNumber()
  - getEmail()
  - addQuiz(int score)
  - getTotalScore()
  - getAverageScore()

To compute the average, you also MUST track the number of quizzes that the student has taken. You are NOT storing the individual quiz scores in a list, instead you are keeping a running total. *Don't forget to check if the number of quizzes equals 0 before calculating the average score. Otherwise, division by zero could occur.*

Supply a StudentTester class that tests ALL methods. Print your expected results and then the actual results.
