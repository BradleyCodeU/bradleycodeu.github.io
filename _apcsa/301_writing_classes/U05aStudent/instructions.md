---
layout: project
category: 301_writing_classes
title: Student
---
Implement a class Student. For the purpose of this exercise, a student has...

  - a name
  - an ID number (a random number from 1000-3000 that is assigned within the constructor)
  - an email (lowercase first two letters of name plus their ID number plus "@example.com")
  - a total quiz score (a "running total" of points earned) as an int
  - a counter that tracks the number of quizzes

Supply one constructor in which the name can be supplied as an argument.

Implement the following methods...

    - addQuiz(int score) NOTE: Adds score to the total quiz score AND adds 1 to the counter
    - getName()
    - getIdNumber()
    - getEmail()
    - getTotalScore()
    - getAverageScore()

To compute the average score, you MUST count the number of quizzes that the student has taken. You are NOT storing the individual quiz scores in a list, instead you are keeping a running total. *Don't forget to check if the number of quizzes equals 0 before calculating the average score. Otherwise, division by zero could occur. If the number of quizzes equals 0, then return an average score of 0.*

Complete the StudentTester class so that it tests ALL methods. Print your expected results and then the actual results.

SAMPLE OUTPUT
```
Added the following quiz scores for Beth: 96, 45, 65, 85, 25
Expected results are Total = 316, Average = 63.2
Actual results
Name = Beth
Id Number = 1342
Email = be1342@example.com
Total Score = 316
Average Score = 63.2
```


Starter Code for StudentTester.java
```
class StudentTester {
  public static void main(String[] args) {
    Student demoStudent;
    demoStudent.addQuiz();
    demoStudent.addQuiz();
    demoStudent.addQuiz();
    System.out.println("Added the following quiz scores: 95, 65, 85");
    System.out.println("Expected Total = 
    System.out.println("Expected Average = 
    System.out.println("Actual results");
    System.out.println("Name = ");
    System.out.println("Id Number = ");
    System.out.println("Email = ");
    System.out.println("Total Score = ");
    System.out.println("Average Score = ");
  }
}
```