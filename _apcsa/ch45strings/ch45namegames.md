---
layout: project
category: ch45strings
title: Name Games
---


Write a Java program to prompt the user to enter their name. Your program will respond with a welcome message for the user and then some information about the user’s first name.

Next, cite wrode… Oops I mean, write code… that will prompt for the user’s nast lame… Oops I mean, last name… then generate a [Spoonerism](https://en.wikipedia.org/wiki/Spoonerism) using their first and last name. For example, Brilliard Hadley, Jeve Stobs, Fran Sancisco. Create a method called findFirstVowel that takes a string as argument and returns the index of the first vowel or returns 0 if no vowels. Create a method called vowelName that takes a string like “Bradley” as argument, calls findFirstVowel, and returns “adley”. In your main method, use getVowelName to help you.
- findFirstVowel method requires parameter inputWord
  - temporary string called vowels that is "aeiouy"
  - temporary counter starts at 0
  - while the counter is less than the length of inputWord
    - if vowels contains inputWord substring from counter to counter+1
      - return counter // done! here is the index of the first vowel
    - counter + 1 // check the next char in the string
  - return 0 // didn't find a vowel

You MUST match the spelling, wording, and punctuation in the sample output.

Sample Output:
```
Enter your first name: Becky
Hello Becky!
Your name is 5 letters long.
Your name starts with a B.
The letter c is at the center of your name.
Your name ends with a y.
Enter your last name: Tanner
Goodbye Tecky Banner!
Oops I mean Becky Tanner!
```

Sample Output 2:
```
Enter your first name: Andrew
Hello Andrew!
Your name is 6 letters long.
Your name starts with a A.
The letter r is at the center of your name.
Your name ends with a w.
Enter your last name: Smith
Goodbye SmAndrew ith!
Oops I mean Andrew Smith!
```

Try running your code with a different variety of inputs. What happens if you just hit the ENTER key instead of entering a name?

You MUST also complete one of the challenges:

  - CHALLENGE 1: Prompt for the user's last name, then randomly generate 10 suggested usernames for that person. For example... jusriley3, rilj6, juriley7, rileyju29, justiri4, rijustin2, jr87, etc

  - CHALLENGE 2: With the user's first name, generate a verse for [the 1964 Shirley Ellis song](https://drive.google.com/open?id=1NehR20x0yzheTYAEYxJ5W9-D6hbEbuqT) "The Name Game" [https://en.wikipedia.org/wiki/The_Name_Game](https://en.wikipedia.org/wiki/The_Name_Game). Create a method called findFirstVowel that takes a string as argument and returns the index of the first vowel or returns 0 if no vowels. Create a method called vowelName that takes a string as argument, calls findFirstVowel, and returns  In your main method, use getVowelName to help you. If the name starts with a b, f, or m, that sound simply is not repeated. For example: Billy becomes "Billy Billy bo-illy"; Fred becomes "bonana fanna fo-red"; Marsha becomes "fee fi mo-arsha"
    - findFirstVowel pseudocode requires parameter inputWord
      - temporary string called vowels that is "aeiouy"
      - temporary counter starts at 0
      - while the counter is less than the length of inputWord
        - if vowels contains inputWord substring from counter to counter+1
          - return counter // done! here is the index of the first vowel
        - counter + 1 // check the next char in the string
      - return 0 // didn't find a vowel
