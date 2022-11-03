---
layout: project
category: ch45strings
title: Name Games
---
Starter Template: [https://replit.com/@JustinRiley1/226NameGames-Template#Main.java](https://replit.com/@JustinRiley1/226NameGames-Template#Main.java)

1. Create a method called isVowel that takes a string as argument and returns true or false.

    Define a static function named isVowel that require parameter singleLetter and return a boolean
    
      - create a string named vowels that is "aeiouy"
      - if vowels index of singleLetter equals -1
          - return false
      - else
          - return true 

1. Create a method called findFirstVowel that takes a string as argument and returns the index of the first vowel or returns 0 if no vowels. 

    Define a static function named findFirstVowel() that requires parameter inputWord and returns an int
    
      - create a counter starts at 0
      - while the counter is less than the length of inputWord
        - get a single letter using inputWord substring from counter to counter+1
        - if isVowel with the argument single letter
          - add one to counter so we check the next letter in the string
        - else
          - return counter // done! here is the index of the first vowel

      - return 0 // didn't find a vowel

1. Create a method called vowelName that takes a string like “Bradley” as argument, calls findFirstVowel, and returns “adley”.

1. In the main method...
 
    1. Write a Java program to prompt the user to enter their name. Your program will respond with a welcome message for the user and then some information about the user’s first name: length, starts with, middle letter, ends with.

    1. Next, cite wrode… Oops I mean, write code… that will prompt for the user’s nast lame… Oops I mean, last name… then generate a [Spoonerism](https://en.wikipedia.org/wiki/Spoonerism) using their first and last name. For example, Brilliard Hadley, Jeve Stobs, Fran Sancisco, Melon Usk.  In your main method, use getVowelName to help you.

    1. Next, rite road... Oops I mean, write code... that will convert the user's name to [Scooby-Doo speak](https://www.neatorama.com/2014/03/11/We-Finally-Have-a-Name-for-Scooby-Doos-Speech-Disorder/). For example, Rilliard Radley, Reve Robs, Ran Rancisco, Relon Rusk.

    1. Next, wripite copode... Oops I mean, write code... that will convert the user's name to [Jeringonza](https://en.wikipedia.org/wiki/Jeringonza). You will add the letter p after the first vowel of a word, and repeat the vowel. For example, Hipilliard Brapadley, Stepeve Jopobs, Sapan Frapancisco, Elopon Mupusk.

    1. Next, wrubite cubode... Oops I mean, write code... that will convert the user's name to [Ubbi Dubbi](https://en.wikipedia.org/wiki/Ubbi_dubbi). You will add ub before the first vowel of a word. For example, Hubilliard Brubadley, Stubeve Jubobs, Suban Frubancisco, Ubelon Mubusk.






You MUST match the spelling, wording, and punctuation in the sample output.

Sample Output:
```
Enter your first name: Steve
Hello Steve!
Part 1 (do not use printf)
1. Your name is 5 letters long.
2. Your name starts with a S.
3. The letter e is at the center of your name.
4. Your name ends with a e.
Enter your last name: Jobs
Part 2 (use printf)
    Spoonerism=     Jeve Stobs
    Scooby-doo=      Reve Robs
    Jeringonza= Stepeve Jopobs
    Ubbi Dubbi= Stubeve Jubobs
└┄┄┄┄┄┄┄┄┄┄┄┄┬┘└┄┄┄┄┄┄┄┄┄┄┄┄┬┘
 field width 15 field width 15
```

Sample Output 2:
```
Enter your first name: Elon
Hello Elon!
Part 1 (do not use printf)
1. Your name is 4 letters long.
2. Your name starts with a E.
3. The letter o is at the center of your name.
4. Your name ends with a n.
Enter your last name: Musk
Part 2 (use printf)
    Spoonerism=      Melon Usk
    Scooby-doo=     Relon Rusk
    Jeringonza=  Epelon Mupusk
    Ubbi Dubbi=  Ubelon Mubusk
└┄┄┄┄┄┄┄┄┄┄┄┄┬┘└┄┄┄┄┄┄┄┄┄┄┄┄┬┘
 field width 15 field width 15
```

Try running your code with a different variety of inputs. What happens if you just hit the ENTER key instead of entering a name?

You MUST also complete ONE of the challenges:

  - CHALLENGE 1: Prompt for the user's last name, then randomly generate 10 suggested usernames for that person. For example... jusriley3, rilj6, juriley7, rileyju29, justiri4, rijustin2, jr87, etc

  - CHALLENGE 2: With the user's first name, generate a verse for [the 1964 Shirley Ellis song](https://drive.google.com/open?id=1NehR20x0yzheTYAEYxJ5W9-D6hbEbuqT) "The Name Game" [https://en.wikipedia.org/wiki/The_Name_Game](https://en.wikipedia.org/wiki/The_Name_Game). Create a method called findFirstVowel that takes a string as argument and returns the index of the first vowel or returns 0 if no vowels. Create a method called vowelName that takes a string as argument, calls findFirstVowel, and returns  In your main method, use getVowelName to help you. If the name starts with a b, f, or m, that sound simply is not repeated. For example: Billy becomes "Billy Billy bo-illy"; Fred becomes "bonana fanna fo-red"; Marsha becomes "fee fi mo-arsha"
