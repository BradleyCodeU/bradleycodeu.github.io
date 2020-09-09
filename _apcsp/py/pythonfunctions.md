---
layout: project
category: py
title: Python Functions
---
A function is a behavior. The names of functions should be verbs. For example, makeStudentEmail or sayBonjour. Functions help us break large tasks down into smaller individual actions that are easy to test and can be reused. Using functions becomes more important as we start to write longer and more complex programs.

Here is a simple function. It requires one argument. If I give it the argument "Alex", then it prints "Bonjour Alex!" If I give it the argument "Steve", then it prints "Bonjour Steve!"
```python
def sayBonjour(name):
  text = "Bonjour " + name + "!"
  return text
```

## Creating a Function
In Python a function is defined using the <b>def</b> keyword. A function has to be *defined* (or created) before it can be *called* (or used) by the program.

```python
def sayBonjour(name):
  # code goes here
  # code MUST be indented
```

## Calling a Function
Calling a function means "running" that function. Functions do not run until you call them. To call a function, use the function name followed by parenthesis:

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

A function often returns some data. When the function is called, we usually store the returned data in a new variable.  Here is an example:

```python
newVariable = functionName()
print(newVariable)
```

## Arguments

Information can be passed to functions as an argument. Arguments are specified after the function name, inside the parentheses. In the example above, the first function call passes the argument "Steve" and the second function call passes the argument "Fatima"

When you are defining a function you can add as many arguments (aka parameters) as you want, just separate them with a comma. Here is an example that requires two arguments:
```python
def makeStudentEmail(firstName, lastName):
  email = firstName + "." + lastName + "\@hilliardschools.org"
  return email
```

After defining that function, you can call the function by passing two arguments:
```python
makeStudentEmail("Ariana", "Grande")
```

Here is another function call with two arguments...
```python
makeStudentEmail("Justin", "Bieber")
```

You function might not require any arguments:
```python
def printBye():
  for i in range(10):
    print("bye" * i)
  return True
```

Call a function that doesn't require arguments like this:
```python
printBye()
```

## Summary

A function is a package for code.  You can write any code inside a function, including calling other functions.

A function has to be defined (created) before it can be called (used) by the program.

A function can be called at any time during the program by typing its identifier.

Functions allow us to code common tasks once and reuse them many times.  This helps make our program smaller and more efficient.

Function names are created using lowercase letters with underscores between words.  This is not a syntax rule but it is the common convention.  Using this instead of camel case helps us differentiate between functions and variables/lists when we are reading the code.

You may hear the terms ‘procedure’ or ‘subroutine’ referred to in other programming languages.  In more complex languages these are other ‘flavours’ of function that work in slightly different ways.  However, at beginner level Python handily combines them all into functions.

A function will not run when it is created (using the def command). It has to be called in the program.

A function can have many arguments.  They are separated by commas in the brackets when the function is defined.
