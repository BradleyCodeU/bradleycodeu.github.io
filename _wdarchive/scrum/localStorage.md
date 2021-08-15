---
layout: project
category: scrum
title: localStorage Character Creator
---

* TOC
{:toc}


## What is localStorage?

Before HTML5 the only way to store data in the browser was in a cookie. There were a lot of limits in size, and cookies were sent over the internet with a potentially unsecure connection. In HTML5, localStorage was added to accommodate the needs to keep information persistent, and web storage objects were created.

localStorage can hold at least 5MB of data with no expiration date. All information that you store in localStorage MUST be strings.

The localStorage object has three important methods:

- localStorage.setItem(key, value)
- localStorage.getItem(key)
- localStorage.removeItem(key)

You can also access a key in localStorage directly using localStorage.key

Here is an example:
```
var name = prompt("What's your name?");
var score = 100;
var saveThisScore = JSON.stringify(score); // score must be converted to string
localStorage.setItem("userName", name);
localStorage.setItem("userScore", saveThisScore);
```

Notice that score was converted to a string. When we use localStorage.getItem("userScore") it will give us a string. Use JSON.parse() to convert it back to a number.
```
var scoreString = localStorage.getItem("userScore");
score = JSON.parse(scoreString)
```

## Project Details

Create a random name generator that will create a random character. Something _similar_ to [this D&D character builder](https://tetra-cube.com/dnd/dnd-char-gen.html), but you don't need random images.

You MUST make this character generator match the theme of your Foobar game. For example, if you are creating a zombie game that happens in modern-day Ohio, then all of the characters might be human and the jobs might be Police Officer, Medic, Fry Cook, Pilot, Scientist, Truck Driver, Soldier, Assistant to the Regional Manager, etc.

Things to generate for a basic D&D character:
  - First name
  - Last name
  - Type (Hill dwarf, High elf, Lightfoot halfling, Human, Dragonborn, Rock gnome, Half-elf, Half-orc, Tiefling)
  - Job (Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue, Sorcerer, Warlock, Wizard)
  - Background (Acolyte, Criminal, Folk hero, Noble, Poor, Rich, Sage, Soldier)
  - Weapon (Dagger, Slingshot, Club, Mace, Staff, Short bow, Light crossbow, Battleaxe, Glaive, Greataxe, Greatsword)

Create a button that randomly generates a new character and saves it to local storage.

When the page loads, automatically load the previous character from local storage and display it on the screen.
