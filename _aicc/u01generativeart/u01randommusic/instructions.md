---
layout: project
category: u01_generative_art
title: U01 Random Music
---

Generative Music is a process of algorithmically creating sound or melodies often using randomness.

Click here for screenshot examples: [https://www.google.com/search?udm=2&q=generative+music](https://www.google.com/search?udm=2&q=generative+music)

## Directions

Using P5.js, create a Random Music Generator.

You can EITHER:
- Generate tones with the p5.Oscillator. See the example here: [https://p5js.org/reference/p5.sound/p5.Oscillator/](https://p5js.org/reference/p5.sound/p5.Oscillator/)
- Play short mp3 samples. See the example below:
```
let mySound = loadSound('my_audio_file.mp3');
mySound.play();
```

If you want to play short mp3 sounds, then download one of these:
  - [Alice Sound Library 1](https://www.alice.org/wp-content/uploads/2017/05/AliceSoundLibrary.zip)
  - [Alice Sound Library 2](https://www.alice.org/wp-content/uploads/2017/08/AliceSoundLibraryExpansionPackOne.zip)
  - [Essential Retro Video Game Sound Effects Collection](https://opengameart.org/sites/default/files/The%20Essential%20Retro%20Video%20Game%20Sound%20Effects%20Collection%20%5B512%20sounds%5D.zip)

Your project MUST generate a short sequence of sounds or notes each time the program runs (or refreshes).  

Your project MUST be able to play 7 or more different sounds or notes.

The goal is to create music that sounds different each time, but still has some structure.

Your project MUST have at least **3 random elements**. For example…
- Random colors
- Random order of notes/samples
- Random pitch (choose from a set of notes, like C–D–E–G–A)  
- Random rhythm (note length or rest)  
- Random instrument sound (sine, square, triangle, sawtooth wave, drum, guitar, etc)  


With 3 random elements, each time your project loads we should hear a different short composition. Refresh the page several times to listen to how the music changes.

The focus should be **sound**, but you MUST also display simple visual elements (like shapes reacting to notes) for fun.

NOTE: Your project should mostly work without user input. You are NOT creating a piano app.

NOTE: Structure your code so the generator plays a short phrase, not just one note. Use `frameCount` to space notes out in time.  

NOTE: Change `createCanvas(400, 400);` to `createCanvas(windowWidth, windowHeight);` so visuals fill the screen.

## Challenges


- Make the music interactive (click the mouse to generate a new melody). Your project should mostly work without user input. You are NOT creating a piano app.
- Use scales (pentatonic, major, minor) so the random notes sound more musical.  
- Layer multiple instruments to create harmony or rhythm.  
