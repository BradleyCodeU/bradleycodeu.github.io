---
layout: project
category: u03arrayMethods
title: Webcam Pixels
---

<p><iframe title="YouTube video player" src="https://www.youtube.com/embed/hHZcIMppkFc?si=-I0ugTWWB_s3XXlw" width="560" height="315" loading="lazy" allowfullscreen="allowfullscreen" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" frameborder="0"></iframe></p>
<p>Using P5js, create a colorful, pixelated video filter</p>
<ul>
    <li>MUST make the pixelated display fill the screen</li>
    <li>the pixels are currently in grayscale. you MUST make them display in color (the color can be fun or weird or mixed up)</li>
    <li>MUST change what is displayed if a keyIsPressed. What changes is up to you, but it must be a visible change.</li>
</ul>
<p>STARTER CODE:</p>
<pre>let vid;
let BUBBLE_SIZE = 2;

function setup() {
    createCanvas(windowWidth, windowHeight);
    vid = createCapture(VIDEO, { flipped: true });
    console.log(vid.width + " " + vid.height);
    vid.size(64, 48);
    vid.hide();
}

function draw() {
    background(220);
    
    for (let row = 0; row &lt; vid.height; row += 1) {
        for (let col = 0; col &lt; vid.width; col += 1) {
            let values = vid.get(col, row);
            // console.log(values);
            let myRed = values[0];
            let myGreen = values[0];
            let myBlue = values[0];
            if (keyIsPressed === true) {
                // ???
            }
            fill(myRed, myGreen, myBlue);
            ellipse(col * BUBBLE_SIZE, row * BUBBLE_SIZE, BUBBLE_SIZE, BUBBLE_SIZE);
        }
    }
}
</pre>