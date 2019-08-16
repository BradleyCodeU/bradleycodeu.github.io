---
layout: project
category: py
title: Weight On Planets
---
On Earth, gravity has a value of **9.81** N/Kg (Newtons per kilogram). Because the Moon has about one-sixth of the gravity that Earth does, you would weigh less standing on it. On the Moon, gravity has a value of 1.622 N/Kg.

This is a simple cross-multiplication conversion in which earthWeight / earthGravity = moonWeight / moonGravity. We can use the following formula to calculate your weight on the Moon:
```
moonWeight = earthWeight * moonGravity / earthGravity
```


Calculate and output the weight of the end-user on *one* of the following:

| Celestial Body | Gravity (in N/Kg) |
|----|----|
| Moon | 1.622 |
| Mercury | 	3.7 |
| Venus | 	8.87 |
| Mars | 	3.711 |
| Jupiter | 	24.79 |
| Saturn | 	10.44 |
| Uranus | 	8.69 |
| Neptune | 	11.15 |


You will:
- Collect the user's weight in pounds
- Validate the number
- Convert pounds to kilograms
- Calculate their weight on another planets
- Convert kilograms to pounds
- Create a popup that tells the user "Your weight on *whatever planet* is ___ lbs"
