---
layout: project
category: textgames
title: Array Search
---
Create a very long array of strings that people using your app will be able to search. You can copy/paste one of these:

  - [Popular Movies](https://github.com/dariusk/corpora/blob/master/data/film-tv/popular-movies.json)
  - [TV Shows](https://github.com/dariusk/corpora/blob/master/data/film-tv/tv_shows.json)
  - [Netflix Categories](https://github.com/dariusk/corpora/blob/master/data/film-tv/netflix-categories.json)
  - [Flowers](https://github.com/dariusk/corpora/blob/master/data/plants/flowers.json)
  - [Fruits](https://github.com/dariusk/corpora/blob/master/data/foods/fruits.json)
  - [Vegetables](https://github.com/dariusk/corpora/blob/master/data/foods/vegetables.json)
  - [Scientists](https://github.com/dariusk/corpora/blob/master/data/humans/scientists.json)
  - [Wrestlers](https://github.com/dariusk/corpora/blob/master/data/humans/wrestlers.json)
  - [US Cities](https://gist.github.com/norcal82/42440bd06a67eb7d9616)

  Create a function called main():

    - create a counter
    - prompt the user for search text (for example, they might search for "the" or "ee")
    - get the user search text and convert it to lowercase
    - for each item of the array
      - covert the item to lowercase
      - if the item string _contains_ the user search text
        - increase the counter by 1
        - print the item
    - if the counter equals 0
      - say searchText Not Found (For example, if you searched for "xyz" it might say "xyz Not Found")
