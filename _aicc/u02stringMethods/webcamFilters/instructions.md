---
layout: project
category: u02stringMethods
title: Webcam Filters
---


<p><iframe title="YouTube video player" src="https://www.youtube.com/embed/0wLtj5l6YX0?si=Z5Kzsv8Amtc1CFWC" width="560" height="315" allowfullscreen="allowfullscreen" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" frameborder="0"></iframe></p>


P5js has 8 different built-in image filters that will also work with the webcam.

Create an app that triggers a different filter when a different key is pressed.

- MUST make the canvas fill the window width and window height
- MUST pick 3 different p5js filters [https://p5js.org/reference/p5/filter/](https://p5js.org/reference/p5/filter/)
- MUST pick 3 different keys to trigger the filters. [https://p5js.org/reference/p5/keyIsDown/](https://p5js.org/reference/p5/keyIsDown/)
- MUST have text that displays the name of the current filter and switches when the user presses a different key.

Extra Fun: 

- Add a tint! [https://p5js.org/reference/p5/tint/](https://p5js.org/reference/p5/tint/) 
- You can use the tint's Alpha value to add a motion blur effect. Try setting the alpha to a low value like 10.
- Try using mouseX and mouseY to control the location of the image.
- Try layering multiple filters and/or tints.


### STARTER CODE:
```
let capture;

function setup() {
  createCanvas(100, 100);

  // Create the video capture and hide the element.
  capture = createCapture(VIDEO,{flipped:true});
  capture.hide();
}

function draw() {
  // Draw the video to fill the canvas width
  image(capture, 0, 0, width, width * capture.height / capture.width);

  filter(INVERT);
}
```