Use the arrow keys to move Tina. In this example, the left arrow key rotates Tina to the left. Why doesn't the Up arrow key work? Can you fix it? Can you add code so that the right arrow key rotates Tina to the right?
```python.run
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

screen.onkey(goLeft,"Left") #notice that goLeft doesn't look like the normal goLeft()
screen.onkey(goFwd,"Up")
screen.listen()
```