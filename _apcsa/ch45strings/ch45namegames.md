---
layout: project
category: ch45strings
title: Name Games
---


Write a Java program to prompt the user to enter their name. Your program will respond with a welcome message for the user and then some information about the user’s first name.

Next, cite wrode… Oops I mean, write code… that will prompt for the user’s nast lame… Oops I mean, last name… then generate a [Spoonerism](https://en.wikipedia.org/wiki/Spoonerism) using their first and last name. For example, Brilliard Hadley, Jeve Stobs, Fran Sancisco. Create a method called findFirstVowel that takes a string as argument and returns the index of the first vowel or returns 0 if no vowels. Create a method called vowelName that takes a string like “Bradley” as argument, calls findFirstVowel, and returns “adley”. In your main method, use getVowelName to help you.


define a static function named findFirstVowel() that requires parameter inputWord and returns an int

- create a string named vowels that is "aeiouy"
  - create a counter starts at 0
  - while the counter is less than the length of inputWord
    - get a single letter using inputWord substring from counter to counter+1
    - if vowels index of single letter equals -1
      - add one to counter so we check the next letter in the string
    - else
      - return counter // done! here is the index of the first vowel

  - return 0 // didn't find a vowel



You MUST match the spelling, wording, and punctuation in the sample output.

Sample Output:
```
Enter your first name: Steve
Hello Steve!
Your name is 5 letters long.
Your name starts with a S.
The letter e is at the center of your name.
Your name ends with a e.
Enter your last name: Jobs
Goodbye Jeve Stobs!
Oops I mean Steve Jobs!
```

Sample Output 2:
```
Enter your first name: Elon
Hello Elon!
Your name is 4 letters long.
Your name starts with a E.
The letter o is at the center of your name.
Your name ends with a n.
Enter your last name: Musk
Goodbye MElon usk!
Oops I mean Elon Musk!
```

Try running your code with a different variety of inputs. What happens if you just hit the ENTER key instead of entering a name?

You MUST also complete one of the challenges:

  - CHALLENGE 1: Prompt for the user's last name, then randomly generate 10 suggested usernames for that person. For example... jusriley3, rilj6, juriley7, rileyju29, justiri4, rijustin2, jr87, etc

  - CHALLENGE 2: With the user's first name, generate a verse for [the 1964 Shirley Ellis song](https://drive.google.com/open?id=1NehR20x0yzheTYAEYxJ5W9-D6hbEbuqT) "The Name Game" [https://en.wikipedia.org/wiki/The_Name_Game](https://en.wikipedia.org/wiki/The_Name_Game). Create a method called findFirstVowel that takes a string as argument and returns the index of the first vowel or returns 0 if no vowels. Create a method called vowelName that takes a string as argument, calls findFirstVowel, and returns  In your main method, use getVowelName to help you. If the name starts with a b, f, or m, that sound simply is not repeated. For example: Billy becomes "Billy Billy bo-illy"; Fred becomes "bonana fanna fo-red"; Marsha becomes "fee fi mo-arsha"
