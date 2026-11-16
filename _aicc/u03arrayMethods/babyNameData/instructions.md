---
layout: project
category: u03arrayMethods
title: Baby Name Data
---

Baby Name Data

Use an asynchronous function to load the data

```
let myData = [];

// Async function to load an external file
async function loadExample() {
  const response = await fetch("data/example.json");
  myData = await response.json();
  console.log(myData);
}

loadExample();
```

### VERSION 1

Load the data and answer a question WITHOUT any user input

Create a new HTML file that is your name lowercase. For example, Steve would make steve.html

Display your GOAL as an <h1> on the page.

In version 1, the page will always look up the same name and/or decade.

For example, if you goal is “Show me the top N names from X decade” then it might ALWAYS look up the top 3 names from the 2010s.

SHOW MR RILEY WHEN FINISHED

### VERSION 2

Load the data and answer a question WITH user input

SHOW MR RILEY WHEN FINISHED

### GOAL IDEAS


- Show me the top N names from X decade

- Show me the rank of X name in all decades

- Which is more popular X name or Y name in Z decade

- Guess when X name was born

- What is the longest/shortest name in X decade?

- What is the avg name length in X decade?

- Was X name more popular in Y decade or Z decade?

- My name is X and I was born in Y decade, if I was born in Z decade what would my name have been?

- What is the most/least popular first N letters in X decade?

- What is the most/least popular last N letters in X decade?

- What names are similar to X? Cut the first letter/search for names that include the rest

- What is the most popular boy/girl name in all decades combined?

- Guess if X name is a boy name or a girl name

- 
