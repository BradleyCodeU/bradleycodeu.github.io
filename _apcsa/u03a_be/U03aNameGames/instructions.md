# Name Games
---


1. Define a static method named isVowel that requires String parameter singleLetter and returns a boolean
    
      - create a string named vowels that is "aeiouy"
      - convert singleLetter to lower case
      - if vowels.indexOf(singleLetter) equals -1
          - return false
      - else
          - return true 

1. Define a static method named findFirstVowel that requires a String parameter inputWord and returns an int (the index of the first vowel or returns 0 if no vowels)
    
      - create a counter starts at 0
      - while the counter is less than the length of inputWord
        - get a singleLetter using inputWord substring from counter to counter+1
        - if isVowel(singleLetter) equals false
          - add one to counter so we check the next letter in the string
        - else
          - return counter // done! here is the index of the first vowel

      - return 0 // didn't find a vowel

1. Define a static method called vowelName that takes a string like “Bradley” as argument, calls findFirstVowel, and returns “adley”.

1. Define public static String nameFacts(String firstName) and returns the following facts as one long String: length, longer/shorter than average (6.5), starts with, middle letter, ends with. For example, the name "Steve" would return "Your name is 5 letters long. Your name is shorter than average. Your name starts with a S. The letter e is at the center of your name. Your name ends with a e."

1. Define public static String spoonerism(String firstName, String lastName) and cite wrode… Oops I mean, write code… that will generate a [Spoonerism](https://en.wikipedia.org/wiki/Spoonerism) using their first and last name. For example, Brilliard Hadley, Jeve Stobs, Fran Sancisco, Melon Usk. Use getVowelName to help you.

1. Define public static String scoobyDoo(String firstName, String lastName) and rite road... Oops I mean, write code... that will convert the user's name to [Scooby-Doo speak](https://www.neatorama.com/2014/03/11/We-Finally-Have-a-Name-for-Scooby-Doos-Speech-Disorder/). For example, Rilliard Radley, Reve Robs, Ran Rancisco, Relon Rusk.

1. Define public static String jeringonza(String firstName, String lastName) and wripite copode... Oops I mean, write code... that will convert the user's name to [Jeringonza](https://en.wikipedia.org/wiki/Jeringonza). You will add the letter p after the first vowel of a word, and repeat the vowel. For example, Hipilliard Brapadley, Stepeve Jopobs, Sapan Frapancisco, Elopon Mupusk.

1. Define public static String ubbiDubbi(String name) and wrubite cubode... Oops I mean, write code... that will convert the user's name to [Ubbi Dubbi](https://en.wikipedia.org/wiki/Ubbi_dubbi). You will add ub before the first vowel of a word. For example, Hubilliard Brubadley, Stubeve Jubobs, Suban Frubancisco, Ubelon Mubusk.

1. In the main method...
 
    1. Write a Java program to prompt the user to enter their first name. Your program will respond with a welcome message for the user and then print...
    2. System.out.println(nameFacts(firstName));
    3. prompt the user to enter their last name.

    1. System.out.println("Spoonerism= " + spoonerism(firstName, lastName));
    1. System.out.println("Scooby-doo= " + scoobyDoo(firstName, lastName));
    1. System.out.println("Jeringonza= " + jeringonza(firstName, lastName));
    1. System.out.println("Ubbi Dubbi= " + ubbiDubbi(firstName, lastName));






You MUST match the spelling, wording, and punctuation in the sample output.

Sample Output:
```
Enter your first name: Steve
Hello Steve!
1. Your name is 5 letters long.
Your name is shorter than average.
2. Your name starts with a S.
3. The letter e is at the center of your name.
4. Your name ends with a e.
Enter your last name: Jobs
Spoonerism= Jeve Stobs
Scooby-doo= Reve Robs
Jeringonza= Stepeve Jopobs
Ubbi Dubbi= Stubeve Jubobs
```

Sample Output 2:
```
Enter your first name: Elon
Hello Elon!
1. Your name is 4 letters long.
Your name is shorter than average.
2. Your name starts with a E.
3. The letter o is at the center of your name.
4. Your name ends with a n.
Enter your last name: Musk
Spoonerism= Melon Usk
Scooby-doo= Relon Rusk
Jeringonza= Epelon Mupusk
Ubbi Dubbi= Ubelon Mubusk
```

Try running your code with a different variety of inputs. What happens if you just hit the ENTER key instead of entering a name?

You MUST also complete ONE of the challenges:

  - CHALLENGE 1: Prompt for the user's last name, then randomly generate 10 suggested usernames for that person. For example... jusriley3, rilj6, juriley7, rileyju29, justiri4, rijustin2, jr87, etc

  - CHALLENGE 2: With the user's first name, generate a verse for [the 1964 Shirley Ellis song](https://drive.google.com/open?id=1NehR20x0yzheTYAEYxJ5W9-D6hbEbuqT) "The Name Game" [https://en.wikipedia.org/wiki/The_Name_Game](https://en.wikipedia.org/wiki/The_Name_Game). Create a method called findFirstVowel that takes a string as argument and returns the index of the first vowel or returns 0 if no vowels. Create a method called vowelName that takes a string as argument, calls findFirstVowel, and returns  In your main method, use getVowelName to help you. If the name starts with a b, f, or m, that sound simply is not repeated. For example: Billy becomes "Billy Billy bo-illy"; Fred becomes "bonana fanna fo-red"; Marsha becomes "fee fi mo-arsha"


## Starter Code
```
class Main {
  

  // Define a static method named isVowel that requires String parameter singleLetter and returns a boolean
  {
    // create a string named vowels that is "aeiouy"
    // convert singleLetter to lower case
    // if vowels.indexOf(singleLetter) equals -1
    if(???)
    {
      // return false
    }
    else
    {
      // return true
    }
  }
  
  
  // Define a static method named findFirstVowel that requires a String parameter inputWord and returns an int (the index of the first vowel or returns 0 if no vowels)
  {
    //create a counter starts at 0
    
    //while the counter is less than the length of inputWord
    while(???)
    {
      //get a singleLetter using inputWord substring from counter to counter+1

      //if isVowel(singleLetter) equals false
      if(???)
      {
        //add one to counter so that we check the next letter in the string
      }
      else
      {
        
        //return counter we are done! here is the index of the first vowel
      }
    }
    //return 0 we didn’t find a vowel
  }


  //  Define a static method called vowelName that takes a string like “Bradley” as argument, calls findFirstVowel, and returns “adley”.
  {
    
  }


  public static void main(String[] args)
  {
    System.out.print("Enter your first name: ");
    System.out.println("Hello ");
    System.out.println("1. Your name is ");
    System.out.println("2. Your name starts with a ");
    System.out.println("3. The letter ");
    System.out.println("4. Your name ends with a ");
    System.out.print("Enter your last name: ");
    
  }
  
}
```