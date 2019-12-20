---
layout: project
category: console
title: Global Variables
---

This code will cause an error...
```
x = 5

def double():
    x = x * 2

double()
double()
print(x)
```
The error message reads, ``` UnboundLocalError: local variable 'x' referenced before assignment ```

One solution would be to pass variable x as an argument. That will fix the error message, BUT when you print x at the end you will find that *x is still 5*. Changes made inside of the function will not effect variable x outside of the function. You would need to return x and save the returned value back in x, like this ```x = double(x)```

### A FASTER Solution Would Be To Make X A Global Variable

```
x = 5

def double():
    global x
    x = x * 2

double()
double()
print(x)
```
Now, changes made inside of the function WILL effect variable x outside of the function. When you print x at the end you will find that x is 20
