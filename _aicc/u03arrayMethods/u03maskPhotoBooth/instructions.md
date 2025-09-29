---
layout: project
category: u02_classification
title: U02 Mask Photobooth
---

Create a photobooth app that allows the user to select from several masks, switch backgrounds, and capture the canvas as an image.

## Directions

1. Duplicate this Coding Train project by clicking File > Duplicate: [https://editor.p5js.org/codingtrain/sketches/zUKp9n4MW](https://editor.p5js.org/codingtrain/sketches/zUKp9n4MW)

1. On line 10, rename the variable img to currentMask. Do the same on line 17 and line 54.

1. Upload 5 or more mask images and 2 or more backgrounds. 

    - Download this image if you want to draw your own mask.
    - ![Mask template](https://bradleycodeu.github.io/aicc/u02classification/u02maskphotobooth/maskTemplate.png)

1. Declare an array that you will use to store your images. Inside of the preload() function, use loadImage() to add the images to the array. [https://p5js.org/reference/p5/loadImage/](https://p5js.org/reference/p5/loadImage/)

1. Use the keyPressed() function to change the currentMask or change the background image. [https://p5js.org/reference/p5/keyPressed/](https://p5js.org/reference/p5/keyPressed/)
    - Possibilites...
        - Assign each mask/background to a different key
        - Select a random mask and a random background
        - Make one key increment so that it advances to the next mask

1. Finally, make the spacebar key take a screenshot by using the saveCanvas() function. [https://p5js.org/reference/p5/saveCanvas/](https://p5js.org/reference/p5/saveCanvas/) Either play a camera sound or flash a white background when the screenshot is taken.

### Challenges

- Apply the mask to ALL faces, not just faces[0].

- Adjust the scale so that the canvas fill the entire width of the screen. This will ensure that the app looks good on all devices: phone, iPad, laptop, desktop.
- Add touch controls. When the user taps the screen, move to the next mask. [https://p5js.org/reference/p5/touchStarted/](https://p5js.org/reference/p5/touchStarted/)
- Count how long the user's touch lasts. If it's a long press, then take a screenshot.

