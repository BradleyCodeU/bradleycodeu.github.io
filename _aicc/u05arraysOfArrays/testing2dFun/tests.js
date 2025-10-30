let expected;
let actual;

// assertEqual

// Compares two values (expected vs. actual) to check if they are equal.
// Uses arrayToString() to safely convert both values into strings before comparison,
// ensuring that arrays and nested arrays can be compared reliably (since direct array
// equality in JavaScript compares references, not contents).
// Returns true if both match exactly, otherwise false.

function assertEqual(expected, actual){
    return arrayToString(actual) === arrayToString(expected)
}





// arrayToString

// Converts a JavaScript array into a string representation.
// Example: arrayToString([[1,2],[3,4]]) → "[[1,2],[3,4]]"
// Input: any array (1D or 2D)
// Output: a string version of that array.

// Test 1: arrayToString simple numeric array
actual = arrayToString([1, 2, 3]);
expected = "[1,2,3]";
console.assert(expected === actual, `❌ Failed: arrayToString simple numeric array test. Expected: ${expected} Actual: ${actual}`);

// Test 2: arrayToString 2D array with 3 rows 2 columns
actual = arrayToString([[8, 9], [13, 11], [-3, 1]]);
expected = "[[8,9],[13,11],[-3,1]]";
console.assert(expected === actual, `❌ Failed: arrayToString 2D array with 3 rows 2 columns test. Expected: ${expected} Actual: ${actual}`);

// Test 3: arrayToString 2D array with 2 rows 3 columns
// TODO
// actual = arrayToString(???????????????????????????????);
// expected = "???????????????????????????????";
// console.assert(expected === actual, `❌ Failed: arrayToString 2D array with 3 rows 2 columns test. Expected: ${expected} Actual: ${actual}`);

console.log("✅ Finished testing arrayToString");






// sum2dArray

// Calculates the total sum of all numbers inside a 2D array.
// Loops through each row and each element, adding them to a running total.
// Example: sum2dArray([[-5, 9],[-4, 7]]) → 10
// Input: a 2D array of numbers
// Output: the sum of all elements in the array

// Test 1 sum2dArray 0,0 and 0,1
actual = sum2dArray([[0, 0], [0, 1]]);
expected = 1;
console.assert(expected === actual, `❌ Failed: sum2dArray 0,0 and 0,1 test. Expected: ${expected} Actual: ${actual}`);

// Test 2 sum2dArray with positive and negative values
actual = sum2dArray([[-5, 9],[-4, 7]]);
expected = 7;
console.assert(expected === actual, `❌ Failed: sum2dArray with positive and negative values test. Expected: ${expected} Actual: ${actual}`);

// Test 4 sum2dArray with all positive values
// actual = sum2dArray([[???, ???],[???, ???]]);
// expected = ???;
// console.assert(expected === actual, `❌ Failed: sum2dArray with all positive values test. Expected: ${expected} Actual: ${actual}`);

console.log("✅ Finished testing sum2dArray");






// stringTo2dArray

// Converts a string of coordinate pairs into a 2D numeric array.
// Example: "(1, 1), (2, 2)" → [[1, 1], [2, 2]]
// Removes outer parentheses, splits by "), (", then parses each number.
// Input: a formatted string of coordinates
// Output: a 2D array of integers representing coordinate pairs

// Test 1: stringTo2dArray only one coordinate pair
actual = stringTo2dArray("(0, 0)");
expected = [[0, 0]];
console.assert(assertEqual(expected, actual), `❌ Failed: stringTo2dArray only one coordinate pair test. Expected: ${arrayToString(expected)} Actual: ${arrayToString(actual)}`);

// Test 2: stringTo2dArray two coordinate pairs
actual = stringTo2dArray("(1, 1), (2, 2)");
expected = [[1, 1], [2, 2]];
console.assert(assertEqual(expected, actual), `❌ Failed: stringTo2dArray two coordinate pairs test. Expected: ${arrayToString(expected)} Actual: ${arrayToString(actual)}`);

// Test 3: stringTo2dArray three coordinate pairs
// actual = stringTo2dArray("(???, ???), (???, ???), (???, ???)"); // TODO
// expected = [[???, ???], [???, ???], [???, ???]]; // TODO
// console.assert(assertEqual(expected, actual), `❌ Failed: stringTo2dArray two coordinate pairs test. Expected: ${arrayToString(expected)} Actual: ${arrayToString(actual)}`);

console.log("✅ Finished testing stringTo2dArray");






// average2dArray

// Calculates the average of all numbers in a 2D array.
// Should sum all numbers and divide by the total count.
// Example: average2dArray([[3,4],[6,7]]) → 5
// Input: a 2D array of numbers
// Output: the numeric average of all values
// NOTE: currently incomplete, tests should be written before implementation.

// Test 1: average2dArray all the same value
actual = average2dArray([[9,9,9],[9,9,9],[9,9,9]]);
expected = 9;
console.assert(assertEqual(expected, actual), `❌ Failed: average2dArray all the same value test. Expected: ${expected} Actual: ${actual}`);

// Test 2: average2dArray ascending values
actual = average2dArray([[3,4],[6,7]]);
expected = 5;
console.assert(assertEqual(expected, actual), `❌ Failed: average2dArray ascending values test. Expected: ${expected} Actual: ${actual}`);

// Test 2: average2dArray random values
// actual = average2dArray(??????????);
// expected = ???;
// console.assert(assertEqual(expected, actual), `❌ Failed: average2dArray random values test. Expected: ${expected} Actual: ${actual}`);

console.log("✅ Finished testing average2dArray");





// getXsFrom2dArray

// Extracts all x-values (first elements) from a 2D array of coordinate pairs.
// Example: getXsFrom2dArray([[1,2],[3,4],[5,6]]) → [1,3,5]
// Input: a 2D array (each inner array contains [x, y])
// Output: an array containing only the x-values
// NOTE: currently incomplete, tests should be written before implementation.

// Test 1: getXsFrom2dArray 1, 3, and 5
actual = average2dArray([[1,2],[3,4],[5,6]]);
expected = [1,3,5];
console.assert(assertEqual(expected, actual), `❌ Failed: getXsFrom2dArray 1, 3, and 5 test. Expected: ${arrayToString(expected)} Actual: ${arrayToString(actual)}`);

// Test 2: TODO
//
//
// console.assert(assertEqual(expected, actual), `❌ Failed: ???. Expected: ${arrayToString(expected)} Actual: ${arrayToString(actual)}`);

console.log("✅ Finished testing getXsFrom2dArray");