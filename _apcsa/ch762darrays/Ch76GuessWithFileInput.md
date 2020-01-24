---
layout: project
category: ch762darrays
title: Guess With File Input
---
Load a "word bank" from an external text file, sort the words into a 2D array.

- Row 0: 3-5 character words
- Row 1: 6-8 character words
- Row 2: 9+ character words


I recommend copy/pasting your word list from Darius Kazemi's public domain Corpora repository: [https://github.com/dariusk/corpora](https://github.com/dariusk/corpora) Categories include fruits, vegetables, countries, musical instruments, Greek gods, occupations, flowers, programming languages, and many many more. Here are a few...


- [Flowers](https://github.com/dariusk/corpora/blob/master/data/plants/flowers.json)
- [Fruits](https://github.com/dariusk/corpora/blob/master/data/foods/fruits.json)
- [Vegetables](https://github.com/dariusk/corpora/blob/master/data/foods/vegetables.json)
- [Scientists](https://github.com/dariusk/corpora/blob/master/data/humans/scientists.json)
- [Wrestlers](https://github.com/dariusk/corpora/blob/master/data/humans/wrestlers.json)
- [Popular Movies](https://github.com/dariusk/corpora/blob/master/data/film-tv/popular-movies.json)
- [TV Shows](https://github.com/dariusk/corpora/blob/master/data/film-tv/tv_shows.json)
- [Netflix Categories](https://github.com/dariusk/corpora/blob/master/data/film-tv/netflix-categories.json)


The player starts on level 0 (3-6 character words), then proceeds to level 1 (7-10 characters), then level 2 (11+ characters).

Starter template: [GuessWithFileInput-Starter.java](/apcsa\ch762darrays\GuessWithFileInput-Starter.java)
