---
layout: project
category: u05a_writing_classes
title: Employee
---


Implement a class Employee. An employee has a first name (a string), last name (a string), and a salary (a double).

Provide a constructor with 3 arguments
```
public Employee(String firstName, String lastName, double salary)
```
and methods
```
public String getEmail()
public String getFullName()
public double getSalary()
public void raiseSalary(double byPercent)
```

Email should be generated in the constructor using the lowercase first-letter of the first name plus the lowercase last name plus a random number from 20-29 (inclusive) plus "@example.com". For example, the email for "Alice Hacker" might be "ahacker27@example.com"

The Employee methods return the email, return the FULL name ("Alice Hacker", for example), return the salary, and raise the employee's salary by a certain percentage.

Sample usage:
```
Employee harry = new Employee("Harry", "Hacker", 50000);
harry.raiseSalary(10); // Harry gets a 10 percent raise

Employee beth = new Employee("Beth", "Jones", 60000);
beth.raiseSalary(20); // Beth gets a 20 percent raise
```

Supply an EmployeeTester class that tests all methods. RUN TWO TESTS with different salaries and different raises. Print your expected results and then the actual results.

## Sample Output
```
Test ONE
Name of employee = Beth Jones
Email = bjones24@example.com
Salary of employee = 50000.0
Expected result after 10% raise is 55000
Actual result = 55000.0
```

STARTER CODE:
```
class EmployeeTester {
  public static void main(String[] args) {
    
    // Supply an EmployeeTester class that tests all methods. RUN TWO TESTS with different salaries and different raises. Print your expected results and then the actual results.
    
    // Sample Output #
    
    // Test ONE
    // Name of employee = Beth Jones
    // Email = bjones24@example.com
    // Salary of employee = 50000.0
    // Expected result after 10% raise is 55000
    // Actual result = 55000.0
    
    Employee person1;
  }
}
```