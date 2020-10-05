---
layout: project
category: ch3implementingclasses
title: Ch3 Employee
---
Implement a class Employee. An employee has a name (a string) and a salary (a double).

Provide a constructor with 2 arguments
```
public Employee(String fullName, double salary)
```
and methods
```
public String getName()
public double getSalary()
public void raiseSalary(double byPercent)
```
These methods return the name and salary, and raise the employee's salary by a certain percentage. Sample usage:
```
Employee harry = new Employee("Harry Hacker", 50000);
harry.raiseSalary(10); // Harry gets a 10 percent raise
```
Supply an EmployeeTester class that tests all methods. Print your expected results and then the actual results.

<!--
@Test
public void testGetName() {
// Failure message:
// Failed testGetName
Employee temp = new Employee("Bill Gates", 100.00);
assertEquals(temp.getName(),"Bill Gates");
Employee temp2 = new Employee("Steve Jobs", 100.00);
assertEquals(temp2.getName(),"Steve Jobs");
}
@Test
public void testRaise15() {
// Failure message:
// Failed testRaise15
Employee temp = new Employee("Bill Gates", 100.00);
temp.raiseSalary(15.0);
assertEquals(temp.getSalary(),115.0,0.0000000001);
}
@Test
public void testRaise19point9() {
// Failure message:
// Failed testRaise19point9
Employee temp = new Employee("Steve Jobs", 50000.00);
temp.raiseSalary(19.9);
assertEquals(temp.getSalary(),59950.0,0.0000000001);
}
-->
