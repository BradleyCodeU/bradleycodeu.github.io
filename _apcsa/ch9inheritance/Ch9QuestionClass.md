---
layout: project
category: ch9inheritance
title: Question Class
---
Ever wonder how electronic quizzes and tests are created? Your job is to make several different types of questions using the Question class.

- Choose TWO types of questions that will become subclasses of the Question class.
  - Numeric Question
  - Fill In Question
  - Multiple Choice Question
  - True/False Question
- Test each subclass in your tester class.
  - Create at least three questions of each subclass
  - Give the user feedback of correct/incorrect
  - Count and display the number of correct answers
- Turn in the Question class, your subclasses, and the tester class.


In addition to having a question text and correct answer, each question object must be able to store the point value for that question.


Sample Output
```
(true or false) The Chicago Cubs have won 4 World Series. (0.5 pts)
Your answer: false
Correct!
When did the Chicago Cubs win their first World Series? (1.5 pts)
Your answer: 1907
Correct!
(true or false) The first baseman for the Cubs is Kris Bryant. (0.5 pts)
Your answer: true
Incorrect... false
How many homeruns did Kris Bryant get during the 2018 season? (2.0 pts)
Your answer: 14
Incorrect... 13.0
(true or false) One Cub was in the 2018 Homerun Derby. (0.5 pts)
Your answer: false
Correct!
What was the best ERA of a Cubs pitcher during the 2018 season? (2.0 pts)
Your answer: 0
Correct!

You answered 4 questions correctly.
Your score is 4.5 points out of 7
```
