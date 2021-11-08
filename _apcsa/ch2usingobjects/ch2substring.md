---
layout: project
category: ch2usingobjects
title: Ch2 Substring
---

Copy/paste this starter template...
```
import java.util.Random;
public class Main {

    public static void main(String[] args)
    {
      System.out.println("Substring project");
      // your code here

    }

    /**
    * Returns the index of first vowel or
    * returns -1 if the word has no vowels.
    * @param word String
    * @return int the index of the first vowel.
    */
    public static int findFirstVowel(String word)
    {
        for (int i = 0; i < word.length(); i++) {
            String letter = Character.toString(word.charAt(i)
            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("o")
                || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("u")) {
                return i;
            }
        }
        return -1;
    }
```


Create *ONE* Java program that does *ALL* of the following:

1. Ask the user for a word and collect it with Scanner.

1. Convert the word to all caps. For example, if the user input "hello" and then change it to "HELLO". Use the toUpperCase method. <ins>Print the result</ins>

1. Convert the word to all lowercase. For example, if the user input "Justin" and then change it to "justin". Use the toLowerCase method. <ins>Print the result</ins>

1. Convert the word so that the first letter is capitalized. For example, if the user input "hello" and then change it to "Hello". Use the replace method. <ins>Print the result</ins>

1. Convert the word so "ab" is inserted before the first vowel. For example, if the user input "Justin" it becomes "Jabustin" and if the user input "hello" it becomes "habello". Use the String class substring method and the template's findFirstVowel(String word) method. <ins>Print the result</ins>

1. Shm-reduplication. You will need to use findFirstVowel and replace the characters before the first vowel with "shm". If the user input "Justin" it becomes "Justin-shmustin" and if the user input "hello" it becomes "hello-shmello". Use the String class substring method and the template's findFirstVowel(String word) method. <ins>Print the result</ins>

1. Pig Latin. For example, if the user input "Justin" it becomes "Ustin-jay" and if the user input "hello" it becomes "Ello-hay". Use the String class substring method, the String toUpperCase method, the String toLowerCase method, and the template's findFirstVowel(String word) method. <ins>Print the result</ins>

1. Generate a username using the first letter (converted to lowercase), the last letter (converted to uppercase), and a random three-digit number from 100 to 999. For example, if the user input "Justin" it might generate "jN371" or "jN784" or "jN196". Use the String length method and substring to get the last letter. You will need to construct a Random object and use the nextInt() method. <ins>Print the result</ins>
