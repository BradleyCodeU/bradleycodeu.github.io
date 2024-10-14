# U02b Club Meeting
---

Read [this tutorial](https://www.geeksforgeeks.org/java-math-random-method-examples/) about using the static method Math.random()

NOTE: You MUST use the static method Math.random() for this assignment


Project Directions:



The school coding club can't decide when to hold their meetings. The members agree to create a program to randomly decide their meeting times.

  1.  Where will we meet? Your code will randomly pick either 266 or 267.
  1.  What time will we meet? Your code will randomly pick either 3, 4, or 5.
  1.  What grade will provide snacks? Your code will randomly pick either 9, 10, 11, or 12.
  1.  What will the membership fee be? Your code will randomly pick a number 5 to 15.
  1.  5th Random Choice (Something you make up. Every student in class should have something unique)

Ideas for the 5th Random Choice (unique for each student)...

  - Random phone number to call for more info
  - Random raffle number to win this week's "door prize"
  - Random email like minecraft837632@email.com to contact for more info
  - Random snack time (must be after the starting meeting time)
  - Random day for the regional coding competition. For example, "Regional Coding Competition will be Dec ____"
  - Random year the club was founded (must pick a year from 2009 to the current year)
  - Pick a random "fake web address for the club" using an if-else with a random number
  - Pick a random "Sponsored by" business using an if-else with a random number
  - Pick a random "Game of the Week" using an if-else with a random number
  - Pick a random "Celebrity Guest Speaker" using an if-else with a random number
  - Pick a random "club motto" using an if-else with a random number
  - Pick a random social media app and say "Follow us on ____" using an if-else with a random number to fill the blank
  - Pick a random prize and say "Raffle prize is ____" using an if-else with a random number to fill the blank

Above public static void main, you MUST define a new helper method. This method will return an int. Name this method something like randomNumber. This method has two parameters: int minimum and int maximum. You MUST use Math.random() inside of the method. This method returns a random integer number from the minimum to the maximum (INCLUDING the maximum). Call this helper method inside of the main method whenever you need a random number ( for example, randomNumber(1,6) ). Stuck? Refer to this tutorial: https://www.geeksforgeeks.org/java-math-random-method-examples/



SAMPLE OUTPUT 1
```
1. Where will we meet?
Coding club with meet in room 267.
2. What time will we meet?
We will meet at 4 pm.
3. What grade will provide snacks?
10th graders will be providing snacks.
4. What will the membership fee be?
Membership fee is $7.
(5th random choice goes here)
JOIN TODAY!
```

SAMPLE OUTPUT 2
```
1. Where will we meet?
Coding club with meet in room 266.
2. What time will we meet?
We will meet at 5 pm.
3. What grade will provide snacks?
9th graders will be providing snacks.
4. What will the membership fee be?
Membership fee is $13.
(5th random choice goes here)
JOIN TODAY!
```
