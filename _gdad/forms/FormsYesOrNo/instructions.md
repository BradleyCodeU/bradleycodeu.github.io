---
layout: project
category: forms
title: Forms Yes Or No
---

Download one of these:
  - [Alice Sound Library 1](https://www.alice.org/wp-content/uploads/2017/05/AliceSoundLibrary.zip)
  - [Alice Sound Library 2](https://www.alice.org/wp-content/uploads/2017/08/AliceSoundLibraryExpansionPackOne.zip)
  - [Essential Retro Video Game Sound Effects Collection](https://drive.google.com/uc?export=download&id=1wjLFlCGQ_HoQJ0QMawGk5qoCyOWcteY4)

Drag a few of your favorite sounds into the same folder as your project.

[Here is a demo](https://drive.google.com/file/d/1vw5GDnkJAvt61_dFyai6K1EcWJNqBFt4/view)

Create two huge Yes and No buttons. Use CSS to make them huge.

Add CSS so that...
- when you [hover](https://www.w3schools.com/css/tryit.asp?filename=trycss_pseudo-class_links) over them, they change color
- when [active](https://www.w3schools.com/css/tryit.asp?filename=trycss_pseudo-class_links) (aka clicked), they change to a different color
- they have a [border](https://www.w3schools.com/cssref/css3_pr_border-radius.php) that is a different color than the button body
- they have a rounded [border-radius](https://www.w3schools.com/cssref/css3_pr_border-radius.php)

When you click Yes it plays a happy sound and when you click No it play a sad sound

For Javascript audio, you will do something similar to this:
```
let bubblePopSound = new Audio("pop.mp3"); // only when page loads

bubblePopSound.play(); // should happen when button is clicked
```

Finally, create a Customize section under the two big Yes and No buttons:
1. Add an input type text that is labelled Yes Button Text. Give the input an oninput= attribute that will change the innerHTML of the Yes button to be this.value
2. Add an input type text that is labelled No Button Text and changes the text on the button.    


### If you have already completed 1 or more Computer Science classes...

1. Add the following to the Customize section...


    - Add an input type color that will change the Yes Button's background color. Give the input an oninput= attribute that will change the style.background of the Yes button to be this.value
    
    - Add an input type color that changes the No Button's background color oninput.
    - Add an input type range slider that changes the width of BOTH buttons onchange.

1. Make it randomly select one of a few sounds OR make it cycle through several sounds so that they are played in order.
