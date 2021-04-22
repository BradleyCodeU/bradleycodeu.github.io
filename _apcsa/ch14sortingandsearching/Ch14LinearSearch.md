---
layout: project
category: ch14sortingandsearching
title: Linear Search
---
A linear search or sequential search is a method for finding an element within a list. It sequentially checks each element of the list until a match is found or the whole list has been searched.

A linear search is very slow. It is not a smart approach. There are MUCH faster search algorithms that we will be learning, but we are starting with the most obvious/basic search... the linear search.

Copy/paste one of the following, a very long array of strings that people visiting your page will be able to search:


  - [Popular Movies](https://github.com/dariusk/corpora/blob/master/data/film-tv/popular-movies.json)
  - [TV Shows](https://github.com/dariusk/corpora/blob/master/data/film-tv/tv_shows.json)
  - [Netflix Categories](https://github.com/dariusk/corpora/blob/master/data/film-tv/netflix-categories.json)
  - [Flowers](https://github.com/dariusk/corpora/blob/master/data/plants/flowers.json)
  - [Fruits](https://github.com/dariusk/corpora/blob/master/data/foods/fruits.json)
  - [Vegetables](https://github.com/dariusk/corpora/blob/master/data/foods/vegetables.json)
  - [Scientists](https://github.com/dariusk/corpora/blob/master/data/humans/scientists.json)
  - [Wrestlers](https://github.com/dariusk/corpora/blob/master/data/humans/wrestlers.json)
  - [US Cities](https://gist.github.com/norcal82/42440bd06a67eb7d9616)

Directions:

- Print something like "Welcome to Mo's Popular Movie Search"

- Collect user input

- Loop through each item in the full array
  - If each lowercase item contains the lowercase user input
    - Print the item
- If no matches were found, then print a Not Found message (For example, if you searched for "xyz" it might say "xyz Not Found")


NOTE:

Comparing lowercase strings is IMPORTANT. If a user searches for "win" they should not get "win Not Found." Instead, they should get:
- Gone with the Wind (1939)
- Rear Window (1954)

If a user searches for "RIV" they should get:
- Mystic River (2003)
- Taxi Driver (1976)
- Driving Miss Daisy (1989)
- Arrival (2016)
- Saving Private Ryan (1998)
