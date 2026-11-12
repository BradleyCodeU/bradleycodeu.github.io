---
layout: project
category: u03arrayMethods
title: Fuzzy Search
---


Fuzzy search. Here is misspelled name X what are the possible correct spellings?

If a user searches for "Bradaley", we want “Ashley, Bradley, Brandon“ to be listed but we want "Bradley" to rank higher than “Ashley“ or "Brandon"

### HTML file

```
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <h1>Fuzzy Search</h1>
        <label for="textBox">Type here:</label>
        <input type="text" id="textBox" placeholder="Steve" >
        <button onclick="search()">SEARCH</button>
        <ul id="resultsList"></ul>
        <script src="script.js"></script>
    </body>
</html>
```

The rest of your code will be written in the script.js file

### Create variables

Create a variable named hugeArray and set it to [ ]

Create a variable named textBox and set it to document.getElementById(“textBox”). You don’t have to re-type document.getElementById(“textBox”) now. You can use textBox.value = “” to erase the old text

Create a variable named resultsList and set it to document.getElementById(“resultsList”)

### Load the JSON file

Load the file [huge_name_list.json](/aicc\u03arrayMethods\fuzzySearch\huge_name_list.json) into a Javascript array

This file contains 3695 names (both boy and girl names)

Set hugeArray to be the data from the json file.

### addToList() function

Create a function called addToList() that requires an argument: myText

- create a new list item element, like this: const li = document.createElement("li");

- set the text content to be myText, like this: li.textContent = myText;

- use appendChild to add the list item, like this: resultsList.appendChild(li);

### search() function

Create a function named search().

- call removeOldList() to remove any old search results

- get the user input from textBox and save it in a variable named searchQuery

- erase the old text from textBox by setting textBox.value to be ""

- Create an empty array named matches, like this let matches = [];

- for each item of the hugeArray. Read this for…of loop tutorial

  - make a comment that says // check if item includes searchQuery

  - Call let weight = calculateSameness(item, searchQuery);

  - if the weight is greater than zero

    - push the item and its score into matches, like this matches.push({ name: item, weight: weight });

- after the loop finishes, sort the matches based on weight, like this matches.sort((a, b) => b.weight - a.weight);

- if the matches.length equals 0

  - call the addToList function and give an argument that is a message that says searchQuery Not Found (For example, if you searched for “xyz” it might say “xyz Not Found”)

- otherwise

  - use a for loop to add each match to the list, like this addToList(each.name + " (Weight: " + each.weight + ")");

### calculateSameness() function

calculateSameness requires two arguments: fullText and searchQuery

The calculateSameness returns a number (a weight) that is how likely it is of matching. A weight of 0 means that no match was found.

Fill in the blanks ??? in the code below:

```
// Calculates a match weight (score) between fullText and searchQuery
// @param {string} fullText - A name from the list (e.g., "Bradley")
// @param {string} searchQuery - The user's search term (e.g., "Bradly")
// @returns {number} - 0 if no match, or a higher number for closer matches
function calculateSameness(fullText, searchQuery) {

    // TODO: If searchQuery is an empty string "", return 0
    if (??? == ???) {
        return 0;
    }

    // Convert BOTH fullText and searchQuery to lowercase
    fullText = fullText.toLowerCase();
    // TODO: convert searchQuery to lowercase
    ???

    let weight = 0;

    // What if it's an obvious match? For example... Christopher includes Chris, Jackie includes Jack
    // 1. Give a 50-point bonus if fullText directly includes searchQuery
    if (fullText.includes(searchQuery)) {
        weight += 50;
    }

    // 2. Search for clusters of length n-1, n-2, n-3... down to 3
    let n = searchQuery.length;

    // Outer loop controls the cluster size (starts at n - 1, stops at 3)
    for (let clusterSize = n - 1; clusterSize >= 3; clusterSize--) {
        
        // Inner loop slides across searchQuery to grab each cluster
        for (let i = 0; i <= n - clusterSize; i++) {
            let letterCluster = searchQuery.substring(i, i + clusterSize);

            // TODO: Check if fullText includes letterCluster. 
            // If it does, add clusterSize to weight!
            if (???) {
                ???
            }
        }
    }

    return weight;
}

```