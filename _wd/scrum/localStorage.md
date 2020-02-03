---
layout: project
category: scrum
title: localStorage Character Creator
---

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
var saveScore = JSON.stringify(score); // score must be converted to string
localStorage.setItem("name", name);
localStorage.setItem("score", saveScore);
```
