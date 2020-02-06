---
layout: project
category: turtlegames
title: Name the Screen Object
---
Name the Screen object and you can control it using its methods.
```python
from turtle import *

gameScreen = Screen()
gameScreen.tracer(0)
gameScreen.bgcolor('green')

def newBG():
  gameScreen.bgcolor('red')

gameScreen.onkey(newBG,"Space")
gameScreen.listen()

while True:
  gameScreen.update()
```
<iframe src="https://trinket.io/embed/python/12a39007e6" width="100%" height="600" frameborder="0" marginwidth="0" marginheight="0" allowfullscreen></iframe>
