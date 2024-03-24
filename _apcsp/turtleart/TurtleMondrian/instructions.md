# Turtle Mondrian
---

Piet Mondrian is a famous modern artist of the "De Stijl" movement. One of his most famous paintings is [Composition with Red Yellow and Blue](https://www.google.com/search?surl=1&biw=1211&bih=746&tbm=isch&sa=1&q=mondrian+composition+with+red+yellow+and+blue&oq=mondrian+comp&safe=active&ssui=on)

![Mondrian Composition with Red Yellow and Blue Right Piet Mondrian Composition C](/Mondrian-Composition-with-Red-Yellow-and-Blue-Right-Piet-Mondrian-Composition-C.-Images-via-piet-mondrian.org_.jpg)

<br>
In this project you will create a Mondrian-style Drawing Generator.

### DIRECTIONS

Define a function that will draw ONE Rectangle. Requires two arguments: height and width (You will use this in the main algorithm below)
  - Begin fill
  - Draw a rectangle using the height and width arguments and 90-deg turns
  - End fill

Main Algorithm:
  - Ask the user, Please type the name of your 1st color (for example, red):
  - Save their answer in a variable named color1
  - Ask the user, Please type the name of your 2nd color (for example, yellow):
  - Save their answer in another variable
  - Ask the user, Please type the name of your 3rd color (for example, blue):
  - Save their answer in another variable
  - Create a for loop
    - Pick up the pen
    - Create a variable called x set it to 50 multiplied by a small random integer (50 is the grid size)
    - Create a variable called y set it to 50 multiplied by a small random integer
    - Go to x, y
    - Randomly set the fill color to either "white", color1, color2, or color3
    - Create a variable called height set it to 50 multiplied by a small random integer (50 is the grid size)
    - Create a variable called width set it to 50 multiplied by a small random integer
    - Call your draw one rectangle function



EXAMPLE PROJECTS:

![example 1](/mon1.jpg)
![example 2](/mon2.jpg)
![example 3](/mon3.jpg)
![example 4](/mon4.jpg)

### GOLD MEDAL CHALLENGE

Add two more functions for shapes that could be drawn in addition to rectangles/squares. For example, my project might have rectangles, triangles, and circles.

Ask the user which shape they would like. For example, I would ask the user... "Which shape? 1 = rectangles, 2 = triangle, 3 = circles: "

Use a while True loop instead of a for loop.

Don't ask the user for color names. Instead, use RGB color values and SLOWLY change the fill color over time.