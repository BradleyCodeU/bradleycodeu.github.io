---
layout: project
category: u05_arrays_of_arrays
title: Battleship Regression
---

Copy/paste the starter code:

[sketch.js](../sketch.js)


## What is Test-Driven Development?

Test-driven development (TDD) is a way of writing code that involves writing an automated unit-level test case that fails, then writing just enough code to make the test pass

[https://en.wikipedia.org/wiki/Test-driven_development](https://en.wikipedia.org/wiki/Test-driven_development)

For the following 8 functions, write 2 tests first. Then write your code.

The following 8 functions are NOT in the starter code.

### Distance Formula and Slope Intercept

```
// returns the distance between points (x1, y1) and (x2, y2)
function distance(x1, y1, x2, y2){
  // implement the distance formula from algebra class
  // TODO
  return 999;
}

// Test 1: distance NAME-OF-TEST-HERE
actual = distance(???, ???, ???, ???);
expected = ???;
console.assert(expected === actual, `❌ Failed: distance NAME-OF-TEST-HERE test. Expected: ${expected} Actual: ${actual}`);

// Test 2: distance NAME-OF-OTHER-TEST-HERE



// count the number of good squares by comparing distance to the slope/intercept line
function findTotalGoodSquares(slope, intercept) {
  let goodSquaresTotal = 0;
  for (let y = 0; y < GRID_SIZE; y++) {
    for (let x = 0; x < GRID_SIZE; x++) {
        // using the distance function, get the distance
        // between the current x,y and the x, y = mx + b
        // HINT: use the slope and intercept parameters
      const distFromLine = ???; // TODO
      if (distFromLine <= LINE_TOLERANCE) {
        goodSquaresTotal++;
      }
    }
  }
  return ???; // TODO
}

// Test 1:

// Test 2:


// non-determinative function that generates random y-intercepts
// if the slope is > 0, the y-intercept should be smaller
// if the slope is <= 0, it should be larger
function getSecretIntercept(slope) {
  let secretIntercept = 0;
  // generate two random numbers 0-10
  if (slope > 0) {
    // set secretIntercept to be the smaller of the two random nums
    // TODO
  } else {
    // set secretIntercept to be the larger of the two random nums
    // TODO
  }
  return secretIntercept;
}

// Test 1:

// Test 2:

```

### Get X Values and Y Values

```
// retrieve the x values from pointArray
function getXValues(pointArray) {
  const xValues = [];
  // the pointArray contains point objects. For example, {x:0, y:0}
  // loop thru the pointArray and add each x value to the xValues array
  // TODO
  return xValues;
}

// Test 1:

// Test 2:

// retrieve the y values from pointArray
function getYValues(pointArray) {
  const yValues = [];
  // the pointArray contains point objects. For example, {x:0, y:0}
  // loop thru the pointArray and add each y value to the yValues array
  // TODO
  return yValues;
}

// Test 1:

// Test 2:

```




## Nested Loops

```

// draws a 10x10 grid with black lines
function drawGridLines() {
  stroke("black");
  noFill(); // keep the squares transparent
  // using nested loops, draw a grid with 10 rows and 10 columns
  // use GRID_SIZE instead of 10 
  // the size of each square is CELL_SIZE
  // TODO
}

// Test 1:

// Test 2:

// returns a 2d array of the given size filled with 0s
function make2dArray(rows, cols){
  // make an array
  // outer loop
  // // push a new row array into the array
  // // inner loop
  // // // push zeros into the row
  // return the array
  // TODO
}

// Test 1:

// Test 2:

// if the current player is bluePlayer then return redPlayer and vice versa
function getNextPlayer(currentPlayer) {
  // TODO
  return false;
}

// Test 1:

// Test 2:

```