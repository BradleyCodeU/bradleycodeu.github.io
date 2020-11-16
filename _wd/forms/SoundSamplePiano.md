---
layout: project
category: forms
title: Sound Sample Piano
---
![Screenshot of Sample Sequencer](/wd\js\samplesequencer.jpg)

Download one of these:
  - [Alice Sound Library 1](https://www.alice.org/wp-content/uploads/2017/05/AliceSoundLibrary.zip)
  - [Alice Sound Library 2](https://www.alice.org/wp-content/uploads/2017/08/AliceSoundLibraryExpansionPackOne.zip)
  - [Essential Retro Video Game Sound Effects Collection](https://opengameart.org/sites/default/files/The%20Essential%20Retro%20Video%20Game%20Sound%20Effects%20Collection%20%5B512%20sounds%5D.zip)


In the script section, load all 10 of the sounds. For example...
```
var soundA = new Audio("https://cdn.glitch.com/475828fb-3da7-4c90-8b9a-8217d8db7a15%2F0.mp3?1509508399315");
```

Create a button class so that all of your piano keys look almost identical. Add a [hover](https://www.w3schools.com/cssref/sel_hover.asp) effect and an [active](https://www.w3schools.com/cssref/sel_active.asp) effect.

Each of the piano keys can simply play one sound using onclick. For example, onclick="soundA.play()"

Here is the code for the Play button: [https://gist.github.com/ohiofi/c6b2bca45c7a9aa1bc9741afc1f79973](https://gist.github.com/ohiofi/c6b2bca45c7a9aa1bc9741afc1f79973)

Once you've copy/pasted that code and added your variables to the array, give your giant play button onclick="playSong()"

Add code to set the background to a random color.

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
