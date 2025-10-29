---
layout: project
category: u05arraysOfArrays
title: Testing 2d Fun
---




```
let expected;
let actual;

// TODO remove the 1 bug in this function
function arrayToString(arr){
    result = "🐛" + JSON.stringify(arr) + "";
    return result;
}

// Test 1: arrayToString simple numeric array
actual = arrayToString([1, 2, 3]);
expected = "[1,2,3]";
console.assert(actual === expected, `❌ Failed: arrayToString simple numeric array test. Expected: ${expected} Actual: ${actual}`);

// Test 2: arrayToString 2D array with 3 rows 2 columns
actual = arrayToString([[8, 9], [13, 11], [-3, 1]]);
expected = "[[8,9],[13,11],[-3,1]]";
console.assert(actual === expected, `❌ Failed: arrayToString 2D array with 3 rows 2 columns test. Expected: ${expected} Actual: ${actual}`);

// Test 3: arrayToString 2D array with 2 rows 3 columns
// TODO
// actual = arrayToString(???????????????????????????????);
// expected = "???????????????????????????????";
// console.assert(actual === expected, `❌ Failed: arrayToString 2D array with 3 rows 2 columns test. Expected: ${expected} Actual: ${actual}`);

console.log("✅ Finished testing arrayToString");





function sum2dArray(arr){
  let total = 0;
  for(const eachRow of arr){
    for(const eachCol of eachRow){
      total = eachCol;
    }
  }
  return total;
}

// Test 1 sum2dArray 0,0 and 0,1
actual = sum2dArray([[0, 0], [0, 1]]);
expected = 1;
console.assert(actual === expected, `❌ Failed: sum2dArray 0,0 and 0,1 test. Expected: ${expected} Actual: ${actual}`);

// Test 2 sum2dArray with positive and negative values
actual = sum2dArray([[-5, 9],[-4, 7]]);
expected = 7;
console.assert(actual === expected, `❌ Failed: sum2dArray with positive and negative values test. Expected: ${expected} Actual: ${actual}`);

// Test 3 sum2dArray with all positive values
// actual = sum2dArray([[???, ???],[???, ???]]);
// expected = ???;
// console.assert(actual === expected, `❌ Failed: sum2dArray with all positive values test. Expected: ${expected} Actual: ${actual}`);

console.log("✅ Finished testing sum2dArray");

// TODO fix the 1 bug in the sum2dArray function





function stringTo2dArray(mystr) {
  // Remove the first and last characters from the string
  // in order to remove outer parentheses or brackets
  mystr = mystr.substring(1, mystr.length - 1);
  // Split the string into an array of coordinate pairs using "), (" as the divider
  points = mystr.split("), (");
  // Loop through each coordinate pair string in the points array
  for (let i = 0; i < 1; i++) {
    // Split the current coordinate string into its x and y components
    let xyArray = points[i].split(", ");
    // Convert the x component from a string to an integer
    let x = parseInt(xyArray[0]);
    // Convert the y component from a string to an integer
    let y = parseInt(xyArray[0]);
    // Replace the string version with an array containing numeric x and y values
    points[i] = [x, y];
  }
  // Return the final 2D array of numeric coordinate pairs
  return points;
}

// Test 1: stringTo2dArray only one coordinate pair
actual = stringTo2dArray("(0, 0)");
expected = [[0, 0]];
console.assert(arrayToString(actual) === arrayToString(expected), `❌ Failed: stringTo2dArray only one coordinate pair test. Expected: ${expected} Actual: ${actual}`);

// Test 2: stringTo2dArray two coordinate pairs
// actual = stringTo2dArray("(???, ???), (???, ???)"); // TODO
// expected = [[???, ???], [???, ???]]; // TODO
// console.assert(arrayToString(actual) === arrayToString(expected), `❌ Failed: stringTo2dArray two coordinate pairs test. Expected: ${expected} Actual: ${actual}`);

console.log("✅ Finished testing stringTo2dArray");

// TODO fix the 2 bugs in stringTo2dArray function





// PROFESSIONALS WILL OFTEN WRITE TESTS *BEFORE* WRITING
// FUNCTIONS. COMPLETE TESTS FOR THE INCOMPLETE FUNCTION.
function average2dArray(arr){
  // ¯\_(ツ)_/¯
  return 0;
}

// Test 1: average2dArray all the same value
actual = average2dArray([[9,9,9],[9,9,9],[9,9,9]]);
expected = 9;
console.assert(arrayToString(actual) === arrayToString(expected), `❌ Failed: average2dArray all the same value test. Expected: ${expected} Actual: ${actual}`);

// Test 2: average2dArray random values
// actual = average2dArray(??????????);
// expected = ???;
// console.assert(arrayToString(actual) === arrayToString(expected), `❌ Failed: average2dArray random values test. Expected: ${expected} Actual: ${actual}`);





// PROFESSIONALS WILL OFTEN WRITE TESTS *BEFORE* WRITING
// FUNCTIONS. COMPLETE TESTS FOR THE INCOMPLETE FUNCTION.
function getXsFrom2dArray(arr){
  let xValues = [];
  // ¯\_(ツ)_/¯
  return xValues;
}

// Test 1: getXsFrom2dArray 1, 3, and 5
actual = average2dArray([[1,2],[3,4],[5,6]]);
expected = [1,3,5];
console.assert(arrayToString(actual) === arrayToString(expected), `❌ Failed: getXsFrom2dArray 1, 3, and 5 test. Expected: ${expected} Actual: ${actual}`);

// Test 2: TODO
//
//
// console.assert(arrayToString(actual) === arrayToString(expected), `❌ Failed: ???. Expected: ${expected} Actual: ${actual}`);
```