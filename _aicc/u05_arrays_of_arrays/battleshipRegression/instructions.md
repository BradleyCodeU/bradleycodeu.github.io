---
layout: project
category: u05_arrays_of_arrays
title: Battleship Regression
---






Copy/paste the starter code:

[sketch.js](../sketch.js)


### Distance formula

```
// returns the distance between points (x1, y1) and (x2, y2)
function distance(x1, y1, x2, y2){
  // implement the distance formula from algebra class
  // TODO
  return 999;
}

// retrieve the x values
function getXValues(pointArray) {
  const xValues = [];
  // the pointArray contains point objects. For example, {x:0, y:0}
  // loop thru the pointArray and add each x value to the xValues array
  // TODO
  return xValues;
}

// retrieve the y values
function getYValues(pointArray) {
  const yValues = [];
  // the pointArray contains point objects. For example, {x:0, y:0}
  // loop thru the pointArray and add each y value to the yValues array
  // TODO
  return yValues;
}

// if the current player is bluePlayer then return redPlayer and vice versa
function getNextPlayer(currentPlayer) {
  // TODO
  return false;
}

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



// draws a 10x10 grid with black lines
function drawGridLines() {
  stroke("black");
  noFill(); // keep the squares transparent
  // using nested loops, draw a grid with 10 rows and 10 columns
  // use GRID_SIZE instead of 10 
  // the size of each square is CELL_SIZE
  // TODO
}





function findTotalGoodSquares(slope, intercept) {
  // Calculate total number of good squares
  let goodSquaresTotal = 0; // Reset count
  for (let y = 0; y < GRID_SIZE; y++) {
    for (let x = 0; x < GRID_SIZE; x++) {
      const distFromLine = distance(x, slope * x + intercept, x, y)
      if (distFromLine <= LINE_TOLERANCE) {
        goodSquaresTotal++;
      }
    }
  }
  return goodSquaresTotal;
}
```