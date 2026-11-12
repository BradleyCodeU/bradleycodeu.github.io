---
layout: project
category: u03arrayMethods
title: Fuzzy Search
---


Fuzzy search. Here is misspelled name X what are the possible correct spellings?

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

### Load the JSON file

Load the file [huge_name_list.json](/aicc\u03arrayMethods\fuzzySearch\huge_name_list.json) into a Javascript array

This file contains 3695 names (both boy and girl names)

### addToList() function

Create a function named addToList() that requires an argument: myText

Read this appendChild tutorial [https://www.w3schools.com/jsref/met_node_appendchild.asp](https://www.w3schools.com/jsref/met_node_appendchild.asp){target:_blank} to learn how to…

- create a new list item element

- create a text node with myText

- append the text node to the new list item

- use appendChild to add the list item to the resultsList

### search() function

Create a function named search().

- let counter = 0

- call removeOldList() to remove any old search results

- get the user input from textBox and save it in a variable named searchQuery

- erase the old text from textBox

- for each item of the array. Read this for…of loop tutorial

    - make a comment that says // check if item includes searchQuery

    - if the item includes the searchQuery

        - increase counter by 1

        - call the addToList function and give it the item as an argument

- if the counter equals 0

    - call the addToList function and give an argument that is a message that says searchQuery Not Found (For example, if you searched for “xyz” it might say “xyz Not Found”)

### fuzzySearch() function

Change your search() function. Below “// check if fullText includes searchQuery” you will use a new function fuzzySearch. Like this… `if (fuzzySearch(fullText, searchQuery)){`

Fill in the blanks ??? in the code below to define the new fuzzySearch function. Requires two arguments: fullText and searchQuery

```
// Performs a more-inclusive, fuzzy search
// 1. Converts both strings to lowercase
// 2. Checks for a direct, simple inclusion (the "old search style")
// 3. If no direct match, checks if the fullText contains *ANY* 3-letter cluster from the search term
// @param {string} fullText - The string to search within (e.g., "An Apple a day")
// @param {string} searchQuery - The search term (e.g., "applesauce")
// @returns {boolean} - True if it's a match, false otherwise
// For example, fuzzySearch("An Apple a day", "applesauce") would return true


function fuzzySearch(fullText, searchQuery) {

    // TODO If search is an empty string "", return false
    if (??? == ???) {
        return false;
    }

    // convert BOTH the fullText String and searchQuery String to lowercase
    fullText = fullText.toLowerCase();
    // TODO convert searchQuery to lowercase
    ???

    // do the old search style, does the fullText text include searchQuery
    if(???){
      return true;
    }

    // make an array of 3-letter clusters from searchQuery
    let clusters = []; // Start with an empty array

    for (let i = 0; i <= searchQuery.length - 3; i++) {
        // string.substring(from, to)
        let letterCluster = searchQuery.substring(i, i + 3);
        // TODO push the letterCluster into the array. for example, array.push(fullText)
        ???
    }

    // loop thru the array of clusters and check each one
    for (let eachCluster of clusters){
      if (fullText.includes(eachCluster)){
        return true;
      }
    }

    return false; // we didn't find any matches
}

```