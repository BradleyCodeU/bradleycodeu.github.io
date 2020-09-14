---
layout: project
category: py
title: Python Functions
---
A function is a behavior. It completes a task. The names of functions should be verbs. For example, makeStudentEmail, sayBonjour, or sendTweet. Functions help us break large tasks down into smaller individual actions that are easy to test and can be reused. Using functions becomes more important as we start to write longer and more complex programs.

Here is a simple function. It requires one argument. If I give it the argument "Alex", then it prints "Bonjour Alex!" If I give it the argument "Steve", then it prints "Bonjour Steve!"
```python
def sayBonjour(name):
  text = "Bonjour " + name + "!"
  return text
```

## Creating a Function
In Python a function is defined using the ```def``` keyword. A function has to be *defined* (or created) before it can be *called* (or used) by the program.

```python
def sayBonjour(name):
  # code goes here
  # code MUST be indented
```

## Calling a Function
Calling a function means "running" that function. You have probably already called the print function by writing: ```print("Hello world")```. Functions do not run until you call them. To call a function, use the function name followed by parenthesis:

```python
# call the sayBonjour function
text = sayBonjour("Alex")
# call the print function
print(text)
```

Here are two other function calls...
```python
text1 = sayBonjour("Steve")
text2 = sayBonjour("Fatima")
```

This is very useful if your program needs to perform the same task multiple times or at different points in the code. Instead of writing the same code for the task over and over, we would create one function and call it as many times as we need.

## Return Values

A function often returns some data. When the function is called, we usually save the returned data in a new variable. Here is an example:

```python
newVariable = functionName()
print(newVariable)
```

Here is a build-in Python function named ```int()``` that converts a decimal number to an integer.
```python
myNumber = 5.001
myNumber = int(myNumber) # Convert to integer & save back in myNumber
```

Notice that if you forget to save the returned value in a variable, then the conversion is not saved.
```python
myNumber = 5.001
int(myNumber) # Forgot to save the return value
print(myNumber) # Oops! This will still print 5.001
```

Here is how to *correctly* convert from a decimal number to an integer. Don't forget to save the return value:
```python
myNumber = 5.001
myInteger = int(myNumber)
print(myInteger) # It worked! It prints: 5
```

## Arguments

Information can be passed to functions as an argument. Arguments are specified after the function name, inside the parentheses. In the example below, the first function call passes the argument "Steve" and the second function call passes the argument "Fatima"

```python
text1 = sayBonjour("Steve")
text2 = sayBonjour("Fatima")
```

You can call a function that requires two arguments like this:
```python
makeStudentEmail("Ariana", "Grande")
```

Here is another function call with two arguments...
```python
makeStudentEmail("Justin", "Bieber")
```

When you are defining a function you can add as many arguments (aka parameters) as you want, just separate them with a comma. Here is an example that requires two arguments:
```python
def makeStudentEmail(firstName, lastName):
  email = firstName + "." + lastName + "@hilliardschools.org"
  return email
```



You function might not require any arguments:
```python
def sayBye():
  for i in range(10):
    print("bye" * i)
  return True
```

You can call a function that doesn't require arguments like this:
```python
sayBye()
```

## Summary

- Function names should be verbs. This is not a syntax rule but it is the common convention.
- A function is a container for code. You can write any code inside a function, including calling other functions.
- A function has to be *defined* (or created) before it can be *called* (or used) by the program.
- A function will not run when it is first created (using the def command). It has to be called in the program.
- A function can be called at any time during the program by typing its identifier (name follow by parentheses).
- Functions allow us to code common tasks once and reuse them many times. This helps make our programs smaller, more efficient, and easier to read.
- A function often returns some data. When the function is called, we usually save the returned data in a new variable.
- A function can have many arguments. They are separated by commas in the parentheses when the function is defined.
