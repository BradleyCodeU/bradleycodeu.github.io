Name the Screen object and you can control it using its methods.
```python.run
from turtle import *

myscreen = Screen()
myscreen.tracer(0)
myscreen.bgcolor('green')

def newBG():
    myscreen.bgcolor('red')

myscreen.onkey(newBG,"Space")
myscreen.listen()

while True:
  myscreen.update()
```