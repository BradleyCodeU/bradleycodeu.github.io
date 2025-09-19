---
layout: project
category: u02_classification
title: localStorage Shopping List v3
---

Continue working on your previous project.

## ADD LIBRARIES AND BUTTONS

Add p5js and ml5 to your project. Add these lines within the head section of `index.html` to import the libraries.
```
    <script src="https://cdn.jsdelivr.net/npm/p5@1.11.10/lib/p5.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/p5@1.11.10/lib/addons/p5.sound.min.js"></script>
    <script src="https://unpkg.com/ml5@latest/dist/ml5.min.js"></script>
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

## ADD sketch.js

Complete the lines marked //TODO
```
// Declare a variable for the image classifier
let classifier;

// Model URL
// URL of the Teachable Machine model used for classification
let imageModelURL = 'https://teachablemachine.withgoogle.com/models/y0uMfyEUa/';

// Video
// Variable to store the webcam video
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
  background(128);
  // Only draw the video and text if the camera is on
  if(isCameraOn){
    // Display the webcam feed at position (0,0)
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

// Get a prediction for the current video frame
function classifyVideo() {
  // Only classify if the camera is on
  if(isCameraOn){
    // Pass the webcam image to the classifier, call gotResult when done
    classifier.classify(webCam, gotResult);
  }
}

// When we get a result
function gotResult(results, error) {
  // If there is an error, log it and stop
  if (error) {
    console.error(error);
    return;
  }
  // Check if the result is confident enough
  checkConfidence(results);
  // If a label has been detected (not "nothing")
  if(label != "nothing"){
    // Ask user if they want to add the detected item
    confirmAddItem(label);
    // Reset the label so it doesn’t repeat
    label = "nothing";
  }
  // Classify again if the camera is still on
  if(isCameraOn){
    classifyVideo();
  }else{
    // If the camera is off, clear the label
    label = "";
  }
}

// Ask the user if they want to add the detected item
function confirmAddItem(someText){
  // Display a confirmation popup with the label
  if(confirm("Do you want to add "+someText+"?")){
    // If user clicks OK, add the item to the list
    addListItem(someText);
  }
}

// Check confidence of the classifier result
function checkConfidence(results){
  // If the top result has confidence greater than 95%
  if(results[0].confidence > 0.95){
    // Set the label to the detected class name
    label = results[0].label;
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
  // Turn the camera flag on
  isCameraOn = true;
  // Start classification loop
  classifyVideo();
}

// Stop the camera
function camStop(){
  // Set the camera flag to false
  isCameraOn = false;
  // Remove the webcam capture element
  webCam.remove();
}

```


## ADD COMPUTER VISION

Train a model using Teachable Machine to recognize at least 7 different grocery items AND to recognize "nothing".