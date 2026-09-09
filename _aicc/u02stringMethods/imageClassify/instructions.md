---
layout: project
category: u02stringMethods
title: Image Classify
---

Using Teachable Machine, train an Image Model to recognize either:
- 4 different objects AND to recognize "nothing"
- 4 different colors AND "nothing"

Once your model is trained, create a p5js project with ml5 and have it display text that shows both the top result AND the confidence (as a percent, rounded to a whole number). For example... "Water Bottle 98%"

If the condfidence score for the top result is ever less than 50%, then display some text or an emoji to let you know that the app is not sure. It should NEVER say "Water Bottle 45%"

You will use: [https://teachablemachine.withgoogle.com/](https://teachablemachine.withgoogle.com/)

FINAL STEP: Customize it and make your project unique. 
- Maybe play a different sound for each object. 
- Maybe display a different meme for each object. 
- Maybe generate art and different shapes or colors for each object.
- Maybe use the [p5.speech library](https://idmnyu.github.io/p5.js-speech/) to have the computer read the text. 
- Maybe something else! 

The choice is yours!

### IMPORTANT ! ! !
Changes for updated P5js and updated ml5

1. Go to index.html and replace the head section with this...

```
<head>
  <meta charset="UTF-8">
  <title>Webcam Image Classification using a pre-trained customized model and p5.js</title>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/1.9.4/p5.min.js"></script>
  <script src="https://unpkg.com/ml5@1/dist/ml5.min.js"></script>
</head>
```

2. In sketch.js, replace all flippedVideo with video. Remove all lines with `ml5.flipImage()`

Show Mr Riley when finished.