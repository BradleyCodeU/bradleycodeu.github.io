---
layout: project
category: turtlegames
title: Naming a Turtle Object
---
Tina is a Turtle that you control with code.
But what's a turtle? It's what's called an object. This means that a programmer has written some code that we can use to do cool things. In Tina's case, she knows how to go ```
forward
```, ```
backward
```, ```
left
```, and ```
right
``` because the people who wrote the turtle class (the blueprint for creating a turtle object) thought those would be neat things for turtles to do.
```python.run
from turtle import *
tina = Turtle()

tina.shape('turtle')
tina.color('purple')
tina.left(90)
tina.forward(50)
tina.write('Hello!')
tina.backward(20)
```
<iframe src="https://trinket.io/embed/python/06ef3fff7b" width="100%" height="356" frameborder="0" marginwidth="0" marginheight="0" allowfullscreen></iframe>
