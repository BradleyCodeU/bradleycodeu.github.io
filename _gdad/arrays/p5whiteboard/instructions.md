---
layout: project
category: arrays
title: P5 Whiteboard
---

Create a P5js application that allows you to draw pictures.

![whiteboard demo](/wdarchive/arrays/whiteboardDemo.gif)

In your HTML file...

Create a div that will contain drawing tools:
  - An [HTML5 color picker](https://www.w3schools.com/tags/att_input_type_color.asp){:target="_blank"}
  - A CLEAR button using a standard HTML button
  - Two [radio buttons](https://www.w3schools.com/tags/att_input_type_radio.asp){:target="_blank"} so that you can switch between Pencil (which adds Dots at the mouse location) and Eraser (which erases Dots at the mouse location). Both buttons will have same name... name="PencilEraserSwitch" but they will both have different ids and different values. For example... id="pencil"

Create a div and give it the ID "canvasDiv"

In your Javscript file...

- Create an array that will store Dot objects.
- Create a variable called pencilButton and set it to document.getElementById("pencil"). Now you don't have to re-type document.getElementById("pencil") and you can use pencilButton.checked whenever you want to know if it is selected or not.
- Create a variable called eraserButton and set it to document.getElementById("eraser"). Now you don't have to re-type document.getElementById("eraser") and you can use eraserButton.checked whenever you want to know if it is selected or not.

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

If [mouseIsPressed](https://p5js.org/reference/#/p5/mouseIsPressed) and pencilButton.checked == true, then add a new Dot to the array.

If [mouseIsPressed](https://p5js.org/reference/#/p5/mouseIsPressed) and eraserButton.checked == true, then remove any Dots near the mouse. Like this...
```
if (mouseIsPressed && eraserButton.checked == true) {
  // I'm guessing that your array is named myArray ¯\_(ツ)_/¯
  // Loop through myArray
  for (let i = 0; i < myArray.length; i++){
    // Check the distance from the mouse to the Dot
    let minimumDistance = 5;
    if (dist(mouseX, mouseY, myArray[i].x, myArray[i].y) < minimumDistance){
      // Remove that Dot
      myArray.splice(i,1);
    }
  }
}
```

If the CLEAR button is clicked, then remove everything in the array.

-------

If you have taken 1 or more computer science classes in the past, add 1 or more extra drawing tools...
  - A color palette (several buttons with common colors so that you can quickly select common colors)
  - A random color button that randomizes the color once each time it is clicked
  - A "Confetti Mode" checkbox that (if checked) randomizes the color before every new Dot is added
  - A [range slider](https://www.w3schools.com/tags/att_input_type_range.asp){:target="_blank"} that will change the pen size
  - Add a 3rd radio button, Spray Paint: add multiple slightly random dots near the mouse
