---
layout: project
category: ch2usingobjects
title: Ch2 Substring
---

In this project you will demonstrate the use of several String methods including substring, indexOf, toUpperCase, toLowerCase, and length

Starter Template:
```
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("SUBSTRING PROJECT");
    }

    /**
    * findFirstVowel(String inputWord)
    * Returns the index of first vowel or
    * returns -1 if the word has no vowels.
    * @param String inputWord
    * @return int index of the first vowel
    */

    // Define a static function named findFirstVowel() that requires String parameter inputWord and returns an int

}
```


Define a static function named findFirstVowel() that requires String parameter inputWord and returns an int

- create a string named vowels that is "aeiouy"
  - create a counter starts at 0
  - while the counter is less than the length of inputWord
    - get a single letter using inputWord substring from counter to counter+1
    - if vowels index of single letter equals -1
      - add one to counter so we check the next letter in the string
    - else
      - return counter // done! here is the index of the first vowel

  - return 0 // didn't find a vowel


Create *ONE* Java program that does *ALL* of the following:

1. Ask the user for a word and collect it with Scanner.

1. Convert the word to all caps. For example, if the user input "hello" and then change it to "HELLO". Use the toUpperCase method. <ins>Print the result</ins>

1. Convert the word to all lowercase. For example, if the user input "Justin" and then change it to "justin". Use the toLowerCase method. <ins>Print the result</ins>

1. Convert the word so that the first letter is capitalized. For example, if the user input "hello" it becomes "Hello" and if the user input "BRADLEY" it becomes "Bradley". Use the substring, toUpperCase, and toLowerCase methods. <ins>Print the result</ins>

1. Convert the word so "ab" is inserted before the first vowel. For example, if the user input "Justin" it becomes "Jabustin" and if the user input "screen" it becomes "scrabeen". Use the String class substring method and the static findFirstVowel(inputWord) method. <ins>Print the result</ins>

1. Shm-reduplication. You will need to use findFirstVowel and replace the characters before the first vowel with "shm". If the user input "Justin" it becomes "Justin-shmustin" and if the user input "bradley" it becomes "bradley-shmadley". Use the String class substring method and the static findFirstVowel(inputWord) method. <ins>Print the result</ins>

1. Pig Latin. For example, if the user input "Justin" it becomes "Ustin-jay" and if the user input "bradley" it becomes "Adley-bray". Use the String class substring method, the String toUpperCase method, the String toLowerCase method, and the static findFirstVowel(inputWord) method. <ins>Print the result</ins>

1. Generate a username using the first letter (converted to lowercase), the last letter (converted to uppercase), and a random three-digit number from 100 to 999. For example, if the user input "Justin" it might generate "jN371" or "jN784" or "jN196". Use the String length and substring to get the last letter. You will need to construct a Random object and use the nextInt() method. <ins>Print the result</ins>
