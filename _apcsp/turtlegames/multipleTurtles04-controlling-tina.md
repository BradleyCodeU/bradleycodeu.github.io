---
layout: project
category: turtlegames
title: Controlling Tina
---
Use the arrow keys to move Tina. In this example, the left arrow key rotates Tina to the left. Why doesn't the Up arrow key work? Can you fix it? Can you add code so that the right arrow key rotates Tina to the right?
```python
from turtle import *

screen = Screen()
screen.bgcolor('lightgreen')
tina = Turtle()
tina.shape('turtle')
tina.color('purple')
print("Click the green, then use your left arrow key and up arrow key")

def goLeft():
  tina.forward(1)
  tina.left(10)

def goFwd():
  forward(5) #Why doesn't the Up arrow key work? Can you fix it?

screen.onkey(goLeft,"Left") #NOTICE that goLeft doesn't look like the normal goLeft()
screen.onkey(goFwd,"Up")
screen.listen()
```
<iframe src="https://trinket.io/embed/python/82aecc7f94" width="100%" height="356" frameborder="0" marginwidth="0" marginheight="0" allowfullscreen></iframe>
