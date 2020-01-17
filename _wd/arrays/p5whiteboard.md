---
layout: project
category: arrays
title: P5 Whiteboard
---

Create a P5js application that allows you to draw pictures.

![whiteboard demo](/wd/arrays/whiteboardDemo.gif)

In your HTML file...

Create a div that will contain drawing tools:
  - An [HTML5 color picker](https://www.w3schools.com/tags/att_input_type_color.asp)
  - An Erase button using a standard HTML button

Create a div and give it the ID "canvasDiv"

In your Javscript file...

Create an array that will store Dot objects.

Add the following P5js setup function...
```
function setup() {
  let myCanvas = createCanvas(windowWidth,windowHeight);
  myCanvas.parent("canvasDiv");
}
```

Create a Dot class.
  - Each dot has a dot color, x coordinate, and y coordinate.
  - Create a show method
    - Set the fill to the dot color
    - Draw an ellipse at the x and y coordinates

If [mouseIsPressed](https://p5js.org/reference/#/p5/mouseIsPressed), then add a new Dot to the array.

If the Erase button is clicked, then remove everything in the array.

-=-=-=-=-=-=-=-

If you have taken 1 or more computer science classes in the past, add 1 or more extra drawing tools...
  - A color palette (several buttons with common colors so that you can quickly select common colors)
  - A random color button
  - A [range slider](https://www.w3schools.com/tags/att_input_type_range.asp) that will change the pen size
  - Create two radio buttons so that you can switch between Pencil (add one Dot at the mouse location) and Spray Paint (add multiple slightly random dots near the mouse)
