Not only can we rename Turtles, we can have more than one! Let's give Tina a friend named Tommy:
```python.run
from turtle import *

tina = Turtle()
tina.shape('turtle')
tina.color('red')

tina.left(90)
tina.forward(100)
tina.write("I'm Tina!")
tina.forward(20)
tina.right(90)

tommy = Turtle()
tommy.shape('turtle')
tommy.color('blue')

tommy.right(90)
tommy.forward(100)
tommy.write("I'm Tommy!")
tommy.forward(20)
tommy.left(90)
```