---
layout: project
category: arrays
title: Array Search
---

In your HTML file, create...
  - a text input box with the id "textBox"
  - a button that says "Search"
  - a div with the id "resultsBox" and inside of the div:
    - an empty unordered list with the id "resultsList"

In your JS file, create...

A very long array of strings that you will search.

[Popular Movies](https://github.com/dariusk/corpora/blob/master/data/film-tv/popular-movies.json)
[TV Shows](https://github.com/dariusk/corpora/blob/master/data/film-tv/tv_shows.json)
[Netflix Categories](https://github.com/dariusk/corpora/blob/master/data/film-tv/netflix-categories.json)
[Flowers](https://github.com/dariusk/corpora/blob/master/data/plants/flowers.json)
[Fruits](https://github.com/dariusk/corpora/blob/master/data/foods/fruits.json)
[Vegetables](https://github.com/dariusk/corpora/blob/master/data/foods/vegetables.json)
[Scientists](https://github.com/dariusk/corpora/blob/master/data/humans/scientists.json)
[Wrestlers](https://github.com/dariusk/corpora/blob/master/data/humans/wrestlers.json)

Create a function called search()
  - let counter = 0
  - get the searchText from textBox
  - for each item of the array
    - if the item contains the searchText
      - increase counter by 1
      - [Read this tuturial](https://www.w3schools.com/jsref/met_node_appendchild.asp) to learn how to create a list item element, create a text node, use appendChild to add the item to the resultsList
  - if the counter equals 0, popup a message that says searchText Not Found (For example, if you searched for "xyz" it might say "xyz Not Found")
