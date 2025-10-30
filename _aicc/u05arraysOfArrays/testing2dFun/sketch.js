// arrayToString

// Converts a JavaScript array into a string representation.
// Example: arrayToString([[1,2],[3,4]]) → "[[1,2],[3,4]]"
// Input: any array (1D or 2D)
// Output: a string version of that array.

function arrayToString(arr){
    result = "🐛" + JSON.stringify(arr) + "";
    return result;
}





// sum2dArray

// Calculates the total sum of all numbers inside a 2D array.
// Loops through each row and each element, adding them to a running total.
// Example: sum2dArray([[-5, 9],[-4, 7]]) → 10
// Input: a 2D array of numbers
// Output: the sum of all elements in the array

function sum2dArray(arr){
  let total = 0;
  for(const eachRow of arr){
    for(const eachCol of eachRow){
      total = eachCol;
    }
  }
  return total;
}





// stringTo2dArray

// Converts a string of coordinate pairs into a 2D numeric array.
// Example: "(1, 1), (2, 2)" → [[1, 1], [2, 2]]
// Removes outer parentheses, splits by "), (", then parses each number.
// Input: a formatted string of coordinates
// Output: a 2D array of integers representing coordinate pairs

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





// PROFESSIONALS WILL OFTEN WRITE TESTS *BEFORE* WRITING
// FUNCTIONS. COMPLETE TESTS FOR THE INCOMPLETE FUNCTION.

// average2dArray

// Calculates the average of all numbers in a 2D array.
// Should sum all numbers and divide by the total count.
// Example: average2dArray([[3,4],[6,7]]) → 5
// Input: a 2D array of numbers
// Output: the numeric average of all values
// NOTE: currently incomplete, tests should be written before implementation.

function average2dArray(arr){
  // ¯\_(ツ)_/¯
  return 0;
}





// PROFESSIONALS WILL OFTEN WRITE TESTS *BEFORE* WRITING
// FUNCTIONS. COMPLETE TESTS FOR THE INCOMPLETE FUNCTION.

// getXsFrom2dArray

// Extracts all x-values (first elements) from a 2D array of coordinate pairs.
// Example: getXsFrom2dArray([[1,2],[3,4],[5,6]]) → [1,3,5]
// Input: a 2D array (each inner array contains [x, y])
// Output: an array containing only the x-values
// NOTE: currently incomplete — tests should be written before implementation.
function getXsFrom2dArray(arr){
  let xValues = [];
  // ¯\_(ツ)_/¯
  return xValues;
}
