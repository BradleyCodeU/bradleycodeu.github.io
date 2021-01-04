---
layout: project
category: console
title: Console Random Int Array
---

Concepts: arrays, random numbers, append, for loop, for each loop, modulus, concatenate

Read this tutorial about [Python lists](https://www.geeksforgeeks.org/python-list/)

Python lists are sets of numbers, strings, booleans, or objects and are just like arrays in other languages. A single list may contain a mix of DataTypes like Integers, Strings, as well as Objects. Lists are mutable (can be changed) which means that you can add new items to the list or remove items from the list.

Read this tutorial about [how to append something to a list/array](https://www.geeksforgeeks.org/append-extend-python/)

Lists are objects and have methods that only work on list objects. For example...
```
mylist = [79, False, 0.5, "apple"]
mylist.insert(0, "coconut")
mylist.append("banana")
mylist.sort()
mylist.insert(1, "orange")
mylist.pop()
mylist.reverse()
```

Read this tutorial about [how to create a For Each loop to iterate through a list/array](https://www.geeksforgeeks.org/iterate-over-a-list-in-python/)

Most programming languages have a "For Each" loop, a kind of loop that allows you to grab items from the list one at a time. In Python a For Each loop looks like this...
```
thislist = ["apple", "banana", "cherry"]
for each in thislist:
  print(each)
```

Finally, what is modulus? The % operator returns the remainder of two numbers. It is useful for detecting even/odd numbers (like to make striped patterns), for restricting a value to a range (like to wrapping an animated ball around the screen), for finding numbers that are multiples of each other (36 is a multiple of 9), and for converting one unit to another.
```
mynumber == 7
if (mynumber % 2) == 0:
  print("Even number")
if (mynumber % 2) == 1:
  print("Odd number")
```

### Project Directions:

Copy/paste the following direction comments into your code...

<iframe src="https://trinket.io/embed/python/f88dae8c78?outputOnly=true&runOption=run&start=result" width="100%" height="600" frameborder="0" marginwidth="0" marginheight="0" allowfullscreen></iframe>
