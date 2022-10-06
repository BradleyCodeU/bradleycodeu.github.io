---
layout: project
category: ch3implementingclasses
title: Ch3 Student
---
Implement a class Student. For the purpose of this exercise, a student has...

  - a name
  - an ID number (a random number from 1000-3000 that is assigned within the constructor)
  - an email (lowercase first two letters of name plus their ID number plus "@example.com")
  - a total quiz score (a "running total" of points earned)
  - a counter that tracks the number of quizzes

Supply one constructor in which the name can be supplied as an argument.

Implement the following methods...

  - addQuiz(int score) NOTE: Adds score to the total quiz score AND adds 1 to the counter
  - getName()
  - getIdNumber()
  - getEmail()
  - getTotalScore()
  - getAverageScore()

To compute the average, you MUST count the number of quizzes that the student has taken. You are NOT storing the individual quiz scores in a list, instead you are keeping a running total. *Don't forget to check if the number of quizzes equals 0 before calculating the average score. Otherwise, division by zero could occur. If the number of quizzes equals 0, then return an average score of 0.*

Complete the StudentTester class so that it tests ALL methods. Print your expected results and then the actual results.

SAMPLE OUTPUT
```
Added the following quiz scores for Beth: 95, 45, 65, 85, 25
Expected results are Total = 315, Average = 63
Actual results
Name = Beth
Id Number = 1342
Email = be1342@example.com
Total Score = 315
Average Score = 63.0
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
    System.out.println("Expected results are Total = ?, Average = ?");
    System.out.println("Actual results");
    System.out.println("Name = ");
    System.out.println("Id Number = ");
    System.out.println("Email = ");
    System.out.println("Total Score = ");
    System.out.println("Average Score = ");
  }
}
```


<!--

@Test
public void getName() {
  Student a = new Student("Amy");
  assertEquals("Amy", a.getName());
  Student b = new Student("Billy");
  assertEquals("Billy", b.getName());
}
@Test
public void getIdNumber() {
  Student a = new Student("Amy");
  int result1 = a.getIdNumber();
  int result2 = a.getIdNumber();
  assertEquals(result1, result2);
  assertEquals(true, result1 > 999);
  assertEquals(true, result1 < 3001);
}
@Test
public void getEmail() {
  Student a = new Student("Xyz");
  int result1 = a.getIdNumber();
  String email1 = a.getEmail();
  int result2 = a.getIdNumber();
  String email2 = a.getEmail();
  int result3 = Integer.parseInt(email1.substring(2,6));
  assertEquals(email1, email2);
  assertEquals(result1, result2);
  assertEquals(result2, result3);
  assertEquals(true, email1.contains("xy"));
  assertEquals(true, email1.contains(""+result1));
  assertEquals(true, email1.contains("@example.com"));
}
@Test
public void getTotalScore() {
  Student b = new Student("Billy");
  assertEquals(0, b.getTotalScore());
  b.addQuiz(99);
  assertEquals(99, b.getTotalScore());
  b.addQuiz(100);
  assertEquals(199, b.getTotalScore());
}
@Test
public void getAverageScore() {
  Student b = new Student("Billy");
  assertEquals(0.0, b.getAverageScore(), 0.00000000001);
  b.addQuiz(99);
  assertEquals(99.0, b.getAverageScore(), 0.00000000001);
  b.addQuiz(100);
  assertEquals(99.5, b.getAverageScore(), 0.00000000001);
  b.addQuiz(65);
  assertEquals(88.0, b.getAverageScore(), 0.00000000001);
  b.addQuiz(70);
  assertEquals(83.5, b.getAverageScore(), 0.00000000001);
}

-->
