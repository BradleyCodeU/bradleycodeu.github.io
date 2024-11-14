---
layout: project
category: forms
title: Forms Sound Piano
---
![Screenshot of Sample Sequencer](https://bradleycodeu.github.io/gdad/forms/samplesequencer.jpg)

Download one of these and pick 10 sounds to use:
  - [Alice Sound Library 1](https://www.alice.org/wp-content/uploads/2017/05/AliceSoundLibrary.zip)
  - [Alice Sound Library 2](https://www.alice.org/wp-content/uploads/2017/08/AliceSoundLibraryExpansionPackOne.zip)
  - [Essential Retro Video Game Sound Effects Collection](https://opengameart.org/sites/default/files/The%20Essential%20Retro%20Video%20Game%20Sound%20Effects%20Collection%20%5B512%20sounds%5D.zip)
  - [Chipshop Deluxe 16bit](https://drive.google.com/uc?export=download&id=1BwXL4Szc6FoJFlN3iCRukdnNiN060Y3u)


1. In the script section, load all 10 of the sounds. For example...
```
// when the page loads
let soundA = new Audio("drum.mp3");
```

1. Create a button class so that all of your piano keys look almost identical. Add a [hover](https://www.w3schools.com/cssref/sel_hover.asp) effect and an [active](https://www.w3schools.com/cssref/sel_active.asp) effect.

1. Each of the piano keys can simply play ONE sound using onclick. For example, onclick="soundA.play()"

1. Make a giant Play button. Here is the code for the giant Play button: [https://gist.githubusercontent.com/ohiofi/c6b2bca45c7a9aa1bc9741afc1f79973/raw/5829b31f4be8ad59500eece457158993bfaa941f/JS%2520play%2520button](https://gist.githubusercontent.com/ohiofi/c6b2bca45c7a9aa1bc9741afc1f79973/raw/5829b31f4be8ad59500eece457158993bfaa941f/JS%2520play%2520button)

1. Once you've copy/pasted that code and added your variables to the array/list, give your giant play button onclick="playSong()"

1. Add code to set the background to a random color.

### If you have already completed 1 or more Computer Science classes...

You MUST ALSO add the ability to play sounds by pressing keyboard keys.
```
// create an event listener function that runs when any key is pressed down
window.onkeydown = function(){
    // check if event.key equals a specific key
    if(event.key == "a"){
       //play a sound
       //change bg color
    }
    if(event.key == "s"){
       //play a sound
       //change bg color
    }
};
```

Read this tutorial about [key events](https://www.w3schools.com/jsref/event_key_key.asp)
