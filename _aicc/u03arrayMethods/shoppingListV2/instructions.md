---
layout: project
category: u03arrayMethods
title: localStorage Shopping List v2
---

Continue working on your previous project.

## ADD LIBRARIES AND BUTTONS

Add p5js and ml5 to your project. Add these lines within the head section of `index.html` to import the libraries.
```
    <script src="https://cdn.jsdelivr.net/npm/p5@1.11.10/lib/p5.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/p5@1.11.10/lib/addons/p5.sound.min.js"></script>
    <script src="https://unpkg.com/ml5@latest/dist/ml5.min.js"></script>
    <script src="sketch.js"></script>
```

NOTE: you should keep the old "ADD" button so that items can still be added the old way.

Beneath the code for your ADD button, insert the following code to make two new buttons
```
    <button onclick="camGo()">
       Cam Go
    </button>
    <button onclick="camStop()">
        Cam Stop
    </button>
```

## ADD COMPUTER VISION

Train a model using Teachable Machine to recognize at least 7 different grocery items AND to recognize "nothing".

## ADD sketch.js

Complete the lines marked `// TODO`
```
// Declare a variable for the image classifier
let classifier;

// URL of the Teachable Machine model used for classification
// Add your model
const imageModelURL = 'https://teachablemachine.withgoogle.com/models/???/'; // TODO

// Video
// Variable to store the webcam object
let webCam;
// Flag to track whether the camera is on or off
let isCameraOn = false;

// To store the classification
// Default label text before anything is detected
let label = "nothing";

// Load the model first
function preload() {
  // Initialize the image classifier with the model JSON file
  classifier = ml5.imageClassifier(imageModelURL + 'model.json');
}

function setup() {
  // Create a canvas where video and labels will be drawn
  createCanvas(320, 260);
}

function draw() {
  // Set the background color to gray
  // TODO
  // Only draw the video and text if the camera is on
  if(???){ // TODO
    // Display the webcam feed at canvas position (0,0)
    image(webCam, 0, 0);
    // Set text color to white
    fill(255);
    // Set text size to 16 pixels
    textSize(16);
    // Center-align the text
    textAlign(CENTER);
    // Draw the current label near the bottom of the canvas
    text(label, width / 2, height - 4);
  }
}

// Start the camera and begin classifying
function camGo(){
  // Create a webcam capture with flipped orientation
  webCam = createCapture(VIDEO,{flipped:true});
  // Set the webcam video size
  webCam.size(320, 240);
  // Hide the default video element (we’ll draw it to the canvas instead)
  webCam.hide();
  // Turn the camera flag on by setting it to be true
  isCameraOn = ???; // TODO
  // Start classification loop 
  classifyVideo();
}

// Stop the camera
function camStop(){
  // Set the camera flag to false
  isCameraOn = ???; // TODO
  // Remove the webcam capture element
  webCam.remove();
}

// Check confidence of the classifier result and return a label String
function getLabel(results){
  // Set topResult to be the object at index location 0 from the results array
  const topResult = ???; // TODO
  // Check if the top result has confidence greater than 95%
  if(???){ // TODO
    // Return the label of the top result
    return topResult.label;
  } else {
    // Return the String nothing
    return ???;  // TODO
  }
}

// Ask the user if they want to add the detected item
function confirmAddItem(someText){
  // Display a confirmation popup with the label
  if(confirm("Do you want to add "+someText+"?")){
    // Call the add list item function and send in some text as an argument
    // TODO
  }
}

// When we get a result
function gotResult(results, error) {
  // If there is an error, log it and stop
  if (error) {
    console.error(error);
    return;
  }
  // Call the getLabel function and pass in results as an argument
  label = ???; // TODO
  // If label does not equal "nothing"
  if(???){ // TODO
    // Stop the camera by calling the cam stop function
    // TODO
    // Call the confirmAddItem function and pass in label as an argument
    // TODO
    // Set the label back to nothing
    label = "nothing";
  }
  // If the camera is on, then classify again
  if(???){ // TODO
    classifyVideo();
  }else{
    // If the camera is off, clear the label
    label = "";
  }
}

// Get a prediction for the current video frame
function classifyVideo() {
  // Only classify if the camera is on
  if(???){ // TODO
    // Pass the webcam image to the classifier, call gotResult when done
    classifier.classify(webCam, gotResult);
  }
}

```
