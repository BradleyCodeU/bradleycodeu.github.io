---
layout: project
category: u02a_using_objects
title: Ch2 Club Meeting
---

Here is the Random API: [https://docs.oracle.com/javase/8/docs/api/java/util/Random.html](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)

Read [this tutorial](https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java) about using the Random class

NOTE: You MUST use the single argument nextInt() method for this assignment
```
int	nextInt(int bound)
Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.
```

Project Directions:

The school coding club can't decide when to hold their meetings. The members agree to create a program to randomly decide their meeting times.

  1.  Where should they meet? Your code will randomly pick either 266 or 267.
  1.  What time should they meet? Your code will randomly pick either 3, 4, or 5.
  1.  What grade will provide snacks? Your code will randomly pick either 9, 10, 11, or 12.
  1.  What should the membership fee be? Your code will randomly pick a number 5 to 15.
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


Construct an object of the Random class (see [this tutorial](https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java) about using the Random class) and invoke the nextInt(int bound) method to generate a number.

NOTE: You do NOT need to construct more than one Random class object. Each time you need to generate a new number just use an additional method call.

NOTE: You MUST use the single argument nextInt() method for this assignment
```
int	nextInt(int bound)
Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.
```

SAMPLE OUTPUT 1
```
Coding club with meet in room 267 at 4 pm.
10th graders will be providing snacks.
Membership fee is $7.
(5th random choice goes here)
JOIN TODAY!
```

SAMPLE OUTPUT 2
```
Coding club with meet in room 266 at 5 pm.
9th graders will be providing snacks.
Membership fee is $13.
(5th random choice goes here)
JOIN TODAY!
```

## STARTER TEMPLATE:
```
class Main {
  public static void main(String[] args) {

    // Ch2 Club Meeting
    // ---

    // Read [this tutorial](https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java)
    // about using the Random class

    // NOTE: You MUST use the single argument nextInt() method for this assignment
    // ```
    // int	nextInt(int bound)
    // Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.
    // ```

    // The school coding club can't decide when to hold their meetings. The members
    // agree to create a program to randomly decide their meeting times.

    // 1. Where should they meet? Your code will randomly pick either 266 or 267.
    
    // 2. What time should they meet? Your code will randomly pick either 3, 4, or 5.
    
    // 3. What grade will provide snacks? Your code will randomly pick either 9, 10, 11, or 12.
    
    // 4. What should the membership fee be? Your code will randomly pick a number 5 to 15.
    
    // 5. 5th Random Choice (Something you make up. Every student in class should have something unique)

    // Ideas for the 5th Random Choice (unique for each student)...

    // - Random phone number to call for more info
    // - Random raffle number to win this week's "door prize"
    // - Random email like minecraft837632@email.com to contact for more info
    // - Random snack time (must be after the starting meeting time)
    // - Random day for the regional coding competition. For example, "Regional
    // Coding Competition will be Dec ____"
    // - Random year the club was founded (must pick a year from 2009 to the current
    // year)
    // - Pick a random "fake web address for the club" using an if-else with a
    // random number
    // - Pick a random "Sponsored by" business using an if-else with a random number
    // - Pick a random "Game of the Week" using an if-else with a random number
    // - Pick a random "Celebrity Guest Speaker" using an if-else with a random
    // number
    // - Pick a random "club motto" using an if-else with a random number
    // - Pick a random social media app and say "Follow us on ____" using an if-else
    // with a random number to fill the blank
    // - Pick a random prize and say "Raffle prize is ____" using an if-else with a
    // random number to fill the blank

    // Construct an object of the Random class (see [this
    // tutorial](https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java)
    // about using the Random class) and invoke the nextInt(int bound) method to generate 
    // a number.

    // NOTE: You do NOT need to construct more than one Random class object. Each
    // time you need to generate a new number just use an additional method call.

    // NOTE: You MUST use the single argument nextInt() method for this assignment
    // ```
    // int	nextInt(int bound)
    // Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.
    // ```



    // SAMPLE OUTPUT 1
    // ```
    // Coding club with meet in room 267 at 4 pm.
    // 10th graders will be providing snacks.
    // Membership fee is $7.
    // (5th random choice goes here)
    // JOIN TODAY!
    // ```

    // SAMPLE OUTPUT 2
    // ```
    // Coding club with meet in room 266 at 5 pm.
    // 9th graders will be providing snacks.
    // Membership fee is $13.
    // (5th random choice goes here)
    // JOIN TODAY!
    // ```

  }
}
```
