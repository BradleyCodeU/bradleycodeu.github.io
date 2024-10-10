---
layout: project
category: turtleart
title: Turtle Simple Drawing
---
Turtle Simple Drawing



Define a function that will create one simple turtle art drawing. At the end of your file, call that function. Ideas for your simple drawing include...
<table style="border-collapse: collapse; width: 100%;" border="1">
<tbody>
<tr>
<td>
Ghost<br>Pumpkin<br>UFO<br>Bat<br>Cloud<br>Candy<br>Kite<br>House<br>Tree
</td>
<td>
Pepperoni Pizza<br>Music Note (8th note or smaller)<br>Gift w/ bow on top<br>Ms. Pac-man (aka Pacman w/ bow)<br>Pair of cherries<br>Hamburger<br>Stick Person<br>Crescent moon<br>Bunches of grapes
</td>
<td>
Heart<br>Cat face<br>Bunny face<br>Butterfly<br>Triforce<br>Umbrella<br>Spider<br>Mushroom<br>Sun
</td>
<td>
Car or Truck<br>Flower<br>Peace sign<br>Dollar sign<br>Snowman<br>Block letter B<br>Bubble letter B<br>3D Cheese Wedge<br>3D Cube
</td>
</tr>
</tbody>
</table>


NOT just a squiggle or spiral. Your drawing should be 12 lines of code or more. Should draw 6 or more lines/shapes. Like this...

![smiley](https://bradleycodeu.github.io/apcsp/turtleart/TurtleSimpleDrawing/turtlesmiley.jpg)


Here are some of the basic Python Turtle commands you may need:
```python
from turtle import *
tracer(0)
Turtle()
penup()
goto()
pendown()
forward()
left()
right()
update()
mainloop()
```

If your code is written correctly, then you can draw one on the left side, draw one on the right side, and it will still look good. You should NOT be using goto() inside of your function because it will always draw at that same x, y position. Instead you can use goto(), then call your function. For example... 
```
goto(-100,0)
drawGhost()
goto(100,0)
drawGhost()
```

### GOLD MEDAL CHALLENGE

Add an angle argument to your function. Use the angle to control the direction that the shape is facing. For example, `drawGhost(angle=0)` might draw a normal ghost that is upright and `drawGhost(angle=45)` would draw a ghost that is rotated 45 degrees. Do NOT use any if statements.

Add a size argument to your function. Use the size to control the scale of the shape. For example, `drawGhost(angle=0,size=0.5)` would draw a small ghost and `drawGhost(angle=0,size=1.5)` would draw a big ghost. Do NOT use any if statements.