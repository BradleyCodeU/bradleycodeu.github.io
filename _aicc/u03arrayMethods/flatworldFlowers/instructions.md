---
layout: project
category: u03arrayMethods
title: Flatworld Flowers
---

In p5js create simulated flowers.

In sketch.js, complete the code to add a new Flower when the user clicks the button.

```
let sprites = [];
let button1;

function setup() {
  createCanvas(400, 400);
  sprites.push(new Flower());
  sprites.push(new Flower());
  sprites.push(new Flower());
  button1 = createButton('+ Flower');
  // Set position of button1 (x, y)
  button1.position(0, 0);
  // Call a function when button1 is pressed
  button1.mousePressed(???);
}

function draw() {
  background(225, 255, 225);
  for(let each of sprites){
    each.update();
    each.show();
  }
}
```

Update the Flower class so that it has 3 or more states. You can use either Strings or numbers to represent the states. Flowers MUST be visibly different in each state.
```
class Flower {
  constructor(){
    // instance variables
    this.x = random(0, width);
    this.y = random(height);
    this.state = ???;
  }

  grow(){
    ???; // change states
  }

  update(){
    // 1% chance of randomly growing
    if( ??? ){
      this.grow();
    }
  }

  show(){
    // to do
  }
}
```