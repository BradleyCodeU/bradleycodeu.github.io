---
layout: project
category: ch3implementingclasses
title: Ch3 Employee
---
Implement a class Employee. An employee has a name (a string) and a salary (a double).

Provide a constructor with 2 arguments
```
public Employee(String empName, double sal)
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
Supply an EmployeeTester class that tests all methods.
