---
layout: project
category: ch9inheritance
title: Virtual Pet Game
---

Here is a [demo video](https://drive.google.com/file/d/12lmCfq5ru7Vth4apWrTKk2eomeqEvJ-J/view?usp=sharing) of the Virtual Pet Game

Create an [abstract](https://www.w3schools.com/java/java_abstract.asp) Pet class, a Dog class, and classes for 3 other types of pet.

Create a Main class that will contain the game.

Create a static method called updateScore. Returns int score. Requires two arguments: int score, Pet[ ] pets
```
for each in pets
if each is happy, then score plus 1, else score minus 1
if all pets are happy, then add 1 bonus point to the score
return the score
```

Next, use this pseudocode to create your main method.

```
score = 50
create an array of pet objects
add 4 different types of pet to the array (Dog and 3 others)
print Your Name's Virtual Pet Game
while True
  print a line like this = = = = = = = = = = = = = = = = = = = =
  for each in pets
      - each add one hour
      - print each
  call the static updateScore method
  print score
  if score is greater than 100 then print you win and break the loop
  if score is less than 0 then print game over and break the loop
  prompt select a pet # 0, 1, 2, or 3
  collect and validate input (repeat prompt if not an int)
  print a line like this . . . . . . . . . . . .
  print pets[user input pet #]
  print pets[user input pet #] get list of actions
  prompt type one of the listed actions (MUST not be numbered!)
  collect input (accept all inputs even gibberish like “lkjsdf”)
  pets[user input pet #] do action (user input action string)
```
