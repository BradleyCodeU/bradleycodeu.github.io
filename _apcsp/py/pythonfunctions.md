---
layout: project
category: py
title: Python Functions
---
Here is a simple function. It requires one argument. If I give it the argument "Steve", then it prints "Hello Steve!"
<pre>
def bonjourPerson(name):
  text = "Bonjour " + name + "!"
  return text
</pre>

## Creating a Function
In Python a function is defined using the def keyword:

<pre>
def bonjourPerson(name):
</pre>

## Calling a Function
Calling a function means "running" that function. Functions do not run until you call them. To call a function, use the function name followed by parenthesis:

<pre>
bonjourPerson("Steve")
bonjourPerson("Fatima")
</pre>

## Arguments

Information can be passed to functions as an argument. Arguments are specified after the function name, inside the parentheses. In the example above, the first function call passes the argument "Steve" and the second function call passes the argument "Fatima"

When you are defining a function you can add as many arguments (aka parameters) as you want, just separate them with a comma. Here is an example that requires two arguments:
<pre>
def makeStudentEmail(firstName, lastName):
  email = firstName + "." + lastName + "\@hilliardschools.org"
  return email
</pre>

After defining that function, you can call the function by passing two arguments:
<pre>
makeStudentEmail("Ariana", "Grande")
makeStudentEmail("Justin", "Bieber")
makeStudentEmail("Taylor", "Swift")
</pre>

You function might not require any arguments:
<pre>
def byebye():
  for i in range(10):
    print("bye" * i)
  return True
</pre>

Call a function that doesn't require arguments like this:
<pre>
byebye()
</pre>
