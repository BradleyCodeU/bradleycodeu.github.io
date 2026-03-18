---
layout: project
category: console
title: Console Random Int Array
---

Concepts: arrays, random numbers, append, for loop, for each loop, modulus, concatenate

Read this tutorial about [Python lists](https://www.geeksforgeeks.org/python-list/)

Python lists are sets of numbers, strings, booleans, or objects and are just like arrays in other languages. A single list may contain a mix of DataTypes like Integers, Strings, as well as Objects. Lists are mutable (can be changed) which means that you can add new items to the list or remove items from the list.

Read this tutorial about [how to append something to a list/array](https://www.geeksforgeeks.org/append-extend-python/)

Lists are objects and have methods that only work on list objects. For example...
```
mylist = [79, False, 0.5, "apple"]
mylist.insert(0, "coconut")
mylist.append("banana")
mylist.sort()
mylist.insert(1, "orange")
mylist.pop()
mylist.reverse()
```

Read this tutorial about [how to create a For Each loop to iterate through a list/array](https://www.geeksforgeeks.org/iterate-over-a-list-in-python/)

Most programming languages have a "For Each" loop, a kind of loop that allows you to grab items from the list one at a time. In Python a For Each loop looks like this...
```
thislist = ["apple", "banana", "cherry"]
for each in thislist:
  print(each)
```

Finally, what is modulus? The % operator returns the remainder of two numbers. It is useful for detecting even/odd numbers (like to make striped patterns), for restricting a value to a range (like to wrapping an animated ball around the screen), for finding numbers that are multiples of each other (36 is a multiple of 9), and for converting one unit to another.
```
mynumber = 7
if (mynumber % 2) == 0:
  print("Even number")
if (mynumber % 2) == 1:
  print("Odd number")
```

### Project Directions:

Copy/paste the following direction comments into your code...

<button onclick="generatePractice()">Generate New Coding Prompt</button>
<p id="question">Complete the following Python programming task based on the requirements below:</p>
<pre id="output" style="font-size: 1.1em; padding: 20px; background: #1e1e1e; color: #d4d4d4; border-radius: 5px; white-space: pre-wrap; border-left: 5px solid #3584e4;"></pre>

<script>
function generatePractice() {
    let temp = (Math.floor(Math.random() * 10) + 1) * 10;
    let result = "";

    // --- Section 1: Setup ---
    result += `# Section 1: Generate and print the full array...\n`;
    result += `print("Section 1: Integers from ${temp} to ${temp * 2}")\n`;
    result += `# - Create an empty array\n`;
    result += `# - Using a "for i in range" loop, randomly generate 20 positive integers ranging from ${temp} to ${temp * 2} and append them to the array\n`;
    result += `# - Print a line that says "FULL ARRAY"\n`;
    result += `# - Print the full contents of the array using print()\n`;

    result += `\n# -=-=-=-=-=-=-=-=-=-=-=-=-\n\n`;

    // --- Section 2: Evens or Odds ---
    if (Math.random() < 0.5) {
        result += `# Section 2: Print the Odd Integers...\n`;
        result += `print("Section 2: Odd Integers")\n`;
        result += `# - Create a variable called result and set it to be an empty string ""\n`;
        result += `# - Print a line that says "ODD INTEGERS"\n`;
        result += `# - Use a FOR EACH loop to iterate through the array.\n`;
        result += `# - If an integer is odd (Hint: use modulus %), then add it to the result string\n`;
        result += `# - Hint: use result = result + str(i) + " & "\n`;
        result += `# - Print result\n`;
    } else {
        result += `# Section 2: Print the Even Integers...\n`;
        result += `print("Section 2: Even Integers")\n`;
        result += `# - Create a variable called result and set it to be an empty string ""\n`;
        result += `# - Print a line that says "EVEN INTEGERS"\n`;
        result += `# - Use a FOR EACH loop to iterate through the array.\n`;
        result += `# - If an integer is even (Hint: use modulus %), then add it to the result string\n`;
        result += `# - Hint: use result = result + str(i) + " # - "\n`;
        result += `# - Print result\n`;
    }

    result += `\n# -=-=-=-=-=-=-=-=-=-=-=-=-\n\n`;

    // --- Section 3: Multiples ---
    let multipleType = Math.random();
    if (multipleType < 0.333) {
        result += `# Section 3: Print the Multiples of 3...\n`;
        result += `print("Section 3: Multiples of 3")\n`;
        result += `# - Set result to be an empty string ""\n`;
        result += `# - Use a FOR EACH loop to iterate through the array\n`;
        result += `# - If a number is a multiple of 3, add it to result with a " / " separator\n`;
        result += `# - Print result`;
    } else if (multipleType < 0.666) {
        result += `# Section 3: Print the Multiples of 4...\n`;
        result += `print("Section 3: Multiples of 4")\n`;
        result += `# - Set result to be an empty string ""\n`;
        result += `# - Use a FOR EACH loop to iterate through the array\n`;
        result += `# - If a number is a multiple of 4, add it to result with a " * " separator\n`;
        result += `# - Print result`;
    } else {
        result += `# Section 3: Print the Multiples of 5...\n`;
        result += `print("Section 3: Multiples of 5")\n`;
        result += `# - Set result to be an empty string ""\n`;
        result += `# - Use a FOR EACH loop to iterate through the array\n`;
        result += `# - If a number is a multiple of 5, add it to result with a ", " separator\n`;
        result += `# - Print result`;
    }

    document.getElementById("output").innerText = result;
}

// Run once on load
generatePractice();
</script>
