---
layout: project
category: ch9inheritance
title: Virtual Pet Game
---

Creating an [abstract](https://www.w3schools.com/java/java_abstract.asp) Pet class, a Dog class, and classes for 3 other types of pet.

Next, use this pseudocode to create your Main class main method.

```
score = 50
create an array of pet objects
add 4 different types of pet to the array (Dog and 3 others)
print Your Name's Virtual Pet Game
while True
  print a line like this = = = = = = = = = = = = = = = = = = = =
  for each in pets
      - each add one hour
      - if each is happy, then score plus 1, else score minus 1
      - print each
  print score
  if score is greater than 100 then print you win and break the loop
  if score is less than 0 then print game over and break the loop
  prompt select a pet # 0,1, or 2
  collect and validate input (repeat prompt if not an int)
  print a line like this - = - = - = - = -
  print pets[user input pet #]
  print pets[user input pet #] get list of actions
  prompt type one of the listed actions (MUST not be numbered!)
  collect input (accept all inputs this time. even gibberish like “lkjsdf”)
  pets[user input pet #] do action (user input action string)
```
