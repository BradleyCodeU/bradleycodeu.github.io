---
layout: project
category: u01generativeart
title: U01 Random Haiku
---

Generative Text is a process of algorithmically creating words, poems, or stories often using randomness.

A haiku is a form of unrhymed poetry that has:
- 3 lines of text
- 5–7–5 structure (a five-syllable line, followed by a seven-syllable line, concluded with another five-syllable line)
- must be about observing nature

Click here for examples: [https://www.google.com/search?udm=2&q=random+haiku+generator](https://www.google.com/search?udm=2&q=random+haiku+generator)

## Directions

Using P5.js create a Random Haiku Generator.

Your project MUST generate a three-line haiku following the traditional 5–7–5 syllable structure and must be about nature.

Each time your program runs (or refreshes) it should generate a new random haiku.  

Your project MUST have **at least 5** random elements. For example...
- Random noun choice (pick from arrays of nouns)
- Random verb choice
- Random adjective choice
- Random adverb choice
- Random line structure or random word order. For example, "The noun is adjective" compared to "Adjective, adjective noun"
- Random text size, text style, text font

With 5 random elements, each time your project loads we should see a different haiku. Refresh the page several times to see how the poems change.

The haiku should be displayed as text on the canvas [https://p5js.org/reference/p5/text/](https://p5js.org/reference/p5/text/). You could also add a simple visual background, but the focus should be the poem.  

NOTE: The focus of this project should be the TEXT, so don't worry about random colors.

NOTE: Store your words in Javascript arrays [https://www.w3schools.com/js/js_arrays.asp](https://www.w3schools.com/js/js_arrays.asp) and use the p5js `random()` function to select from each array. [https://p5js.org/reference/p5/random/](https://p5js.org/reference/p5/random/) 

NOTE: You can use `textAlign(CENTER, CENTER);` and `textSize();` to style your haiku.  

NOTE: Change `createCanvas(400, 400);` to `createCanvas(windowWidth, windowHeight);` so that it fills the screen.

### Challenges

- Animate your haiku (fade in, scroll, or change over time).  
- Add an interactive element (maybe clicking the mouse generates a new haiku).  
- Combine your haiku with a calming generative art background.  
- A *good* haiku conveys a single moment where the poet suddenly sees or realizes something. It should have contrast or surprise. Usually the 3rd line gives some new, important information. Reference the same noun on the first and third lines.
