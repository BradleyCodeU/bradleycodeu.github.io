---
layout: project
category: arrays
title: Array Search
---

In your HTML file, create...
  - an h1 with the id "introTextHeading" and says something like "Welcome to Mo's Popular Movie Search"
  - a text input box with the id "textBox"
  - a button that says "Search"
  - a div with the id "resultsBox" and inside of the div:
    - an empty unordered list with the id "resultsUL"

In your JS file, create...

A very long array of strings that people visiting your page will be able to search.

  - [Popular Movies](https://github.com/dariusk/corpora/blob/master/data/film-tv/popular-movies.json)
  - [TV Shows](https://github.com/dariusk/corpora/blob/master/data/film-tv/tv_shows.json)
  - [Netflix Categories](https://github.com/dariusk/corpora/blob/master/data/film-tv/netflix-categories.json)
  - [Flowers](https://github.com/dariusk/corpora/blob/master/data/plants/flowers.json)
  - [Fruits](https://github.com/dariusk/corpora/blob/master/data/foods/fruits.json)
  - [Vegetables](https://github.com/dariusk/corpora/blob/master/data/foods/vegetables.json)
  - [Scientists](https://github.com/dariusk/corpora/blob/master/data/humans/scientists.json)
  - [Wrestlers](https://github.com/dariusk/corpora/blob/master/data/humans/wrestlers.json)
  - [US Cities](https://gist.github.com/norcal82/42440bd06a67eb7d9616)

Create a variable named introText and set it to document.getElementById("introTextHeading"). You don't have to re-type document.getElementById("introTextHeading") now. You can use introText.innerHTML = "whatever you want" to replace the old text

Create a variable named textBox and set it to document.getElementById("textBox"). You don't have to re-type document.getElementById("textBox") now. You can use textBox.value = "" to erase the old text

Create a variable named resultsList and set it to document.getElementById("resultsUL")

Create a function called addToList() that requires on argument: myText
  - [Read this tuturial](https://www.w3schools.com/jsref/met_node_appendchild.asp) to learn how to...
      - create a new list item element
      - create a text node with myText
      - append the text node to the new list item
      - use appendChild to add the list item to the resultsList


Create a function called search()
  - let counter = 0
  - get the user input from textBox and save it in a variable named searchText
  - erase the old text from textBox
  - for each item of the array
    - if the item contains the searchText
      - increase counter by 1
      - call the addToList function and give it searchText as an argument
  - if the counter equals 0
    - call the addToList function and give an argument that is a message that says searchText Not Found (For example, if you searched for "xyz" it might say "xyz Not Found")



Your search should be working, BUT it doesn't remove old search results. It just keeps adding new results to the bottom. Create a function called removeOldList()
  - while the resultsList has a firstChild
    - use resultsList.removeChild() to remove resultsList.firstChild


Finally, at the top of your search function call the removeOldList function.
